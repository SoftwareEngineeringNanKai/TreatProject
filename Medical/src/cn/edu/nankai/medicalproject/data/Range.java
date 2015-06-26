package cn.edu.nankai.medicalproject.data;

public class Range {

	private double start;
	private double end;

	public double getStart() {
		return start;
	}

	public void setStart(double start) {
		this.start = start;
	}

	public double getEnd() {
		return end;
	}

	public void setEnd(double end) {
		this.end = end;
	}

	public Range() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Range(double start, double end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public String toString() {
		return "Range [start=" + start + ", end=" + end + "]";
	}
}
