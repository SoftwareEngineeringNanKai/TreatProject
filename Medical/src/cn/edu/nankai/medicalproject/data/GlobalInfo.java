package cn.edu.nankai.medicalproject.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class GlobalInfo {

	public static ArrayList<Double> item = new ArrayList<Double>();
	public static ArrayList<Double> inputs = new ArrayList<Double>();
	public static ArrayList<Double> starts = new ArrayList<Double>();
	public static ArrayList<Double> ends = new ArrayList<Double>();
	public static HashMap<String, Integer> resultsForPhysiological = new HashMap<String,Integer>();
	public static HashMap<String, Integer> resultsForPsychologica = new HashMap<String,Integer>();
	public static boolean isMale=true;
	public static String moduleName;
}
