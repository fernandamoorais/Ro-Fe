package ie.cct.entities;

import java.util.Random;

public class Animal {
	
	private static String type = typeCreator();
	private static String name = nameCreator();
	private static int age = ageCreator();
	private static String medicalCondition = conditionCreator();
	private static final String[] TYPESOFANIMALS = {"Dog", "Cat", "Rabbit"};
	private static final String[] NAMES = {"Fido", "Teddy", "Rufus", "Jackie", "Pappy"};
	private static final String[] MEDICALCONDITIONS = {"Myxomatosis", "Osteoporosis", "Bacterial Endocarditis", "Cancer"};
	private Staff caretaker;
	
	public Animal(Staff caretaker) {
		super();							
		this.caretaker = caretaker;
	}

	public Animal() {
		super();
	}

	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public String getMedicalCondition() {
		return medicalCondition;
	}


	public Staff getCaretaker() {
		return caretaker;
	}

	public void setCaretaker(Staff caretaker) {
		this.caretaker = caretaker;
	}
	


	@Override
	public String toString() {
		return "Animal [ Name = " + getName() + ", Age = " + getAge() + ", Medical condition = "
				+ getMedicalCondition()+ " ]";
	}

	public static String typeCreator() {
		Random typeNum = new Random();
		int typeIndex = typeNum.nextInt(TYPESOFANIMALS.length);
		String type = TYPESOFANIMALS[typeIndex];
		return type;
	}
	
	public static String nameCreator() {
		Random nameNum = new Random();
		int nameIndex = nameNum.nextInt(NAMES.length);
		String name = NAMES[nameIndex];
		return name;
	}
	
	
	public static int ageCreator() {
	switch(type) {
		
		case("Dog"):
			Random ageNum = new Random();
			int age = ageNum.nextInt(12)+1;

			return age;
		case("Cat"):
			Random ageNum2 = new Random();
			int age2 = ageNum2.nextInt(16)+1;

			return age2;
		case("Rabbit"):
			Random ageNum3 = new Random();
			int age3 = ageNum3.nextInt(2)+1;

			return age3;
		default: 
			return 0;
		}
		
	}
	
	public static String conditionCreator() {
		Random conditionNum = new Random();
		int conditionIndex = conditionNum.nextInt(MEDICALCONDITIONS.length);
		String condition = MEDICALCONDITIONS[conditionIndex];
		return condition;
	}
}
