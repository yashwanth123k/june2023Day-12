import java.util.*;
class MarkDoesNotFitException extends Exception{
String msg;
MarkDoesNotFitException(String msg){
super(msg);
this.msg=msg;
}
@Override
public String toString(){
return msg;
}
}
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int mark=sc.nextInt();
try{
if(mark<18){ 
throw new MarkDoesNotFitException("Fail...!");
}
else throw new MarkDoesNotFitException("Pass...!");

}
catch(MarkDoesNotFitException ex){
System.out.println(ex);

}
}
}
