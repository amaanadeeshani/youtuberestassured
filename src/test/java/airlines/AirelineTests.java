package airlines;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class AirelineTests {

    @Test
    public void createAirelines(){
        Response response = RestAssured.given().log().all();

        .baseURl("")
    }
}
