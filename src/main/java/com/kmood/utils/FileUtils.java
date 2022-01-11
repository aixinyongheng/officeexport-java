package com.kmood.utils;

import java.io.*;
import java.nio.ByteBuffer;

public class FileUtils {
	//readToStringByFilepath

	public static String readToStringByFilepath(String filePath)throws IOException {
		StringBuilder data = new StringBuilder();
		Reader reader  =  null;
		try {
			File file = new File(filePath);
			reader = new FileReader(file);
			char [] c = new char [1024];
			int len = 0;
			while ((len = reader.read(c)) != -1){
				data.append(String.copyValueOf(c,0,len));
			}
		} finally {
			if (reader != null)
			reader.close();
		}
		return data.toString();
	}

	public static byte[] readToBytesByFilepath(String filePath)throws IOException {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		FileInputStream reader  =  null;
		try {
			File file = new File(filePath);
			reader = new FileInputStream(file);
			int len = 0;
			byte[] buffer = new byte[1024];
			while ((len = reader.read(buffer)) != -1){
				output.write(buffer, 0, len);
			}
		} finally {
			if (reader != null)
				reader.close();
		}
		return output.toByteArray();
	}

	public static String getFileSuffixByPath(String path){
		File file = new File(path);
		String fileName = file.getName();
		String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
		return suffix;
	}

}
