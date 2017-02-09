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
Customer obj=new Customer(1,"Geetha","calicut");
System.out.println(obj.Serialno);
System.out.println(obj.Name);
System.out.println(obj.Place);
	}

}
