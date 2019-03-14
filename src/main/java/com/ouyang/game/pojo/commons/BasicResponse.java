package com.ouyang.game.pojo.commons;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Collection;

/**
 * 统一接口返回值
 * @author Administrator
 *
 * @param <T>
 */
@ApiModel("游戏征信系统统一的返回数据")
public class BasicResponse<T> implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public static final String SUCCESS_MESSAGE = "请求成功";
	public static final String ERROR_MESSAGE = "请求失败";
	public static final String SUCCESS_CODE = "000";
	public static final String ERROR_CODE = "-1";
	
	@ApiModelProperty(value="访问的状态码",name="code")
	private String code;
	
	@ApiModelProperty(value="访问接口结果的提示信息",name="message")
	private String message;
	
	/**
	 * 需返回的业务数据
	 */
	@ApiModelProperty(value="访问接口结果的业务数据存放区",name="data")
	private T data;

	
	public BasicResponse() {
		super();
		this.code = SUCCESS_CODE;
		this.message = SUCCESS_MESSAGE;
	}


	public BasicResponse(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public BasicResponse(String code, String message, T data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}


	@SuppressWarnings("rawtypes")
	public BasicResponse(T data) {
		super();
		if (data == null || (data instanceof Collection && ((Collection) data).isEmpty())) {
			this.code = SUCCESS_CODE;
			this.message = SUCCESS_MESSAGE;
        } else {
        	this.code = SUCCESS_CODE;
    		this.message = SUCCESS_MESSAGE;
            this.data = data;
        }
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public String toString() {
		return "BasicYouleResponse [code=" + code + ", message=" + message
				+ ", data=" + data + "]";
	}

}
