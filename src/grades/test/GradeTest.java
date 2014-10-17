package grades.test;

import static org.junit.Assert.*;
import grades.entities.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class GradeTest {
	
	private Grade grade;
	
	@Before
	public void setUp() throws Exception {
		this.grade = new Grade();
	}
	
	@After
	public void tearDown() throws Exception {
		
	}
	
	private int shouldRetrieveFaults() {
		int faults = this.grade.getAmountOfFaults();
		return faults;
	}
	
	private void shouldSetValuesForCalculateAverage(final double firstGrade, final double secondGrade) {
		this.grade.setGradeOne(firstGrade);
		this.grade.setGradeTwo(secondGrade);
	}
	
	private double shouldRetrieveAverageCalculated(final double firstGrade, final double secondGrade) {
		shouldSetValuesForCalculateAverage(firstGrade, secondGrade);
		double gradeOne = this.grade.getGradeOne();
		double gradeTwo = this.grade.getGradeTwo();
		double average = this.grade.calculateAverageForExams(gradeOne, gradeTwo);
		return average;
	}

	@Test
	public void shouldReturnTheCorrectAverageForExamsFirstCase() {
		double average = shouldRetrieveAverageCalculated(0.0, 0.0);
		assertEquals(0.0,average,0.01);
	}
	
	@Test
	public void shouldReturnTheCorrectAverageForExamsSecondCase() {
		double average = shouldRetrieveAverageCalculated(8.0, 6.0);
		assertEquals(7.0,average,0.01);
	}
	
	
	@Test
	public void shouldReturnTheCorrectAverageForActivitiesFirstCase() {
		assertEquals(0.0, this.grade.calculateAverageForActivities(0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0),0.01);
	}
	
	@Test
	public void shouldReturnTheCorrectAverageForActivitiesSecondCase() {
		assertEquals(5.75, this.grade.calculateAverageForActivities(6.0,5.0,9.0,7.0,7.0,6.0,4.0,2.0),0.01);
	}
	
	@Test
	public void shouldReturnTheCorrectPercentageForFaults() {
		int amountOfFaults = 0;
		this.grade.setAmountOfFaults(0);
		
		amountOfFaults = shouldRetrieveFaults();
		assertEquals(100,this.grade.calculatePercentageForFaults(amountOfFaults));
	}

}
