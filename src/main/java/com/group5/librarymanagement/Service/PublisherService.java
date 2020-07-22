package com.group5.librarymanagement.Service;

import java.util.List;

import com.group5.librarymanagement.Entity.Publisher;

public interface PublisherService {
	public abstract Publisher getPublisher(Integer id);
	public abstract void addPublisher(Publisher publisher);
	public abstract void updatePublisher(Integer id, Publisher publisher);
	public abstract void deletePublisher(Integer id);
	public abstract List<Publisher> listAllPublisher();  
}
