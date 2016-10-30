package cn.tyrael.library.task;

public interface ProgressListener extends AsyncListener{
	void onProgress(int current, int total);
}
