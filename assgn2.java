package assignt1;

public class employee {
	 private int int_number;
	 private String char_name;
	 private String char_place;
	employee(int a,String  b,String c)
	{
		this.int_number=a;
		this.char_name=b;
		this.char_place=c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	employee obj1 = new employee(1,"Robin","Calicut");
	    System.out.println(obj1.int_number);
		System.out.println(obj1.char_name);
		System.out.println(obj1.char_place);
	employee obj2 = new employee(2,"John","Kollam");
		System.out.println(obj2.int_number);
		System.out.println(obj2.char_name);
		System.out.println(obj2.char_place);
	employee obj3 = new employee(3,"Anna","Kottayam");
		System.out.println(obj3.int_number);
		System.out.println(obj3.char_name);
		System.out.println(obj3.char_place);
	}
}