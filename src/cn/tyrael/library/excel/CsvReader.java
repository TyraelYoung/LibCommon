package cn.tyrael.library.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import cn.tyrael.library.log.LogAdapter;

public class CsvReader {
	private static final String TAG = "CsvReader";

	private final String file;
	
	private Scanner scanner;
	
	public CsvReader(String file) {
		super();
		this.file = file;
	}

	public void open(){
		try {
			scanner = new Scanner(new File(file));
		} catch (FileNotFoundException e) {
			LogAdapter.w(TAG, "FileNotFoundException");
			e.printStackTrace();
			
		}
	}
	
	public void close(){
		scanner.close();
	}
	
	public boolean hasNextLine(){
		return scanner.hasNextLine();
	}

	public String[] nextLine(){
		String s = scanner.nextLine();
		LogAdapter.d(TAG, "nextLine:" + s);
		String[] seg = s.split(",");
		return seg;
	}
}
