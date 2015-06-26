package cn.edu.nankai.medicalproject.data;

import java.util.ArrayList;

public class Data implements Cloneable{

	private ArrayList<Item> items = new ArrayList<Item>();
    private static Data uniqueInstance = new Data();
	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	private Data() {
		super();
		// TODO Auto-generated constructor stub
		//this.items = ;
	}

	/*private Data(ArrayList<Item> items) {
		super();
		this.items = items;
	}*/

	public static Data getInstance(){
		return uniqueInstance;
	}
	
	public void addItem(Item item){
		//System.out.println("Added item: " + item);
		this.items.add(item);
	}
	
	public void clearItems(){
		this.items.clear();
	}
	
	@Override
	public String toString() {
		return "Data [items=" + items + "]";
	}
	
	public Data clone(){
		try {
			return (Data)(super.clone());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
