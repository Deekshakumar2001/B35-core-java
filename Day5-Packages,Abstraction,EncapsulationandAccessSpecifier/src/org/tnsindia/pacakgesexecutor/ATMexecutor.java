package org.tnsindia.pacakgesexecutor;
import java.util.Scanner;

import org.tnsindia.pacakagesdemo.ATM;

//importing the class of another package
//import org.tnsindia.packagesdemo.ATM;


//driver class
public class ATMexecutor {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the card no: ");
		String card_no=s.nextLine();
		ATM obj=new ATM();
		obj.display(card_no);
		s.close();

	}

}
