package com.ouyang.game.pojo.user.business; 

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;


import lombok.Data;

/** 
 * @author 作者 ouyq 
 * @date 创建时间：2019年2月19日 下午5:27:26 
 * 类/接口说明 登录传输的信息
 */
@Data
@ApiModel(value="浏览器环境登录参数详情")
public class LoginDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2875602083585812899L;
	
	/**
	 * 手机号
	 */
	@ApiModelProperty(value="手机号码",name="mobile",required=true)
	private String mobile;
	
	/**
	 * 验证码
	 */
	@ApiModelProperty(value="手机接收到的验证码",name="verificationCode",required=true)
	private String verificationCode;
	
	/**
	 * 注册用户的外带信息
	 */
	@ApiModelProperty(value="注册用户的外带信息,非新用户填写无效",name="registUserInfo",required=false)
	private RegisterUserInfo registUserInfo;
}
 