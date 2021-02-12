package day13;

import java.util.ArrayList;
import java.util.Collections;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList javabatch = new ArrayList();
		javabatch.add("Aarti");
		javabatch.add("Abhay");
		javabatch.add("Deepa");
		javabatch.add("Pavan");
		javabatch.add("darshan");
		
		System.out.println("elements of javabatch"  + javabatch);
		
		ArrayList softskill = new ArrayList();
		softskill.add("Nikhil");
		softskill.add("Deepa");
		softskill.add("Aarti");
		softskill.add("Akshay");
		softskill.add("anajali");
		

		System.out.println("elements of javabatch" + softskill);
		
		
		softskill.addAll(javabatch);
				System.out.println("elements of softskill after adding javabatch"   + softskill);
				softskill.removeAll(javabatch);
				System.out.println("after remove javabatch from softskill"+  softskill);
				
		Collections.sort(javabatch);
		System.out.println("after sorting"  + javabatch);
		
		Collections.sort(softskill);
		System.out.println("after sorting"  + softskill);
	}

}