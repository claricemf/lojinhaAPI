package dataFactory;

import pojo.UsuarioPojo;

public class UsuarioDataFactory {
    public static UsuarioPojo criarUsuarioAdministrador(){
        UsuarioPojo usuario = new UsuarioPojo();
        usuario.setUsuarioLogin("admin");
        usuario.setUsuarioSenha("admin");
        return usuario;
    }

    public static UsuarioPojo criarUsuarioJaExistente(){
        UsuarioPojo usuario = new UsuarioPojo();
        usuario.setUsuarioNome("Novo Usuario");
        usuario.setUsuarioLogin("user");
        usuario.setUsuarioSenha("user");
        return usuario;
    }
}
