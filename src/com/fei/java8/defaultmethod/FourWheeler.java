package com.fei.java8.defaultmethod;

/**
 * java8 default method
 * @author fzh 81597228@qq.com
 * @date 2017年7月31日 上午11:04:35
 */
interface FourWheeler {
	default void print() {
		System.out.println("I am a four wheeler!");
	}
}
