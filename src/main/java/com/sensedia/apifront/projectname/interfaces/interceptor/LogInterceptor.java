package com.sensedia.apifront.projectname.interfaces.interceptor;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.MDC;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * Classe responsavel por adicionar um id unico para cada requisção ao api-front, que será utilizado em todos os logs para identificar uma requisção
 * 
 * @author Ronaldo Ronie (ronaldo.nascimento@sensedia.com)
 *
 */

public class LogInterceptor extends HandlerInterceptorAdapter {

	private static final String REQUEST_ID_KEY = "requestId";
	
	public static String getRequestId() {
		
		Object reqId = MDC.get(REQUEST_ID_KEY);
		if (reqId != null) {
			return reqId.toString();	
		}
		
		return null;
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		MDC.put(REQUEST_ID_KEY, UUID.randomUUID().toString());
		return super.preHandle(request, response, handler);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		super.afterCompletion(request, response, handler, ex);
		MDC.clear();
	}
}