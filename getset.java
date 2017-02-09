package assignt1;

public class employee {
	 private int number;
	 private String name;
	 private String place;
	 
	 	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	employee obj1 = new employee();
	obj1.setNumber(1);
	obj1.setName("Riya");
	obj1.setPlace("Calicut");
	obj1.getNumber();
	obj1.getName();
	obj1.getPlace();
	    System.out.println(obj1.getNumber());
		System.out.println(obj1.getName());
		System.out.println(obj1.getPlace());
	
	}
}