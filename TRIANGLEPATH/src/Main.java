import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static int n;
	public static int [][] cache;
	public static int [][] Triangle;
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		int cases = s.nextInt();
		s.nextLine();
		while(cases!=0) {
			cases--;
			n = s.nextInt();
			Triangle = new int[n][n];
			cache = new int[n][n];
			for(int []arr:Triangle)Arrays.fill(arr, -1);
			for(int []arr:cache)Arrays.fill(arr, -1);
			for(int i=0;i<n;i++) {
				for(int j=0;j<i+1;j++) {
					Triangle[i][j] = s.nextInt();
				}
			}
			
			System.out.println(path1(0,0));
		}
	}
	public static int path1(int y, int x) {
		if(y == n-1)return Triangle[y][x];
		
		if(cache[y][x]!=-1)return cache[y][x];
		
			
		return cache[y][x] = max(path1(y+1,x+1),path1(y+1,x))+Triangle[y][x];
	}
	
	private static int max(int path1, int path12) {
		// TODO Auto-generated method stub
		if(path1>path12) return path1;
		else return path12;
	}
}
