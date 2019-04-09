import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


class choc {
public static void main(String []arg) {
	Scanner sc =new Scanner(System.in);
	int n= sc.nextInt();
	int [] h=new int [n];
	for(int i=0;i<n;i++)
		h[i]=sc.nextInt();
	int m=sc.nextInt();
	int [] w=new int [m];
	for(int i=0;i<m;i++)
		w[i]=sc.nextInt();
	Arrays.sort(h);
	Arrays.sort(w);
	int indexh=0,cnt=0;
	for(int i=0;i<m;i++) {
		if(w[i]>=h[indexh]&&indexh<n) {
			cnt++;
			indexh++;
		}
	}
	System.out.print(cnt);
	
}
}
