package com.m2sys.demo.data.local.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.m2sys.demo.data.local.db.dao.UrlDao;
import com.m2sys.demo.data.model.Url;

@Database(entities = {Url.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UrlDao urlDao();
}
