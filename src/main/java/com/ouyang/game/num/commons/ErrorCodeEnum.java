package com.ouyang.game.num.commons;

/**
 * 返回信息错误编码
 * 
 * @author Administrator
 *
 */
public enum ErrorCodeEnum {

	/**************************** 系统请求返回码 ****************************/
	SUCCESS("000", "请求成功"),

	REQUEST_METHOD_ERROR("-3", "接口请求方法类型错误"),

	REQUEST_PARAMETER_IS_INCORRECT("-2", "请求参数有误"),

	INTERNAL_SERVER_ERROR("-1", "服务繁忙"),

	REQUESTED_URL_DOESNT_EXIST("-4", "请求的资源不存在"),

	OPERATION_FREQUENTLY("-5", "请求频繁，请勿重复请求"),

	SYSTEM_BUSY("-6", "系统正在处理请求......"),

	ILLEGLITY_IP("-7", "IP被禁用，请联系客服 "),

	ILLEGLITY_USER("-8", "用户被禁用，请联系客服"),

	ILLEGLITY_PICTURE_CODE_LIMT("-9", "图形验证码错误，今日已无机会，请明日再来！或联系客服处理！"),

	PHONE_SEND_COUNT_LIMIT("-10", "短信发送次数过多，请稍后重试"),

	REQUEST_COUNT_LIMIT("-11", "访问次数超出限制"),

	/**************************** 业务请求返回码---签到 ****************************/
	ALREADY_SIGNED_IN("101", "今天已经签到"),

	SIGNED_IN_FAIL("102", "签到失败"),

	SIGN_RULE_FAIL("103", "获取签到规则失败"),

	SIGN_REWARD_FAIL("104", "获取签到奖励失败"),

	/**************************** 业务请求返回码---短信登录 ****************************/
	SMS_CODE_ERROR("201", "短信验证码错误"),

	PHONE_NOT_EMPTY("202", "手机号不能为空"),

	PHONE_NUMBER_ERROR("203", "手机号码格式不正确"),

	FREQUENT_OPERATION("204", "两次发送短信间隔不能少于60秒"),

	SMS_SEND_ERROR("205", "短信发送失败，请填写正确的手机号码"),
	
	PHONE_EXIST_ERROR("206", "操作失败，所填手机号已注册！"),
	MESSAGE_SYSTEM_EXCEPTION("207","短信服务模块异常，暂时无法使用，请稍后再试！"),

	/**************************** 业务请求返回码---短信登录 ****************************/
	REPERTORY_CODE_ERROR("11101", "库存数量不足"), 
	REPERTORY_CODE_SECCUSE("11102", "加入购物车成功"),

	/**************************** 任务中心错误码 ****************************/
	TASK_NOT_EXISTS("901", "当前任务不存在"),

	MENU_CODE_NOT_EMPTY("902", "菜单代码不能为空"),

	REQ_PARAM_WRONG("903", "参数有误"),

	TASK_NOT_COMPLETE("904", "当前任务还未完成"),

	REWARD_ALREADY_GET("905", "当前任务奖励已领取过了"),

	TASK_STATUS_EXCEPTION("906", "当前任务状态异常"),

	REWARD_NOT_EXISTS("907", "当前任务未设置奖励"),

	DATA_EXCEPTION("908", "数据异常"),

	PREVIOUS_NOT_COMPLETE("909", "请先完成上级任务哦"),

	PARAM_CAN_NOT_EMPEY("910", "参数不能为空"),

	TASK_NOT_COMPLETE_OR_ALREADY_GET("911", "当前任务未完成或奖励已领取"),

	TASK_STATUS_NOT_ACCORD("912", "当前任务状态不符合领取条件"),

	TASK_ALREADY_DONE("913", "当前任务已经完成了"),

	TASK_INIT_EXCEPTION("914", "任务中心初始化操作发生异常"),

	/**************************** 后台系统错误代码 ****************************/
	BACKSTAGE_SERVICE_ERROR("7400", "后台服务器错误"),

	BACKSTAGE_UNKNOWN_ACCOUNT("7401", "账号不存在"),

	BACKSTAGE_UNAUTHORIZED("7402", "该功能未授权"),

	BACKSTAGE_INCORRECT_CREDENTIALS("7403", "密码错误"),

	BACKSTAGE_ACCOUNT_FROZEN("7404", "账号状态异常"),

	BACKSTAGE_ADD_FAILED("7405", "新增操作失败"),

	BACKSTAGE_UPDATE_FAILED("7406", "更新操作失败"),

	BACKSTAGE_DELETE_FAILED("7407", "删除操作失败"),

	BACKSTAGE_REQUEST_PARAMS_ERROR("7408", "请求参数错误"),

	BACKSTAGE_DATA_UNAUTHORIZED("7409", "当前数据无权限获取"),

	BACKSTAGE_UNLOGIN("7410", "账号未登陆"),
	
	BACKSTAGE_VALUE_EXISTING("7411", "已存在"),
	
	BACKSTAGE_SUPER_ERROR("7412", "禁止执行超级管理员数据操作"),
	
	STAR_ACQUIRE_UTOKEN_ERROR("70031", "acquire utoken error"),
	
	/**************************** 后台商品错误代码 ****************************/
	SPECIFICATIONNAME_VALUE_EXISTING("7551", "规格名称重复"),
	
	GOOD_DOWM_ERROR("7552", "商品下架失败"),
	
	/**************************** 登录错误代码 ****************************/
	IMAGE_CODE_ERROR("20062", "图形验证码错误，每天有5次输入错误限制"),

	INNIT_CARD_LEVEL_ERROR("80000", "初始化会员等级失败"),

	PLATFORMID_INVALIDATE_ERROR("80001", "平台id不正确"),

	WX_TOKEN_INVALIDATE("80002", "无效的token"),

	WX_GET_MEMBER_INFO_INVALIDATE("80003", "这是一条有故事的数据"),

	GET_MEMBER_CARD_INFO_ERROR("80004", "获取会员卡信息失败"),

	GET_MEMBER_PLATFORM_INFO_ERROR("80005", "获取会员平台信息失败"),

	GET_WX_CONFIG_INFO_ERROR("80006", "获取微信平台配置信息失败"),

	GET_SMS_CONFIG_INFO_ERROR("80007", "获取短信配置信息失败"),

	GET_WX_USER_INFO_ERROR("80008", "获取用户微信信息失败"),

	GET_MEMBER_VALIDATE_ERROR("80009", "获取用户等级有效期失败"),

	GET_WX_OPENID_ERROR("80010", "获取用户微信openId为空"),
	IDENTIFYING_CODE_ERROR("80011", "错误的短信验证码"),
	APP_ID_ERROR("80012", "appid有误"),
	REDIRECT_URL_ERROR("80013", "回跳的url和授权配置的跳转url不符合"),
	ACCOUNT_CONFIG_ERROR("80014", "redis中账户配置文件有误"),
	ACCOUNT_CONFIG_CHECK_FAIL("80020", "账户配置文件校验失败"),
	TEMP_CODE_ERROR("80015", "绑定手机号失败，无效的临时code"),
	TEMP_USER_ERROR("80016", "绑定手机号失败，临时用户数据有误"),
	NO_BIND_MOBILE("80017", "未绑定手机号码，需要用户手动绑定手机号码"),
	ACCESS_WEIXIN_ERROR("80018","访问微信接口失败，请弹出登录框，使用浏览器登录"),
	SLIDER_SIGN_ERROR("80019", "滑块验证失败"),
	USER_NOT_LOGIN("20005", "用户未登录"),
	USER_TOKEN_EXPIRE("20008", "Token失效请重新登录"),
	// 积分
	POINT_ADD_POINT_ERROR("5001", "增加积分失败"),

	POINT_POINT_TRANNO_REPEAT_ERROR("5002", "积分交易流水号重复"),

	POINT_SUBTRACT_MEB_POINT_ERROR("5003", "减少积分数不合法"),

	POINT_POINT_TRANNO_NOT_EXIST_REPEAT_ERROR("5004", "积分交易流水号重复"),

	POINT_QUERY_POINT_DATE_NOT_EXIST_ERROR("5005", "查询积分日期不能为空"),
	
	GOWTH_INVALIDATE_EXIST_ERROR("5006", "请求的成长值不合法"),
	
	POINT_NULL("5007","积分为空"),
	// 外部对接
	MISSING_SYSTEM_PARAMETERS("70006", "缺少系统参数"),

	APP_KEY_NOT_EXIST("70007", "app_key不存在或合作方不合作"),

	API_VERSION_NOT_SUPPORT("70008", "api版本号不支持"),

	PARAM_SIGN_FAILED("70009", "参数验证失败"),

	REQUEST_TIME_OUT("700010", "请求最大允许时间不能超过十分钟"),

	PARAMETER_VALIDATION_ERROR("700011", "参数校验失败"),

	THIRD_SIGN_REPEAT_ERROR("700012", "签名重复"),

	GET_POINT_USERID_ISEMPTY_ERROR("700013", "userId不能为空"),

	GET_POINT_USERID__ERROR("700014", "用户不存在!"),

	ORDER_POINT_CONFIG__ERROR("700015", "订单加积分配置不符合"),

	// ===================================
	UPDATE_MEMBER_LEVEL_ERROR("20002", "up member level type error"),

	UP_MEMBER_LEVEL_ERROR("20003", "up member level error"),

	MEMBER_LEVEL_CHANGE_TYPE_ERROR("80020", "会员等级变更类型错误"),

	MEMBER_LEVELUP_CDKEY_ERROR("80080", "会员等级直升兑换码错误"),

	MEMBER_LEVELUP_CDKEY_USED("80081", "会员等级直升兑换码已使用"),

	MEMBER_ALREADY_EXIST("20016", "用户已经存在，请前去登录"),

	USER_NOT_REGISTER("20002", "该手机号未注册"),

	LOGIN_STATUES_ERROR("9999", "登陆注册 的来源未定义"),

	SMS_TEMPLATE_IS_EXIST("50033", "短信模板不存在"),

	INVITER_TEL_IS_NOT_EXIST("700016", "邀请人信息不存在"),

	BLACK_LIST("700017", "监测到账号异常，为保障您的利益，暂冻结账号。请联系人工客服4008-210-656"),

	CODE_GET_USER_INFO_ERROR("700018", "code已过期,请重新登录"),

	// 后台系统
	PLATFORMID_ERROR("90001", "该平台id无权进行操作"),

	GET_MEMBER_LEVEL_INFO("90002", "获取等级列表失败"),

	GET_MEMBER_BRAND_ERROR("90003", "获取品牌列表失败"),

	ADD_MEMBER_ERROR("90004", "该手机号已经注册"),
	
	MEMBER_ID_ISNULL_ERROR("90005","用户id不为空"),
	
	GET_OPENID_ISNULL("90007","根据userID获取openid为null"),
	
	MEMBER_ID_ERROR("90006","用户id不存在"),
	//活动错误信息 91000-92000
	ACTIVITY_TIME_IS_NOT_ON("91000","活动尚未开启,尽请期待"),
	
	ACTIVITY_DOES_NOT_EXIST("91001","活动尚未配置"),
	
	ACTIVITY_QUERY_MEMBER_REWARD("91002","圣诞活动查询用户查询该类奖品领取状态失败"),
	
	ACTIVITY_MEMBER_HAVE_NOT_GET_CARD("91003","亲,您还有未领取的贺卡额"),
	
	ACTIVITY_DOES_END("91004","亲,活动已经结束"),
	
	

	// 翻拍抽奖
	NO_DRAW_CHANCE("600", "用户没有翻拍次数"), LOSING_LOTTERY("601", "用户没有中奖"),
	// 登录
	INVALID_TOKEN("700", "无效的token,请重新登录"),
	// 优惠券
	COUPON_COUNT_NOT_ENOUGH("800", "优惠券剩余数量不足"), COUPON_NON_EXISTENT("801",
			"领取的优惠券不存在"), COUPON_ALREADY_RECEIVED("802", "用户已领取该优惠券"), COUPON_LEVE_INSUFFICIENT(
			"803", "用户等级和优惠券允许领取等级不符合"), COUPON_CHECK_FALL("804", "使用优惠券的校验失败"), COUPON_FILED_ERROR(
			"805", "优惠券字段信息错误"), COUPON_EXPIRED("806", "无效的优惠券"),
			COUPON_USE_STATUS_ERROR("807", "优惠券的使用状态不符合"),
	// 活动
	ACTIVE_NON_EXISTENT("1000", "用户完成活动失败，不存在的活动"),
	// 微信支付
	WEIXIN_PAY_FALL("1100", "获取预支付订单号失败"), WEIXIN_QUERY_ORDER_FALL("1101",
			"查询微信订单失败"), CREATE_JSAPISIGNATURE_FALL("1102", "获取jsapi的签名失败"), CLOSE_ORDER_FALL(
			"1103", "关闭订单失败"),
	// 积分支付
	POINT_PAY_ERROR("1104", "积分支付失败"),
	// 权益
	RIGHTS_ALREADY_RECEIVED("1200", "用户领取权益次数达上限"), RIGHTS_LEVE_INSUFFICIENT(
			"1201", "用户等级和权益允许领取等级不符合"), RIGHTS_CONDITION_INSUFFICIENT("1202",
			"领取条件不足"), RIGHTS_NON_EXISTENT("1203", "不存在的权益"),

	// 参数校验

	/**************************** 资源配置错误码 ****************************/

	ADVERTISEMENT_PIC_IS_NULL("1301", "广告图片不能为空"), SHOW_BEGIN_TIME_IS_NULL(
			"1302", "展示开始时间不能为空"), SHOW_END_TIME_IS_NULL("1303", "展示结束时间不能为空"), OPERATOR_IS_NULL(
			"1304", "操作人不能为空"), ACTIVITIES_IS_NOT_COMPLETE("1305",
			"运营活动未填写完整(仅跳转地址非必填)"), ACTIVITY_NAME_IS_NULL("1306", "活动区名称不能为空"), SHOW_MISSION_IS_NOT_COMPLETE(
			"1307", "展示任务未填写完整(仅跳转地址非必填)"), SHOW_GAME_IS_NOT_COMPLETE("1308",
			"展示游戏未填写完整(仅跳转地址非必填)"), END_TIME_BEFORE_CURRENT_TIME("1309",
			"投放结束时间不能早于当前时间"), SHOW_PLATFORM_IS_NULL("1310", "展示平台不能为空"),SURPLUS_AMOUNT_NOT_ENOUGH("13101", "权益剩余数量不足"),

	// 订单相关信息错误
	ORDER_FREIGHTTEMPLATE_NON_EXISTENT("1400", "生产订单运费计算失败，商品对应的运费模版不存"), ORDER_FREIGHTTEMPLATE_BILLING_TYPE_ERROR(
			"1401", "生产订单运费计算失败，运费模版的计费方式有误"), ORDER_FREIGHTTEMPLATE_PARAMS_ERROR(
			"1402", "生产订单运费计算失败，运费模版参数有误"), ORDER_NON_EXISTENT("1403", "无效的订单号"), ORDER_NOT_EMPTY(
			"1404", "订单号为空"),
	ORDER_UPDATE_STATUS_ERROR("1405","修改订单状态错误"),
	//运费模板
	FREIGHTTEMPLATE_ISUSE("30000","该运费模板目前正在使用无法删除"),
	NOTUSE_FREIGHTTEMPLATE("30001","无权限操作该运费模板"),
	// 订单1500-1600
	ORDER_GET_GOODS_ERROR("1500", "订单id获取goodsID的数据为空"), SUPPLIERINVOICE_ID_ERROR(
			"1501", "订单id获取goodsID的数据为空"), ORDER_PARAMS_ERROR("1502",
			"缺少产生订单的必要参数"), REPERTORY_ERROR("1503", "减少库存失败"), PRE_ORDER_PAY_ERROR(
			"1504", "获取预支付单信息失败"), ORDER_STATUS_ERROR("1505", "订单状态不符"), ORDER_INFO_IS_NULL(
			"1506", "订单详情为空"),ORDER_ISNOTNULL_LOGISTICNUMBER("1507","该笔订单已发货"),
	/**************************** 资源配置错误码 ****************************/

	/**************************** BlockChain异常 ****************************/

	CREATE_ACCOUNT_FAILED("70059", "创建数字资产账号失败"), REMOVE_ACCOUNT_FAILED(
			"70060", "移除数字资产账号失败"), SET_DEFAULT_ACCOUNT_FAILED("70061",
			"设置默认数字资产账号失败"), GET_ACCOUNT_FAILED("70062", "获取数字资产账号失败"), DEPLOY_TOKEN_FAILED(
			"70063", "发行TOKEN失败"), GET_BALANCE_FAILED("70064", "获取balance失败"), GET_TOTAL_SUPPLY_FAILED(
			"70065", "获取TOKEN发行总量失败"), TRANSFER_FAILED("70066", "transfer操作失败"), SET_CONTRACT_HASH_FAILED(
			"70067", "设置ContractHash失败"), GROUP_TRANSFER_FAILED("70070",
			"GroupTransfer失败"), CREATE_IDENTITY_FAILED("70071", "创建IDENTITY失败"), GET_CONTRACT_HASH_FAILED(
			"70072", "获取ContractHash失败"), SET_TOKEN_BASE_FAILED("70073",
			"设置TokenBase失败"), GET_END_TIME_FAILED("70074", "获取合约的有效期失败"), INIT_MEMBER_FAILED(
			"10000", "初始化用户数据失败"), INIT_MEMBER_BATCH_FAILED("10001",
			"批量初始化用户数据失败"),

	/**************************** BlockChain异常 ****************************/

	/**************************** 商户入驻申请 ****************************/

	COMPANY_NAME_ALREADY_EXISTS("70047", "企业名称已存在"), COMPANY_CODE_ALREADY_EXISTS(
			"70048", "企业代码已存在"), MERCHANT_FAILED("70049", "商户入驻失败"), UPLOAD_CONTRACT_FAILED(
			"70050", "上传合约文件失败"), DEPLOY_CONTRACT_FAILED("70051", "部署合约失败"), MERCHANT_NOT_FOUND(
			"70052", "未查询到该商户"), MERCHANT_GET_CONTRACT_TEMPLATE_FAILED("70053",
			"商户入驻获取合约模板失败"), COMPANY_NAME_CAN_NOT_BE_NULL("70054", "企业名称不能为空"), NODE_TYPE_CAN_NOT_BE_NULL(
			"70055", "节点类型不能为空"), CONTACT_PHONE_CAN_NOT_BE_NULL("70056",
			"联系人手机号不能为空"), POINT_TYPE_CAN_NOT_BE_NULL("70057", "积分类型不能为空"), PLEASE_UPLOAD_CONTRACT_FILE(
			"70058", "请先上传编译后的合约文件"),

	/**************************** 商户入驻申请 ****************************/
	REDIRECT_URI_MUST_NOT_NULL("10011", "redirect_uri不能为空"),

	APPID_MUST_NOT_NULL("10012", "appid不能为空"),

	STATE_MUST_NOT_NULL("10013", "state不能为空"),

	RESPONSE_TYPE_MUST_NOT_NULL("10014", "响应类型不能为空"),

	RESPONSE_TYPE_INVALID("10015", "响应类型无效"),

	APPID_INVALID("10016", "appid无效"),

	REQUESTID_INVALID("50002", "requestId错误"),

	/**************************** 消息队列 ****************************/

	SEND_MSG_FAILED("900001", "消息发送失败"),

	/**************************** 消息队列 ****************************/


	OUTTRADENO_TRADENO_ISNOBLANK("70033", "查询交易记录外部交易号和有叻交易号不能同时为空"),

	OUTTRADENO_TRADENO_REPEATED("70034", "查询交易记录外部交易号和有叻交易号重复"),
	
	OUTTRADENO_TRADENO_ERROR("70035", "该笔积分交易不存在"),

	/************************************ 特殊权益的错误信息 *******************************************/
	FORYOUHUI_ACQUIRE_ACCESS_TOKEN_ERROR("20001", "acquire access_token error"), 
	ORYOUHUI_LEVEL_UP_NOTIFICATION_ERROR("20004", "send member notification error"),

	FORYOUHUI_ACQUIRE_MEMBER_ERROR("20002", "acquire member information error"),

	FORYOUHUI_UP_MEMBER_LEVEL_ERROR("20003", "up member level error"),

	FORYOUHUI_LEVEL_UP_NOTIFICATION_ERROR("20004","send member notification error"),

	FORYOUHUI_LEVEL_MATCHING_ERROR("20005", "level is not exist in youle"),

	
	/************************************ 文件上传 *******************************************/
	FILE_UPLOAD_FAILED("50001", "文件上传失败"),
	FILE_IS_NULL("50003", "上传文件不能为空"),
	/************************************ 文件上传 *******************************************/
	
	
	/************************************ 后台管理--微信公众号  *******************************************/
	
	OPEN_OR_CLOSE_FAILED("50004", "启用/禁用失败"),
	SAVE_FAILED("50005", "新增失败"),
	EDIT_FAILED("50006", "编辑失败"),
	REQUEST_FAILED("50007", "请求失败"),
	NO_EXPORT_DATA("50008", "没有选择导出数据"),
	
	/************************************ 后台管理--微信公众号 *******************************************/
	/************************************ 微信消息模版 *******************************************/
	NO_OPEN_ID("60001","未获取到用户的openid"),
	NO_WEIXINUSERAPI("60002","注入的查询微信openid的api为空"),
	
	
	
	MD5_FAILED("60003","MD5加密失败"),
	
	CHANYI_DATA_IS_NULL("60005","禅医导入数据为空"),
	CHANYI_SUCC_DATA_IS_NULL("60006","禅医导入成功数据为空"),
	CHANYI_FAIL_DATA_IS_NULL("60007","禅医未导入的数据为空"),
	
	;

	private ErrorCodeEnum(String errorCode, String errorMsg) {
		this.code = errorCode;
		this.message = errorMsg;
	}

	private String code;
	private String message;

	public String getErrorCode() {
		return code;
	}

	public void setErrorCode(String errorCode) {
		this.code = errorCode;
	}

	public String getErrorMsg() {
		return message;
	}

	public void setErrorMsg(String errorMsg) {
		this.message = errorMsg;
	}

}
