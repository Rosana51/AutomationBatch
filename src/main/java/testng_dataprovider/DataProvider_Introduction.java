package testng_dataprovider;
//always import testng 
public class DataProvider_Introduction {
//Few rules when implementing DataProvider
//Rule 1 - @DataProvider will return a 2 Dimensional Object Array
//Rule 2 - You have to add all the entries of the array
//Rule 3 - You have to pass dataProvider = name of the method in the @Test
//Rule 4 - pass the parameters in the method of @Test == col of the 2 - D array
	@DataProvider
	
	public void getData() {
		Object [] [] data = new Object [3] [4];
		
		
	}
}
