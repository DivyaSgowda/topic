package infy.Topic.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import infy.Topic.entity.Topic;
import infy.Topic.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService; 
	
	@RequestMapping("/topics")
	public Object getAllTopics() {
		return topicService.getTopics();				
	}

	@RequestMapping("/topics/{id}")
	public Topic getOneTopic(@PathVariable String id) {
		return topicService.getOneTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics" )
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}" )
	public Object updateTopic(@RequestBody Topic topic,@PathVariable String id) {
		return topicService.updateTopic(topic,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		 topicService.deleteTopic(id);
	}
	

	
	
	
	
	
	
	
	
}
