package assignt1;

public class contractemployee extends employee1 implements promotionalOffers{
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

		
		employee1 obj=new employee1("Robin","Manager",25,200,12000);
		
		System.out.println("Name:" +obj.Name);
		System.out.println("Designation:"+obj.designation);
		System.out.println("Age:"+obj.Age);
		System.out.println("Fine:"+obj.Fine);
		
		System.out.println("Basic Salary:"+obj.BasicSalary);
		System.out.println("Salary:"+obj.calculateSalary());
		
		contractemployee obj1=new contractemployee();
		obj1.setduration(2);
		obj1.Getduration();
		System.out.println("ContractDuration:"+obj1.Getduration());
		obj1.regularoffer(2500);
		obj1.seasonOffer(2500);
	}
	public int seasonOffer(int totalPurchaseAmount) {
			
			totalPurchaseAmount=totalPurchaseAmount*15/100;
			System.out.println("Seasonoffer:"+totalPurchaseAmount);
			return totalPurchaseAmount;
		
		}
		
		public int regularoffer(int amount) {
			amount=amount*8/100;
			System.out.println("Regularoffer:"+amount);
			return amount;
		
	}

}
