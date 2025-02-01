package edu.stpeters.stdres.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {
@Id
	String name;
	String college;
	int fee;
	int math;
	int sci;
	int eng;
	public Student() {	 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", college=" + college + ", fee=" + fee + ", math=" + math + ", sci=" + sci
				+ ", eng=" + eng + "]";
	}
}


