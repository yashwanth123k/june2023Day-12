import java.util.Scanner;
class Pattern{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=5;
for(int i=1;i<=n;i++){
for(int j=1;j<i;j++){
System.out.print("\n");
}
for(int k=1;k<i*2;k++){
System.out.print("^");
}
System.out.println();
}
}
}
