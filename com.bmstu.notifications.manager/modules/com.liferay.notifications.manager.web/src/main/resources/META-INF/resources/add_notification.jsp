<%@include file="/init.jsp"%>

<%
	Notification notification = null;
%>

<portlet:renderURL var="viewURL">

	<portlet:param name="mvcPath" value="/view.jsp" />

</portlet:renderURL>

<portlet:actionURL name="addNotification" var="addNotificationURL" />

<aui:form action="<%=addNotificationURL%>"
	name="<portlet:namespace />fm">

	<aui:model-context bean="<%=notification%>"
		model="<%=Notification.class%>" />

	<aui:fieldset>

		<aui:select label="Type" name="type">
			<aui:option value="Device is moving"><liferay-ui:message key="Device is moving" /></aui:option>
			<aui:option value="Fuel drop event"><liferay-ui:message key="Fuel drop event" /></aui:option>
			<aui:option value="Device exceeds the speed"><liferay-ui:message key="Device exceeds the speed" /></aui:option>
			<aui:option value="Device is offline"><liferay-ui:message key="Device is offline" /></aui:option>
			<aui:option value="Ignition is OFF"><liferay-ui:message key="Ignition is OFF" /></aui:option>
			<aui:option value="Text message received"><liferay-ui:message key="Text message received" /></aui:option>
			<aui:option value="Device has exited geofence"><liferay-ui:message key="Device has exited geofence" /></aui:option>
			<aui:option value="Driver has changed"><liferay-ui:message key="Driver has changed" /></aui:option>
			<aui:option value="Command result"><liferay-ui:message key="Command result" /></aui:option>
			<aui:option value="Device has stopped"><liferay-ui:message key="Device has stopped" /></aui:option>
			<aui:option value="Maintenance required"><liferay-ui:message key="Maintenance required" /></aui:option>
			<aui:option value="Device status is unknown"><liferay-ui:message key="Device status is unknown" /></aui:option>
			<aui:option value="Device has entered geofence"><liferay-ui:message key="Device has entered geofence" /></aui:option>
			<aui:option value="Ignition is ON"><liferay-ui:message key="Ignition is ON" /></aui:option>
			<aui:option value="Device is online"><liferay-ui:message key="Device is online" /></aui:option>
			<aui:option value="Alarms"><liferay-ui:message key="Alarms" /></aui:option>
		</aui:select>
		<aui:input name="always" label="All Devices" />
		<aui:input name="mail" label="Send by Mail"/>
		<aui:input name="sms" label="Send by SMS"/>
		<aui:input name="web" label="Send by Web"/>
		<aui:input name="notificationAttributes" label="Attributes"/>

	</aui:fieldset>

	<aui:button-row>

		<aui:button type="submit" />
		<aui:button type="cancel" onClick="<%= viewURL.toString() %>" />

	</aui:button-row>
</aui:form>