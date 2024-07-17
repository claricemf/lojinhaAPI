package modulos.usuario;

import io.restassured.http.ContentType;
import modulos.BaseAPI;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static dataFactory.ProdutoDataFactory.criarProdutoComumComValorIgualA;
import static dataFactory.UsuarioDataFactory.criarUsuarioJaExistente;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@DisplayName("Testes de API Rest do módulo de Usuário")
public class UsuarioTest extends BaseAPI {
    @Test
    @DisplayName("Validar criar usuário com login já existente não é permitido.")
    public void testValidarCriarUsuarioComLoginJaExistenteNaoPermitido(){
        given()
                .contentType(ContentType.JSON)
                .body(criarUsuarioJaExistente())
        .when()
                .post("/v2/usuarios")
        .then()
            .assertThat()
                .body("error", equalTo("O usuário user já existe."))
                .statusCode(409);
    }
}
