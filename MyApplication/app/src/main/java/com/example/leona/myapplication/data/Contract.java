package com.example.leona.myapplication.data;

import android.provider.BaseColumns;

/**
 * Created by leona on 8/4/2017.
 */

public class Contract {
    public static class TABLE_USER implements BaseColumns {

        public static final String TABLE_NAME = "user";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_GENDER = "gender";
        public static final String COLUMN_NAME_HEIGHT= "height";
        public static final String COLUMN_NAME_WEIGHT = "weight";
    }
}
