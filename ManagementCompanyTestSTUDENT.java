

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	Property p1 ,p2,p3,p4,p5,p6;
	ManagementCompany m ;
	@Before
	public void setUp() throws Exception {
		p1 = new Property ("Hargerstown", "Rockville", 4844.00, "Sammy ScarFace",2,1,2,2);
		p2 = new Property ("Lakehouse", "Lake", 4114, "Adam Taylor",4,1,2,2);
		p3 = new Property ("Santiago Bernabeu", "Madrid", 4905, "Cristiano Ronaldo",6,1,2,2);
		
		m= new ManagementCompany("Railey", "555555555",6);
	 
		m.addProperty(p1);
		m.addProperty(p2);
		m.addProperty(p3);
		
	}

	@After
	public void tearDown() {
		//student set mgmt co to null  
		
	p1=p2=p3=p4=p5=p6= null;
	m = null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		//student should add property with 4 args & default plot (0,0,1,1)
		p4 = new Property ("Home", "AdamsTown", 4000.0, "Me");
		//student should add property with 8 args
		p5 = new Property ("Montgomery College", "Rockville", 4905, "MC");
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1	
		p6 = new Property ("Out Of Bounds", "NeverLand", 0.0, "FairyKing");
	}
 
	@Test
	public void testMaxRentProp() {
		//student should test if maxRentProp contains the maximum rent of properties
		assertEquals(m.maxRentProp(),4905,0);
		
	}

	@Test
	public void testTotalRent() {
		//student should test if totalRent returns the total rent of properties
		assertEquals(m.totalRent(),8958.0,0);
	}

 }
