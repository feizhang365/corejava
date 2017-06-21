package com.fei.java8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class StreamIO {

	public static void main(String[] args) throws IOException {
		Files.list(new File(".").toPath())
		 .forEach(System.out::println);
	}

}
