import java.util.Arrays;
import java.util.Scanner;

class bigMuti {
	public static void main(String [] args) {
	String [] s;
	int al,bl,rl;
	Scanner sc= new Scanner(System.in);
	s=sc.nextLine().split(" ");
	al=s[0].length();
	bl=s[1].length();
	rl=al+bl+1;
	int [] a=new int [al];
	int [] b =new int [bl];
	int[] resulttmp =new int [rl];
	int[] result =new int [rl];
	for(int i=0;i<al;i++)
		a[i]=s[0].charAt(i)-'0';
	for(int i=0;i<bl;i++)
		b[i]=s[1].charAt(i)-'0';
	int diff=0;
	for(int i=al-1;i>=0;i--) {
		for(int k=bl-1;k>=0;k--) {
			resulttmp[i+k+2]+=a[i]*b[k];
			resulttmp[i+k+1]+=resulttmp[i+k+2]/10;
			resulttmp[i+k+2]=Math.floorMod(resulttmp[i+k+2], 10);			
		}
		
		diff++;
	}
	
	for(int i=0;i<rl;i++) {	
		
		if(resulttmp[i]!=0) {
			for(;i<rl;i++)
				System.out.format("%c", (resulttmp[i]+'0'));
		}	
	}
	
	
			}

}
