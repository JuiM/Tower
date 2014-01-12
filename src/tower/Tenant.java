package tower;

public interface Tenant {

	public int size();

	public int preferredRent();

	public int income();

	public int customers();

	public int foo();

	public boolean preferRecycling();

	public void setRent(int amount);

	public boolean staying();
	public boolean unhappy();
	public boolean destructive();
	public boolean isHungry();

	public String name();

	public void draw();
	public void setPosition(int x, int y);

 public int getX();
 public int getY();
 
 public void addRandomTenant();
}
