package iff.statements;

public class IfElaseLadder {

	public static void main(String[] args) {

		int marks = 92;

		if (marks > 40 && marks < 50) {
			System.out.println("You are just passed");
		} else if (marks >= 50 && marks < 60) {
			System.out.println("You are passed with second class");
		} else if (marks >= 60 && marks < 66) {
			System.out.println("You are passed with first class");
		} else if (marks > 90) {
			System.out.println("You have achieved silver medal");

		} else if (marks >= 66) {
			System.out.println("You are passed with distinction");
		}

		else {
			System.out.println("You are failed");
		}

		System.out.println("After if else ladder");

	}

}
