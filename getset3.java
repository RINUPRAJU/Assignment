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

	
	Customer obj1 = new Customer();
	obj1.setSerialno(1);
	obj1.setName("Manu");
	obj1.setPlace("Calicut");
	obj1.getSerialno();
	obj1.getName();
	obj1.getPlace();
	    System.out.println(obj1.getSerialno());
		System.out.println(obj1.getName());
		System.out.println(obj1.getPlace());
		Customer obj2 = new Customer();
		obj2.setSerialno(2);
		obj2.setName("Ammini");
		obj2.setPlace("Delhi");
		obj2.getSerialno();
		obj2.getName();
		obj2.getPlace();
		    System.out.println(obj2.getSerialno());
			System.out.println(obj2.getName());
			System.out.println(obj2.getPlace());
			Customer obj3 = new Customer();
			obj3.setSerialno(3);
			obj3.setName("Merin");
			obj3.setPlace("Calicut");
			obj3.getSerialno();
			obj3.getName();
			obj3.getPlace();
			    System.out.println(obj3.getSerialno());
				System.out.println(obj3.getName());
				System.out.println(obj3.getPlace());
	
	}
}