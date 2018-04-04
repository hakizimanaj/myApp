package com.example.hjean.myapp;

import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.Database;
import android.content.Context;

public abstract class myAppDatabase extends RoomDatabase {
    public abstract UserDao model();
    private static myAppDatabase database;

    public static myAppDatabase getFileDatabase(Context context){
        return Room.databaseBuilder(context.getApplicationContext(), myAppDatabase.class, "database-filename").build();
    }
}
