package cn.tyrael.library.log;

import cn.tyrael.library.DebugConfig;

public class LogAdapter {
	private static final DebugConfig sDebugConfig = DebugConfig.getInstance();
	
	public static void e(String tag, String content){
		if(sDebugConfig.isDebuggable()){
			throw new RuntimeException(tag +  ": " + content);
		}else{
			
		} 
	}
	
	public static void w(String tag, String content){
		System.out.println(tag +  ": " + content);
	}
	
	public static void i(String tag, String content){
		System.out.println(tag +  ": " + content);
	}
	
	public static void d(String tag, String content){
		if(sDebugConfig.isDebuggable()){
			System.out.println(tag +  ": " + content);
		}else{
			
		} 
	}
}
