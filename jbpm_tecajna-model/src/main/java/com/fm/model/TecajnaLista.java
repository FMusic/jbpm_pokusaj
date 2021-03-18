package com.fm.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Date;

// https://github.com/FasterXML/jackson-annotations
@JsonIgnoreProperties(ignoreUnknown = true)
public class TecajnaLista {

    private int id;

    @JsonProperty("Broj tečajnice")
    private Integer brojTecajnice; //"Broj tečabbxfc jnice":"1",

    @JsonProperty("Datum primjene")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Constants.DATE_FORMAT)
    private Date datumPrimjene; // "Datum primjene":"02.01.2021",

    @JsonProperty("Država")
    private String drzava; // "Država":"Australija",

    @JsonProperty("Šifra valute")
    private Integer sifraValute; // "Šifra valute":"036",

    @JsonProperty("Valuta")
    private String valuta;     // "Valuta":"AUD",

    @JsonProperty("Jedinica")
    private Integer jedinica;  // "Jedinica":1,

    @JsonProperty("Kupovni za devize")
    @JsonDeserialize(using = FlexibleDoubleDeserializer.class)
    private Double kupovniZaDevize; //  "Kupovni za devize":"4,736459",

    @JsonProperty("Srednji za devize")
    @JsonDeserialize(using = FlexibleDoubleDeserializer.class)
    private Double srednjiZaDevize; //   "Srednji za devize":"4,750711",

    @JsonProperty("Prodajni za devize")
    @JsonDeserialize(using = FlexibleDoubleDeserializer.class)
    private Double prodajniZaDevize; //   "Prodajni za devize":"4,764963"

    private boolean odobren = true;
    private String razlogNeOdobravanja;

    public String getRazlogNeOdobravanja() {
        return razlogNeOdobravanja;
    }

    public void setRazlogNeOdobravanja(String razlogNeOdobravanja) {
        this.razlogNeOdobravanja = razlogNeOdobravanja;
    }

    public boolean isOdobren() {
        return odobren;
    }

    public void setOdobren(boolean odobren) {
        this.odobren = odobren;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getBrojTecajnice() {
        return brojTecajnice;
    }

    public void setBrojTecajnice(Integer brojTecajnice) {
        this.brojTecajnice = brojTecajnice;
    }

    public Date getDatumPrimjene() {
        return datumPrimjene;
    }

    public void setDatumPrimjene(Date datumPrimjene) {
        this.datumPrimjene = datumPrimjene;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public Integer getSifraValute() {
        return sifraValute;
    }

    public void setSifraValute(Integer sifraValute) {
        this.sifraValute = sifraValute;
    }

    public String getValuta() {
        return valuta;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }

    public Integer getJedinica() {
        return jedinica;
    }

    public void setJedinica(Integer jedinica) {
        this.jedinica = jedinica;
    }

    public Double getKupovniZaDevize() {
        return kupovniZaDevize;
    }

    public void setKupovniZaDevize(Double kupovniZaDevize) {
        this.kupovniZaDevize = kupovniZaDevize;
    }

    public Double getSrednjiZaDevize() {
        return srednjiZaDevize;
    }

    public void setSrednjiZaDevize(Double srednjiZaDevize) {
        this.srednjiZaDevize = srednjiZaDevize;
    }

    public Double getProdajniZaDevize() {
        return prodajniZaDevize;
    }

    public void setProdajniZaDevize(Double prodajniZaDevize) {
        this.prodajniZaDevize = prodajniZaDevize;
    }

    @Override
    public String toString() {
        return "TecajnaLista{" +
                "brojTecajnice=" + brojTecajnice +
                ", datumPrimjene=" + datumPrimjene +
                ", drzava='" + drzava + '\'' +
                ", sifraValute=" + sifraValute +
                ", valuta='" + valuta + '\'' +
                ", jedinica=" + jedinica +
                ", kupovniZaDevize=" + kupovniZaDevize +
                ", srednjiZaDevize=" + srednjiZaDevize +
                ", prodajniZaDevize=" + prodajniZaDevize +
                '}';
    }

}