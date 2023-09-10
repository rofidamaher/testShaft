import com.shaft.driver.SHAFT;
import org.testng.annotations.Test;

public class new_pro {
@Test
    public void f(){

    SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();
    driver.browser().navigateToURL("www.google.com");
}
}
