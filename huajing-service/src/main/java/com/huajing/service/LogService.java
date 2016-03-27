package com.huajing.service;

import java.util.Map;

import com.huajing.entity.User;

public interface LogService {
	public Map<String,Object> login(User user);
}
