package assignt1;

public class Customer {
	private int Serialno;
	private String Name;
	private String Place;
	public int getSerialno() {
		return Serialno;
	}


	public void setSerialno(int serialno) {
		this.Serialno = serialno;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		this.Name = name;
	}


	public String getPlace() {
		return Place;
	}


	public void setPlace(String place) {
		this.Place = place;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub




	
	Customer obj = new Customer();
	obj.setSerialno(1);
	obj.setName("Manu");
	obj.setPlace("Calicut");
	obj.getSerialno();
	obj.getName();
	obj.getPlace();
	    System.out.println(obj.getSerialno());
		System.out.println(obj.getName());
		System.out.println(obj.getPlace());
	
	}
}