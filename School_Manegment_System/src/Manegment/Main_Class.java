package Manegment;

import java.util.ArrayList;
import java.util.List;

public class Main_Class {

	public static void main(String[] args) {

		Teacher lizzy = new Teacher(1, "Lizzya", 5000);
		Teacher marker = new Teacher(1, "Marker", 6000);
		Teacher jaki = new Teacher(1, "Jaki", 1000);

		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(lizzy);
		teacherList.add(marker);
		teacherList.add(jaki);

		Student maggi = new Student(1, "Maggi", 2);
		Student jack = new Student(2, "jack", 1);
		Student kiran = new Student(3, "Kiran", 4);
		Student sam = new Student(4, "Sam", 3);

		List<Student> studentList = new ArrayList<>();
		studentList.add(maggi);
		studentList.add(sam);
		studentList.add(jack);
		studentList.add(kiran);

		School school = new School(teacherList, studentList, 0, 0);
		System.out.println("school Has earned " + school.getTotalMoneyEarned());

		// Student Pays Fees
		jack.payFees(12000);
		System.out.println("Jack Has earned " + school.getTotalMoneyEarned());
		kiran.payFees(22000);
		System.out.println("Kiran  Has earned " + school.getTotalMoneyEarned());
		sam.payFees(1000);
		System.out.println(" Sam Has earned " + school.getTotalMoneyEarned());

		System.out.println("-- Making GHS Pay Salary --");
		
		lizzy.reciveSalary(lizzy.salary());
		System.out.println("school Has Spent For Salary " + lizzy.getname() + " " + school.getTotalMoneyEarned() );
	}
}
