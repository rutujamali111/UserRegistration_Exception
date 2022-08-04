package exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exceptions.ValidException;

public class ValidationMethods 
{
	public void isValidFirstName(String finame) throws ValidException
	{
		String fname = "^[A-Z][A-Za-z]{2,}"; 
        Pattern fnme = Pattern.compile(fname);
        
        Matcher m1 = fnme.matcher(finame);
        boolean result=m1.matches();
              	
        if(result==false)
        	throw new ValidException("Please enter in valid format");        
         
	}
	
	public void isValidLastName(String liname) throws ValidException {
		String lname = "^[A-Z][A-Za-z]{2,}"; 
        Pattern lnme = Pattern.compile(lname); 
        
        Matcher m2 = lnme.matcher(liname);
        boolean result=m2.matches();
        if(result==false)
        	throw new ValidException("Please enter in valid format");        
         
        
	}
	
	public void isValidMail(String mail) throws ValidException {
		String email = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$"; 
        Pattern emil = Pattern.compile(email); 
        
        Matcher m3 = emil.matcher(mail);
        boolean result=m3.matches();
        if(result==false)
        	throw new ValidException("Please enter in valid format");        
         
	}
	
	public void isValidNo(String no) throws ValidException {
		String mobile ="^[0-9]{2}\\s{1}[0-9]{10}$"; 
        Pattern mob = Pattern.compile(mobile); 
         
        Matcher m4 = mob.matcher(no);
        boolean result=m4.matches();
        if(result==false)
        	throw new ValidException("Please enter in valid format");        
         
	}
	public void isValidPwd(String pass) throws ValidException {
		//rule 1
		//String password = "( *?[0-9a-zA-Z] *?){8,}";
		//rule 2
		//String password = "^(?=.*[A-Z])[0-9a-zA-Z]{8,}$";
		//rule 3
		//String password = "^(?=.*[A-Z])(?=.*[0-9])[0-9a-zA-Z]{8,}$";
		//rule 4
		String password = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[#?!@$%^&*-])[0-9a-zA-Z#?!@$%^&*-]{8,}$";
        Pattern pwd = Pattern.compile(password); 
        
        Matcher m5 = pwd.matcher(pass);
        boolean result=m5.matches();
        if(result==false)
        	throw new ValidException("Please enter in valid format");        
         
	}

}
