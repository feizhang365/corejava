package com.fei.http;

public class GoogleLBS {
	public static void main(String[] args) throws Exception {
//		String res = HttpUtil.get("http://maps.google.com/maps/api/geocode/json?address=1600+Amphitheatre+Parkway,+Mountain+View,+CA&sensor=true_or_false").body();
//		System.out.println(res);
		String res = HttpUtil.get("https://maps.googleapis.com/maps/api/geocode/json?key=AIzaSyCAq8NNIXa_xBiNUE2PsMkVvViUJokMxPA&address=1600+Amphitheatre+Parkway%2C+Mountain+View%2C+CA").body();		
		System.out.println(res);
	}
}
