
public class Rocket {
	int fuel;
	String rocket;
	String end = "Out of Fuel";

	public Rocket(int fuel, String rocket) {
		this.fuel = fuel;
		this.rocket = rocket;
		System.out.println("Constructing Rocket...");
	}

	public void launch() {
		for (int i = 10; i >= 0; i -= 1) {
			System.out.println(i);
			if (i == 0) {
				System.out.println(end);

			}
		}
	}
}
