package id.my.hendisantika.springbootpgadmin;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.PostgreSQLContainer;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-pgadmin
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 30/10/24
 * Time: 07.44
 * To change this template use File | Settings | File Templates.
 */
@TestConfiguration
public class TestContainersConfig {

    @Bean
    public PostgreSQLContainer<?> postgresContainer() {
        PostgreSQLContainer<?> postgresContainer = new PostgreSQLContainer<>("postgres:17-alpine3.20")
                .withDatabaseName("test")
                .withUsername("test")
                .withPassword("test");
        postgresContainer.start();
        return postgresContainer;
    }
}
