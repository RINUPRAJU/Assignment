package assignt1;

public class employee1 {
	
		  String Name;
		  String designation;
		 int Age,Fine,BasicSalary;
	employee1(){}


		 employee1(String Name,String designation,int Age,int Fine,int BasicSalary)
			{
				this.Name=Name;
				this.designation=designation;
				this.Age=Age;
				this.Fine=Fine;
				this.BasicSalary=BasicSalary;
				
			}
		 public int calculateSalary()
			{
				return(BasicSalary-Fine);
			}

			

		public static void main(String[] args) 
			// TODO Auto-generated method stub
			
		{
			employee1 obj=new employee1("Robin","Manager",25,200,12000);
				
				System.out.println("Name:" +obj.Name);
				System.out.println("Designation:"+obj.designation);
				System.out.println(obj.Age);
				System.out.println(obj.Fine);
				
				System.out.println(obj.BasicSalary);
				System.out.println("Salary"+obj.calculateSalary());
			 }
		
			
	}


