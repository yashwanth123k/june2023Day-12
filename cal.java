class cal extends Thread{
public static void main(String args[]){
cal obj=new cal();
Thread threadobj=new Thread(obj);
threadobj.start();
System.out.println("Threads inside main");
}
public void run(){
System.out.println("Threads outside main");
}
}
