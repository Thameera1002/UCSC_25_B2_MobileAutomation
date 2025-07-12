package tests;

import org.testng.annotations.Test;
import pages.PageLogin;
import util.TestNGUtil;

public class TS_LoginTest extends TestNGUtil {

    @Test
    public void loginTest(){
        PageLogin pgLogin = pgHome.clickOnLoginIcon();
        pgLogin.fillUserName("testuser@gmail.com");
        pgLogin.fillPassword("12345678");
        pgLogin.clickOnLoginButton();
    }
}
