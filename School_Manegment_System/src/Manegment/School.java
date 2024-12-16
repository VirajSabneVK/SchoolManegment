package Manegment;

import java.util.List;
/*
 * Created by VirajVs
 * The school have many teachers , many students
 * Implements teachers & students using Array List
 *  */

public class School {

	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;

	/*
	 * new School Object is created teacher list of teacher in the school student
	 * list of the student of the school
	 */

	public School(List<Teacher> teachers, List<Student> students, int totalMoneyEarned, int totalMoneyspent) {
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}

	/*
	 * Return the list of student in the School
	 */

	public List<Teacher> getTeachers() {
		return teachers;
	}

	/*
	 * add teacher to the school parameter teacher to teacher to be added
	 */

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	// It is going to return the list of student in the school
	public List<Student> getStudents() {
		return students;
	}

	/*
	 * Add a student to the school parameter student the student to be added
	 */

	public void addStudents(Student student) {
		students.add(student);
	}

	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	// Add total money By the School

	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}

	// return the total money spent
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	/*
	 * Update money that is spent by the School is the salary given by the school to
	 * the teacher Argument MoneySpent Spent by School
	 */
	public static void updateMoneySpent(int MoneySpent) {
		totalMoneyEarned -= MoneySpent;
	}

}
