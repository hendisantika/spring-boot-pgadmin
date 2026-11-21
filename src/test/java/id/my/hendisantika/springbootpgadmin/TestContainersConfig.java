package id.my.hendisantika.springbootpgadmin;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.postgresql.PostgreSQLContainer;

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
@TestConfiguration(proxyBeanMethods = false)
public class TestContainersConfig {

    @Bean
    @ServiceConnection
    public PostgreSQLContainer postgresContainer() {
        return new PostgreSQLContainer("postgres:17-alpine")
                .withDatabaseName("test")
                .withUsername("test")
                .withPassword("test");
    }
}
