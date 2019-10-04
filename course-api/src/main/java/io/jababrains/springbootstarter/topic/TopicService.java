package io.jababrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic("spring1","spring FrameWork 1","Description1"),
			new Topic("spring2","spring FrameWork 2","Description2"),
			new Topic("spring3","spring FrameWork 3","Description3"),
			new Topic("spring4","spring FrameWork 4","Description4")
			
			));
	
	public List<Topic> getAllTopics(){
		
		return topics;
	}
	

	public Topic getTopic(String id) throws DefaultExceptionHandler{
		
		if(id.equalsIgnoreCase("Student1")) {
			throw new RuntimeException("This is a Runtime Error,Shashank !");
		}
		else if(id.equalsIgnoreCase("Student2")) {
			throw new RecordNotFoundException("Record not found");
		}
		else {
			
		}

//		try {
//			int x = 10/0;
//		}
//		catch(Exception e)
//		{
//			throw new DefaultExceptionHandler();
//		}
//		

		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();	
	}
	
	public void addTopics(Topic topic) {
		topics.add(topic);
	}
	
	public void updateTopic(String id,Topic topic) {
		for(int i=0;i<topics.size();i++) {
			Topic t=topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}
	
	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}
}
