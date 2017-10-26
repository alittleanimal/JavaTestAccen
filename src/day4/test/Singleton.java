package day4.test;

public class Singleton {
	private final static Singleton instance = new Singleton();
	
	public Singleton() {
		super();
	}
	
	public static Singleton getInstance(){
		return instance;
	}
}
