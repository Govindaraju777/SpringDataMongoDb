/**
 * 
 */
package com.itbrothers_test.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.itbrothers.MongoDbApplication;
import com.itbrothers.domain.Employee;
import com.itbrothers.repository.EmployeeRepo;

/**
 * @author govindaraju.v
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MongoDbApplication.class)
//@Import(Mongooze.class)
public class TestEmployeeRepo {

	@Autowired
	EmployeeRepo empRepo;
	
	public void testInsert(){
	}
	
	 @Test
	    public void testInsertEmployee() {
			Employee emp1 = new Employee();
			emp1.setName("Govind");
			emp1.setDepId(1000);
			empRepo.save(emp1);
			Assert.assertNotNull("failure - expected not null", emp1.getId());
	    }
}
