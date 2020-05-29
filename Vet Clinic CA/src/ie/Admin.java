package ie.cct.entities;

import java.util.Random;

public class Admin extends Staff {
	private static String type = typeCreator();
	private static String task = taskCreator();
	
	private static final String[] TYPESOFADMINSTAFF = {"IT Nerd","Receptionist"};
	private static final String[] TASKSITNERD = {};
	private static final String[] TASKSRECEPTIONIST = {};

	
	public Admin() {
		super(task);
		
		// TODO Auto-generated constructor stub
	}
	
	public static String typeCreator() {
		Random typeNum = new Random();
		int typeIndex = typeNum.nextInt(TYPESOFADMINSTAFF.length);
		
		String type = TYPESOFADMINSTAFF[typeIndex];
		return type;
	}
	
	public static String taskCreator() {
		switch(type) {
		
		case("IT Nerd"):
			Random taskNum = new Random();
			int taskIndex = taskNum.nextInt(TASKSITNERD.length);
			String t = TASKSITNERD[taskIndex];
			return t;
		case("Nurse"):
			Random taskNum2 = new Random();
			int taskIndex2 = taskNum2.nextInt(TASKSRECEPTIONIST.length);
			String t2 = TASKSRECEPTIONIST[taskIndex2];
			return t2;
		default: 
			return null;
		}
	}
	public String toString() {
		return "Admin [Name = " + getName() + ", Staff Number = " + getStaffNumber() + ", Salary Level = "
				+ getSalaryLevel() + ", Task= " + getTask() + " ] "
				;
	}
}
