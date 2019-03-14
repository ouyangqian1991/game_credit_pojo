package com.ouyang.game.pojo.user.business; 

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;


import lombok.Data;

/** 
 * @author 作者 ouyq 
 * @date 创建时间：2019年3月6日 上午10:02:41 
 * 类/接口说明 用户发生注册行为时，可以将已知的用户信息封装传递的类
 */
@Data
@ApiModel("用户发生注册行为时，用于封装用户数据的对象")
public class RegisterUserInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6100343110208161561L;

	
	
	/**
	 * 用户名
	 */
	@ApiModelProperty(value="用户名",name="userName",required=false)
	private String userName;
	
	/**
	 * 头像图片链接
	 */
	@ApiModelProperty(value="用户名",name="userName",required=false)
	private String headImageUrl;
	
	/**
	 * 性别 0未知（默认）  1男  2女
	 */
	@ApiModelProperty(value="性别 0:未知（默认）1:男  2:女",example="1",dataType="Integer",name="gender")
	private Integer gender;
	
	/**
	 * 身份证号码
	 */
	@ApiModelProperty(value="身份证号码",name="idCardNo")
	private String idCardNo;
	
	/**
	 * QQ号码
	 */
	@ApiModelProperty(value="QQ号码",name="userName")
	private String qqNo;
	
	/**
	 * 电子邮箱
	 */
	@ApiModelProperty(value="电子邮箱",name="email")
	private String email;
	
	
}
 