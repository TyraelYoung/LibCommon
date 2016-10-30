package cn.tyrael.library.http;

import okhttp3.OkHttpClient;

/**
 * http客户端工厂
 * @author Administrator
 *
 */
public class HttpFactory {
	public static HttpAdapter getDefault(){
		HttpAdapter httpAdapter = new HttpAdapter();
		httpAdapter.setClient(new OkHttpClient());
		return httpAdapter;
	}
}
