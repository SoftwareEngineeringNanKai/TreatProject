package com.nankai.project;


public class Patient {
	private int age;
	private boolean isMale;
	private double RBC;
	private double HGB;
	private double HCT;
	private double MCV;
	private double MCH;
	private double MCHC;
	private double RDW;
	private double WBC;
	private double NEUT;
	private double EOS;
	private double BASO;
	private double LYM;
	private double MONO;
	private double PLT;
	private double MPV;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Patient(int age, boolean isMale) {
		super();
		this.age = age;
		this.isMale = isMale;
	}

	

	public Patient(double d[]) {
		this.RBC = d[0];
		this.HGB = d[1];
		this.HCT = d[2];
		this.MCV = d[3];
		this.MCH = d[4];
		this.MCHC = d[5];
		this.RDW = d[6];
		this.WBC = d[7];
		this.NEUT = d[8];
		this.EOS = d[9];
		this.BASO = d[10];
		this.LYM = d[11];
		this.MONO = d[12];
		this.PLT = d[13];
		this.MPV = d[14];
	}

	public Patient(int age, boolean isMale, double rBC, double hGB, double hCT,
			double mCV, double mCH, double mCHC, double rDW, double wBC,
			double nEUT, double eOS, double bASO, double lYM, double mONO,
			double pLT, double mPV) {
		super();
		this.age = age;
		this.isMale = isMale;
		RBC = rBC;
		HGB = hGB;
		HCT = hCT;
		MCV = mCV;
		MCH = mCH;
		MCHC = mCHC;
		RDW = rDW;
		WBC = wBC;
		NEUT = nEUT;
		EOS = eOS;
		BASO = bASO;
		LYM = lYM;
		MONO = mONO;
		PLT = pLT;
		MPV = mPV;
	}
	
	public void setInfo(double d[]) {
		this.RBC = d[0];
		this.HGB = d[1];
		this.HCT = d[2];
		this.MCV = d[3];
		this.MCH = d[4];
		this.MCHC = d[5];
		this.RDW = d[6];
		this.WBC = d[7];
		this.NEUT = d[8];
		this.EOS = d[9];
		this.BASO = d[10];
		this.LYM = d[11];
		this.MONO = d[12];
		this.PLT = d[13];
		this.MPV = d[14];
	}
	public double getBASO() {
		return BASO;
	}

	public void setBASO(double bASO) {
		BASO = bASO;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public double getRBC() {
		return RBC;
	}

	public void setRBC(double rBC) {
		RBC = rBC;
	}

	public double getHGB() {
		return HGB;
	}

	public void setHGB(double hGB) {
		HGB = hGB;
	}

	public double getHCT() {
		return HCT;
	}

	public void setHCT(double hCT) {
		HCT = hCT;
	}

	public double getMCV() {
		return MCV;
	}

	public void setMCV(double mCV) {
		MCV = mCV;
	}

	public double getMCH() {
		return MCH;
	}

	public void setMCH(double mCH) {
		MCH = mCH;
	}

	public double getMCHC() {
		return MCHC;
	}

	public void setMCHC(double mCHC) {
		MCHC = mCHC;
	}

	public double getRDW() {
		return RDW;
	}

	public void setRDW(double rDW) {
		RDW = rDW;
	}

	public double getWBC() {
		return WBC;
	}

	public void setWBC(double wBC) {
		WBC = wBC;
	}

	public double getNEUT() {
		return NEUT;
	}

	public void setNEUT(double nEUT) {
		NEUT = nEUT;
	}

	public double getEOS() {
		return EOS;
	}

	public void setEOS(double eOS) {
		EOS = eOS;
	}

	public double getLYM() {
		return LYM;
	}

	public void setLYM(double lYM) {
		LYM = lYM;
	}

	public double getMONO() {
		return MONO;
	}

	public void setMONO(double mONO) {
		MONO = mONO;
	}

	public double getPLT() {
		return PLT;
	}

	public void setPLT(double pLT) {
		PLT = pLT;
	}

	public double getMPV() {
		return MPV;
	}

	public void setMPV(double mPV) {
		MPV = mPV;
	}
	
	
	
	
	
	

}
