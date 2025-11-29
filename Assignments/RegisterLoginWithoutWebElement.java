package Assignments;

import UtilityClass.RegisterLoginUtility;

public class RegisterLoginWithoutWebElement extends RegisterLoginUtility {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		precondition();
        register();
        System.out.println(RegisterLoginUtility.generatedEmail);
        driver.close();
        
        precondition();
        RegisterLoginUtility.login();
	}
}
