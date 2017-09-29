package com.exercicio.lucascarbone.meusgames.dao;


import com.activeandroid.query.Select;
import com.exercicio.lucascarbone.meusgames.model.Game;

import java.util.List;

public class GameDAO {
    public List<Game> findAll(){
        return new Select()
                .from(Game.class)
                .orderBy("titulo ASC")
                .execute();
    }
}
