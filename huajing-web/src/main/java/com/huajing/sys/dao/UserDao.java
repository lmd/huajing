
package com.huajing.sys.dao;

import java.util.LinkedList;
import java.util.List;

import com.huajing.common.persistence.CrudDao;
import com.huajing.common.persistence.annotation.MyBatisDao;
import com.huajing.sys.entity.User;

/**
* @Description: 用户 Dao
* @author MingDingLi
* @date 2016年2月26日 上午11:41:55
 */
@MyBatisDao
public interface UserDao extends CrudDao<User> {
	
	/**
	 * 根据登录名称查询用户
	 * @param loginName
	 * @return
	 */
	public User getByLoginName(User user);

	/**
	 * 通过OfficeId获取用户列表，仅返回用户id和name（树查询用户时用）
	 * @param user
	 * @return
	 */
	public List<User> findUserByOfficeId(User user);
	
	/**
	* @Description: 根据多节点 id 查询用户
	* @param @param user
	* @param @param office_ids
	* @param @return
	* @return List<User>
	* @throws  
	* @author MingDingLi
	 */
	public List<User> findListByOfficeIds(User user);
	
	/**
	 * 查询全部用户数目
	 * @return
	 */
	public long findAllCount(User user);
	
	/**
	 * 更新用户密码
	 * @param user
	 * @return
	 */
	public int updatePasswordById(User user);
	
	/**
	 * 更新登录信息，如：登录IP、登录时间
	 * @param user
	 * @return
	 */
	public int updateLoginInfo(User user);

	/**
	 * 删除用户角色关联数据
	 * @param user
	 * @return
	 */
	public int deleteUserRole(User user);
	
	/**
	 * 插入用户角色关联数据
	 * @param user
	 * @return
	 */
	public int insertUserRole(User user);
	
	/**
	 * 更新用户信息
	 * @param user
	 * @return
	 */
	public int updateUserInfo(User user);

	/**
	 * 根据登录名称查询用户
	 * @param loginName
	 * @return
	 */
	public User findUserForMobile(User user);

	public LinkedList<User> getSynchUsers();
}
