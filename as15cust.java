package assignt1;

public class Customr implements promotionalOffers {
	
	String name,address;
	int age,phone;
	
	Customr(String name,String address, int age,int phone )
	{
		this.name=name;
		this.address=address;
		this.age=age;
		this.phone=phone;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customr cus=new Customr("Geetha","calicut",28,997753);
		System.out.println("Name:"+cus.name);
		System.out.println("Address:"+cus.address);
		System.out.println("Age:"+cus.age);
		System.out.println("Phone No:"+cus.phone);
		cus.regularoffer(3500);
		cus.seasonOffer(1800);
	}
	
	public int seasonOffer(int totalPurchaseAmount) {
		
		totalPurchaseAmount=totalPurchaseAmount*10/100;
		System.out.println("Seasonoffer:"+totalPurchaseAmount);
		return totalPurchaseAmount;
	
	}
	
	public int regularoffer(int amount) {
		amount=amount*0/100;
		System.out.println("Regularoffer:"+amount);
		return amount;
		
			}
	}

	

