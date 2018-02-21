/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.bmstu.notifications.manager.core.service.impl;

import java.util.Date;
import java.util.List;

import com.bmstu.notifications.manager.core.model.Notification;
import com.bmstu.notifications.manager.core.service.base.NotificationLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

/**
 * The implementation of the notification local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.bmstu.notifications.manager.core.service.NotificationLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Arapov
 * @see NotificationLocalServiceBaseImpl
 * @see com.bmstu.notifications.manager.core.service.NotificationLocalServiceUtil
 */
public class NotificationLocalServiceImpl extends NotificationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.bmstu.notifications.manager.core.service.
	 * NotificationLocalServiceUtil} to access the notification local service.
	 */

	@Override
	public Notification addNotification(long userId, String type, boolean isAlways, boolean sendMail, boolean sendSms,
			boolean useWeb, String notificationAttributes, ServiceContext serviceContext) throws PortalException {
		String nonNulltype = nullToEmpty(type);
		String nonNullNotificationAttributes = nullToEmpty(notificationAttributes);

		long groupId = serviceContext.getScopeGroupId();
		User user = userLocalService.getUserById(userId);
		Date currentDate = new Date();

		Notification notification = notificationPersistence.create(counterLocalService.increment());

		notification.setUuid(serviceContext.getUuid());
		notification.setUserId(userId);
		notification.setGroupId(groupId);
		notification.setCompanyId(user.getCompanyId());
		notification.setUserName(user.getFullName());
		notification.setCreateDate(serviceContext.getCreateDate(currentDate));
		notification.setModifiedDate(serviceContext.getModifiedDate(currentDate));
		notification.setType(nonNulltype);
		notification.setAlways(isAlways);
		notification.setMail(sendMail);
		notification.setSms(sendSms);
		notification.setWeb(useWeb);
		notification.setNotificationAttributes(nonNullNotificationAttributes);
		notification.setExpandoBridgeAttributes(serviceContext);

		notificationPersistence.update(notification);

		return notification;
	}
	
	@Override
	public List<Notification> getNotifications(long groupId, int start, int end) {

		return notificationPersistence.findByGroupId(groupId, start, end);
	}

	@Override
	public int getNotificationsCount() {
		return notificationPersistence.countAll();
	}

	private String nullToEmpty(String string) {
		return string == null ? "" : string;
	}
}