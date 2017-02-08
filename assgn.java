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
	employee obj = new employee(10,"baabtra","calicut");
	System.out.println(obj.int_number);
		System.out.println(obj.char_name);
		System.out.println(obj.char_place);
	}
}