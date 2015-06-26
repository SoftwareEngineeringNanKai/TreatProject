package cn.edu.nankai.translateexceltoclass.main;

import java.util.ArrayList;
import java.util.Arrays;

import cn.edu.nankai.medicalproject.data.Item;
import cn.edu.nankai.medicalproject.data.Range;;


public class FirstHandler extends Handler {

	public FirstHandler(String module){
		this.item = new Item();
		item.setModule(module);
	}
	
	private void addToArrayList(ArrayList<String> arrayList,String[] strings){
		for(String str : strings){
			arrayList.add(str);
		}
		//System.out.println("size2: " + arrayList.size());
	}
	
	private void clearItems(ArrayList<String> increasePhysiologicalReasons,ArrayList<String> increasePsychologicalReasons,
			ArrayList<String> decreasePhysiologicalReasons,ArrayList<String> decreasePsychologicalReasons){
		 increasePhysiologicalReasons.clear();
		 increasePsychologicalReasons.clear();
		 decreasePhysiologicalReasons.clear();
		 decreasePsychologicalReasons.clear();
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
			//System.out.println("handle first Reason");
			this.item.setTitle(results[0].trim());
			this.item.setMaleRange(new Range(getStart(results[1]), getEnd(results[1])));
			this.item.setUnits(results[2]);
			addToArrayList(increasePhysiologicalReasons,results[4].split("#"));	
			/*for(String tempString : increasePhysiologicalReasons){
				System.out.println("tempString:" + tempString);
			}*/
			this.item.setIncreasePhysiologicalReasons(increasePhysiologicalReasons);
			/*for(String tempString : item.getIncreasePhysiologicalReasons()){
				System.out.println("tempString:" + tempString);
			}*/
			addToArrayList(decreasePhysiologicalReasons, results[6].split("#"));
			this.item.setDecreasePhysiologicalReasons(decreasePhysiologicalReasons);
		}else if(string.contains("病理性原因")){
			//System.out.println("handle second reason");
			this.item.setFemaleRange(new Range(getStart(results[0]), getEnd(results[0])));
			addToArrayList(increasePsychologicalReasons,results[3].split("#"));	
			this.item.setIncreasePsychologicalReasons(increasePsychologicalReasons);
			addToArrayList(decreasePsychologicalReasons, results[5].split("#"));
			this.item.setDecreasePsychologicalReasons(decreasePsychologicalReasons);
			/*for(String tempString : item.getIncreasePhysiologicalReasons()){
				System.out.println("tempString2:" + tempString);
			}*/
		}
	}
	
	private double getStart(String string){
		return Double.parseDouble(string.split("：")[1].split("-")[0]);
	}
	private double getEnd(String string){
		return Double.parseDouble(string.split("：")[1].split("-")[1]);
	}
}
