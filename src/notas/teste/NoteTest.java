package notas.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class NoteTest {
	
	private Note note;
	
	@Before
	public void setUp() throws Exception {
		this.note = new Note();
	}
	
	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void shouldReturnTheCorrectAverageForExams() {
		float noteOne = this.note.setNoteOne(0.0);
		float noteTwo = this.note.setNoteTwo(0.0);
		float average = this.note.calculateAverage(noteOne, noteTwo);
		assertEquals(0.0,(average).0);
	}

}
