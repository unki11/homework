package oop.modifier6;

public class Student {
	
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	boolean pass;
	
	Student(String name,int kor,int eng,int math){
		
		setName(name);
		setKor(kor);
		setEng(eng);
		setMath(math);
		setTotal();
		setPass();
	}
	
	void setName(String name) {
		this.name=name;
	}
	
	void setKor(int kor) {
		this.kor=kor;
		setTotal();
	}
	
	void setEng(int eng) {
		this.eng=eng;
		setTotal();
	}
	
	void setMath(int math) {
		this.math=math;
		setTotal();
	}
	
	void setTotal() {
		this.total=this.kor+this.eng+this.math;
		this.avg=(int)(total/3.0*100)/100.0;
	}
	
	void setPass() {
		if(this.avg>=60.0) {
			this.pass=true;
		}
	}
	
	String getName() {
		return this.name;
	}
	
	int getKor() {
		return this.kor;
	}
	
	int getEng() {
		return this.eng;
	}
	
	int getMath() {
		return this.math;
	}
	
	int getTotal() {
		return this.total;
	}
	
	double getAvg() {
		return this.avg;
	}
	
	boolean getPass() {
		return this.pass;
	}
	
	void print() {
		System.out.println("이름: "+getName());
		System.out.println("국어: "+getKor());
		System.out.println("영어: "+getEng());
		System.out.println("수학: "+getMath());
		System.out.println("총합: "+getTotal());
		System.out.println("평균: "+getAvg());
		if(getPass()) {
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다");
		}
		System.out.println();
	}
}


