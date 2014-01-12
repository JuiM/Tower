package tower;

public class Vacancy implements Tenant {
	int x;
	int y;

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {

		return y;
	}

	@Override
	public int size() {
		return 1;
	}

	@Override
	public int preferredRent() {
		return 0;
	}

	@Override
	public int income() {
		return 0;
	}

	@Override
	public int customers() {
		return 0;
	}

	@Override
	public int foo() {
		return 0;
	}

	@Override
	public boolean preferRecycling() {
		return false;
	}

	@Override
	public void setRent(int amount) {
	}

	@Override
	public boolean staying() {
		return true;
	}

	@Override
	public boolean unhappy() {
		return false;
	}

	@Override
	public boolean destructive() {
		return false;
	}

	@Override
	public boolean isHungry() {
		return false;
	}

	@Override
	public String name() {
		return "vacancy";
	}

	@Override
	public void draw() {
		Zen.setColor(0, 0, 0);
		Zen.fillRect(x, y, 80, 30);
	}

	@Override
	public void setPosition(int x, int y) {
		this.x=x;
		this.y=y;

	}




	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 */
}
