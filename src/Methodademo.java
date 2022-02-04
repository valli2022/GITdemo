
public class Methodademo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodademo d= new Methodademo();
		//d.getData();       // for without return type
		String nam = d.getData1();  //for with return type
		getdata3();
		System.out.println(nam);
		Methodemo2 d1=new Methodemo2();
		d1.getdate2();
		
	}
 public void getData() //with out return type
 {
	 System.out.println("hello world");
 }
 
 public String getData1() //with return type string
 {
	 System.out.println("hello");
	 return "Munny";
 }
 
 public static void getdata3()// add static key word to the method then we need not create an object

{
	 System.out.println("chowdary");
	
}
}