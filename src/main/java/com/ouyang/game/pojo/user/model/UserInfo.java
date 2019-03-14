package com.ouyang.game.pojo.user.model; 

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/** 
 * @author 作者 ouyq 
 * @date 创建时间：2019年2月19日 下午4:46:54 
 * 类/接口说明 用户信息表
 */
@Data
@Table(name="user_info")
@ApiModel(value="用户信息参数")
public class UserInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7822524683528965244L;
	
	/**
	 * 用户id
	 */
	@Id
	@ApiModelProperty(value="用户id",name="userId")
	private String userId;
	
	/**
	 * 手机号码
	 */
	@ApiModelProperty(value="用户的手机号码",name="mobile")
	private String mobile;
	
	/**
	 * 用户名
	 */
	@ApiModelProperty(value="用户名",name="userName")
	private String userName;
	
	/**
	 * 头像图片链接
	 */
	@ApiModelProperty(value="头像图片链接",name="headImageUrl")
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
	
	/**
	 * 使用状态 0:不可使用 1:可使用（默认）
	 */
	@ApiModelProperty(value="使用状态 0:不可使用 1:可使用（默认）",example="1",dataType="Integer",name="userName")
	private Integer status ;

	/**
	 * 创建时间
	 */
	@ApiModelProperty(value="创建时间",name="createTime")
	private Date createTime;
	
	/**
	 * 修改时间
	 */
	@ApiModelProperty(value="修改时间",name="updateTime")
	private Date updateTime;
	
	
}
 