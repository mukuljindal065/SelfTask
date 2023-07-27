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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;practice_form&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see form
 * @generated
 */
public class formTable extends BaseTable<formTable> {

	public static final formTable INSTANCE = new formTable();

	public final Column<formTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<formTable, Long> empId = createColumn(
		"empId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<formTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<formTable, Long> mobileNo = createColumn(
		"mobileNo", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<formTable, String> email = createColumn(
		"email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<formTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<formTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<formTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<formTable, String> field1 = createColumn(
		"field1", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<formTable, Boolean> field2 = createColumn(
		"field2", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);
	public final Column<formTable, Integer> field3 = createColumn(
		"field3", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<formTable, Date> field4 = createColumn(
		"field4", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<formTable, String> field5 = createColumn(
		"field5", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private formTable() {
		super("practice_form", formTable::new);
	}

}