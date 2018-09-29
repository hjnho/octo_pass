import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static int [][] foo;
	public static int [][] cache;
	public static int n;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int cases = s.nextInt();
		s.nextLine();
		while(cases!=0) {
			cases--;
			
			n = s.nextInt();
			s.nextLine();
			foo = new int[n][n];
			cache = new int[n][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					foo[i][j] = s.nextInt();
				}
			}
			
			for(int []arr:cache) {
				Arrays.fill(arr, -1);
			}
			
			//System.out.println(SolveMatrix(0,0));
			if(SolveMatrix(0,0)) System.out.println("YES");
			else System.out.println("NO");
			
		}

	}
	
	public static boolean SolveMatrix(int y, int x) {
		if(y>=n||x>=n) return false;
		else if(y == n-1&&x == n-1)return true;
		
		if(cache[y][x] == 1)return false;
		else cache[y][x] = 1;
		
		int jumpsize = foo[y][x];
		return SolveMatrix(y+jumpsize,x)||SolveMatrix(y,x+jumpsize);
		
	}

}
