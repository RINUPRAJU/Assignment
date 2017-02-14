package assignt1;

public class contractemployee extends employee1{
	int ContractDuration;
	public void setduration(int duration)
	{
		this.ContractDuration=duration;
	}
	public int Getduration()
	{
		return  ContractDuration;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		contractemployee obj1=new contractemployee();
		obj1.setduration(2);
		obj1.Getduration();
		System.out.println("ContractDuration:"+obj1.Getduration());
		
		employee1 obj=new employee1("Robin","Manager",25,200,12000);
		
		System.out.println("Name:" +obj.Name);
		System.out.println("Designation:"+obj.designation);
		System.out.println("Age:"+obj.Age);
		System.out.println("Fine:"+obj.Fine);
		System.out.println(obj.BasicSalary);
		System.out.println("Salary"+obj.calculateSalary());
		
	}

}
