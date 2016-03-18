package com.huajing.sys.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huajing.sys.dao.UserDao;
import com.huajing.sys.entity.User;

/**
 * 
* @Description: 登陆 Service
* @author MingDingLi
* @date 2016年2月25日 下午7:06:07
 */
@Service
@Transactional(readOnly = true)
public class LogService {
	
	@Autowired
	private UserDao userDao;

	public Map<String,Object> login(User user) {
		
		System.out.println("登陆 service");
		User userS = userDao.login(user);
		if(userS == null){
			System.out.println("用户"+user.getLoginName()+"不存在");
		}else{
			System.out.println("用户"+user.getLoginName()+"登陆成功!");
		}
		
		return null;
		
	}
	
}
