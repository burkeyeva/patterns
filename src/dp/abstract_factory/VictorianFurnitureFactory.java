package dp.abstract_factory;

public class VictorianFurnitureFactory implements FurnitureFactory{
	//Chair ch = new VictorianChair();
	// Shape sh = new Rectangle(3,4);
	@Override
	public Chair createChair() {
		return new VictorianChair();
	}

	@Override
	public Sofa createSofa() {
		return new VictorianSofa();
	}

	@Override
	public CoffeeTable createCoffeeTable() {
		return new VictorianCoffeeTable();
	}

}
