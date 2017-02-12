package com.example.sninkovic_ns.fragmenti17.Modeli;

/**
 * Created by Mika on 2/7/2017.
 */

public class Sastojci {
    private int id;
    private String naziv;
    private Jela jela;


    public Sastojci(){

    }

    public Sastojci(int id, String naziv, Jela jela) {
        this.id = id;
        this.naziv = naziv;
        this.jela = jela;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Jela getJela() {
        return jela;
    }

    public void setJela(Jela jela) {
        this.jela = jela;
    }
}
