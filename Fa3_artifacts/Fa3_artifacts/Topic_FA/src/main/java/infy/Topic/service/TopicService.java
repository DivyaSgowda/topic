package infy.Topic.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import infy.Topic.dao.TopicRepository;
import infy.Topic.entity.*;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository; 
	
//	private List<Topic> topics= new ArrayList<>(Arrays.asList(
//			new Topic("Spring1","springframework","Springframeworkdescription"),
//			new Topic("java","core java","corejavadescription"),
//			new Topic("javascript","jss","jssdescription")				
//			));


	public Iterable<Topic> getTopics() {
		// return topics;
		
		return topicRepository.findAll();
	}

		public Topic getOneTopic(String id) {
			//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
			return topicRepository.findById(id).orElse(null);
		}

		public void addTopic(Topic topic) {
			topicRepository.save(topic);
			
			//topics.add(topic);
			//return null;
		}

		public Topic updateTopic(Topic topic, String id) {
			Topic existingTopic=topicRepository.findById(id).orElse(null);
			if (existingTopic !=null) {
				existingTopic.setName(topic.getName());
				existingTopic.setDescription(topic.getDescription());
				return topicRepository.save(existingTopic);
			}
			return null;
			

			
		}

		public void deleteTopic(String id) {
			topicRepository.deleteById(id);
			
		}
		
}
