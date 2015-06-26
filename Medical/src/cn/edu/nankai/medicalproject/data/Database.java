package cn.edu.nankai.medicalproject.data;

import java.util.ArrayList;

public class Database {

	private Data data;

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
	
	private void clearItems(ArrayList<String> increasePhysiologicalReasons,ArrayList<String> increasePsychologicalReasons,
			ArrayList<String> decreasePhysiologicalReasons,ArrayList<String> decreasePsychologicalReasons){
		 increasePhysiologicalReasons.clear();
		 increasePsychologicalReasons.clear();
		 decreasePhysiologicalReasons.clear();
		 decreasePsychologicalReasons.clear();
	}
	
	private void addToArrayList(ArrayList<String> arrayList,String[] strings){
		for(String str : strings){
			arrayList.add(str);
		}
		//System.out.println("size2: " + arrayList.size());
	}
	
	/*private void initialData(){
		Item item;
		ArrayList<Item> items = new ArrayList<Item>();
		ArrayList<String> increasePhysiologicalReasons = new ArrayList<String>();
		ArrayList<String> increasePsychologicalReasons = new ArrayList<String>();
		ArrayList<String> decreasePhysiologicalReasons = new ArrayList<String>();
		ArrayList<String> decreasePsychologicalReasons = new ArrayList<String>();
        
		String[] strincreasePhysiologicalReasons = new String[]{"精神因素","缺氧","多次献血者","新生儿"};
		String[] strincreasePsychologicalReasons = new String[]{"代偿性红细胞释放增加","各种原因所致的血液浓缩","先天性心脏病","慢性肺脏疾患","干细胞疾病","药物因素"};
		String[] strdecreasePhysiologicalReasons = new String[]{"3个月的婴儿至15岁以前的儿童会出现","老年人骨髓造血功能减低","血液稀释(妊娠中、后期)"};
		String[] strdecreasePsychologicalReasons = new String[]{"急慢性失血","血管外溶血","血管内溶血","急慢性贫血","药物因素"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		//System.out.println("strincreasePhysiologicalReasons: " + increasePhysiologicalReasons.size());
		item = new Item("红细胞计数",new Range(4.3, 5.9),new Range(3.9, 5.2),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		strincreasePhysiologicalReasons = new String[]{"精神因素","缺氧","多次献血者","新生儿","大量吸烟"};
		strincreasePsychologicalReasons = new String[]{"代偿性红细胞释放增加","各种原因所致的血液浓缩","先天性心脏病","慢性肺脏疾患","干细胞疾病"};
		strdecreasePhysiologicalReasons = new String[]{"3个月的婴儿至15岁以前的儿童会出现","老年人骨髓造血功能减低","血液稀释(妊娠中、后期)"};
		strdecreasePsychologicalReasons = new String[]{"铁缺乏","急慢性失血","血管外溶血","血管内溶血","急慢性贫血","药物因素"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("血红蛋白测定",new Range(137, 179),new Range(116, 155),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		strincreasePhysiologicalReasons = new String[]{"精神因素","缺氧","新生儿"};
		strincreasePsychologicalReasons = new String[]{"代偿性红细胞释放增加","各种原因所致的血液浓缩","先天性心脏病","慢性肺脏疾患","干细胞疾病"};
		strdecreasePhysiologicalReasons = new String[]{"3个月的婴儿至15岁以前的儿童会出现","老年人骨髓造血功能减低","血液稀释(妊娠中、后期)"};
		strdecreasePsychologicalReasons = new String[]{"急慢性失血","血管外溶血","血管内溶血","急慢性贫血","休克","烧伤","电解质紊乱"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("红细胞压积",new Range(0.40, 0.52),new Range(0.37, 0.47),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		strincreasePhysiologicalReasons = new String[]{};
		strincreasePsychologicalReasons = new String[]{"大细胞性贫血","药物影响"};
		strdecreasePhysiologicalReasons = new String[]{};
		strdecreasePsychologicalReasons = new String[]{"单纯小细胞性贫血","小细胞低色素性贫血","全身性溶血性贫血","药物影响"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("平均红细胞体积",new Range(80, 100),new Range(80, 100),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		strincreasePhysiologicalReasons = new String[]{};
		strincreasePsychologicalReasons = new String[]{"细胞性贫血"};
		strdecreasePhysiologicalReasons = new String[]{};
		strdecreasePsychologicalReasons = new String[]{"单纯小细胞性贫血","小细胞低色素性贫血"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("平均红细胞血红蛋白量",new Range(27, 34),new Range(27, 34),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		strincreasePhysiologicalReasons = new String[]{};
		strincreasePsychologicalReasons = new String[]{};
		strdecreasePhysiologicalReasons = new String[]{};
		strdecreasePsychologicalReasons = new String[]{"小细胞低色素性贫血"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("平均红细胞血红蛋白浓度",new Range(320, 360),new Range(320, 360),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		strincreasePhysiologicalReasons = new String[]{};
		strincreasePsychologicalReasons = new String[]{};
		strdecreasePhysiologicalReasons = new String[]{};
		strdecreasePsychologicalReasons = new String[]{"小细胞低色素性贫血"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("平均红细胞血红蛋白浓度",new Range(320, 360),new Range(320, 360),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		strincreasePhysiologicalReasons = new String[]{};
		strincreasePsychologicalReasons = new String[]{"大细胞不均一性贫血","正细胞不均一性贫血","小细胞不均一性贫血"};
		strdecreasePhysiologicalReasons = new String[]{};
		strdecreasePsychologicalReasons = new String[]{"小细胞低色素性贫血"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("红细胞体积分布宽度",new Range(0, 14.5),new Range(0, 14.5),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		strincreasePhysiologicalReasons = new String[]{"月经前","妊娠与分娩","哺乳期妇女","剧烈运动","精神因素","饮酒","大量吸烟"};
		strincreasePsychologicalReasons = new String[]{"急性和化脓性感染","全身感染","严重烧伤","急性大出血及急性溶血","恶性肿瘤","中毒","粒细胞白血病","药物影响"};
		strdecreasePhysiologicalReasons = new String[]{"女性绝经期"};
		strdecreasePsychologicalReasons = new String[]{"病毒感染","某些传染病","某些白血病","化学药品及放射损害","自身免疫性疾病","脾功能亢进","药物影响"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("白细胞计数",new Range(3.50, 10.00),new Range(3.50, 10.00),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		

		strincreasePhysiologicalReasons = new String[]{"初生儿","妊娠","吸烟","女性黄体期"};
		strincreasePsychologicalReasons = new String[]{"急性和化脓性感染","急性中毒","恶性肿瘤","急性大出血及溶血","较大手术后","白血病","急性心肌梗死","肾移植术后排斥反应期"};
		strdecreasePhysiologicalReasons = new String[]{"月经期","绝经期"};
		strdecreasePsychologicalReasons = new String[]{"病毒感染","某些白血病","化学药品及放射损害","自身免疫性疾病","脾功能亢进","甲亢"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("中性粒细胞",new Range(0.50, 0.70),new Range(0.50, 0.70),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		strincreasePhysiologicalReasons = new String[]{};
		strincreasePsychologicalReasons = new String[]{"寄生虫病","血液病","过敏性疾病","皮肤病"};
		strdecreasePhysiologicalReasons = new String[]{};
		strdecreasePsychologicalReasons = new String[]{"伤寒","副伤寒","应激状态"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("嗜酸性粒细胞",new Range(0.01, 0.05),new Range(0.01, 0.05),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		strincreasePhysiologicalReasons = new String[]{"吸烟","妊娠","月经期"};
		strincreasePsychologicalReasons = new String[]{"骨髓增殖性疾病","金属中毒","溃疡性结肠炎","甲状腺红能减低症","肾病综合征"};
		strdecreasePhysiologicalReasons = new String[]{"绝经期,排卵期,黄体期"};
		strdecreasePsychologicalReasons = new String[]{"Ⅰ型超敏反应（速发型变态反应）","应激反应","失血性休克","传染病急性期"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("嗜碱性粒细胞",new Range(0.00, 0.01),new Range(0.00, 0.01),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		strincreasePhysiologicalReasons = new String[]{"婴儿期"};
		strincreasePsychologicalReasons = new String[]{"病毒感染","某些血液病","移植术后排异反应期","多数急性传染病恢复期"};
		strdecreasePhysiologicalReasons = new String[]{};
		strdecreasePsychologicalReasons = new String[]{"长期化疗及免疫缺陷","接触放射线","传染病急性期"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("淋巴细胞",new Range(0.20, 0.40),new Range(0.20, 0.40),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		

		strincreasePhysiologicalReasons = new String[]{"月经期卵泡期"};
		strincreasePsychologicalReasons = new String[]{"某些感染","某些血液病","某些疾病恢复期","某些寄生虫病","甲亢","结节性关节炎","病毒,立克次体感染","药物影响"};
		strdecreasePhysiologicalReasons = new String[]{"妊娠","高海拔地区"};
		strdecreasePsychologicalReasons = new String[]{"急慢性淋巴细胞白血病和全髓功能不全"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("单核细胞",new Range(0.03, 0.08),new Range(0.03, 0.08),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		strincreasePhysiologicalReasons = new String[]{"剧烈活动或饱餐后","高原居民","频繁捐献血小板者"};
		strincreasePsychologicalReasons = new String[]{"持续性增多","一过性增多","脾切除后","脾大","肝硬化","多发性骨髓瘤","霍奇金病","网状细胞瘤","结核病","结节性关节炎","慢性胰腺炎","PLT>700×109/L"};
		strdecreasePhysiologicalReasons = new String[]{"月经前","急性酒精中毒"};
		strdecreasePsychologicalReasons = new String[]{"生成减少","破坏过多","消耗过多","某些病毒感染","PLT<60×109/L"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("血小板计数",new Range(100, 300),new Range(100, 300),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		strincreasePhysiologicalReasons = new String[]{};
		strincreasePsychologicalReasons = new String[]{"血小板减少骨髓代偿性增加","骨髓纤维化","血栓性疾病","脾切除","慢性粒细胞白血病","巨大血小板综合征"};
		strdecreasePhysiologicalReasons = new String[]{};
		strdecreasePsychologicalReasons = new String[]{"骨髓造血系统衰竭","败血症","脾亢","再障","巨幼细胞性贫血"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("平均血小板体积",new Range(6.8, 12.8),new Range(6.8, 12.8),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		this.data = new Data(items);
	}
	
	public Database() {
		super();
		// TODO Auto-generated constructor stub
		initialData();
	}

	public Database(Data data) {
		super();
		this.data = data;
	}*/

	@Override
	public String toString() {
		return "Database [data=" + data + "]";
	}

}
