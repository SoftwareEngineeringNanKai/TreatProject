package cn.edu.nankai.translateexceltoclass.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Iterator;

public class TextReader {

	private File file;
	private  BufferedReader bufferedReader;
	private  String currentString;
	private  String nextString;
	private  boolean isMovedNext;
	
	public TextReader(String fileName) {
		file = new File(fileName);
		try {
			if(file.exists()){
				bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                nextString = bufferedReader.readLine();			
                isMovedNext = false;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public TextReader(String fileName,String encoding) {
		file = new File(fileName);
		try {
			if(file.exists()){
				bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file),encoding));        
				nextString = bufferedReader.readLine();			
                isMovedNext = false;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public  String currentString(){
		return currentString;
	}
	
	public String readNext(){
		currentString = nextString;
		isMovedNext = true;
		return currentString;
	}
	
	public boolean isLast(){
		boolean isLast = false;
		
		if(!isMovedNext){
			return isLast;
		}
		try {
			nextString = bufferedReader.readLine();
			isLast = (nextString == null) ? true : false;
			isMovedNext = false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			isLast = true;
		}
		return isLast;
	}
}
