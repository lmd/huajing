
package com.huajing.entity;

import java.util.Date;

/**
 * 用户Entity
 * @author MingDingLi
 * @version 2013-12-05
 */
public class User {

	private static final long serialVersionUID = 1L;
	
	/**
	* @Fields ISADMIN 是管理员,1
	*/
	public static final String ISADMIN = "1";
	
	private Date createDate;	    // 注册时间
	
	private String loginName;   // 登录名
	private String password;    // 密码
	private String name;	    // 姓名
	private String mobile;	    // 手机
	private String userType;    // 节点权限  
	private String newPassword;	// 新密码
	private String adminFlag;//是否是管理员 1:是 0:否
	
	private String loginIp;	    // 最后登陆IP
	private Date loginDate;	    // 最后登陆日期
	private String loginFlag;	// 是否允许登陆
	private String oldLoginName;// 原登录名
	private String oldLoginIp;	// 上次登陆IP
	private Date oldLoginDate;	// 上次登陆日期	
	
	 private String no;		// 工号
	 private String photo;	// 头像
	 private String email;	// 邮箱
	 private String phone;	// 电话
	

	

	public User() {
		super();
	}
	
	public User(String id){
	}

	public User(String id, String loginName){
		this.loginName = loginName;
	}

	
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	public String getLoginFlag() {
		return loginFlag;
	}

	public String getAdminFlag() {
		return adminFlag;
	}

	public void setAdminFlag(String adminFlag) {
		this.adminFlag = adminFlag;
	}

	public void setLoginFlag(String loginFlag) {
		this.loginFlag = loginFlag;
	}

	

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}
	
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public String getOldLoginName() {
		return oldLoginName;
	}

	public void setOldLoginName(String oldLoginName) {
		this.oldLoginName = oldLoginName;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getOldLoginIp() {
		if (oldLoginIp == null){
			return loginIp;
		}
		return oldLoginIp;
	}

	public void setOldLoginIp(String oldLoginIp) {
		this.oldLoginIp = oldLoginIp;
	}

	public Date getOldLoginDate() {
		if (oldLoginDate == null){
			return loginDate;
		}
		return oldLoginDate;
	}

	public void setOldLoginDate(Date oldLoginDate) {
		this.oldLoginDate = oldLoginDate;
	}

	public static boolean isAdmin(String id){
		return id != null && "1".equals(id);
	}
	
}