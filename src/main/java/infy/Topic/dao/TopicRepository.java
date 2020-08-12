package infy.Topic.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import infy.Topic.entity.Topic;

public interface TopicRepository extends CrudRepository<Topic,String> {

	
}
