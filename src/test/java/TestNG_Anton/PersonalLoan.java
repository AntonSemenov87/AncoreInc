package TestNG_Anton;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PersonalLoan {

    @Parameters ({"username", "password", "personalURL", "mainURL"})
    @Test (dataProvider = "getData")
    public void personalLogin (String username, String password) {
        System.out.println("Personal Login");
        System.out.println(username);
        System.out.println(password);
    }

    @Test (dependsOnMethods = "personalLogin")
    public void personalLogout () {
        System.out.println("Personal Logout");
    }

    @DataProvider
    public Object[][] getData () {
        // 1st combination - username and password -- Good Credit Score --> how is app behaving -- row1
        // 2nd combination - username and password -- no credit history... -- row 2
        // 3rd combination - username and password -- Bad Credit Score... -- row 3

        Object [] [] data = new Object[3][2]; // multidimensional Object array
        // columns in the row are values for that particular combination
        data [0][0] = "firstset_username";
        data [0][1] = "firstset_password";

        data [1][0] = "secondset_username";
        data [1][1] = "secondset_password";

        data [2][0] = "thirdset_username";
        data [2][1] = "thirdset_password";

        return data;

    }


}
