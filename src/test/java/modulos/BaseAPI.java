package modulos;

import org.junit.jupiter.api.BeforeAll;
import static config.ConfigurationManager.getConfiguration;
import static io.restassured.RestAssured.*;

public abstract class BaseAPI {
    @BeforeAll
    public static void beforeAllTests(){
        baseURI = getConfiguration().baseURI();
        basePath = getConfiguration().basePath();
    }
}
