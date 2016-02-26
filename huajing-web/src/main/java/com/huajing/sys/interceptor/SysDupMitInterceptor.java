package com.huajing.sys.interceptor;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.huajing.sys.entity.User;

/**
* @Description: 防止重复请求提交
* @author MingDingLi
* @date 2015年12月1日 上午9:31:25
 */
public class SysDupMitInterceptor implements HandlerInterceptor {
	/* 日志对象 */
	protected Logger logger = LoggerFactory.getLogger(getClass());
	/* 全局用户线程池 */
	Map<String,Object> userThreadMap = new HashMap<String,Object>();
	
	/**
	 * 验证当前用户是否有其他线程执行
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	/**
	 * 将当前用户执行线程重池中剔除
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		
	}

}
