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

	@Test
	public void shouldReturnTheCorrectAverageForExams() {
		this.grade.setGradeOne(0.0);
		double gradeOne = this.grade.getGradeOne();
		this.grade.setGradeTwo(0.0);
		double gradeTwo = this.grade.getGradeTwo();
		double average = this.grade.calculateAverage(gradeOne, gradeTwo);
		assertEquals(0.0,average,0.0);
	}

}
