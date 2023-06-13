class Example{
public static void main(String args[]){
try{
int data=50/0;
}
//handling the exception
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Can't divided by zero");
}
}