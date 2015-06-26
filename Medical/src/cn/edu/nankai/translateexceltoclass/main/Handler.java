package cn.edu.nankai.translateexceltoclass.main;
import cn.edu.nankai.medicalproject.data.*;
public abstract class Handler {

	protected Item item;

	public Item getItem() {
		return item.clone();
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	public abstract void handleString(String string);
}
