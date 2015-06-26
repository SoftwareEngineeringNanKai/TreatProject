package cn.edu.nankai.medicalproject.data;

import java.util.ArrayList;

public class Item implements Cloneable{

	private String module;
	private String title;
	private Range maleRange;
	private Range femaleRange;
	private String standard;
	private String units;
	private String input;
	private ArrayList<String> increasePhysiologicalReasons;
	private ArrayList<String> increasePsychologicalReasons;
	private ArrayList<String> decreasePhysiologicalReasons;
	private ArrayList<String> decreasePsychologicalReasons;

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Range getMaleRange() {
		return maleRange;
	}

	public void setMaleRange(Range maleRange) {
		this.maleRange = maleRange;
	}

	public Range getFemaleRange() {
		return femaleRange;
	}

	public void setFemaleRange(Range femaleRange) {
		this.femaleRange = femaleRange;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public ArrayList<String> getIncreasePhysiologicalReasons() {
		return increasePhysiologicalReasons;
	}

	public void setIncreasePhysiologicalReasons(
			ArrayList<String> increasePhysiologicalReasons) {
		this.increasePhysiologicalReasons = (ArrayList<String>) increasePhysiologicalReasons.clone();
		/*for(String tempString : this.increasePhysiologicalReasons){
			System.out.println("tempStringInMethod:" + tempString);
		}*/
	}

	public ArrayList<String> getIncreasePsychologicalReasons() {
		return increasePsychologicalReasons;
	}

	public void setIncreasePsychologicalReasons(
			ArrayList<String> increasePsychologicalReasons) {
		this.increasePsychologicalReasons = (ArrayList<String>) increasePsychologicalReasons.clone();
	}

	public ArrayList<String> getDecreasePhysiologicalReasons() {
		return decreasePhysiologicalReasons;
	}

	public void setDecreasePhysiologicalReasons(
			ArrayList<String> decreasePhysiologicalReasons) {
		this.decreasePhysiologicalReasons = (ArrayList<String>) decreasePhysiologicalReasons.clone();
	}

	public ArrayList<String> getDecreasePsychologicalReasons() {
		return decreasePsychologicalReasons;
	}

	public void setDecreasePsychologicalReasons(
			ArrayList<String> decreasePsychologicalReasons) {
		this.decreasePsychologicalReasons = (ArrayList<String>) decreasePsychologicalReasons.clone();
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(String module,String title, Range maleRange, Range femaleRange,
			ArrayList<String> increasePhysiologicalReasons,
			ArrayList<String> increasePsychologicalReasons,
			ArrayList<String> decreasePhysiologicalReasons,
			ArrayList<String> decreasePsychologicalReasons) {
		super();
		this.module = module;
		this.title = title;
		this.maleRange = maleRange;
		this.femaleRange = femaleRange;
		this.increasePhysiologicalReasons = (ArrayList<String>)increasePhysiologicalReasons.clone();
		this.increasePsychologicalReasons = (ArrayList<String>)increasePsychologicalReasons.clone();
		this.decreasePhysiologicalReasons = (ArrayList<String>)decreasePhysiologicalReasons.clone();
		this.decreasePsychologicalReasons = (ArrayList<String>)decreasePsychologicalReasons.clone();
		//System.out.println("this.strincreasePhysiologicalReasons: " + this.increasePhysiologicalReasons.size());
		//System.out.println("showDetailOfArrayList" + showDetailOfArrayList(increasePhysiologicalReasons));
	}

	public Item(String module,String title, Range maleRange, Range femaleRange, String units,
			ArrayList<String> increasePhysiologicalReasons,
			ArrayList<String> increasePsychologicalReasons,
			ArrayList<String> decreasePhysiologicalReasons,
			ArrayList<String> decreasePsychologicalReasons) {
		super();
		this.module = module;
		this.title = title;
		this.maleRange = maleRange;
		this.femaleRange = femaleRange;
		this.units = units;
		this.increasePhysiologicalReasons = (ArrayList<String>)increasePhysiologicalReasons.clone();
		this.increasePsychologicalReasons = (ArrayList<String>)increasePsychologicalReasons.clone();
		this.decreasePhysiologicalReasons = (ArrayList<String>)decreasePhysiologicalReasons.clone();
		this.decreasePsychologicalReasons = (ArrayList<String>)decreasePsychologicalReasons.clone();
	}

	public Item(String module,String title, String standard,
			ArrayList<String> increasePhysiologicalReasons,
			ArrayList<String> increasePsychologicalReasons,
			ArrayList<String> decreasePhysiologicalReasons,
			ArrayList<String> decreasePsychologicalReasons) {
		super();
		this.module = module;
		this.title = title;
		this.standard = standard;
		this.increasePhysiologicalReasons = (ArrayList<String>)increasePhysiologicalReasons.clone();
		this.increasePsychologicalReasons = (ArrayList<String>)increasePsychologicalReasons.clone();
		this.decreasePhysiologicalReasons = (ArrayList<String>)decreasePhysiologicalReasons.clone();
		this.decreasePsychologicalReasons = (ArrayList<String>)decreasePsychologicalReasons.clone();
		//System.out.println("this.strincreasePhysiologicalReasons: " + this.increasePhysiologicalReasons.size());
		//System.out.println("showDetailOfArrayList" + showDetailOfArrayList(increasePhysiologicalReasons));
	}

	public Item(String module,String title, String standard, String units,
			ArrayList<String> increasePhysiologicalReasons,
			ArrayList<String> increasePsychologicalReasons,
			ArrayList<String> decreasePhysiologicalReasons,
			ArrayList<String> decreasePsychologicalReasons) {
		super();
		this.module = module;
		this.title = title;
		this.standard = standard;
		this.units = units;
		this.increasePhysiologicalReasons = (ArrayList<String>)increasePhysiologicalReasons.clone();
		this.increasePsychologicalReasons = (ArrayList<String>)increasePsychologicalReasons.clone();
		this.decreasePhysiologicalReasons = (ArrayList<String>)decreasePhysiologicalReasons.clone();
		this.decreasePsychologicalReasons = (ArrayList<String>)decreasePsychologicalReasons.clone();
	}
	
	private String showDetailOfArrayList(ArrayList<String> strs){
		String result = "";
		if(strs == null){
			return "NULL ArrayList";
		}
		//System.out.println("size0: " + strs.size());
		for(String item : strs){
			result += item + ".";
		}
		//System.out.println("size" + strs.size());
		return result;
	}
	
	
	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public Item(String module, String title, Range maleRange,
			Range femaleRange, String standard, String units, String input,
			ArrayList<String> increasePhysiologicalReasons,
			ArrayList<String> increasePsychologicalReasons,
			ArrayList<String> decreasePhysiologicalReasons,
			ArrayList<String> decreasePsychologicalReasons) {
		super();
		this.module = module;
		this.title = title;
		this.maleRange = maleRange;
		this.femaleRange = femaleRange;
		this.standard = standard;
		this.units = units;
		this.input = input;
		this.increasePhysiologicalReasons = increasePhysiologicalReasons;
		this.increasePsychologicalReasons = increasePsychologicalReasons;
		this.decreasePhysiologicalReasons = decreasePhysiologicalReasons;
		this.decreasePsychologicalReasons = decreasePsychologicalReasons;
	}


	
	@Override
	public String toString() {
		return "Item [module=" + module + ", title=" + title + ", maleRange="
				+ maleRange + ", femaleRange=" + femaleRange + ", standard="
				+ standard + ", units=" + units + ", input=" + input
				+ ", increasePhysiologicalReasons="
				+ increasePhysiologicalReasons
				+ ", increasePsychologicalReasons="
				+ increasePsychologicalReasons
				+ ", decreasePhysiologicalReasons="
				+ decreasePhysiologicalReasons
				+ ", decreasePsychologicalReasons="
				+ decreasePsychologicalReasons + "]";
	}

	public Item clone() {
		// TODO Auto-generated method stub
		try {
			return (Item)(super.clone());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
