package com.example.hjean.myapp;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import static java.nio.charset.CodingErrorAction.IGNORE;

@Dao
public interface UserDao {

    @Query("SELECT * FROM user")
    List<Words> loadAllUsers();

    @Query("SELECT * FROM user WHERE words (:words)")
    List<Words> loadAllByIds(String words);

    @Query("SELECT * FROM user WHERE words=(:antonym)")
    Words findByName(String antonym);

    @Insert
    void insertAll(Words... word);

    @Delete
    void delete(Words word);
}
