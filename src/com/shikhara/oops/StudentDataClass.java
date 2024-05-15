package com.shikhara.oops;

public class StudentDataClass {
	
	 StudentData[] showData(StudentData d6[]) {
		
		return d6;
	}
	

	public static void main(String[] args) {


		StudentData d1 = new StudentData(1,"Shikhara",100);
		StudentData d2 = new StudentData(2,"Abhi",90);
		StudentData d3 = new StudentData(3,"Name",200);
		StudentData d4 = new StudentData(4,"Rohith",80);
		
		StudentData[] d5 = {d1,d2,d3,d4};
		
		//System.out.println(d5);	
		
		StudentDataClass stc = new StudentDataClass();
		
		StudentData[] re = stc.showData(d5);	
		
		for(StudentData k: re) {
			
			System.out.println(k);
		}
		
		

	}

}
