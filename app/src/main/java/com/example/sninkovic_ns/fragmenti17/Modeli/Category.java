package com.example.sninkovic_ns.fragmenti17.Modeli;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mika on 2/7/2017.
 */

public class Category {
    private int id;
    private String ime;
    private List<Jela> jela;

    public Category(){
        jela=new ArrayList<>();
    }

    public Category(int id, String ime) {
        this.id = id;
        this.ime = ime;

        jela=new ArrayList<>();


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }


}

