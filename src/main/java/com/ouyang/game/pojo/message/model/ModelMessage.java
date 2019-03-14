package com.ouyang.game.pojo.message.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;

import lombok.Data;

/**
 *  模版消息的pojo
 *  nationCode 国家码，如 86 为中国</br>
 *	phoneNumber 不带国家码的手机号</br>
 *	templateId 信息内容</br>
 *	params 模板参数列表，如模板 {1}...{2}...{3}，那么需要带三个参数</br>
 *	sign 签名，如果填空，系统会使用默认签名</br>
 *	extend 扩展码，可填空</br>
 *	ext 服务端原样返回的参数，可填空</br>
 *
 * @author ouyq
 *
 * @date 2018年7月23日 上午10:06:12
 */
@Data
@ApiModel("发送短信需要的参数详情")
public class ModelMessage implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@ApiModelProperty(value="国际码",name="nationCode",example="86",required=true)
	private String nationCode;
	/**
	 * 手机号
	 */
	@ApiModelProperty(value="手机号",name="phoneNumber",required=true)
	private String phoneNumber;
	@ApiModelProperty(hidden=true)
	private int templateId;//TXmodelId
	@ApiModelProperty(hidden=true)
	private  ArrayList<String> params ;//参数
	@ApiModelProperty(hidden=true)
	private String sign;//签名
	@ApiModelProperty(hidden=true)
	private String extend;//
	@ApiModelProperty(hidden=true)
	private String ext;
	
	public ModelMessage(String nationCode, String phoneNumber, int templateId,
			ArrayList<String> params, String sign, String extend, String ext) {
		super();
		this.nationCode = nationCode;
		this.phoneNumber = phoneNumber;
		this.templateId = templateId;
		this.params = params;
		this.sign = sign;
		this.extend = extend;
		this.ext = ext;
	}
	public ModelMessage() {
		super();
	}
	
	public String getNationCode() {
		return nationCode;
	}
	public void setNationCode(String nationCode) {
		this.nationCode = nationCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getTemplateId() {
		return templateId;
	}
	public void setTemplateId(int templateId) {
		this.templateId = templateId;
	}
	public ArrayList<String> getParams() {
		return params;
	}
	public void setParams(ArrayList<String> params) {
		this.params = params;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getExtend() {
		return extend;
	}
	public void setExtend(String extend) {
		this.extend = extend;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	
	
	
	
}
