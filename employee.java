package assignt1;

public class employee   {
	  String Name;
	  String designation;
	 int Age,PF,Gratuity,Salary;
employee(){}


	 employee(String Name,String designation,int Age,int PF,int Gratuity,int Salary)
		{
			this.Name=Name;
			this.designation=designation;
			this.Age=Age;
			this.PF=PF;
			this.Gratuity=Gratuity;
			this.Salary=Salary;
			
		}
	 public int calculateSalary()
		{
			return(Salary-(PF+Gratuity));
		}

		

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		
	{
		employee obj=new employee("Meenu","Manager",35,200,100,1200);
			
			System.out.println("Name:" +obj.Name);
			System.out.println("Designation:"+obj.designation);
			System.out.println(obj.Age);
			System.out.println(obj.PF);
			System.out.println(obj.Gratuity);
			System.out.println(obj.Salary);
			System.out.println(obj.calculateSalary());
		 }
	
		
}
