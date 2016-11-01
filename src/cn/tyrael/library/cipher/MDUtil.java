package cn.tyrael.library.cipher;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MDUtil {
    /** 
   * @author：罗国辉 
   * @date： 2015年12月17日 上午9:24:43 
   * @description： SHA、SHA1加密
   * @parameter：  str：待加密字符串
   * @return： 加密串
  **/
  public static String SHA1(String str) {
    try {
      MessageDigest digest = java.security.MessageDigest
          .getInstance("SHA-1"); //如果是SHA加密只需要将"SHA-1"改成"SHA"即可
      digest.update(str.getBytes());
      byte messageDigest[] = digest.digest();
      // Create Hex String
      StringBuffer hexStr = new StringBuffer();
      // 字节数组转换为 十六进制 数
      for (int i = 0; i < messageDigest.length; i++) {
        String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
        if (shaHex.length() < 2) {
          hexStr.append(0);
        }
        hexStr.append(shaHex);
      }
      return hexStr.toString();

    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    }
    return null;
  }
}
