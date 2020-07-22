package com.group5.librarymanagement.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.group5.librarymanagement.Entity.Publisher;
import com.group5.librarymanagement.ServiceImpl.PublisherServiceImpl;

@RestController
@RequestMapping(path = "/api/v1")
public class PublisherController {
	@Autowired
	private PublisherServiceImpl publisherServiceImpl;

	@RequestMapping(value = "/publishers")
	public List<Publisher> getAllPublisher() {
		return publisherServiceImpl.listAllPublisher();
	}

	@RequestMapping(value = "{id}")
	public ResponseEntity<Void> deletePublisher(@PathVariable("id") Integer id) {
		Publisher publisher = publisherServiceImpl.getPublisher(id);
		if (publisher == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		publisherServiceImpl.deletePublisher(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ResponseEntity<Void> addPublisher(@RequestBody Publisher publisher) {
		publisherServiceImpl.addPublisher(publisher);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
}
