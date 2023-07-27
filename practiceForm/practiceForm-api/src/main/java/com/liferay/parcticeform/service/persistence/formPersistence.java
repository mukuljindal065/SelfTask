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

import com.liferay.parcticeform.exception.NoSuchformException;
import com.liferay.parcticeform.model.form;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see formUtil
 * @generated
 */
@ProviderType
public interface formPersistence extends BasePersistence<form> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link formUtil} to access the form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the forms where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching forms
	 */
	public java.util.List<form> findByUuid(String uuid);

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
	public java.util.List<form> findByUuid(String uuid, int start, int end);

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
	public java.util.List<form> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<form>
			orderByComparator);

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
	public java.util.List<form> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<form>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first form in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form
	 * @throws NoSuchformException if a matching form could not be found
	 */
	public form findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<form>
				orderByComparator)
		throws NoSuchformException;

	/**
	 * Returns the first form in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form, or <code>null</code> if a matching form could not be found
	 */
	public form fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<form>
			orderByComparator);

	/**
	 * Returns the last form in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form
	 * @throws NoSuchformException if a matching form could not be found
	 */
	public form findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<form>
				orderByComparator)
		throws NoSuchformException;

	/**
	 * Returns the last form in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form, or <code>null</code> if a matching form could not be found
	 */
	public form fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<form>
			orderByComparator);

	/**
	 * Returns the forms before and after the current form in the ordered set where uuid = &#63;.
	 *
	 * @param empId the primary key of the current form
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next form
	 * @throws NoSuchformException if a form with the primary key could not be found
	 */
	public form[] findByUuid_PrevAndNext(
			long empId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<form>
				orderByComparator)
		throws NoSuchformException;

	/**
	 * Removes all the forms where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of forms where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching forms
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the form where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchformException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching form
	 * @throws NoSuchformException if a matching form could not be found
	 */
	public form findByUUID_G(String uuid, long groupId)
		throws NoSuchformException;

	/**
	 * Returns the form where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching form, or <code>null</code> if a matching form could not be found
	 */
	public form fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the form where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching form, or <code>null</code> if a matching form could not be found
	 */
	public form fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the form where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the form that was removed
	 */
	public form removeByUUID_G(String uuid, long groupId)
		throws NoSuchformException;

	/**
	 * Returns the number of forms where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching forms
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the forms where empId = &#63;.
	 *
	 * @param empId the emp ID
	 * @return the matching forms
	 */
	public java.util.List<form> findByempId(long empId);

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
	public java.util.List<form> findByempId(long empId, int start, int end);

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
	public java.util.List<form> findByempId(
		long empId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<form>
			orderByComparator);

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
	public java.util.List<form> findByempId(
		long empId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<form>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first form in the ordered set where empId = &#63;.
	 *
	 * @param empId the emp ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form
	 * @throws NoSuchformException if a matching form could not be found
	 */
	public form findByempId_First(
			long empId,
			com.liferay.portal.kernel.util.OrderByComparator<form>
				orderByComparator)
		throws NoSuchformException;

	/**
	 * Returns the first form in the ordered set where empId = &#63;.
	 *
	 * @param empId the emp ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching form, or <code>null</code> if a matching form could not be found
	 */
	public form fetchByempId_First(
		long empId,
		com.liferay.portal.kernel.util.OrderByComparator<form>
			orderByComparator);

	/**
	 * Returns the last form in the ordered set where empId = &#63;.
	 *
	 * @param empId the emp ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form
	 * @throws NoSuchformException if a matching form could not be found
	 */
	public form findByempId_Last(
			long empId,
			com.liferay.portal.kernel.util.OrderByComparator<form>
				orderByComparator)
		throws NoSuchformException;

	/**
	 * Returns the last form in the ordered set where empId = &#63;.
	 *
	 * @param empId the emp ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching form, or <code>null</code> if a matching form could not be found
	 */
	public form fetchByempId_Last(
		long empId,
		com.liferay.portal.kernel.util.OrderByComparator<form>
			orderByComparator);

	/**
	 * Removes all the forms where empId = &#63; from the database.
	 *
	 * @param empId the emp ID
	 */
	public void removeByempId(long empId);

	/**
	 * Returns the number of forms where empId = &#63;.
	 *
	 * @param empId the emp ID
	 * @return the number of matching forms
	 */
	public int countByempId(long empId);

	/**
	 * Caches the form in the entity cache if it is enabled.
	 *
	 * @param form the form
	 */
	public void cacheResult(form form);

	/**
	 * Caches the forms in the entity cache if it is enabled.
	 *
	 * @param forms the forms
	 */
	public void cacheResult(java.util.List<form> forms);

	/**
	 * Creates a new form with the primary key. Does not add the form to the database.
	 *
	 * @param empId the primary key for the new form
	 * @return the new form
	 */
	public form create(long empId);

	/**
	 * Removes the form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param empId the primary key of the form
	 * @return the form that was removed
	 * @throws NoSuchformException if a form with the primary key could not be found
	 */
	public form remove(long empId) throws NoSuchformException;

	public form updateImpl(form form);

	/**
	 * Returns the form with the primary key or throws a <code>NoSuchformException</code> if it could not be found.
	 *
	 * @param empId the primary key of the form
	 * @return the form
	 * @throws NoSuchformException if a form with the primary key could not be found
	 */
	public form findByPrimaryKey(long empId) throws NoSuchformException;

	/**
	 * Returns the form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param empId the primary key of the form
	 * @return the form, or <code>null</code> if a form with the primary key could not be found
	 */
	public form fetchByPrimaryKey(long empId);

	/**
	 * Returns all the forms.
	 *
	 * @return the forms
	 */
	public java.util.List<form> findAll();

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
	public java.util.List<form> findAll(int start, int end);

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
	public java.util.List<form> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<form>
			orderByComparator);

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
	public java.util.List<form> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<form>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the forms from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of forms.
	 *
	 * @return the number of forms
	 */
	public int countAll();

}