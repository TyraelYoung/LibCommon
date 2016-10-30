package cn.tyrael.library.task;

public interface AsyncListener {	
	void onSucceed();
	void onFail(int code, String msg);
}
