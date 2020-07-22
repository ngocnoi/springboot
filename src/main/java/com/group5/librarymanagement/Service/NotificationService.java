package com.group5.librarymanagement.Service;

import java.util.List;

import com.group5.librarymanagement.Entity.Notification;


public interface NotificationService {
	public abstract Notification getNotification(Integer id);
	public abstract void addNotification(Notification notification);
	public abstract void updateNotification(Integer id, Notification notification);
	public abstract void deleteNotification(Integer id);
	public abstract List<Notification> listAllNotification(); 
}
