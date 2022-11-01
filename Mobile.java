package week1.day2;

public class Mobile {
 public void makecall() { 
	 String mobilemodel="vivo y30";
	 float mobileweight=20.5f;
 System.out.println("MAKE CALL");

}
 private void sendmessage() {
	boolean charged=true;
	int mobilecost=15000;
System.out.println("sending message");	
	

}
 public static void main(String[] args) {
	Mobile obj=new Mobile ();
	obj.sendmessage();
	obj.makecall();
	System.out.println("THIS IS MY MOBILE");
	
}
}
