package finalTaxLab;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		String status="";
		while (!(status.equals("s")||status.equals("h")||status.equals("mj")||status.equals("mf"))) {
			System.out.println("Filing as single 's', head of household 'h', married filing jointly or "
					+ "qualifying widow 'mj', or married filing seperately 'mf' :");
			status=stdin.next();
			if (!(status.equals("s")||status.equals("h")||status.equals("mj")||status.equals("mf"))) {
				System.out.println("Invalid Entry. Try again.");
			}
		}
		System.out.println("Income: ");
		int income=stdin.nextInt();
		stdin.close();
		
		int total=0;
		
		if (status.equals("s")) {
			if (income<=9700){
				total+=0.1*income;
			}else if (income<=39475) {
				total+=0.1*9700; income-=9700;
				
				total+=0.12*income;
			}else if (income<=84200) {
				total+=0.1*9700;
				total+=0.12*(39475-9700); income-=39475;
				
				total+=0.22*income;
			}else if (income<=160725) {
				total+=0.1*9700;
				total+=0.12*(39475-9700);
				total+=0.22*(84200-39475); income-=84200;
				
				total+=0.24*income;
			}else if (income<=204100) {
				total+=0.1*9700;
				total+=0.12*(39475-9700);
				total+=0.22*(84200-39475);
				total+=0.24*(160725-84200); income-=160725;
				
				total+=0.32*income;
			}else if (income<=510300) {
				total+=0.1*9700;
				total+=0.12*(39475-9700);
				total+=0.22*(84200-39475);
				total+=0.24*(160725-84200);
				total+=0.32*(204100-160725); income-=204100;
				
				total+=0.35*income;
			}else {
				total+=0.1*9700;
				total+=0.12*(39475-9700);
				total+=0.22*(84200-39475);
				total+=0.24*(160725-84200);
				total+=0.32*(204100-160725);
				total+=0.35*(510300-204100); income-=510300;
				
				total+=0.37*income;
			}
		}else if (status.equals("h")) {
			if (income<=13850){
				total+=0.1*income;
			}else if (income<=52850) {
				total+=0.1*13850; income-=13850;
				
				total+=0.12*income;
			}else if (income<=84200) {
				total+=0.1*13850;
				total+=0.12*(52850-13850); income-=52850;
				
				total+=0.22*income;
			}else if (income<=160700) {
				total+=0.1*13850;
				total+=0.12*(52850-13850);
				total+=0.22*(84200-52850); income-=84200;
				
				total+=0.24*income;
			}else if (income<=204100) {
				total+=0.1*13850;
				total+=0.12*(52850-13850);
				total+=0.22*(84200-52850);
				total+=0.24*(160700-84200); income-=160700;
				
				total+=0.32*income;
			}else if (income<=510300) {
				total+=0.1*13850;
				total+=0.12*(52850-13850);
				total+=0.22*(84200-52850);
				total+=0.24*(160700-84200);
				total+=0.32*(204100-160700); income-=204100;
				
				total+=0.35*income;
			}else {
				total+=0.1*13850;
				total+=0.12*(52850-13850);
				total+=0.22*(84200-52850);
				total+=0.24*(160700-84200);
				total+=0.32*(204100-160700);
				total+=0.35*(510300-204100); income-=510300;
				
				total+=0.37*income;
			}
		}else if (status.equals("mj")) {
			if (income<=19400){
				total+=0.1*income;
			}else if (income<=78950) {
				total+=0.1*19400; income-=19400;
				
				total+=0.12*income;
			}else if (income<=168400) {
				total+=0.1*19400;
				total+=0.12*(78950-19400); income-=78950;
				
				total+=0.22*income;
			}else if (income<=321450) {
				total+=0.1*19400;
				total+=0.12*(78950-19400);
				total+=0.22*(168400-78950); income-=168400;
				
				total+=0.24*income;
			}else if (income<=408200) {
				total+=0.1*19400;
				total+=0.12*(78950-19400);
				total+=0.22*(168400-78950);
				total+=0.24*(321450-168400); income-=321450;
				
				total+=0.32*income;
			}else if (income<=612350) {
				total+=0.1*19400;
				total+=0.12*(78950-19400);
				total+=0.22*(168400-78950);
				total+=0.24*(321450-168400);
				total+=0.32*(408200-321450); income-=408200;
				
				total+=0.35*income;
			}else {
				total+=0.1*19400;
				total+=0.12*(78950-19400);
				total+=0.22*(168400-78950);
				total+=0.24*(321450-168400);
				total+=0.32*(408200-321450);
				total+=0.35*(612350-408200); income-=612350;
				
				total+=0.37*income;
			}
		}else if (status.equals("mf")) {
			if (income<=9700){
				total+=0.1*income;
			}else if (income<=39475) {
				total+=0.1*9700; income-=9700;
				
				total+=0.12*income;
			}else if (income<=84200) {
				total+=0.1*9700;
				total+=0.12*(39475-9700); income-=39475;
				
				total+=0.22*income;
			}else if (income<=160725) {
				total+=0.1*9700;
				total+=0.12*(39475-9700);
				total+=0.22*(84200-39475); income-=84200;
				
				total+=0.24*income;
			}else if (income<=204100) {
				total+=0.1*9700;
				total+=0.12*(39475-9700);
				total+=0.22*(84200-39475);
				total+=0.24*(160725-84200); income-=160725;
				
				total+=0.32*income;
			}else if (income<=306175) {
				total+=0.1*9700;
				total+=0.12*(39475-9700);
				total+=0.22*(84200-39475);
				total+=0.24*(160725-84200);
				total+=0.32*(204100-160725); income-=204100;
				
				total+=0.35*income;
			}else {
				total+=0.1*9700;
				total+=0.12*(39475-9700);
				total+=0.22*(84200-39475);
				total+=0.24*(160725-84200);
				total+=0.32*(204100-160725);
				total+=0.35*(306175-204100); income-=306175;
				
				total+=0.37*income;
			}
		}
		System.out.println("$"+total);
	}
	
}
