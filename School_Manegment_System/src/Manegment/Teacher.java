package Manegment;

/*
 * Created by VirajVS
 * this class is responsible for keep the track
 * of teachers name,id,salary*/

public class Teacher {

	private int id;
	private String name;
	private int salary;
	private int salaryEarnd;

	/*
	 * Create a new teacher object id of the teacher name of the teacher salary of
	 * the teacher
	 */

	public Teacher(int id, String name, int salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarnd = 0;
	}

	// teacher id
	public int getid() {
		return id;
	}

	// Teacher name
	public String getname() {
		return name;
	}

	// Teacher salary
	public int salary() {
		return salary;
	}

	public void setsalary(int salary) {
		this.salary = salary;
	}

	// Add To The Salary Remove TotalMoney earn To GHS By the School
	public void reciveSalary(int salary) {
		salaryEarnd += salary;
		School.updateMoneySpent(salary);
	}
}
