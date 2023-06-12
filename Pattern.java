import java.util.Scanner;
public class Pattern{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<=n;i++){
System.out.println();
for(int j=1;j<=i;j=j+1){
System.out.print(j);	
if(j<=i-1)
System.out.print(",");
}
}
}
}