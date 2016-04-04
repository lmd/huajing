package com.huajing.common.exception;

public class HuaJingExceptionCommon extends Exception {
	public HuaJingExceptionCommon(String msg){
		super(msg);
	}
	public static void throwException(String msg) {
		throw new HuaJingException(msg);
	}
	
	public static void runtimeException(String msg) {
		throw new HuaJingException(msg);
	}
	
}
