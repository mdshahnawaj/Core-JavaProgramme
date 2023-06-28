package Interface;

/**
 * @author MdShahnawaj
 * Create interface for implementation multiple inheritance
*/
interface Hero {
	/**
	 * This is abstract method
	*/
	public abstract void hero();
}

interface Honda {
	/**
	 * This is abstract method
	*/
	public abstract void honda();
}

/**
 * Class is used for implements interface
*/
class HeroHonda implements Hero, Honda {

	/**
	 * This is body of abstract method
	*/
	public void hero() {
		System.out.println("This is hero company");
	}

	/**
	 * This is body of abstract method
	*/
	public void honda() {
		System.out.println("This is honda company");
	}

	public static void main(String[] args) {
		HeroHonda heroHonda = new HeroHonda();
		heroHonda.hero();
		heroHonda.honda();
	}

}