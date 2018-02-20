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

package com.bmstu.notifications.manager.core.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Notification}.
 * </p>
 *
 * @author Arapov
 * @see Notification
 * @generated
 */
@ProviderType
public class NotificationWrapper implements Notification,
	ModelWrapper<Notification> {
	public NotificationWrapper(Notification notification) {
		_notification = notification;
	}

	@Override
	public Class<?> getModelClass() {
		return Notification.class;
	}

	@Override
	public String getModelClassName() {
		return Notification.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("notificationId", getNotificationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("type", getType());
		attributes.put("always", getAlways());
		attributes.put("mail", getMail());
		attributes.put("sms", getSms());
		attributes.put("web", getWeb());
		attributes.put("notificationAttributes", getNotificationAttributes());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long notificationId = (Long)attributes.get("notificationId");

		if (notificationId != null) {
			setNotificationId(notificationId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		Boolean always = (Boolean)attributes.get("always");

		if (always != null) {
			setAlways(always);
		}

		Boolean mail = (Boolean)attributes.get("mail");

		if (mail != null) {
			setMail(mail);
		}

		Boolean sms = (Boolean)attributes.get("sms");

		if (sms != null) {
			setSms(sms);
		}

		Boolean web = (Boolean)attributes.get("web");

		if (web != null) {
			setWeb(web);
		}

		String notificationAttributes = (String)attributes.get(
				"notificationAttributes");

		if (notificationAttributes != null) {
			setNotificationAttributes(notificationAttributes);
		}
	}

	@Override
	public Notification toEscapedModel() {
		return new NotificationWrapper(_notification.toEscapedModel());
	}

	@Override
	public Notification toUnescapedModel() {
		return new NotificationWrapper(_notification.toUnescapedModel());
	}

	/**
	* Returns the always of this notification.
	*
	* @return the always of this notification
	*/
	@Override
	public boolean getAlways() {
		return _notification.getAlways();
	}

	/**
	* Returns the mail of this notification.
	*
	* @return the mail of this notification
	*/
	@Override
	public boolean getMail() {
		return _notification.getMail();
	}

	/**
	* Returns the sms of this notification.
	*
	* @return the sms of this notification
	*/
	@Override
	public boolean getSms() {
		return _notification.getSms();
	}

	/**
	* Returns the web of this notification.
	*
	* @return the web of this notification
	*/
	@Override
	public boolean getWeb() {
		return _notification.getWeb();
	}

	/**
	* Returns <code>true</code> if this notification is always.
	*
	* @return <code>true</code> if this notification is always; <code>false</code> otherwise
	*/
	@Override
	public boolean isAlways() {
		return _notification.isAlways();
	}

	/**
	* Returns <code>true</code> if this notification is approved.
	*
	* @return <code>true</code> if this notification is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _notification.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _notification.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this notification is denied.
	*
	* @return <code>true</code> if this notification is denied; <code>false</code> otherwise
	*/
	@Override
	public boolean isDenied() {
		return _notification.isDenied();
	}

	/**
	* Returns <code>true</code> if this notification is a draft.
	*
	* @return <code>true</code> if this notification is a draft; <code>false</code> otherwise
	*/
	@Override
	public boolean isDraft() {
		return _notification.isDraft();
	}

	@Override
	public boolean isEscapedModel() {
		return _notification.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this notification is expired.
	*
	* @return <code>true</code> if this notification is expired; <code>false</code> otherwise
	*/
	@Override
	public boolean isExpired() {
		return _notification.isExpired();
	}

	/**
	* Returns <code>true</code> if this notification is inactive.
	*
	* @return <code>true</code> if this notification is inactive; <code>false</code> otherwise
	*/
	@Override
	public boolean isInactive() {
		return _notification.isInactive();
	}

	/**
	* Returns <code>true</code> if this notification is incomplete.
	*
	* @return <code>true</code> if this notification is incomplete; <code>false</code> otherwise
	*/
	@Override
	public boolean isIncomplete() {
		return _notification.isIncomplete();
	}

	/**
	* Returns <code>true</code> if this notification is mail.
	*
	* @return <code>true</code> if this notification is mail; <code>false</code> otherwise
	*/
	@Override
	public boolean isMail() {
		return _notification.isMail();
	}

	@Override
	public boolean isNew() {
		return _notification.isNew();
	}

	/**
	* Returns <code>true</code> if this notification is pending.
	*
	* @return <code>true</code> if this notification is pending; <code>false</code> otherwise
	*/
	@Override
	public boolean isPending() {
		return _notification.isPending();
	}

	/**
	* Returns <code>true</code> if this notification is scheduled.
	*
	* @return <code>true</code> if this notification is scheduled; <code>false</code> otherwise
	*/
	@Override
	public boolean isScheduled() {
		return _notification.isScheduled();
	}

	/**
	* Returns <code>true</code> if this notification is sms.
	*
	* @return <code>true</code> if this notification is sms; <code>false</code> otherwise
	*/
	@Override
	public boolean isSms() {
		return _notification.isSms();
	}

	/**
	* Returns <code>true</code> if this notification is web.
	*
	* @return <code>true</code> if this notification is web; <code>false</code> otherwise
	*/
	@Override
	public boolean isWeb() {
		return _notification.isWeb();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _notification.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Notification> toCacheModel() {
		return _notification.toCacheModel();
	}

	@Override
	public int compareTo(Notification notification) {
		return _notification.compareTo(notification);
	}

	/**
	* Returns the status of this notification.
	*
	* @return the status of this notification
	*/
	@Override
	public int getStatus() {
		return _notification.getStatus();
	}

	@Override
	public int hashCode() {
		return _notification.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _notification.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new NotificationWrapper((Notification)_notification.clone());
	}

	/**
	* Returns the notification attributes of this notification.
	*
	* @return the notification attributes of this notification
	*/
	@Override
	public java.lang.String getNotificationAttributes() {
		return _notification.getNotificationAttributes();
	}

	/**
	* Returns the status by user name of this notification.
	*
	* @return the status by user name of this notification
	*/
	@Override
	public java.lang.String getStatusByUserName() {
		return _notification.getStatusByUserName();
	}

	/**
	* Returns the status by user uuid of this notification.
	*
	* @return the status by user uuid of this notification
	*/
	@Override
	public java.lang.String getStatusByUserUuid() {
		return _notification.getStatusByUserUuid();
	}

	/**
	* Returns the type of this notification.
	*
	* @return the type of this notification
	*/
	@Override
	public java.lang.String getType() {
		return _notification.getType();
	}

	/**
	* Returns the user name of this notification.
	*
	* @return the user name of this notification
	*/
	@Override
	public java.lang.String getUserName() {
		return _notification.getUserName();
	}

	/**
	* Returns the user uuid of this notification.
	*
	* @return the user uuid of this notification
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _notification.getUserUuid();
	}

	/**
	* Returns the uuid of this notification.
	*
	* @return the uuid of this notification
	*/
	@Override
	public java.lang.String getUuid() {
		return _notification.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _notification.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _notification.toXmlString();
	}

	/**
	* Returns the create date of this notification.
	*
	* @return the create date of this notification
	*/
	@Override
	public Date getCreateDate() {
		return _notification.getCreateDate();
	}

	/**
	* Returns the modified date of this notification.
	*
	* @return the modified date of this notification
	*/
	@Override
	public Date getModifiedDate() {
		return _notification.getModifiedDate();
	}

	/**
	* Returns the status date of this notification.
	*
	* @return the status date of this notification
	*/
	@Override
	public Date getStatusDate() {
		return _notification.getStatusDate();
	}

	/**
	* Returns the company ID of this notification.
	*
	* @return the company ID of this notification
	*/
	@Override
	public long getCompanyId() {
		return _notification.getCompanyId();
	}

	/**
	* Returns the group ID of this notification.
	*
	* @return the group ID of this notification
	*/
	@Override
	public long getGroupId() {
		return _notification.getGroupId();
	}

	/**
	* Returns the notification ID of this notification.
	*
	* @return the notification ID of this notification
	*/
	@Override
	public long getNotificationId() {
		return _notification.getNotificationId();
	}

	/**
	* Returns the primary key of this notification.
	*
	* @return the primary key of this notification
	*/
	@Override
	public long getPrimaryKey() {
		return _notification.getPrimaryKey();
	}

	/**
	* Returns the status by user ID of this notification.
	*
	* @return the status by user ID of this notification
	*/
	@Override
	public long getStatusByUserId() {
		return _notification.getStatusByUserId();
	}

	/**
	* Returns the user ID of this notification.
	*
	* @return the user ID of this notification
	*/
	@Override
	public long getUserId() {
		return _notification.getUserId();
	}

	@Override
	public void persist() {
		_notification.persist();
	}

	/**
	* Sets whether this notification is always.
	*
	* @param always the always of this notification
	*/
	@Override
	public void setAlways(boolean always) {
		_notification.setAlways(always);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_notification.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this notification.
	*
	* @param companyId the company ID of this notification
	*/
	@Override
	public void setCompanyId(long companyId) {
		_notification.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this notification.
	*
	* @param createDate the create date of this notification
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_notification.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_notification.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_notification.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_notification.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this notification.
	*
	* @param groupId the group ID of this notification
	*/
	@Override
	public void setGroupId(long groupId) {
		_notification.setGroupId(groupId);
	}

	/**
	* Sets whether this notification is mail.
	*
	* @param mail the mail of this notification
	*/
	@Override
	public void setMail(boolean mail) {
		_notification.setMail(mail);
	}

	/**
	* Sets the modified date of this notification.
	*
	* @param modifiedDate the modified date of this notification
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_notification.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_notification.setNew(n);
	}

	/**
	* Sets the notification attributes of this notification.
	*
	* @param notificationAttributes the notification attributes of this notification
	*/
	@Override
	public void setNotificationAttributes(
		java.lang.String notificationAttributes) {
		_notification.setNotificationAttributes(notificationAttributes);
	}

	/**
	* Sets the notification ID of this notification.
	*
	* @param notificationId the notification ID of this notification
	*/
	@Override
	public void setNotificationId(long notificationId) {
		_notification.setNotificationId(notificationId);
	}

	/**
	* Sets the primary key of this notification.
	*
	* @param primaryKey the primary key of this notification
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_notification.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_notification.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets whether this notification is sms.
	*
	* @param sms the sms of this notification
	*/
	@Override
	public void setSms(boolean sms) {
		_notification.setSms(sms);
	}

	/**
	* Sets the status of this notification.
	*
	* @param status the status of this notification
	*/
	@Override
	public void setStatus(int status) {
		_notification.setStatus(status);
	}

	/**
	* Sets the status by user ID of this notification.
	*
	* @param statusByUserId the status by user ID of this notification
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_notification.setStatusByUserId(statusByUserId);
	}

	/**
	* Sets the status by user name of this notification.
	*
	* @param statusByUserName the status by user name of this notification
	*/
	@Override
	public void setStatusByUserName(java.lang.String statusByUserName) {
		_notification.setStatusByUserName(statusByUserName);
	}

	/**
	* Sets the status by user uuid of this notification.
	*
	* @param statusByUserUuid the status by user uuid of this notification
	*/
	@Override
	public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
		_notification.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Sets the status date of this notification.
	*
	* @param statusDate the status date of this notification
	*/
	@Override
	public void setStatusDate(Date statusDate) {
		_notification.setStatusDate(statusDate);
	}

	/**
	* Sets the type of this notification.
	*
	* @param type the type of this notification
	*/
	@Override
	public void setType(java.lang.String type) {
		_notification.setType(type);
	}

	/**
	* Sets the user ID of this notification.
	*
	* @param userId the user ID of this notification
	*/
	@Override
	public void setUserId(long userId) {
		_notification.setUserId(userId);
	}

	/**
	* Sets the user name of this notification.
	*
	* @param userName the user name of this notification
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_notification.setUserName(userName);
	}

	/**
	* Sets the user uuid of this notification.
	*
	* @param userUuid the user uuid of this notification
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_notification.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this notification.
	*
	* @param uuid the uuid of this notification
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_notification.setUuid(uuid);
	}

	/**
	* Sets whether this notification is web.
	*
	* @param web the web of this notification
	*/
	@Override
	public void setWeb(boolean web) {
		_notification.setWeb(web);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NotificationWrapper)) {
			return false;
		}

		NotificationWrapper notificationWrapper = (NotificationWrapper)obj;

		if (Objects.equals(_notification, notificationWrapper._notification)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _notification.getStagedModelType();
	}

	@Override
	public Notification getWrappedModel() {
		return _notification;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _notification.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _notification.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_notification.resetOriginalValues();
	}

	private final Notification _notification;
}