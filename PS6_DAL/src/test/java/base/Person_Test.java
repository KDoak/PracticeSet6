package base;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person_Test {
		
	private static PersonDomainModel person1;
	private static UUID person1UUID = UUID.randomUUID();			
	
	@BeforeClass
	public static void personInstance() throws Exception{
		
		Date person1Birth = null;

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		 person1 = new PersonDomainModel();
		 
		try {
			person1Birth = dateFormat.parse("1994-11-27");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		person1.setPersonID(person1UUID);
		person1.setFirstName("Mingkun");
		person1.setMiddleName("a");
		person1.setLastName("Chen");
		person1.setBirthday(person1Birth);
		person1.setCity("Elkton");
		person1.setStreet("702 Stone Gate Blvd");
		person1.setPostalCode(21921);
		
	}
	
	@Test
	public void getterTester() {
		person1.getPersonID();
		String EXPECTEDfirst = person1.getFirstName();
		String EXPECTEDmiddle = person1.getMiddleName();
		String EXPECTEDlast = person1.getLastName();
		Date EXPECTEDbirthday = person1.getBirthday();
		String EXPECTEDcity = person1.getCity();
		String EXPECTEDstreet = person1.getStreet();
		int EXPECTEDzip = person1.getPostalCode();
		
		assertEquals("Mingkun", EXPECTEDfirst);
		assertEquals("a", EXPECTEDmiddle);
		assertEquals("Chen", EXPECTEDlast);
	}
	/*
	@Test
	public void personAddTester(){
		PersonDomainModel person;		
		person = PersonDAL.getPerson(person1.getPersonID());	
		PersonDAL.addPerson(person1);
		}
	
	@Test
	public void personUpdateTester()
	{}
	@Test
	public void personDeleteTester()
	{}*/
}