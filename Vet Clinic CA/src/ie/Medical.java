package ie.cct.entities;

import java.util.Random;

public class Medical extends Staff {

	private static String type = typeCreator();
	private static String task = taskCreator();
	
	private static final String[] TYPESOFMEDICALSTAFF = {"Veterinarian", "Nurse", "Trainee vet"};
	private static final String[] TASKSVETERINARIAN = {};
	private static final String[] TASKSNURSE = {};
	private static final String[] TASKSTRAINEEVET = {};	
	
	
	
	public Medical() {
		super(task);										

	}
	
	public static String typeCreator() {
		Random typeNum = new Random();
		int typeIndex = typeNum.nextInt(TYPESOFMEDICALSTAFF.length);
		
		String type = TYPESOFMEDICALSTAFF[typeIndex];
		return type;
	}
	
	public static String taskCreator() {
		
		
		switch(type) {
		
		case("Veterinarian"):
			Random taskNum = new Random();
			int taskIndex = taskNum.nextInt(TASKSVETERINARIAN.length);
			String t = TASKSVETERINARIAN[taskIndex];
			return t;
		case("Nurse"):
			Random taskNum2 = new Random();
			int taskIndex2 = taskNum2.nextInt(TASKSNURSE.length);
			String t2 = TASKSNURSE[taskIndex2];
			return t2;
		case("Trainee vet"):
			Random taskNum3 = new Random();
			int taskIndex3 = taskNum3.nextInt(TASKSTRAINEEVET.length);
			String t3 = TASKSTRAINEEVET[taskIndex3];
			return t3;
		default: 
			return null;
		}
	}

	@Override
	public String toString() {
		return "Medical [Name = " + getName() + ", Staff Number = " + getStaffNumber() + ", Salary Level = "
				+ getSalaryLevel() + ", Task= " + getTask() + " ] "
				;
	}
	
	
	
}
