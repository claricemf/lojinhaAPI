package modulos.produto;

import io.restassured.http.ContentType;
import modulos.BaseAPI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static dataFactory.ProdutoDataFactory.criarProdutoComumComValorIgualA;
import static dataFactory.UsuarioDataFactory.criarUsuarioAdministrador;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

@DisplayName("Testes de API Rest do módulo de Produto")
public class ProdutoTest extends BaseAPI {
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
    @DisplayName("Validar que o valor do produto igual a zero não é permitido.")
    public void testValidarValorProdutoIgualZeroNaoPermitido(){
        given()
            .contentType(ContentType.JSON)
            .header("token", token)
            .body(criarProdutoComumComValorIgualA(0.00))
        .when()
            .post("/v2/produtos")
        .then()
            .assertThat()
                .body("error", equalTo("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00"))
                .statusCode(422);
    }

    @Test
    @DisplayName("Validar que o valor do produto maior que sete mil não é permitido.")
    public void testValidarLimiteMaiorSeteMilProibidoValorProduto(){
        given()
            .contentType(ContentType.JSON)
            .header("token", token)
            .body(criarProdutoComumComValorIgualA(7000.01))
        .when()
            .post("/v2/produtos")
        .then()
            .assertThat()
            .body("error", equalTo("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00"))
            .statusCode(422);
    }
}
