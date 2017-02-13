package assignt1;

public class Permanantemployee extends employee  {
	
	int PermanantCode;
		
	public void setpcode(int pcode)
	{
		this.PermanantCode=pcode;
	}
	public int Getpcode()
	{
		return  PermanantCode;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Permanantemployee obj1=new Permanantemployee();
		obj1.setpcode(5001);
		obj1.Getpcode();
		System.out.println("Permanantcode:"+obj1.Getpcode());
		
		employee obj=new employee("Meenu","Manager",35,200,100,1200);
		
		System.out.println("Name:" +obj.Name);
		System.out.println("Designation:"+obj.designation);
		System.out.println("Age:"+obj.Age);
		System.out.println("PF:"+obj.PF);
		System.out.println("Gratuity:"+obj.Gratuity);
		System.out.println("Salary:"+obj.Salary);
		System.out.println("Total Salary:"+obj.calculateSalary());
		
	}
}
	

	


