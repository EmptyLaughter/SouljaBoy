import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayListAddressBookTest {
	 private AddressBook dir;
	 private AddressBook deptDir;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void initialize() throws Exception {
		 dir = new ArrayListAddressBook();
		 deptDir = new ArrayListAddressBook();
		 deptDir.load("deptdir.txt");
	}

	@After
	public void tearDown() throws Exception {
	}

	 @Test (expected=NoSuchElementException.class)
	 public void directoryHasNoSoljaBoy() 
	 {
	     dir.put("Solja Boy", "Phone", "678-999-8212");
	     dir.put("Fred","Email", "freddo@gmail.com");
	     dir.remove("Teresa Boy", "Phone");
	     //assertNull(dir.get("Solja Boy", "Phone"));
	 }
	 
	 @Test
	 public void deptDirContainsHorstmann() 
	 {
	    assertNotNull(deptDir.get("Horstmann", "Phone"));
	 }
}
