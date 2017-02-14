package assignt1;

public class Permanant_Empl  {
	
		  String Name;
		  String Gender;
		 int Age,Empcode,PhoneNo,Salary,Permanantcode;
		


		  Permanant_Empl(String Name,String Gender,int Age,int Empcode,int PhoneNo,int Salary,int Permanantcode)
			{
				this.Name=Name;
				this.Gender=Gender;
				this.Age=Age;
				this.Empcode=Empcode;
				this.Salary=Salary;
				this.PhoneNo=PhoneNo;
				this.Permanantcode=Permanantcode;
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Permanant_Empl obj=new  Permanant_Empl("John", "Male", 35, 1001,15000,98967321,100);
		System.out.println("Name:" +obj.Name);
		System.out.println("Gender:"+obj.Gender);
		System.out.println("Age:"+obj.Age);
		System.out.println("Empcode:"+obj.Empcode);
		System.out.println("Salary:"+obj.Salary);
		System.out.println("PhoneNo:"+obj.PhoneNo);
		System.out.println("Permanantcode:"+obj.Permanantcode);
	}

}
