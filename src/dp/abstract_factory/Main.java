package dp.abstract_factory;

import java.util.Scanner;

public class Main {
	public static Application configs(String furnitureType) {
		Application app;
		if(furnitureType.equals("Modern")) {
			app = new Application(new ModernFurnitureFactory());
		}else {
			app = new Application(new VictorianFurnitureFactory());
		}
		return app;
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String furnitureType = in.next();
		Application app = configs(furnitureType);
		app.delivered();
	}
}
