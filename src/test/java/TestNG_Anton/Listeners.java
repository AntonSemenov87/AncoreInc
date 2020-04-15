package TestNG_Anton;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    public void onTestSuccess(ITestResult result) {
        System.out.println("PASS by Listener");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("I'm here because TC failed");
    }


}
