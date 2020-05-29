package ie.cct.entities;

import java.util.ArrayList;
import java.util.Random;

public class Staff {
	
	private static String name = nameCreator();
	private static int staffNumber = numberCreator();
	private static String salaryLevel = salaryLevelCreator();
	private String task;
	private ArrayList<Animal> animals;
	private static final String[] NAMES = {"John Denver", "Mariah Carey", "Kurt Cobain", "Freddie Mercury", "Thom Yorke", "Britney Spears", "Tupac Shaqur", "James Cameron", "Joey Tribbiani"};
	private static final String[] SALARYLEVELS = {"Low tier", "Mid tier", "High tier"};
	
	public Staff(String task) {						
		super();
		this.task = task;
		this.animals = new ArrayList<Animal>();
	}

	public String getName() {
		return name;
	}

	public int getStaffNumber() {
		return staffNumber;
	}

	public String getSalaryLevel() {
		return salaryLevel;
	}

	public String getTask() {
		return task;
	}

	public ArrayList<Animal> getAnimals() {
		return animals;
	}

	public void addAnimals(Animal animal) {
		this.animals.add(animal);
	} 		
	
	public static String nameCreator() {
		Random nameNum = new Random();
		int nameIndex = nameNum.nextInt(NAMES.length);
		String name = NAMES[nameIndex];
		return name;
	}
	
	public static int numberCreator() {
		int sn = (int) Math.random();
		return sn;
	}

	public static String salaryLevelCreator() {
		Random salaryNum = new Random();
		int salaryIndex = salaryNum.nextInt(3);
		String salary = SALARYLEVELS[salaryIndex];
		return salary;
	}
}
