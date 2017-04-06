
public class Coffee {
	int temp;
	String brewType;
	boolean isDecaf;

	public Coffee(int temp, String brewType, boolean isDecaf) {
		this.temp = temp;
		this.brewType = brewType;
		this.isDecaf = isDecaf;
	}

	public void serve(String guest) {
		System.out.println(guest + ", your order is a " + brewType + ", is " + isDecaf + " decaf and " + temp + " degrees.");
	}

	public static void main(String[] args) {
		Coffee Starbucks = new Coffee(90, "dark", true);
		Starbucks.serve("David");

	}

}
