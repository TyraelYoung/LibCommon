package cn.tyrael.data.net.response;

public class BaseResponse<T> {
	public int code;
	public String msg;
	public T data;
}
