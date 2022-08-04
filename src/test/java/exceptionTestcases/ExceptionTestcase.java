package exceptionTestcases;

import static org.junit.Assert.*;

import org.junit.Test;


import exceptions.ValidException;
import validations.ValidationMethods;

public class ExceptionTestcase {
	
	@Test
	public void FirstNametest() {
		ValidationMethods vm1=new ValidationMethods();
		try
		{
			
			vm1.isValidFirstName("rutuja");
			fail();
		}catch(ValidException e)
		{
			assertEquals("Please enter in valid format", e.getMessage());
		}
		
		
	}
	@Test
	public void LastNametest() {
		ValidationMethods vm1=new ValidationMethods();
		try
		{
			
			vm1.isValidLastName("mali");
			fail();
		}catch(ValidException e)
		{
			assertEquals("Please enter in valid format", e.getMessage());
		}
		
		
	}
	@Test
	public void Emailtest() {
		ValidationMethods vm1=new ValidationMethods();
		try
		{
			
			vm1.isValidMail("abc");
			fail();
		}catch(ValidException e)
		{
			assertEquals("Please enter in valid format", e.getMessage());
		}
		
		
	}
	@Test
	public void MobileNumtest() {
		ValidationMethods vm1=new ValidationMethods();
		try
		{
			
			vm1.isValidNo("91306545");
			fail();
		}catch(ValidException e)
		{
			assertEquals("Please enter in valid format", e.getMessage());
		}
		
		
	}
	@Test
	public void Passwordtest() {
		ValidationMethods vm1=new ValidationMethods();
		try
		{
			
			vm1.isValidPwd("admin");
			fail();
		}catch(ValidException e)
		{
			assertEquals("Please enter in valid format", e.getMessage());
		}
		
		
	}

}
