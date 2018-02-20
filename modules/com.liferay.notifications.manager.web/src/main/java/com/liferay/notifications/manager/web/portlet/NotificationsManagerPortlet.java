package com.liferay.notifications.manager.web.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.bmstu.notifications.manager.core.model.Notification;
import com.bmstu.notifications.manager.core.service.NotificationLocalService;
import com.liferay.notifications.manager.web.constants.NotificationsManagerPortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

/**
 * 
 * Notifications manager portlet.
 * 
 * @author Arapov
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=Traccar",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=Notifications manager",
		"javax.portlet.init-param.template-path=/", "javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + NotificationsManagerPortletKeys.NotificationsManager,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class NotificationsManagerPortlet extends MVCPortlet {

	private NotificationLocalService notificationsLocalService;

	/**
	 * 
	 * Adds notification to data base.
	 * 
	 * @param request
	 *            - request. Can't be <code>null</code>.
	 * @param response
	 *            - response. Can't be <code>null</code>
	 * 
	 * @throws PortalException
	 */
	public void addNotification(ActionRequest request, ActionResponse response) throws PortalException {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Notification.class.getName(), request);

		String notificationType = ParamUtil.getString(request, "type");
		boolean notificationAlways = ParamUtil.getBoolean(request, "always");
		boolean notificationMail = ParamUtil.getBoolean(request, "mail");
		boolean notificationSms = ParamUtil.getBoolean(request, "sms");
		boolean notificationWeb = ParamUtil.getBoolean(request, "web");
		String notificationAttributes = ParamUtil.getString(request, "notificationAttributes");

		try {
			notificationsLocalService.addNotification(serviceContext.getUserId(), notificationType, notificationAlways,
					notificationMail, notificationSms, notificationWeb, notificationAttributes, serviceContext);
			SessionMessages.add(request, "Notification Added");
		} catch (Exception e) {
			System.out.println(e);
			SessionErrors.add(request, e.getClass().getName());
			PortalUtil.copyRequestParameters(request, response);
			response.setRenderParameter("mvcPath", "/add_notification.jsp");
		}
	}

	/**
	 * 
	 * Removes notification from data base.
	 * 
	 * @param request
	 *            - request. Can't be <code>null</code>.
	 * @param response
	 *            - response. Can't be <code>null</code>
	 * 
	 * @throws PortalException
	 */
	public void deleteNotification(ActionRequest request, ActionResponse response) throws PortalException {
		long notificationId = ParamUtil.getLong(request, "notificationId");

		try {
			notificationsLocalService.deleteNotification(notificationId);
			SessionMessages.add(request, "Notification Added");
		} catch (Exception e) {
			System.out.println(e);
			SessionErrors.add(request, e.getClass().getName());
			PortalUtil.copyRequestParameters(request, response);
			response.setRenderParameter("mvcPath", "/view.jsp");
		}
	}
	
	/**
	 * 
	 * Binds notifications service.
	 * 
	 */
	@Reference(unbind = "-")
	protected void bindDeviceService(NotificationLocalService notificationsLocalService) {
		this.notificationsLocalService = notificationsLocalService;
	}
}