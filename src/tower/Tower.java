package tower;

import java.util.ArrayList;

public class Tower {

	static ArrayList <Tenant> tenants;
	static int balance = 1000;

	public static void main(String[] args) {

		initialize();
		addTenant(new Dentist());
		
		public void addRandomTenant(){
			double choice = Math.random();
			if (choice < 0.1){
				addTenant(newDentist());
			}
			else if(choice <0.2)
				//add new Hair Stylist
		}
		while(true){
			drawBackground();
			//moving stuff around
			drawTenants();

			Zen.flipBuffer();
			Zen.sleep(33);

		}
	}
	public static void addTenant(Tenant t){
		for(int i=0;  i < tenants.size(); i++){
			if (tenants.get(i).name().equals("vacancy")){
				Tenant old = tenants.get(i);
				//setting it as a new tenant if it's vacant
				t.setPosition(old.getX(), old.getY());
				tenants.set(i,t);
				return;
			}
		}
	}

	private static void initialize(){
		Zen.create(550, 700);
		tenants = new ArrayList <Tenant> ();

		for(int y=26 ; y< 600; y+= 31) {
			for( int x = 26; x<= 188; x+= 81){
				Tenant t = new Vacancy();
				t.setPosition(x,y);
				tenants.add(t);	
			}
		}
		for(int y=26 ; y< 600; y+= 31) {
			for( int x = 282; x<= 500; x+= 81){
				Tenant t = new Vacancy();
				t.setPosition(x,y);
				tenants.add(t);	
			}
		}

	}
	private static void drawTenants() {
		// TODO Auto-generated method stub
		for(Tenant t:tenants){
			t.draw();
		}
	}

	public static void drawBackground() {
		Zen.setColor(0, 0, 255);
		Zen.fillRect(0, 0, 550, 700);
		Zen.setColor(247, 163, 17);
		Zen.fillRect(25, 25, 500, 675);
		Zen.setColor(211,16,45);
		Zen.fillRect(269, 25, 12, 675);
		Zen.setColor(218,149,21);
		Zen.fillRect(26, 615, 498, 100);
	}
}

