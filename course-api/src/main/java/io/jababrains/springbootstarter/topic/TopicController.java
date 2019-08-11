package io.jababrains.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.jababrains.springbootstarter.constantsdeclaration.AllConstantsDeclaration;
import io.jababrains.springbootstarter.utilityclass.UtilityClass;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicservice;
	
	
	@Autowired
	private UtilityClass utility;
	
	@Autowired
	private AllConstantsDeclaration acd;
	
	
	@RequestMapping(value="/topics")
	public List<Topic> getAllTopics() {
		return topicservice.getAllTopics();
	}
	
/*
	@RequestMapping("/topics/spring1")
	public Topic getTopic1(String id) {
		return topicservice.getTopic("spring1");
	}
*/
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicservice.getTopic(id);
		//System.out.println(utility.changeToBold(id));
		//System.out.println(acd.age);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicservice.addTopics(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updateTopics(@RequestBody Topic topic,@PathVariable String id) {
		topicservice.updateTopic(id,topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopics(@PathVariable String id) {
		topicservice.deleteTopic(id);
	}
	
	
	
}
