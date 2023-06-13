import java.util.Scanner;
public class Pattern1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
for (int i=1;i<=5;i++){
for(int s=i;s<5;s++){

System.out.print(" ");
}
for(int j=1;j<i*2;j++){
System.out.print("^");
}
System.out.println();

}
}}