package assignt1;

public class Permanant_Empl extends employee  {
	
		  String Name;
		  String Gender;
		 int Empcode,PhoneNo,Salary,Permanantcode;
		


		  Permanant_Empl(String Name,String Gender,int Empcode,int PhoneNo,int Permanantcode)
			{
				this.Name=Name;
				this.Gender=Gender;
				
				this.Empcode=Empcode;
				
				this.PhoneNo=PhoneNo;
				this.Permanantcode=Permanantcode;
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Permanant_Empl obj=new  Permanant_Empl("John", "Male",100,98967321,100);
		System.out.println("Name:" +obj.Name);
		System.out.println("Gender:"+obj.Gender);
		
		System.out.println("Empcode:"+obj.Empcode);
		
		System.out.println("PhoneNo:"+obj.PhoneNo);
		System.out.println("Permanantcode:"+obj.Permanantcode);
		
		employee emp=new employee(30,100,200,3000);
		
		
		System.out.println("Age:"+emp.Age);
		System.out.println("PF:"+emp.PF);
		System.out.println("Gratuity:"+emp.Gratuity);
		System.out.println("Salary:"+emp.Salary);
		System.out.println("TotalSalary:"+emp.calculateSalary());
	}

}
