package com.exercicio.lucascarbone.meusgames;

import android.app.Application;

import com.activeandroid.ActiveAndroid;
import com.exercicio.lucascarbone.meusgames.dao.GeneroDAO;
import com.facebook.stetho.Stetho;


public class App extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        Stetho.initializeWithDefaults(this);
        ActiveAndroid.initialize(this);


        seedGenero();
    }

    private void seedGenero(){
        GeneroDAO generoDAO = new GeneroDAO();
        if (generoDAO.findAll().size() == 0)
            generoDAO.seed();
    }
}
