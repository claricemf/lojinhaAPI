package modulos.componente;

import io.restassured.http.ContentType;
import modulos.BaseAPI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static dataFactory.ComponenteDataFactory.criarComponenteComum;
import static dataFactory.ProdutoDataFactory.criarProdutoComumComValorIgualA;
import static dataFactory.UsuarioDataFactory.criarUsuarioAdministrador;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ComponenteTest extends BaseAPI {
    private String token;

    @BeforeEach
    public void beforeEach(){
        this.token = given()
            .contentType(ContentType.JSON)
            .body(criarUsuarioAdministrador())
        .when()
            .post("/v2/login")
        .then()
            .extract()
            .path("data.token");
    }

    @Test
    @DisplayName("Validar criar componente com idProduto inexistente não é permitido.")
    public void testValidarCriarComponenteComIdProdutoInexistenteNaoPermitido(){
        given()
            .contentType(ContentType.JSON)
            .header("token", token)
            .body(criarComponenteComum())
        .when()
            .post("/v2/produtos/10/componentes")
        .then()
            .assertThat()
            .statusCode(404);
    }
}
