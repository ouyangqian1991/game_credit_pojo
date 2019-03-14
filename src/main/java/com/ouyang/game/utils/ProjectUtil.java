package com.ouyang.game.utils;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;



public final class ProjectUtil {

	/**
	 * 判断字符串是否为空
	 * 
	 * @param str
	 * @return
	 */
	public static final boolean strIsNull(String str) {
		if (str == null || StringUtils.EMPTY.equals(str.trim())) {
			return true;
		}
		return false;
	}

	/**
	 * 判断对象不是null或空字符串
	 * 
	 * @param o
	 * @return
	 */
	public static final boolean objectIsNotEmpty(Object o) {
		if (o == null) {
			return false;
		}
		if (o instanceof String || o instanceof StringBuilder || o instanceof StringBuffer) {
			return o != null && StringUtils.isNotEmpty(o.toString());
		}
		return o != null;
	}

	/**
	 * null返回""
	 * 
	 * @param str
	 * @return
	 */
	public static final String convertNullToEmpty(Object str) {
		if (str == null) {
			return StringUtils.EMPTY;
		}
		return str.toString();
	}

	/**
	 * null返回0
	 * 
	 * @param source
	 * @return
	 */
	public static final BigDecimal convertNullToZero(BigDecimal source) {
		if (source == null) {
			return BigDecimal.ZERO;
		}
		return source;
	}

	/**
	 * 生成随机的验证码(手机短信验证码)
	 * 
	 * @return
	 */
	public static final String genValidationCode() {
		int a1 = (int) (Math.random() * (10 - 1 + 1));
		int a2 = (int) (Math.random() * (10 - 1 + 1));
		int a3 = (int) (Math.random() * (10 - 1 + 1));
		int a4 = (int) (Math.random() * (10 - 1 + 1));
		int a5 = (int) (Math.random() * (10 - 1 + 1));
		int a6 = (int) (Math.random() * (10 - 1 + 1));
		return StringUtils.EMPTY + a1 + a2 + a3 + a4 + a5 + a6;
	}


	
	/**
	 * 将异常堆栈信息转换为字符串
	 *
	 * @param e
	 * @return
	 */
	public static final String exceptionStack2String(Exception e) {
		if (e != null) {
			ByteArrayOutputStream traceOutputStream = new ByteArrayOutputStream();
			e.printStackTrace(new PrintStream(traceOutputStream));
			try {
				return new String(traceOutputStream.toByteArray(), "UTF8");
			} catch (UnsupportedEncodingException e1) {
				return new String(traceOutputStream.toByteArray());
			}
		}
		return null;
	}

	

	/**
	 * List转String
	 * 
	 * @param list
	 * @param separator
	 * @return
	 */
	public static final String listToString(List<String> list, String separator) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)).append(separator);
		}
		return sb.toString().substring(0, sb.toString().length() - 1);
	}

	/**
	 * String转List
	 * 
	 * @param str
	 * @param separator
	 * @return
	 */
	public static final List<String> stringToList(String str, String separator) {
		List<String> list = new ArrayList<String>();
		if (StringUtils.isEmpty(str)) {
			return null;
		}
		for (String s : str.split(separator)) {
			list.add(s);
		}
		return list;
	}

	/**
	 * 获取文件的MD5
	 * 
	 * @param fis
	 * @return
	 */
	public static final String getFileMd5(InputStream fis) {
		String md5 = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] buffer = new byte[1024];
			int length = -1;
			while ((length = fis.read(buffer, 0, 1024)) != -1) {
				md.update(buffer, 0, length);
			}
			BigInteger bigInt = new BigInteger(1, md.digest());
			md5 = bigInt.toString(16).toUpperCase();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return md5;
	}

	/**
	 * 连接2个url
	 * 
	 * @param first
	 * @param second
	 * @return
	 */
	public static final String appendUrl(String first, String second) {
		if (StringUtils.isEmpty(first)) {
			return second;
		}
		if (StringUtils.isEmpty(second)) {
			return first;
		}
		// 两个衔接的均有斜杠
		if (first.endsWith("/") && second.startsWith("/")) {
			return first + second.substring(1);
		}
		// 两个衔接的均没有斜杠
		if (!first.endsWith("/") && !second.startsWith("/")) {
			return first + "/" + second;
		}
		return first + second;
	}

	/**
	 * 获取图片压缩url
	 * 
	 * @param url
	 * @param width
	 * @param height
	 * @return
	 */
	public static final String getImageCompressUrl(String url, Integer type, Integer width, Integer height) {
		if (StringUtils.isEmpty(url)) {
			return url;
		}
		// 七牛CDN图片压缩
		if (StringUtils.startsWithIgnoreCase(url, "https://img.jiaw.com")) {
			String param = StringUtils.EMPTY;
			if (width != null && width > 0) {
				param = param + "/w/" + width;
			}
			if (height != null && height > 0) {
				param = param + "/h/" + height;
			}
			return url + "?imageView2/" + type + param;
		}
		return url;
	}

	/**
	 * 根据图片位置返回图片压缩的url，宽度固定，高度等比例缩放
	 * 
	 * @param url
	 * @param imageType
	 * @return
	 */
	public static final String getImageCompressUrl(String url, String imageType) {
		if (StringUtils.isEmpty(imageType)) {
			return url;
		}
		switch (imageType.toUpperCase()) {
		case "INDEX_TURNS":
			// 小程序--首页轮播图
			return getImageCompressUrl(url, 3, 750, null);
		case "INDEX_COMMEND":
			// 小程序--首页推荐商品图
			return getImageCompressUrl(url, 3, 228, null);
		case "ORDER_LIST":
			// 小程序--订单列表图
			return getImageCompressUrl(url, 3, 180, null);
		case "COMMODITY_LIST":
			// 小程序--商品列表图
			return getImageCompressUrl(url, 3, 136, null);
		case "COMMODITY_TURNS":
			// 小程序--商品详情轮播图
			return getImageCompressUrl(url, 3, 750, null);
		case "COMMODITY_DETAIL":
			// 小程序--商品详情图
			return getImageCompressUrl(url, 3, 750, null);
		case "CUSTOMER_IDENTITY":
			// 小程序--客户身份证复印件
			return getImageCompressUrl(url, 3, 750, null);
		case "CUSTOMER_LICENSE":
			// 小程序--客户营业执照附件
			return getImageCompressUrl(url, 3, 750, null);
		case "SUPPLIER_RECEIPT":
			// 小程序、供应商PC--供应商上传的签收单附件
			return getImageCompressUrl(url, 3, 750, null);
		case "BRAND_LOGO":
			// 小程序--品牌logo图
			return getImageCompressUrl(url, 3, 192, null);

		default:

		}
		return url;
	}

	
}
