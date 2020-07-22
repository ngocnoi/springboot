package com.group5.librarymanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group5.librarymanagement.Entity.Notification;
import com.group5.librarymanagement.Service.NotificationService;

@RestController
@RequestMapping(path = "/api/notification")
public class NotificationController {
	@Autowired
	private NotificationService notificationServiceImpl;
	
	@RequestMapping(value = "/notifications")
	public List<Notification> getAllNotification() {
		return notificationServiceImpl.listAllNotification();
	}
}
