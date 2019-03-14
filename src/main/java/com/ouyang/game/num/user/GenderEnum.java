package com.ouyang.game.num.user;



/**
 * @author ouyangqian
 * @version 1.0
 * @date: 2018/05/22 15:55:30
 * @description: 状态枚举，1表肯定。0表否定
 */
public enum GenderEnum  {

	/**
	 * 是 1
	 */
	UNKNOWN("未知", 0),
	
	/**
	 * 是 1
	 */
	MALE("男", 1),
	
	/**
	 * 否 0
	 */
	 FEMALE("女", 2),;
	
	

	private String key;
	private Integer value;

	private GenderEnum(String key, Integer value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public Integer getValue() {
		return value;
	}


	/**
	 * 根据key获取value
	 * 
	 * @param value
	 * @return
	 */
	public static Integer keyToValue(String key) {
		for (GenderEnum e : GenderEnum.class.getEnumConstants()) {
			if (e.getKey().equals(key)) {
				return e.getValue();
			}
		}
		return null;
	}

	/**
	 * 根据value获取key
	 * 
	 * @param value
	 * @return
	 */
	public static String valueToKey(Integer value) {
		for (GenderEnum e : GenderEnum.class.getEnumConstants()) {
			if (e.getValue() == value) {
				return e.getKey();
			}
		}
		return null;
	}

}
