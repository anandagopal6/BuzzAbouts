package edu.gatech.anandagopal.buzzabouts;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;
import android.database.Cursor;

public class DBHandler extends SQLiteOpenHelper {

    //information of database
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "markerDB.db";
    private static final String TABLE_NAME_ = "Markers";
    private static final String COLUMN_LAT = "Latitude";
    private static final String COLUMN_LNG = "Longitude";
    private static final String COLUMN_LOC = "Location Name";
    private static final String COLUMN_TIME = "Time";

    //initialize database
    public DBHandler (Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {}
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {}
    public String loadHandler() {return null;}
    public void addHandler(Markers marker) {}
    public Markers findHandler(int time) {return null;}
    public boolean deleteHandler(int time) { return false; }
    public boolean updateHandler(int time) { return false; }

}
