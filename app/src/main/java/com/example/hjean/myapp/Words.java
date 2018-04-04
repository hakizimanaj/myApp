package com.example.hjean.myapp;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;

@Entity(primaryKeys = {"word", "antonym"})
public class Words {

    private String word;

    private String antonym;

    public void setWord(String word){
        this.word=word;
    }

    public void setAntonym(String antonym){
        this.antonym=antonym;
    }

    public String getWord(){
        return word;
    }

    public String getAntonym(){
        return antonym;
    }

    public String toString(){
        return "The" + word + "Antonym is" + antonym;
    }


}
