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

package com.liferay.parcticeform.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link form}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see form
 * @generated
 */
public class formWrapper
	extends BaseModelWrapper<form> implements form, ModelWrapper<form> {

	public formWrapper(form form) {
		super(form);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("empId", getEmpId());
		attributes.put("groupId", getGroupId());
		attributes.put("mobileNo", getMobileNo());
		attributes.put("email", getEmail());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("field1", getField1());
		attributes.put("field2", isField2());
		attributes.put("field3", getField3());
		attributes.put("field4", getField4());
		attributes.put("field5", getField5());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long empId = (Long)attributes.get("empId");

		if (empId != null) {
			setEmpId(empId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long mobileNo = (Long)attributes.get("mobileNo");

		if (mobileNo != null) {
			setMobileNo(mobileNo);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
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

		String field1 = (String)attributes.get("field1");

		if (field1 != null) {
			setField1(field1);
		}

		Boolean field2 = (Boolean)attributes.get("field2");

		if (field2 != null) {
			setField2(field2);
		}

		Integer field3 = (Integer)attributes.get("field3");

		if (field3 != null) {
			setField3(field3);
		}

		Date field4 = (Date)attributes.get("field4");

		if (field4 != null) {
			setField4(field4);
		}

		String field5 = (String)attributes.get("field5");

		if (field5 != null) {
			setField5(field5);
		}
	}

	@Override
	public form cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the create date of this form.
	 *
	 * @return the create date of this form
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email of this form.
	 *
	 * @return the email of this form
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the emp ID of this form.
	 *
	 * @return the emp ID of this form
	 */
	@Override
	public long getEmpId() {
		return model.getEmpId();
	}

	/**
	 * Returns the field1 of this form.
	 *
	 * @return the field1 of this form
	 */
	@Override
	public String getField1() {
		return model.getField1();
	}

	/**
	 * Returns the field2 of this form.
	 *
	 * @return the field2 of this form
	 */
	@Override
	public boolean getField2() {
		return model.getField2();
	}

	/**
	 * Returns the field3 of this form.
	 *
	 * @return the field3 of this form
	 */
	@Override
	public int getField3() {
		return model.getField3();
	}

	/**
	 * Returns the field4 of this form.
	 *
	 * @return the field4 of this form
	 */
	@Override
	public Date getField4() {
		return model.getField4();
	}

	/**
	 * Returns the field5 of this form.
	 *
	 * @return the field5 of this form
	 */
	@Override
	public String getField5() {
		return model.getField5();
	}

	/**
	 * Returns the group ID of this form.
	 *
	 * @return the group ID of this form
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the mobile no of this form.
	 *
	 * @return the mobile no of this form
	 */
	@Override
	public long getMobileNo() {
		return model.getMobileNo();
	}

	/**
	 * Returns the modified date of this form.
	 *
	 * @return the modified date of this form
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this form.
	 *
	 * @return the primary key of this form
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user name of this form.
	 *
	 * @return the user name of this form
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the uuid of this form.
	 *
	 * @return the uuid of this form
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this form is field2.
	 *
	 * @return <code>true</code> if this form is field2; <code>false</code> otherwise
	 */
	@Override
	public boolean isField2() {
		return model.isField2();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the create date of this form.
	 *
	 * @param createDate the create date of this form
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this form.
	 *
	 * @param email the email of this form
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the emp ID of this form.
	 *
	 * @param empId the emp ID of this form
	 */
	@Override
	public void setEmpId(long empId) {
		model.setEmpId(empId);
	}

	/**
	 * Sets the field1 of this form.
	 *
	 * @param field1 the field1 of this form
	 */
	@Override
	public void setField1(String field1) {
		model.setField1(field1);
	}

	/**
	 * Sets whether this form is field2.
	 *
	 * @param field2 the field2 of this form
	 */
	@Override
	public void setField2(boolean field2) {
		model.setField2(field2);
	}

	/**
	 * Sets the field3 of this form.
	 *
	 * @param field3 the field3 of this form
	 */
	@Override
	public void setField3(int field3) {
		model.setField3(field3);
	}

	/**
	 * Sets the field4 of this form.
	 *
	 * @param field4 the field4 of this form
	 */
	@Override
	public void setField4(Date field4) {
		model.setField4(field4);
	}

	/**
	 * Sets the field5 of this form.
	 *
	 * @param field5 the field5 of this form
	 */
	@Override
	public void setField5(String field5) {
		model.setField5(field5);
	}

	/**
	 * Sets the group ID of this form.
	 *
	 * @param groupId the group ID of this form
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the mobile no of this form.
	 *
	 * @param mobileNo the mobile no of this form
	 */
	@Override
	public void setMobileNo(long mobileNo) {
		model.setMobileNo(mobileNo);
	}

	/**
	 * Sets the modified date of this form.
	 *
	 * @param modifiedDate the modified date of this form
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this form.
	 *
	 * @param primaryKey the primary key of this form
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user name of this form.
	 *
	 * @param userName the user name of this form
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the uuid of this form.
	 *
	 * @param uuid the uuid of this form
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected formWrapper wrap(form form) {
		return new formWrapper(form);
	}

}