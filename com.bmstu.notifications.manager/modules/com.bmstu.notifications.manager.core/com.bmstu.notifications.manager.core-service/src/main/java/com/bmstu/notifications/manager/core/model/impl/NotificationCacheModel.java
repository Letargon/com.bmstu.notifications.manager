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

package com.bmstu.notifications.manager.core.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.bmstu.notifications.manager.core.model.Notification;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Notification in entity cache.
 *
 * @author Arapov
 * @see Notification
 * @generated
 */
@ProviderType
public class NotificationCacheModel implements CacheModel<Notification>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NotificationCacheModel)) {
			return false;
		}

		NotificationCacheModel notificationCacheModel = (NotificationCacheModel)obj;

		if (notificationId == notificationCacheModel.notificationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, notificationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", notificationId=");
		sb.append(notificationId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", type=");
		sb.append(type);
		sb.append(", always=");
		sb.append(always);
		sb.append(", mail=");
		sb.append(mail);
		sb.append(", sms=");
		sb.append(sms);
		sb.append(", web=");
		sb.append(web);
		sb.append(", notificationAttributes=");
		sb.append(notificationAttributes);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Notification toEntityModel() {
		NotificationImpl notificationImpl = new NotificationImpl();

		if (uuid == null) {
			notificationImpl.setUuid(StringPool.BLANK);
		}
		else {
			notificationImpl.setUuid(uuid);
		}

		notificationImpl.setNotificationId(notificationId);
		notificationImpl.setGroupId(groupId);
		notificationImpl.setCompanyId(companyId);
		notificationImpl.setUserId(userId);

		if (userName == null) {
			notificationImpl.setUserName(StringPool.BLANK);
		}
		else {
			notificationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			notificationImpl.setCreateDate(null);
		}
		else {
			notificationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			notificationImpl.setModifiedDate(null);
		}
		else {
			notificationImpl.setModifiedDate(new Date(modifiedDate));
		}

		notificationImpl.setStatus(status);
		notificationImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			notificationImpl.setStatusByUserName(StringPool.BLANK);
		}
		else {
			notificationImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			notificationImpl.setStatusDate(null);
		}
		else {
			notificationImpl.setStatusDate(new Date(statusDate));
		}

		if (type == null) {
			notificationImpl.setType(StringPool.BLANK);
		}
		else {
			notificationImpl.setType(type);
		}

		notificationImpl.setAlways(always);
		notificationImpl.setMail(mail);
		notificationImpl.setSms(sms);
		notificationImpl.setWeb(web);

		if (notificationAttributes == null) {
			notificationImpl.setNotificationAttributes(StringPool.BLANK);
		}
		else {
			notificationImpl.setNotificationAttributes(notificationAttributes);
		}

		notificationImpl.resetOriginalValues();

		return notificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		notificationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		type = objectInput.readUTF();

		always = objectInput.readBoolean();

		mail = objectInput.readBoolean();

		sms = objectInput.readBoolean();

		web = objectInput.readBoolean();
		notificationAttributes = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(notificationId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);

		if (type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(type);
		}

		objectOutput.writeBoolean(always);

		objectOutput.writeBoolean(mail);

		objectOutput.writeBoolean(sms);

		objectOutput.writeBoolean(web);

		if (notificationAttributes == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(notificationAttributes);
		}
	}

	public String uuid;
	public long notificationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public String type;
	public boolean always;
	public boolean mail;
	public boolean sms;
	public boolean web;
	public String notificationAttributes;
}