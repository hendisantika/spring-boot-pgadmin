package id.my.hendisantika.springbootpgadmin;

import id.my.hendisantika.springbootpgadmin.event.Event;
import id.my.hendisantika.springbootpgadmin.event.EventRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Import(TestContainersConfig.class)
class SpringBootPgadminApplicationTests {

    @Autowired
    private EventRepository eventRepository;

    @BeforeEach
    void deleteAll() {
        eventRepository.deleteAll();
    }

    @Test
    void contextLoads() {
        assertThat(eventRepository).isNotNull();
    }

    @Test
    void shouldSaveAndFindEvent() {
        Event event = new Event(1, "Spring I/O", "Spring conference", LocalDate.of(2026, 5, 21),
                LocalDate.of(2026, 5, 22), LocalDate.of(2025, 11, 1), LocalDate.of(2026, 1, 15),
                "Barcelona", "https://2026.springio.net");

        eventRepository.save(event);

        assertThat(eventRepository.findAll()).hasSize(1);
        assertThat(eventRepository.findById(1)).hasValueSatisfying(found ->
                assertThat(found.getName()).isEqualTo("Spring I/O"));
    }
}
