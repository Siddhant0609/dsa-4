interface IPlayer {
//	public + abstract
//	public abstract void walk();
	void walk();
	void run();
	void jump();
	void defence();
	void kick();
	
	void dead();
	void entry();
	
//	this is internally public static final
	int MAX_JUMP = 100;
}

interface ExtraPower {
	void hide();
	void show();
}

//Also known as Adapter class
abstract class CommonPlayer implements IPlayer {
	public void entry() {
		System.out.println("Entry of a player...");
	}
	public void dead() {
		System.out.println("Player is dead...");
	}
}

class Eddy extends CommonPlayer implements IPlayer {

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defence() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}
	
}

class Paul extends CommonPlayer implements IPlayer, ExtraPower {

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defence() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
