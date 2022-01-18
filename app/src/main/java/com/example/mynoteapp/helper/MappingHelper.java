package com.example.mynoteapp.helper;

import android.database.Cursor;

import com.example.mynoteapp.Note;
import com.example.mynoteapp.db.DatabaseContract;

import java.util.ArrayList;

public class MappingHelper {

    public static ArrayList< Note > mapCursorToArray(Cursor noteCursor){
        ArrayList<Note> noteList = new ArrayList<>();
        while (noteCursor.moveToNext()){
            int id = noteCursor.getInt(noteCursor.getColumnIndexOrThrow(DatabaseContract.NoteColumns._ID));
            String title = noteCursor.getString(noteCursor.getColumnIndexOrThrow(DatabaseContract.NoteColumns.TITLE));
            String description =  noteCursor.getString(noteCursor.getColumnIndexOrThrow(DatabaseContract.NoteColumns.DESCRIPTION));
            String date =  noteCursor.getString(noteCursor.getColumnIndexOrThrow(DatabaseContract.NoteColumns.DATE));
        }

        return noteList;
    }
}
