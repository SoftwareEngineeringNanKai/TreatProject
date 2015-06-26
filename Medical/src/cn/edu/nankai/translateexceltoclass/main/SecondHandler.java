package cn.edu.nankai.translateexceltoclass.main;

import java.util.ArrayList;
import java.util.Arrays;
import cn.edu.nankai.medicalproject.data.*;


public class SecondHandler extends Handler {

	public SecondHandler(String module){
		this.item = new Item();
		item.setModule(module);
	}
	
	private void addToArrayList(ArrayList<String> arrayList,String[] strings){
		for(String str : strings){
			arrayList.add(str);
		}
		//System.out.println("size2: " + arrayList.size());
	}
	
	@Override
	public void handleString(String string) {
		// TODO Auto-generated method stub
		String[] results = string.split("\t");
		ArrayList<String> increasePhysiologicalReasons = new ArrayList<String>();
		ArrayList<String> increasePsychologicalReasons = new ArrayList<String>();
		ArrayList<String> decreasePhysiologicalReasons = new ArrayList<String>();
		ArrayList<String> decreasePsychologicalReasons = new ArrayList<String>();
		if(string.contains("生理性原因")){
			this.item.setTitle(results[0].trim());
			this.item.setStandard(results[1]);
			this.item.setUnits(results[2]);
			this.item.setMaleRange(new Range(0,0));
			this.item.setFemaleRange(new Range(0,0));
			addToArrayList(increasePhysiologicalReasons, results[4].split("#"));
			this.item.setDecreasePhysiologicalReasons(increasePhysiologicalReasons);
		}else if(string.contains("病理性原因")){
			addToArrayList(increasePsychologicalReasons, results[3].split("#"));
			this.item.setDecreasePsychologicalReasons(increasePsychologicalReasons);
		}
	}

}
