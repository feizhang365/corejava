package com.fei.http;

import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;

/**
 * HTTP 请求工具类
 */
public class HttpUtil {

	/**
	 * HTTP GET 请求
	 * 
	 * @param url
	 *            请求地址
	 * @return 返回HTTP请求结果 {@link Response}
	 * 
	 * @throws Exception
	 */
	public static Response get(String url) throws Exception {
		try {
			return getConnection(url).method(Method.GET).execute();
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	/**
	 * HTTP GET 请求
	 * 
	 * @param url
	 *            请求地址
	 * @param data
	 *            请求参数
	 * @return 返回HTTP请求结果 {@link Response}
	 * 
	 * @throws Exception
	 */
	public static Response get(String url, Map<String, String> data) throws Exception {
		try {
			return getConnection(url).data(data).method(Method.GET).execute();
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	/**
	 * HTTP POST 请求
	 * 
	 * @param url
	 *            请求地址
	 * @param data
	 *            请求参数
	 * @return 返回HTTP请求结果 {@link Response}
	 * 
	 * @throws Exception
	 */
	public static Response post(String url, Map<String, String> data) throws Exception {
		try {
			return getConnection(url).data(data).method(Method.POST).execute();
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	/**
	 * 获得请求连接
	 * 
	 * @param url
	 *            请求地址
	 * @return 返回HTTP请求连接 {@link Connection}
	 */
	public static Connection getConnection(String url) {
//		return Jsoup.connect(url).timeout(60);
		return Jsoup.connect(url).userAgent("Mozilla").ignoreContentType(true).timeout(3 * 60000).proxy("127.0.0.1",64687);
	}

}
