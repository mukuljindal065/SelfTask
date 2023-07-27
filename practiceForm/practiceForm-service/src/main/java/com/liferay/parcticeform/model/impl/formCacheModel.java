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

package com.liferay.parcticeform.model.impl;

import com.liferay.parcticeform.model.form;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing form in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class formCacheModel implements CacheModel<form>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof formCacheModel)) {
			return false;
		}

		formCacheModel formCacheModel = (formCacheModel)object;

		if (empId == formCacheModel.empId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, empId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", empId=");
		sb.append(empId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", mobileNo=");
		sb.append(mobileNo);
		sb.append(", email=");
		sb.append(email);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", field1=");
		sb.append(field1);
		sb.append(", field2=");
		sb.append(field2);
		sb.append(", field3=");
		sb.append(field3);
		sb.append(", field4=");
		sb.append(field4);
		sb.append(", field5=");
		sb.append(field5);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public form toEntityModel() {
		formImpl formImpl = new formImpl();

		if (uuid == null) {
			formImpl.setUuid("");
		}
		else {
			formImpl.setUuid(uuid);
		}

		formImpl.setEmpId(empId);
		formImpl.setGroupId(groupId);
		formImpl.setMobileNo(mobileNo);

		if (email == null) {
			formImpl.setEmail("");
		}
		else {
			formImpl.setEmail(email);
		}

		if (userName == null) {
			formImpl.setUserName("");
		}
		else {
			formImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			formImpl.setCreateDate(null);
		}
		else {
			formImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			formImpl.setModifiedDate(null);
		}
		else {
			formImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (field1 == null) {
			formImpl.setField1("");
		}
		else {
			formImpl.setField1(field1);
		}

		formImpl.setField2(field2);
		formImpl.setField3(field3);

		if (field4 == Long.MIN_VALUE) {
			formImpl.setField4(null);
		}
		else {
			formImpl.setField4(new Date(field4));
		}

		if (field5 == null) {
			formImpl.setField5("");
		}
		else {
			formImpl.setField5(field5);
		}

		formImpl.resetOriginalValues();

		return formImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		empId = objectInput.readLong();

		groupId = objectInput.readLong();

		mobileNo = objectInput.readLong();
		email = objectInput.readUTF();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		field1 = objectInput.readUTF();

		field2 = objectInput.readBoolean();

		field3 = objectInput.readInt();
		field4 = objectInput.readLong();
		field5 = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(empId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(mobileNo);

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (field1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(field1);
		}

		objectOutput.writeBoolean(field2);

		objectOutput.writeInt(field3);
		objectOutput.writeLong(field4);

		if (field5 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(field5);
		}
	}

	public String uuid;
	public long empId;
	public long groupId;
	public long mobileNo;
	public String email;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String field1;
	public boolean field2;
	public int field3;
	public long field4;
	public String field5;

}