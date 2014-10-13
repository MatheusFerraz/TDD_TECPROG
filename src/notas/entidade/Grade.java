package notas.entidade;

public class Grade {
	
	private double gradeOne;
	private double gradeTwo;
	
	public Grade() {
		
	}
	
	public double calculateAverage(final double gradeOne, final double gradeTwo) {
		double average = 0.00;
		average = ((gradeOne + gradeTwo)/2);
		return average;
	}
	
	public double getGradeOne() {
		return gradeOne;
	}
	
	public void setGradeOne(double gradeOne) {
		this.gradeOne = gradeOne;
	}
	
	public double getGradeTwo() {
		return gradeTwo;
	}
	
	public void setGradeTwo(double gradeTwo) {
		this.gradeTwo = gradeTwo;
	}

}
