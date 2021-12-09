/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerTemperatura;

/**
 *
 * @author M
 */
public class TemperaturaDeCampoGrande implements Observador  {

    private DadosDaTemperaturaDasCidades dados;
    private Sujeito Temperatura;

    public TemperaturaDeCampoGrande(Sujeito Temperatura) {
        this.Temperatura = Temperatura;
        this.Temperatura.incluirObservador(this);
    }

    @Override
    public void atualizar(DadosDaTemperaturaDasCidades dados) {
        this.dados = dados;
        mostrarElementos();
    }

    public void mostrarElementos() {
        System.out.println();
        System.out.println("**********************************************");
        System.out.println("*********** CIDADE DE CAMPO GRANDE ************");
        System.out.println("**********************************************");
        System.out.println("CAMPO GRANDE: " + dados.getCampoGrande() + "°C");
        System.out.println("**********************************************");
        System.out.println("************* CAPITAIS AO REDOR **************");
        System.out.println("**********************************************");
        System.out.println("BRASILIA: " + dados.getBrasilia() + "°C");
        System.out.println("CUIABA: " + dados.getCuiaba() + "°C");
        System.out.println("GOIANIA: " + dados.getGoiania() + "°C");
        System.out.println("**********************************************");
    }
    
}
