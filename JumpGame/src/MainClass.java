import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static int [][] foo;
	public static int [][] cache;
	public static int n;
	
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		
		int cases = s.nextInt();
		while(cases!=0) {
			cases -- ;
			n =s.nextInt(); // 최대값 Scan
			foo = new int[n][n];
			cache = new int[n][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					foo[i][j] = s.nextInt();
				}
			}
			for(int [] array:cache) Arrays.fill(array, -1);
			
			if(chaseGoal(0,0))System.out.println("YES");
			else System.out.println("NO");
		}
	}
	
	public static boolean chaseGoal(int x, int y) {
		
		if(y>=n||x>=n)return false;
		else if(y==n-1&&x==n-1)return true;
		
		if(cache[y][x]==1)return false;
		else cache[y][x] = 1;
		
		int jump = foo[y][x];
		
		return chaseGoal(x+jump,y)||chaseGoal(x,y+jump);
	}
}
