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
public class DadosDaTemperaturaDasCidades {
    
    private int Brasilia = 0;
    private int CampoGrande = 0;
    private int Cuiaba = 0;
    private int Goiania = 0;
    
    
    public DadosDaTemperaturaDasCidades(int Brasilia, int CampoGrande,  int Cuiaba, int Goiania) {
        this.Brasilia = Brasilia;
        this.CampoGrande = CampoGrande;
        this.Cuiaba = Cuiaba;
        this.Goiania = Goiania; 
    }

    public int getBrasilia() {
        return Brasilia;
    }

    public int getCampoGrande() {
        return CampoGrande;
    }

    public int getCuiaba() {
        return Cuiaba;
    }

    public int getGoiania() {
        return Goiania;
    }
    
}
