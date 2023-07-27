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

package com.liferay.parcticeform.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link formLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see formLocalService
 * @generated
 */
public class formLocalServiceWrapper
	implements formLocalService, ServiceWrapper<formLocalService> {

	public formLocalServiceWrapper() {
		this(null);
	}

	public formLocalServiceWrapper(formLocalService formLocalService) {
		_formLocalService = formLocalService;
	}

	/**
	 * Adds the form to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect formLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param form the form
	 * @return the form that was added
	 */
	@Override
	public com.liferay.parcticeform.model.form addform(
		com.liferay.parcticeform.model.form form) {

		return _formLocalService.addform(form);
	}

	/**
	 * Creates a new form with the primary key. Does not add the form to the database.
	 *
	 * @param empId the primary key for the new form
	 * @return the new form
	 */
	@Override
	public com.liferay.parcticeform.model.form createform(long empId) {
		return _formLocalService.createform(empId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _formLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the form from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect formLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param form the form
	 * @return the form that was removed
	 */
	@Override
	public com.liferay.parcticeform.model.form deleteform(
		com.liferay.parcticeform.model.form form) {

		return _formLocalService.deleteform(form);
	}

	/**
	 * Deletes the form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect formLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param empId the primary key of the form
	 * @return the form that was removed
	 * @throws PortalException if a form with the primary key could not be found
	 */
	@Override
	public com.liferay.parcticeform.model.form deleteform(long empId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _formLocalService.deleteform(empId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _formLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _formLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _formLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _formLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _formLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.parcticeform.model.impl.formModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _formLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.parcticeform.model.impl.formModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _formLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _formLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _formLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.parcticeform.model.form fetchform(long empId) {
		return _formLocalService.fetchform(empId);
	}

	/**
	 * Returns the form matching the UUID and group.
	 *
	 * @param uuid the form's UUID
	 * @param groupId the primary key of the group
	 * @return the matching form, or <code>null</code> if a matching form could not be found
	 */
	@Override
	public com.liferay.parcticeform.model.form fetchformByUuidAndGroupId(
		String uuid, long groupId) {

		return _formLocalService.fetchformByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.parcticeform.model.form fillFormData(
		String empName, String emailId, Long mobileNo) {

		return _formLocalService.fillFormData(empName, emailId, mobileNo);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _formLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the form with the primary key.
	 *
	 * @param empId the primary key of the form
	 * @return the form
	 * @throws PortalException if a form with the primary key could not be found
	 */
	@Override
	public com.liferay.parcticeform.model.form getform(long empId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _formLocalService.getform(empId);
	}

	/**
	 * Returns the form matching the UUID and group.
	 *
	 * @param uuid the form's UUID
	 * @param groupId the primary key of the group
	 * @return the matching form
	 * @throws PortalException if a matching form could not be found
	 */
	@Override
	public com.liferay.parcticeform.model.form getformByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _formLocalService.getformByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.parcticeform.model.impl.formModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of forms
	 * @param end the upper bound of the range of forms (not inclusive)
	 * @return the range of forms
	 */
	@Override
	public java.util.List<com.liferay.parcticeform.model.form> getforms(
		int start, int end) {

		return _formLocalService.getforms(start, end);
	}

	/**
	 * Returns the number of forms.
	 *
	 * @return the number of forms
	 */
	@Override
	public int getformsCount() {
		return _formLocalService.getformsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _formLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _formLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _formLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.liferay.parcticeform.model.form saveFormData(
		String empName, Long empId, String emailId, Long mobileNo) {

		return _formLocalService.saveFormData(
			empName, empId, emailId, mobileNo);
	}

	@Override
	public void sendEmail(String email) {
		_formLocalService.sendEmail(email);
	}

	/**
	 * Updates the form in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect formLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param form the form
	 * @return the form that was updated
	 */
	@Override
	public com.liferay.parcticeform.model.form updateform(
		com.liferay.parcticeform.model.form form) {

		return _formLocalService.updateform(form);
	}

	@Override
	public formLocalService getWrappedService() {
		return _formLocalService;
	}

	@Override
	public void setWrappedService(formLocalService formLocalService) {
		_formLocalService = formLocalService;
	}

	private formLocalService _formLocalService;

}