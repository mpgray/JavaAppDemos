package labJUnit;
import org.junit.runner.*;
import org.junit.runner.notification.Failure;


public class MyTestRunner {
	public static void main(String[] args){
		Result result = JUnitCore.runClasses(MyClassTest.class);

		for (Failure failure : result.getFailures()){
			System.out.println(failure.toString());
		}
		
		
	}
}

