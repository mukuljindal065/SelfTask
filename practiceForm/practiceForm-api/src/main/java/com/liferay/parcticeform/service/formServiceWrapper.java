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
 * Provides a wrapper for {@link formService}.
 *
 * @author Brian Wing Shun Chan
 * @see formService
 * @generated
 */
public class formServiceWrapper
	implements formService, ServiceWrapper<formService> {

	public formServiceWrapper() {
		this(null);
	}

	public formServiceWrapper(formService formService) {
		_formService = formService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _formService.getOSGiServiceIdentifier();
	}

	@Override
	public formService getWrappedService() {
		return _formService;
	}

	@Override
	public void setWrappedService(formService formService) {
		_formService = formService;
	}

	private formService _formService;

}