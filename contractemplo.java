package assignt1;

public class Contract_employee {
	  String Name;
	  String Gender;
	 int Age,Empcode,PhoneNo,Salary,ContractDuration;
	


	 Contract_employee(String Name,String Gender,int Age,int Empcode,int PhoneNo,int Salary,int ContractDuration)
		{
			this.Name=Name;
			this.Gender=Gender;
			this.Age=Age;
			this.Empcode=Empcode;
			this.Salary=Salary;
			this.PhoneNo=PhoneNo;
			this.ContractDuration=ContractDuration;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contract_employee emp=new  Contract_employee("Mary", "Female", 24, 1002,10000,98236721,6);
			System.out.println("Name:" +emp.Name);
			System.out.println("Gender:"+emp.Gender);
			System.out.println("Age:"+emp.Age);
			System.out.println("Empcode:"+emp.Empcode);
			System.out.println("Salary:"+emp.Salary);
			System.out.println("PhoneNo:"+emp.PhoneNo);
			System.out.println("ContractDuration:"+emp.ContractDuration);
	}

}
