create table practice_form (
	uuid_ VARCHAR(75) null,
	empId LONG not null primary key,
	groupId LONG,
	mobileNo LONG,
	email VARCHAR(75) null,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	field1 VARCHAR(75) null,
	field2 BOOLEAN,
	field3 INTEGER,
	field4 DATE null,
	field5 VARCHAR(75) null
);