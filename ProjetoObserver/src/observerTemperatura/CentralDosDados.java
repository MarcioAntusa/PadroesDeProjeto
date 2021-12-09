/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerTemperatura;

import java.util.*;

/**
 *
 * @author M
 */
public class CentralDosDados implements Sujeito {

    private ArrayList observers;
    private DadosDaTemperaturaDasCidades dados;

    public CentralDosDados() {
        observers = new ArrayList();
    }

    @Override
    public void incluirObservador(observerTemperatura.Observador o) {
        observers.add(o);
    }

    @Override
    public void removerObservador(observerTemperatura.Observador o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notificarObservador() {
        for (int i = 0; i < observers.size(); i++) {
            Observador observer = (Observador) observers.get(i);
            observer.atualizar(dados);
        }
    }

    public void setDados(DadosDaTemperaturaDasCidades dados) {
        this.dados = dados;
        notificarObservador();
    }

}
