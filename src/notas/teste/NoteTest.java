package notas.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import notas.entidade.*;

public class NoteTest {
	
	private Grade grade;
	
	@Before
	public void setUp() throws Exception {
		this.grade = new Grade();
	}
	
	@After
	public void tearDown() throws Exception {
		
	}
	
	private void shouldSetValuesForCalculateAverage(final double firstGrade, final double secondGrade) {
		this.grade.setGradeOne(firstGrade);
		this.grade.setGradeTwo(secondGrade);
	}
	
	private double shouldRetrieveAverageCalculated(final double firstGrade, final double secondGrade) {
		shouldSetValuesForCalculateAverage(firstGrade, secondGrade);
		double gradeOne = this.grade.getGradeOne();
		double gradeTwo = this.grade.getGradeTwo();
		double average = this.grade.calculateAverage(gradeOne, gradeTwo);
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

}
