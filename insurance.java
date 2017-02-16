package assignt1;

public abstract class Insurance {
    String  InsuranceNo="INS110"; 
    int InsureAmount=20000,totalEMI=100000;
	abstract void registerInsurance();
	abstract void  payEMI();
}