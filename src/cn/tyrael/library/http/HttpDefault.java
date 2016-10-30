package cn.tyrael.library.http;

import java.io.IOException;

import cn.tyrael.library.log.LogAdapter;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpDefault {
	private static HttpAdapter http;
	
	static{
		http = new HttpAdapter();
		http.setClient(new OkHttpClient());
	}
	
	public static Response get(String url) {
		return http.get(url);
	}
}
