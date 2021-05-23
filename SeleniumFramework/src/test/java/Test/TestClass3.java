package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass3 {

	@DataProvider(name = "testdata")
	public Object[][] dataProvFun() {
		return new Object[][] { { "Nidhi" }, { "mike" }, { "raj" } };		//dataprovider is used to use multiple values without using loops
	}

	@Test(dataProvider="testdata")
	public void test5(String names) {
		System.out.println("test5 executed");
		
		System.out.println(names);
	}

}
