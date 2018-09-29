package quad_tree_reverser; // 알고스팟에 패키지까지 올리면 런타임오류남 

import java.util.Scanner;

public class Main {
	public static int order;
	public static String str1;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int cases = s.nextInt();
		s.nextLine();
		
		while(cases!=0) {
			cases--;
			order = 0;
			String str = s.nextLine();
			
			str1 = str;
			
			System.out.println(reverseTree(str.length()));
			
			
		}

	}
	
	public static String reverseTree(int Max) {
		if(str1.charAt(order)!='x') {
			return str1.charAt(order) + "";
		}
		else {
			String [] tmp = new String[4];
			order++;
			tmp[0] = reverseTree(Max);
			order++;
			tmp[1] = reverseTree(Max);
			order++;
			tmp[2] = reverseTree(Max);
			order++;
			tmp[3] = reverseTree(Max);
			
			return "x"+tmp[2]+tmp[3]+tmp[0]+tmp[1];
		}
		
		
	}

}
