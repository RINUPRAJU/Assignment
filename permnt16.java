package assignt1;

public class Permanant_Empl extends employee1 implements promotionalOffers {
	
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
	
	
		
		
		employee1 obj=new employee1("Robin","Manager",25,200,12000);
		
		System.out.println("Name:" +obj.Name);
		System.out.println("Designation:"+obj.designation);
		System.out.println("Age:"+obj.Age);
		System.out.println("Fine:"+obj.Fine);
		
		System.out.println("Basicsalary:"+obj.BasicSalary);
		System.out.println("Salary"+obj.calculateSalary());
		
		Permanant_Empl obj1=new Permanant_Empl();
		obj1.setpcode(5001);
		obj1.Getpcode();
		System.out.println("Permanantcode:"+obj1.Getpcode());
		obj1.regularoffer(2500);
		obj1.seasonOffer(2500);
			 }
	public int seasonOffer(int totalPurchaseAmount) {
		
		totalPurchaseAmount=totalPurchaseAmount*25/100;
		System.out.println("Seasonoffer:"+totalPurchaseAmount);
		return totalPurchaseAmount;
	
	}
	
	public int regularoffer(int amount) {
		amount=amount*10/100;
		System.out.println("Regularoffer:"+amount);
		return amount;
	
}
}