package com.example.leona.myapplication.data;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.leona.myapplication.model.userProfile;

import static com.example.leona.myapplication.data.Contract.TABLE_USER.COLUMN_NAME_GENDER;
import static com.example.leona.myapplication.data.Contract.TABLE_USER.COLUMN_NAME_HEIGHT;
import static com.example.leona.myapplication.data.Contract.TABLE_USER.COLUMN_NAME_NAME;
import static com.example.leona.myapplication.data.Contract.TABLE_USER.COLUMN_NAME_WEIGHT;
import static com.example.leona.myapplication.data.Contract.TABLE_USER.TABLE_NAME;

/**
 * Created by leona on 8/4/2017.
 */

public class userDbUtils {
    public static Cursor getAll(SQLiteDatabase db) {
        Cursor cursor = db.query(
                TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                null
        );
        return cursor;
    }
    // User is equl to userProfile

    public static long InsertToDb(SQLiteDatabase db, userProfile user){
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_NAME_NAME, user.getName());

        cv.put(COLUMN_NAME_GENDER, user.getGender());
        cv.put(COLUMN_NAME_HEIGHT, user.getHeight());
        cv.put(COLUMN_NAME_WEIGHT, user.getWeight());
        return db.insert(TABLE_NAME, null,cv);

    }
}
