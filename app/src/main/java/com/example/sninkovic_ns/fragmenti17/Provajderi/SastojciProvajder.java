package com.example.sninkovic_ns.fragmenti17.Provajderi;

import com.example.sninkovic_ns.fragmenti17.Modeli.Jela;
import com.example.sninkovic_ns.fragmenti17.Modeli.Sastojci;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mika on 2/7/2017.
 */

public class SastojciProvajder {

    public static List<String> getSastojakNazivi(Jela jela) {

        List<String> nazivi = new ArrayList<>();
        for (Sastojci sastojak:jela.getSastojci()
                ) { nazivi.add(sastojak.getNaziv());

        }

        return nazivi;
    }
}
