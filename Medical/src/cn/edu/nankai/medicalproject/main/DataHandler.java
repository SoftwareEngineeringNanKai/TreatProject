package cn.edu.nankai.medicalproject.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import cn.edu.nankai.medicalproject.data.Data;
import cn.edu.nankai.medicalproject.data.Database;
import cn.edu.nankai.medicalproject.data.GlobalInfo;
import cn.edu.nankai.medicalproject.data.Item;
import cn.edu.nankai.medicalproject.data.Range;
import cn.edu.nankai.translateexceltoclass.main.GetAll;

import static cn.edu.nankai.medicalproject.data.GlobalInfo.*;

public class DataHandler {

	private static void merge(ArrayList<String> reasons,
			HashMap<String, Integer> results) {
		/*for (String reason : reasons){
			System.out.println("Reason:" + reason);
		}*/
		
		for (String reason : reasons) {
			if (results.size() == 0) {
				results.put(reason, 1);
				//System.out.println("Reason" + reason);
				continue;
			}
			boolean isExisted = false;
			for (int i = 0; i < results.size(); i++){
					isExisted = results.containsKey(reason);
			}
				if (isExisted) {
					results.put(reason, results.get(reason) + 1);
					//System.out.println("Reason in Method: " + reason);
				} else {
					results.put(reason, 1);
					//System.out.println("Reason in Method(else): " + reason);
			
			}
		}

		Iterator<Entry<String, Integer>> iterator = results.entrySet()
				.iterator();
		while(iterator.hasNext()){
			Entry<String, Integer> entry = iterator.next();
			//System.out.println("Key:" + entry.getKey() + "Value: " + entry.getValue());
		}
		
	}

	public static void clearArrayList(ArrayList... lsts){
		for(int i = 0;i < lsts.length;i++){
			lsts[i].clear();
		}
		resultsForPhysiological.clear();
		resultsForPsychologica.clear();
	}
	
	public static void handleData() {

		ArrayList<String> resultOfPhysiologicalReasons = new ArrayList<String>();
		ArrayList<String> resultOfPsychologicalReasons = new ArrayList<String>();

		//Database database = new Database();
		/*
		 * for(Item item :database.getData().getItems()){
		 * System.out.println(item.toString()); }
		 */
/*
		Iterator<Entry<String, Double>> iteratorForTranslation = GlobalInfo.item.entrySet().iterator();
		while (iteratorForTranslation.hasNext()) {
			Entry<String, Double> entry = iteratorForTranslation.next();*/
			//inputs.add(entry.getValue());
			for(int i = 0; i<item.size() ;i++){
				inputs.add(item.get(i));
				
				//System.out.println("value: " + inputs.get(i));
			}
			
		

		//System.out.println("size of start: " + starts.size());
		
		ArrayList<Item> items = new ArrayList<Item>();
		//System.out.println("size:" + GetAll.getInfo().getItems().size() + " title: " + moduleName);
		ArrayList<Item> tempItems = GetAll.getInfo().getItems();
		System.out.println("Size of TempItems: " + tempItems.size());
		int z = 0;
		for(int w = 0;w < tempItems.size();w++ ){
			/*System.out.println("it.getTitle: " + it.getTitle());*/
			if(tempItems.get(w).getModule().equals(moduleName)){
				Range maleRange = new Range();
				if(starts.get(z) == -1.0){
					maleRange.setStart(tempItems.get(w).getMaleRange().getStart());
				}else{
					maleRange.setStart(starts.get(z));
					System.out.println("startz:" + z + ":" + starts.get(z));
				}
				if(ends.get(z) == -1.0){
					maleRange.setEnd(tempItems.get(w).getMaleRange().getEnd());
				}else{
					maleRange.setEnd(ends.get(z));
					System.out.println("endz:" + z + ":" + ends.get(z));
				}
				System.out.println("w:" + w + "z:" + z + "maleRange: " + maleRange);
				tempItems.get(w).setMaleRange(maleRange);
				z++;
				items.add(tempItems.get(w));
				//System.out.println(tempItems.get(w).getModule() + "title: " + tempItems.get(w).getTitle());
			}
		}
		/*for(int i = 0;i < Data.getInstance().getItems().size();i++){
			System.out.println("Later: " + Data.getInstance().getItems().get(i));
		}*/
		//System.out.println("items: " + items.size());
		
		for (int i = 0; i < inputs.size(); i++) {
			if(inputs.get(i) == -1){
				//System.out.println("==-1: " + i);
				continue;
			}
				
			if(isMale){
				if (inputs.get(i) < items.get(i).getMaleRange().getStart()) {
					//System.out.println("Reach There");
					//System.out.println("input < malestart: " + i);
					if((items.get(i).getDecreasePhysiologicalReasons() != null) && !(items.get(i)
							.getDecreasePhysiologicalReasons().get(0).equals("无"))){
						//System.out.println("True: " + items.get(i)
							//.getDecreasePhysiologicalReasons());
						for(int j = 0;j < items.get(i).getDecreasePhysiologicalReasons().size();j++)
						{
							if(j < 3){
								for(int w = 0;w < 10;w++){
									resultOfPhysiologicalReasons.add(items.get(i).getDecreasePhysiologicalReasons().get(j));
								}
							}else {
								for(int w = 0;w < 3;w++){
									resultOfPhysiologicalReasons.add(items.get(i).getDecreasePhysiologicalReasons().get(j));
								}
							}
						}
						
					}
						
					
					if((items.get(i).getDecreasePsychologicalReasons() != null) && !items.get(i)
							.getDecreasePsychologicalReasons().get(0).equals("无")){
						for(int j = 0;j < items.get(i).getDecreasePsychologicalReasons().size();j++)
						{
							if(j < 3){
								for(int w = 0;w < 10;w++){
									resultOfPsychologicalReasons.add(items.get(i).getDecreasePsychologicalReasons().get(j));
								}
							}else {
								for(int w = 0;w < 3;w++){
									resultOfPsychologicalReasons.add(items.get(i).getDecreasePsychologicalReasons().get(j));
								}
							}
						}
					}
					
				} else if (inputs.get(i) > items.get(i).getMaleRange().getEnd()) {
					if((items.get(i).getIncreasePhysiologicalReasons() != null) && !items.get(i)
							.getIncreasePhysiologicalReasons().get(0).equals("无"))
						for(int j = 0;j < items.get(i).getIncreasePhysiologicalReasons().size();j++)
						{
							if(j < 3){
								for(int w = 0;w < 10;w++){
									resultOfPhysiologicalReasons.add(items.get(i).getIncreasePhysiologicalReasons().get(j));
								}
							}else {
								for(int w = 0;w < 3;w++){
									resultOfPhysiologicalReasons.add(items.get(i).getIncreasePhysiologicalReasons().get(j));
								}
							}
						}
					if((items.get(i).getIncreasePsychologicalReasons() != null) && !items.get(i)
							.getIncreasePsychologicalReasons().get(0).equals("无"))
						for(int j = 0;j < items.get(i).getIncreasePsychologicalReasons().size();j++)
						{
							if(j < 3){
								for(int w = 0;w < 10;w++){
									resultOfPsychologicalReasons.add(items.get(i).getIncreasePsychologicalReasons().get(j));
								}
							}else {
								for(int w = 0;w < 3;w++){
									resultOfPsychologicalReasons.add(items.get(i).getIncreasePsychologicalReasons().get(j));
								}
							}
						}
				}
			}else{
				//System.out.println("Female");
				if (inputs.get(i) < items.get(i).getFemaleRange().getStart()) {
					if((items.get(i).getDecreasePhysiologicalReasons() != null) && !items.get(i)
							.getDecreasePhysiologicalReasons().get(0).equals("无"))
						
						for(int j = 0;j < items.get(i).getDecreasePhysiologicalReasons().size();j++)
						{
							if(j < 3){
								for(int w = 0;w < 10;w++){
									resultOfPhysiologicalReasons.add(items.get(i).getDecreasePhysiologicalReasons().get(j));
								}
							}else {
								for(int w = 0;w < 3;w++){
									resultOfPhysiologicalReasons.add(items.get(i).getDecreasePhysiologicalReasons().get(j));
								}
							}
						}
					if((items.get(i).getDecreasePsychologicalReasons() != null) && !items.get(i)
							.getDecreasePsychologicalReasons().get(0).equals("无"))
						for(int j = 0;j < items.get(i).getDecreasePsychologicalReasons().size();j++)
						{
							if(j < 3){
								for(int w = 0;w < 10;w++){
									resultOfPsychologicalReasons.add(items.get(i).getDecreasePsychologicalReasons().get(j));
								}
							}else {
								for(int w = 0;w < 3;w++){
									resultOfPsychologicalReasons.add(items.get(i).getDecreasePsychologicalReasons().get(j));
								}
							}
						}
				} else if (inputs.get(i) > items.get(i).getFemaleRange().getEnd()) {
					if((items.get(i).getIncreasePhysiologicalReasons() != null) && !items.get(i)
							.getIncreasePhysiologicalReasons().get(0).equals("无"))
						for(int j = 0;j < items.get(i).getIncreasePhysiologicalReasons().size();j++)
						{
							if(j < 3){
								for(int w = 0;w < 10;w++){
									resultOfPhysiologicalReasons.add(items.get(i).getIncreasePhysiologicalReasons().get(j));
								}
							}else {
								for(int w = 0;w < 3;w++){
									resultOfPhysiologicalReasons.add(items.get(i).getIncreasePhysiologicalReasons().get(j));
								}
							}
						}
					if((items.get(i).getIncreasePsychologicalReasons() != null) && !items.get(i)
							.getIncreasePsychologicalReasons().get(0).equals("无"))
						for(int j = 0;j < items.get(i).getIncreasePsychologicalReasons().size();j++)
						{
							if(j < 3){
								for(int w = 0;w < 10;w++){
									resultOfPsychologicalReasons.add(items.get(i).getIncreasePsychologicalReasons().get(j));
								}
							}else {
								for(int w = 0;w < 3;w++){
									resultOfPsychologicalReasons.add(items.get(i).getIncreasePsychologicalReasons().get(j));
								}
							}
						}
				}
			}
			
		}
		merge(resultOfPhysiologicalReasons, resultsForPhysiological);
		merge(resultOfPsychologicalReasons, resultsForPsychologica);
        
		//item.clear();
		int amount = 0;
		Iterator<Entry<String, Integer>> iterator = resultsForPhysiological.entrySet()
				.iterator();
		while (iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			//System.out.println(entry.getKey() + " : " +  entry.getValue());
			//amount += entry.getValue();
		}
		
		Iterator<Entry<String, Integer>> iterator2 = resultsForPsychologica.entrySet()
				.iterator();
		while (iterator2.hasNext()) {
			Entry<String, Integer> entry = iterator2.next();
			//System.out.println("2: " + entry.getKey() + " : " +  entry.getValue());
			//amount += entry.getValue();
		}
	}
}
