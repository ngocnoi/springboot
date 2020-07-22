package com.group5.librarymanagement.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group5.librarymanagement.Entity.BookOffer;
import com.group5.librarymanagement.Entity.Notification;
import com.group5.librarymanagement.Repositories.BookOfferRepository;
import com.group5.librarymanagement.Repositories.NotificationRepository;
import com.group5.librarymanagement.Service.NotificationService;

@Service
public  class NotificationSerivceImpl implements NotificationService{

	@Autowired
	private NotificationRepository Repository;
	
	@Override
	public Notification getNotification(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateNotification(Integer id, Notification notification) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteNotification(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Notification> listAllNotification() {
		return Repository.findAll();
	}

	@Override
	public void addNotification(Notification notification) {
		// TODO Auto-generated method stub
		
	}

	

}
