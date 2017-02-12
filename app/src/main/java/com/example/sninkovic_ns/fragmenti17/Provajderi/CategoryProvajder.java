package com.example.sninkovic_ns.fragmenti17.Provajderi;

import com.appstructural.jelovnik15.jelovnik_fragmenti.model.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mika on 2/7/2017.
 */

public class CategoryProvajder {
    public static List<Category> getCategories(){

        List<Category>categories= new ArrayList<>();
        categories.add(new Category(0,"Jela sa rostilja"));
        categories.add(new Category(1,"Kuvana jela"));
        categories.add(new Category(2,"Predjela"));
        return categories;
    }

    public static List<String> getCategorynames(){

        List<String>names = new ArrayList<>();
        names.add("Jela sa rostilja");
        names.add("Kuvana jela");
        names.add("Predjela");
        return names;

    }

    public static Category getCategoryById (int id){
        switch (id){
            case 0:
                return new Category(0,"Jela sa rostilja");
            case 1 :
                return new Category(3,"Kuvana jela");
            case 2:
                return new Category(4,"Predjela");
            default:
                return null;
        }
    }
}
