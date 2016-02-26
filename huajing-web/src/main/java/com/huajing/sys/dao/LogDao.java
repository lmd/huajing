package com.huajing.sys.dao;

import com.huajing.common.persistence.CrudDao;
import com.huajing.common.persistence.annotation.MyBatisDao;
import com.huajing.sys.entity.Log;
import com.huajing.sys.entity.User;

/**
* @Description: 登陆 Dao
* @author MingDingLi
* @date 2016年2月26日 上午11:17:08
 */
@MyBatisDao
public interface LogDao extends CrudDao<Log> {
	/**
	* @Description: 登陆 Dao实现 
	* @param @param user
	* @param @return
	* @return User
	* @throws  
	* @author MingDingLi
	 */
	public User login(User user);
	
	
}
