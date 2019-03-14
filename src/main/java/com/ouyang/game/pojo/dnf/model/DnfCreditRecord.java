package com.ouyang.game.pojo.dnf.model; 

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/** 
 * @author 作者 ouyq 
 * @date 创建时间：2019年2月22日 下午1:52:25 
 * 类/接口说明 信用记录，每一条记录，代表可能存在的一次失信行为
 */
@Data
@Table(name="dnf_credit_record")
public class DnfCreditRecord implements Serializable{
	
	private static final long serialVersionUID = -8180381734870049665L;
	
	/**
	 * 记录id
	 */
	@Id
	private String creditRecordId;
	
//--------------------------------------游戏相关信息---------------------------------------------
	/**
	 * 网络区域 1:电信区  2:网通区
	 */
	private String netRegion;
	
	/**
	 * 跨区:跨-，跨二
	 */
	private String corssRegion;
	
	/**
	 * 省级区域例如:四川2区
	 */
	private String provinceRegion;
	
	/**
	 * 行骗嫌疑的游戏角色名称
	 */
	private String roleName;
	
	/**
	 * 行骗嫌疑人的冒险团id
	 */
	private String adventureGroupName;
	
//------------------------------------------行骗嫌疑人身份相关信息----------------------------------
	/**
	 * 行骗嫌疑人的QQ号码
	 */
	private String qqNo;
	
	/**
	 * 行骗嫌疑人的手机号码
	 */
	private String mobile;
	
	/**
	 * 行骗嫌疑人的身份证号码
	 */
	private String idCardNo;
}
 