package com.example.sninkovic_ns.fragmenti17.Modeli;

import java.util.ArrayList;

/**
 * Created by Mika on 2/7/2017.
 */

public class Jela {
    private int id;
    private String slika;
    private String naziv;
    private String opis;
    private ArrayList<Sastojci> sastojci;
    private double kalorijskaVrednsot;
    private int cena;
    private float rating;
    private Category category;


    public Jela() {
        sastojci=new ArrayList<>();


    }

    public Jela(int id, String slika, String naziv, String opis, double kalorijskaVrednsot, int cena, float rating, Category category) {
        this.id = id;
        this.slika = slika;
        this.naziv = naziv;
        this.opis = opis;
        this.kalorijskaVrednsot = kalorijskaVrednsot;
        this.cena = cena;
        this.rating = rating;
        this.category = category;
        this.sastojci=new ArrayList<>();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public double getKalorijskaVrednsot() {
        return kalorijskaVrednsot;
    }

    public void setKalorijskaVrednsot(double kalorijskaVrednsot) {
        this.kalorijskaVrednsot = kalorijskaVrednsot;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ArrayList<Sastojci> getSastojci() {
        return sastojci;
    }

    public void setSastojci(ArrayList<Sastojci> sastojci) {
        this.sastojci = sastojci;
    }

    @Override
    public String toString() {
        return "Jela{" +
                "naziv='" + naziv + '\'' +
                '}';
    }
}
