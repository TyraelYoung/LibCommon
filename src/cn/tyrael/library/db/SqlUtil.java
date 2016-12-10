package cn.tyrael.library.db;

import java.util.Map;
import java.util.Map.Entry;

public class SqlUtil {
	/**
	 * ��mapת��Ϊset���
	 * @return
	 */
	public static String mapToSet(Map<String, String> map){
		String set = "";
		for(Entry<String, String> entry : map.entrySet()){
			set += ", " + entry.getKey() + "=\"" + entry.getValue() + "\" "; 
		}
		set = set.substring(1);
		return set;
	}
}
