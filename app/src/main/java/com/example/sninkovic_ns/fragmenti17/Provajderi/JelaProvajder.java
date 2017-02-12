package com.example.sninkovic_ns.fragmenti17.Provajderi;

import com.example.sninkovic_ns.fragmenti17.Modeli.Category;
import com.example.sninkovic_ns.fragmenti17.Modeli.Jela;
import com.example.sninkovic_ns.fragmenti17.Modeli.Sastojci;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mika on 2/7/2017.
 */

public class JelaProvajder {

    public static List<Jela> getJela() {


        Category jelaSaRostilja = new Category(0, "Jela sa rostilja");
        Category kuvanaJela = new Category(1, "Kuvana jela");
        Category predjela = new Category(2, "Predjela");


        List<Jela> jela = new ArrayList<>();
        jela.add(new Jela(0, "Cevapi.jpg", "Cevapi", "Peceno meso", 1000, 220, 5.0f, jelaSaRostilja));
        jela.add(new Jela(1, "Belo_meso.jpg", "Belo meso", "Peceno meso", 800, 250, 5.0f, jelaSaRostilja));
        jela.add(new Jela(2, "Pasulj.jpg", "Pasulj", "Glavno jelo", 1100, 200, 4.0f, kuvanaJela));
        jela.add(new Jela(3, "Sarma2.jpg", "Sarma", "Glavno jelo", 1050, 220, 4.0f, kuvanaJela));
        jela.add(new Jela(4, "Gibanica.JPG", "Gibanica", "Pita", 1200, 180, 3.0f, predjela));
        return jela;
    }


    public static List<String> getImenaJela(){
        List<String> names =new ArrayList<>();
        names.add("Cevapi");
        names.add("Belo meso");
        names.add("Pasulj");
        names.add("Sarma");
        names.add("Gibanica");
        return names;


    }

    public static Jela getJelaById(int id){


        Category jelaSaRostilja = new Category(0,"Jela sa rostilja1");
        Category kuvanaJela = new Category(1,"Kuvana jela");
        Category predjela = new Category(2,"Predjela");


        Jela j;
        switch (id){
            case 0:
                j= new Jela(0,"Cevapi.jpg","Cevapi","Peceno meso",1000,220,5.0f,jelaSaRostilja);
                j.getSastojci().add(new Sastojci(0,"Mleveno meso",j));
                j.getSastojci().add(new Sastojci(1,"Zacin",j));
                j.getSastojci().add(new Sastojci(2,"Luk kao prilog",j));
                break;
            case 1:
                j=new Jela(1,"Belo_meso.jpg","Belo meso","Peceno meso",800,250,5.0f,jelaSaRostilja);
                j.getSastojci().add(new Sastojci(0,"Pileci file",j));
                j.getSastojci().add(new Sastojci(1,"Zacin",j));
                j.getSastojci().add(new Sastojci(2,"Pirinac kao  prilog",j));
                break;
            case 2:
                j= new Jela(2,"Pasulj.jpg","Pasulj","Glavno jelo",1100,200,4.0f,kuvanaJela);
                j.getSastojci().add(new Sastojci(0,"Pasulj",j));
                j.getSastojci().add(new Sastojci(1,"Dimljena rebra",j));
                j.getSastojci().add(new Sastojci(2,"Zacin",j));
                break;
            case 3:
                j = new Jela(3,"Sarma2.jpg","Sarma","Glavno jelo",1050,220,4.0f,kuvanaJela);
                j.getSastojci().add(new Sastojci(0,"Mleveno meso",j));
                j.getSastojci().add(new Sastojci(1,"Kupus",j));
                j.getSastojci().add(new Sastojci(2,"Pirinadz",j));
                break;
            case 4:
                j = new Jela(4,"Gibanica.JPG","Gibanica","Pita",1200,180,3.0f,predjela);
                j.getSastojci().add(new Sastojci(0,"Sir",j));
                j.getSastojci().add(new Sastojci(1,"Testo",j));
                j.getSastojci().add(new Sastojci(2,"Jaja",j));
                break;
            default:
                j= null;
        }return j;


    }
}
