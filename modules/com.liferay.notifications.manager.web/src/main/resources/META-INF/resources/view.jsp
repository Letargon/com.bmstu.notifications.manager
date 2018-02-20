<%@include file="/init.jsp"%>

<%
	Notification notificationVar = null;
%>

<aui:button-row cssClass="traccar-buttons">

	<portlet:renderURL var="addNotificationURL">
		<portlet:param name="mvcPath" value="/add_notification.jsp" />
	</portlet:renderURL>

	<aui:button onClick="<%=addNotificationURL.toString()%>"
		value="Add Notification"></aui:button>

</aui:button-row>

<liferay-ui:search-container
	total="<%=NotificationLocalServiceUtil.getNotificationsCount()%>">
	<liferay-ui:search-container-results
		results="<%=NotificationLocalServiceUtil.getNotifications(scopeGroupId.longValue(),
						searchContainer.getStart(), searchContainer.getEnd())%>" />

	<liferay-ui:search-container-row
		className="com.bmstu.notifications.manager.core.model.Notification"
		modelVar="notification">

		<liferay-ui:search-container-column-text property="notificationId" name="ID"/>
		<liferay-ui:search-container-column-text property="type" value="Some Type"/>
		<liferay-ui:search-container-column-text property="always" name="All Devices"/>
		<liferay-ui:search-container-column-text property="mail" name="Send by Mail"/>
		<liferay-ui:search-container-column-text property="sms" name="Send by SMS"/>
		<liferay-ui:search-container-column-text property="web" name="Send by Web"/>
		<liferay-ui:search-container-column-text property="notificationAttributes" name="Attributes"/>

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>

<portlet:actionURL name="deleteNotification" var="deleteNotificationURL" />
<aui:form action="<%=deleteNotificationURL%>" name="<portlet:namespace />fm">

	<aui:model-context bean="<%=notificationVar%>" model="<%=Notification.class%>" />

	<aui:fieldset>

		<aui:input name="notificationId" label="ID" type="clear" />

	</aui:fieldset>

	<aui:button-row>

		<aui:button type="submit" value="delete" />

	</aui:button-row>
</aui:form>