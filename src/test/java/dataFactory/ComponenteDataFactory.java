package dataFactory;

import pojo.ComponentePojo;

public class ComponenteDataFactory {
    public static ComponentePojo criarComponenteComum(){
        ComponentePojo componente = new ComponentePojo();
        componente.setComponenteNome("Controle Remoto");
        componente.setComponenteQuantidade(2);
        return componente;
    }
}
