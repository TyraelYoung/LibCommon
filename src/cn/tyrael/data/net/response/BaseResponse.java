package cn.tyrael.data.net.response;

public class BaseResponse<T> {
	public int code;
	public String msg;
	public T data;
	
	public static final int CODE_OK = 0;
	public static final int CODE_NOT_LOGIN = -401;
}
