package accessSpecifier;

public class ProtectedModifiers {
	public static void main(String[] args) {
		Bike b = new Bike();
		b.setSpeed(120);
		
		System.out.println("Access via subclass method : " + b.getSpeed());
		
		Vehicle v = new Vehicle();
		System.out.println(v.speed);
	}

}
