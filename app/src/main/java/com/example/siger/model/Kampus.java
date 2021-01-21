
package com.example.siger.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Kampus {

    @SerializedName("negri")
    @Expose
    private List<Negri> negri = null;
    @SerializedName("swasta")
    @Expose
    private List<Swasta> swasta = null;
    @SerializedName("Politeknik")
    @Expose
    private List<Politeknik> politeknik = null;

    public List<Negri> getNegri() {
        return negri;
    }

    public void setNegri(List<Negri> negri) {
        this.negri = negri;
    }

    public List<Swasta> getSwasta() {
        return swasta;
    }

    public void setSwasta(List<Swasta> swasta) {
        this.swasta = swasta;
    }

    public List<Politeknik> getPoliteknik() {
        return politeknik;
    }

    public void setPoliteknik(List<Politeknik> politeknik) {
        this.politeknik = politeknik;
    }

}
