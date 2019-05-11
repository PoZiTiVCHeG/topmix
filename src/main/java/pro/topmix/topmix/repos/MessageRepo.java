package pro.topmix.topmix.repos;

import org.springframework.data.repository.CrudRepository;
import pro.topmix.topmix.domain.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);
}
