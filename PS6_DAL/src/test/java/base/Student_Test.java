package base;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;
import domain.StudentDomainModel;

public class Student_Test {
	
	private static StudentDomainModel student1;
	private static UUID student1UUID = UUID.randomUUID();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
			
			Date student1Birth = null;

			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			
			 student1 = new StudentDomainModel();
			 
			try {
				student1Birth = dateFormat.parse("1997-06-12");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			student1.setStudentID(student1UUID);
			student1.setFirstName("Kevin");
			student1.setMiddleName("m");
			student1.setLastName("Doak");
			student1.setDOB(student1Birth);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getterTester() {
		student1.getStudentID();
		String EXPECTEDfirst = student1.getFirstName();
		String EXPECTEDmiddle = student1.getMiddleName();
		String EXPECTEDlast = student1.getLastName();
		Date EXPECTEDDOB = student1.getDOB();
		
		assertEquals("Kevin", EXPECTEDfirst);
		assertEquals("m", EXPECTEDmiddle);
		assertEquals("Doak", EXPECTEDlast);
	}
	@Test
	public void studentAddTester()
	{}
	@Test
	public void studentUpdateTester()
	{}
	@Test
	public void studentDeleteTester()
	{}
}
