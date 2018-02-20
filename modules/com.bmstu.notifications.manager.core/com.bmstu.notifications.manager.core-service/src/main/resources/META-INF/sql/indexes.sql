create index IX_3CF8EF39 on NM_Notification (groupId);
create index IX_EC567845 on NM_Notification (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_B3A4C07 on NM_Notification (uuid_[$COLUMN_LENGTH:75$], groupId);