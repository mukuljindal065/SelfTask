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

package com.liferay.parcticeform.service.persistence;

import com.liferay.parcticeform.model.form;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the form service. This utility wraps <code>com.liferay.parcticeform.service.persistence.impl.formPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see formPersistence
 * @generated
 */
public class formUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(form form) {
		getPersistence().clearCache(form);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, form> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<form> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<form> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<form> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<form> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static form update(form form) {
		return getPersistence().update(form);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static form update(form form, ServiceContext serviceContext) {
		return getPersistence().update(form, serviceContext);
	}

	/**
	 * Returns all the forms where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching forms
	 */
	public static List<form> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the forms where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>formModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of forms
	 * @param end the upper bound of the range of forms (not inclusive)
	 * @return the range of matching forms
	 */
	public static List<form> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the forms where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>formModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of forms
	 * @param end the upper bound of the range of forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching forms
	 */
	public static List<form> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<form> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the forms where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>formModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of forms
	 * @param end the upper bound of the range of forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching forms
	 */
	public static List<form> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<form> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first form in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form
	 * @throws NoSuchformException if a matching form could not be found
	 */
	public static form findByUuid_First(
			String uuid, OrderByComparator<form> orderByComparator)
		throws com.liferay.parcticeform.exception.NoSuchformException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first form in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form, or <code>null</code> if a matching form could not be found
	 */
	public static form fetchByUuid_First(
		String uuid, OrderByComparator<form> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last form in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form
	 * @throws NoSuchformException if a matching form could not be found
	 */
	public static form findByUuid_Last(
			String uuid, OrderByComparator<form> orderByComparator)
		throws com.liferay.parcticeform.exception.NoSuchformException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last form in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form, or <code>null</code> if a matching form could not be found
	 */
	public static form fetchByUuid_Last(
		String uuid, OrderByComparator<form> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the forms before and after the current form in the ordered set where uuid = &#63;.
	 *
	 * @param empId the primary key of the current form
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next form
	 * @throws NoSuchformException if a form with the primary key could not be found
	 */
	public static form[] findByUuid_PrevAndNext(
			long empId, String uuid, OrderByComparator<form> orderByComparator)
		throws com.liferay.parcticeform.exception.NoSuchformException {

		return getPersistence().findByUuid_PrevAndNext(
			empId, uuid, orderByComparator);
	}

	/**
	 * Removes all the forms where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of forms where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching forms
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the form where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchformException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching form
	 * @throws NoSuchformException if a matching form could not be found
	 */
	public static form findByUUID_G(String uuid, long groupId)
		throws com.liferay.parcticeform.exception.NoSuchformException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the form where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching form, or <code>null</code> if a matching form could not be found
	 */
	public static form fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the form where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching form, or <code>null</code> if a matching form could not be found
	 */
	public static form fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the form where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the form that was removed
	 */
	public static form removeByUUID_G(String uuid, long groupId)
		throws com.liferay.parcticeform.exception.NoSuchformException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of forms where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching forms
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the forms where empId = &#63;.
	 *
	 * @param empId the emp ID
	 * @return the matching forms
	 */
	public static List<form> findByempId(long empId) {
		return getPersistence().findByempId(empId);
	}

	/**
	 * Returns a range of all the forms where empId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>formModelImpl</code>.
	 * </p>
	 *
	 * @param empId the emp ID
	 * @param start the lower bound of the range of forms
	 * @param end the upper bound of the range of forms (not inclusive)
	 * @return the range of matching forms
	 */
	public static List<form> findByempId(long empId, int start, int end) {
		return getPersistence().findByempId(empId, start, end);
	}

	/**
	 * Returns an ordered range of all the forms where empId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>formModelImpl</code>.
	 * </p>
	 *
	 * @param empId the emp ID
	 * @param start the lower bound of the range of forms
	 * @param end the upper bound of the range of forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching forms
	 */
	public static List<form> findByempId(
		long empId, int start, int end,
		OrderByComparator<form> orderByComparator) {

		return getPersistence().findByempId(
			empId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the forms where empId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>formModelImpl</code>.
	 * </p>
	 *
	 * @param empId the emp ID
	 * @param start the lower bound of the range of forms
	 * @param end the upper bound of the range of forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching forms
	 */
	public static List<form> findByempId(
		long empId, int start, int end,
		OrderByComparator<form> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByempId(
			empId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first form in the ordered set where empId = &#63;.
	 *
	 * @param empId the emp ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form
	 * @throws NoSuchformException if a matching form could not be found
	 */
	public static form findByempId_First(
			long empId, OrderByComparator<form> orderByComparator)
		throws com.liferay.parcticeform.exception.NoSuchformException {

		return getPersistence().findByempId_First(empId, orderByComparator);
	}

	/**
	 * Returns the first form in the ordered set where empId = &#63;.
	 *
	 * @param empId the emp ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form, or <code>null</code> if a matching form could not be found
	 */
	public static form fetchByempId_First(
		long empId, OrderByComparator<form> orderByComparator) {

		return getPersistence().fetchByempId_First(empId, orderByComparator);
	}

	/**
	 * Returns the last form in the ordered set where empId = &#63;.
	 *
	 * @param empId the emp ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form
	 * @throws NoSuchformException if a matching form could not be found
	 */
	public static form findByempId_Last(
			long empId, OrderByComparator<form> orderByComparator)
		throws com.liferay.parcticeform.exception.NoSuchformException {

		return getPersistence().findByempId_Last(empId, orderByComparator);
	}

	/**
	 * Returns the last form in the ordered set where empId = &#63;.
	 *
	 * @param empId the emp ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form, or <code>null</code> if a matching form could not be found
	 */
	public static form fetchByempId_Last(
		long empId, OrderByComparator<form> orderByComparator) {

		return getPersistence().fetchByempId_Last(empId, orderByComparator);
	}

	/**
	 * Removes all the forms where empId = &#63; from the database.
	 *
	 * @param empId the emp ID
	 */
	public static void removeByempId(long empId) {
		getPersistence().removeByempId(empId);
	}

	/**
	 * Returns the number of forms where empId = &#63;.
	 *
	 * @param empId the emp ID
	 * @return the number of matching forms
	 */
	public static int countByempId(long empId) {
		return getPersistence().countByempId(empId);
	}

	/**
	 * Caches the form in the entity cache if it is enabled.
	 *
	 * @param form the form
	 */
	public static void cacheResult(form form) {
		getPersistence().cacheResult(form);
	}

	/**
	 * Caches the forms in the entity cache if it is enabled.
	 *
	 * @param forms the forms
	 */
	public static void cacheResult(List<form> forms) {
		getPersistence().cacheResult(forms);
	}

	/**
	 * Creates a new form with the primary key. Does not add the form to the database.
	 *
	 * @param empId the primary key for the new form
	 * @return the new form
	 */
	public static form create(long empId) {
		return getPersistence().create(empId);
	}

	/**
	 * Removes the form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param empId the primary key of the form
	 * @return the form that was removed
	 * @throws NoSuchformException if a form with the primary key could not be found
	 */
	public static form remove(long empId)
		throws com.liferay.parcticeform.exception.NoSuchformException {

		return getPersistence().remove(empId);
	}

	public static form updateImpl(form form) {
		return getPersistence().updateImpl(form);
	}

	/**
	 * Returns the form with the primary key or throws a <code>NoSuchformException</code> if it could not be found.
	 *
	 * @param empId the primary key of the form
	 * @return the form
	 * @throws NoSuchformException if a form with the primary key could not be found
	 */
	public static form findByPrimaryKey(long empId)
		throws com.liferay.parcticeform.exception.NoSuchformException {

		return getPersistence().findByPrimaryKey(empId);
	}

	/**
	 * Returns the form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param empId the primary key of the form
	 * @return the form, or <code>null</code> if a form with the primary key could not be found
	 */
	public static form fetchByPrimaryKey(long empId) {
		return getPersistence().fetchByPrimaryKey(empId);
	}

	/**
	 * Returns all the forms.
	 *
	 * @return the forms
	 */
	public static List<form> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>formModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of forms
	 * @param end the upper bound of the range of forms (not inclusive)
	 * @return the range of forms
	 */
	public static List<form> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>formModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of forms
	 * @param end the upper bound of the range of forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of forms
	 */
	public static List<form> findAll(
		int start, int end, OrderByComparator<form> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>formModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of forms
	 * @param end the upper bound of the range of forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of forms
	 */
	public static List<form> findAll(
		int start, int end, OrderByComparator<form> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the forms from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of forms.
	 *
	 * @return the number of forms
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static formPersistence getPersistence() {
		return _persistence;
	}

	private static volatile formPersistence _persistence;

}