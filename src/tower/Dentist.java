package tower;

public class Dentist implements Tenant {
int x, y;
	@Override
	public int size() {
		return 1;
	}

	@Override
	public int preferredRent() {
		return 200;
	}

	@Override
	public int income() {
		return 5000;
	}

	@Override
	public int customers() {
		return 20;
	}

	@Override
	public int foo() {
		return 0;
	}

	@Override
	public boolean preferRecycling() {
		return true;
	}

	@Override
	public void setRent(int amount) {
	
	}

	@Override
	public boolean staying() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unhappy() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean destructive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isHungry() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String name() {
		return "the Dentist";
	}

	@Override
	public void draw() {
		Zen.setColor(255,255,255);
		Zen.fillRect(x, y, 80, 30);
	    Zen.setColor(41,209,201);
		Zen.fillRect(x+20, y+20, 10, 20);
		Zen.fillOval(x+21, y+15, 10,12);
		
	}

	@Override
	public void setPosition(int x, int y) {
		this.x=x;
		this.y=y;		
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public static void addRandomTenant() {
		// TODO Auto-generated method stub
		
	}


}
