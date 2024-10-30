package id.my.hendisantika.springbootpgadmin.event;

import org.springframework.data.repository.ListCrudRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-pgadmin
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 30/10/24
 * Time: 07.19
 * To change this template use File | Settings | File Templates.
 */
public interface EventRepository extends ListCrudRepository<Event, Integer> {
}
