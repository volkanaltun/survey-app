package com.vaapps.webservice.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	TopicRepository topicRepository;
	
	@PostMapping("/topic")
	public void holdTopic(@RequestBody Topic topic) {
		topicRepository.save(topic);
	}
}
