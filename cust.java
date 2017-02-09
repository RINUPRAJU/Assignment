package assignt1;

public class Customer {
	private int Serialno;
	private String Name;
	private String Place;
	Customer(int a,String b,String c)
	{
		this.Serialno=a;
		this.Name=b;
		this.Place=c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Customer obj1=new Customer(1,"Geetha","calicut");
System.out.println(obj1.Serialno);
System.out.println(obj1.Name);
System.out.println(obj1.Place);
Customer obj2=new Customer(2,"John","Kochi");
System.out.println(obj2.Serialno);
System.out.println(obj2.Name);
System.out.println(obj2.Place);
Customer obj3=new Customer(3,"Aravind","Kollam");
System.out.println(obj3.Serialno);
System.out.println(obj3.Name);
System.out.println(obj3.Place);
	}

}
