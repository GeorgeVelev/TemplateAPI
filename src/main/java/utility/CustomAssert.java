package utility;

import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class CustomAssert extends SoftAssert {
    @Override
    public void assertAll() {
        StringBuffer stringBuilder = new StringBuffer();
        Reporter.getOutput(Reporter.getCurrentTestResult()).forEach(s -> stringBuilder.append(s).append("\n"));
        super.assertAll(stringBuilder.toString());
    }

    public static <T> void areEqual(final T actual, final T expected) {
        CustomAssert customAssert = new CustomAssert();
        customAssert.assertEquals(actual, expected);
        customAssert.assertAll();
    }
}
