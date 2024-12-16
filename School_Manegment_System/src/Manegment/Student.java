package Manegment;

/*Created By VirajVS
 * This class is created  for keep a track for student
 * fees,name,grade & fees
 */

public class Student {

	// Created variables for storing values
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;

	/*
	 * To create a new student by initializing id for the student unique name of the
	 * Fees for every student is $30,000 , Fees Paid Initially is 0; student grade
	 * of the student name of the student, grade of the student
	 */

	public Student(int id, String name, int grade) {
		this.feesPaid = 0;
		this.feesTotal = 30000;
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	// Not Going to alter student's name , student's id.
	/*
	 * Used to update to the student grade new grade of the student
	 */

	public void setGreade(int gread) {
		this.grade = grade;
	}

	/*
	 * keep adding the fees to fees paid field Add the fees to the fees paid This
	 * school is going to receive the funds
	 */

	public void payFees(int fees) {
		feesPaid += fees;
		School.updateTotalMoneyEarned(feesPaid);
	}

	// Return id of the student

	public int getId() {
		return id;
	}

	// Return Name of the Student
	public String getName() {
		return name;
	}

	// Return Grade of the student
	public int getGrade() {
		return grade;
	}

	// Return FeesPaid Of the student
	public int getFeesPaid() {
		return feesPaid;
	}

	// Return Fees Of The Student
	public int getFeesTotal() {
		return feesTotal;
	}

	// Return The Reaming Fees
	public int getRemainingFees() {
		return feesTotal - feesPaid;
	}
}
