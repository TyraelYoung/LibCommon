package cn.tyrael.library;

public class DebugConfig {
	private boolean isDebuggable = true;
	
	public static DebugConfig getInstance(){
		return new DebugConfig();
	}
	
	public boolean isDebuggable(){
		return isDebuggable;
	}
}
