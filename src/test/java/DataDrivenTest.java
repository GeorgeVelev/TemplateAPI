import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pojo.DataDrivenPojo;
import utility.CustomFileReader;

public class DataDrivenTest {
    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethodWithPredefinedData() {
        return new Object[][]{{"data one"}, {"data two"}};
    }

    @DataProvider(name = "data-provider-from-file")
    public Object[] dataProviderMethodFromFile() {
        return new CustomFileReader().readJsonFile("src/test/resources/testdata/ExampleTestData.json", DataDrivenPojo[].class);
    }

    @Test(dataProvider = "data-provider")
    public void testMethod(String data) {
        System.out.println("Data is: " + data);
    }

    @Test(dataProvider = "data-provider-from-file")
    public void testMethodFromFile(DataDrivenPojo data) {
        System.out.println("Data is: " + data.getTitle());
    }
}
