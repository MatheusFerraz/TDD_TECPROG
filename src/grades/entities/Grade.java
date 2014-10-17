package grades.entities;

public class Grade {

	private static final Integer MAXIMUM_ACTIVITIES = 8;
	// private static final double MAXIMUM_GRADE = 10.0;
	// private static final double MINIMUM_GRADE = 0.0;

	private double gradeExamOne;
	private double gradeExamTwo;

	public Grade() {

	}

	public double calculateAverageForActivities(double activityOne,
			double activityTwo, double activityThree, double activityFour,
			double activityFive, double activitySix, double activitySeven,
			double activityEight) {

		double sum = 0.0;
		double average = 0.0;
		
		sum = activityOne + activityTwo + activityThree + activityFour
				+ activityFive + activitySix + activitySeven + activityEight;
		
		average = sum/MAXIMUM_ACTIVITIES;
		
		return average;
	}

	public double calculateAverageForExams(final double gradeOne,
			final double gradeTwo) {
		double average = 0.00;
		average = ((gradeOne + gradeTwo) / 2);
		return average;
	}

	public double getGradeOne() {
		return gradeExamOne;
	}

	public void setGradeOne(double gradeOne) {
		this.gradeExamOne = gradeOne;
	}

	public double getGradeTwo() {
		return gradeExamTwo;
	}

	public void setGradeTwo(double gradeTwo) {
		this.gradeExamTwo = gradeTwo;
	}

}