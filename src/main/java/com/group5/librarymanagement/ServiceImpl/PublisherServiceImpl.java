package com.group5.librarymanagement.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group5.librarymanagement.Entity.Publisher;
import com.group5.librarymanagement.Repositories.PublisherRepository;
import com.group5.librarymanagement.Service.PublisherService;

@Service
public class PublisherServiceImpl implements PublisherService{
	
	@Autowired
	PublisherRepository publisherRepository;

	@Override
	public void addPublisher(Publisher publisher) {	
		publisherRepository.saveAndFlush(publisher);
	}

	@Override
	public void updatePublisher(Integer id, Publisher publisher) {
		Publisher publisherTemp = publisherRepository.findById(id).get();
		if(publisherTemp != null) {
			publisherTemp.setPublisherName(publisher.getPublisherName());
		}
		publisherRepository.saveAndFlush(publisherTemp);
	}
		
	@Override
	public void deletePublisher(Integer id) {
		publisherRepository.deleteById(id);
	}

	@Override
	public List<Publisher> listAllPublisher() {
		return publisherRepository.findAll();
	}

	@Override
	public Publisher getPublisher(Integer id) {
		return publisherRepository.findById(id).get();
	}
	
}
