package cn.tyrael.library.cipher;

import java.security.MessageDigest;

public class Md5Util {
	public static String computeString(String inStr){
		byte[] byteArray = toByteArray(inStr); 
		byteArray = computeByte(byteArray);
		return toString(byteArray);
	}
	
	public static byte[] computeByte(String inStr){
		byte[] byteArray = toByteArray(inStr); 
		return computeByte(byteArray);
	}
	
	/**
	 * 核心函数
	 * @param byteArray
	 * @return
	 */
	public static byte[] computeByte(byte[] byteArray){
        MessageDigest md5 = null;  
        try{  
            md5 = MessageDigest.getInstance("MD5");  
        }catch (Exception e){
            e.printStackTrace();  
            return null;  
        }
        byte[] md5Bytes = md5.digest(byteArray);  
        return md5Bytes;
	}
	
	
	public static byte[] toByteArray(String inStr){
        char[] charArray = inStr.toCharArray();  
        byte[] byteArray = new byte[charArray.length];  
  
        for (int i = 0; i < charArray.length; i++)  
            byteArray[i] = (byte) charArray[i]; 
        return byteArray;
	}
	
	public static String toString(byte[] md5Bytes){
        StringBuffer hexValue = new StringBuffer();  
        for (int i = 0; i < md5Bytes.length; i++){  
            int val = ((int) md5Bytes[i]) & 0xff;  
            if (val < 16)  
                hexValue.append("0");  
            hexValue.append(Integer.toHexString(val));  
        }  
        return hexValue.toString();  
	}
}
