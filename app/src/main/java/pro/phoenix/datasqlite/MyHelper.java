package pro.phoenix.datasqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ANNAS on 12/23/2017.
 */

public class MyHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Students.db";
    public static final int VERSION=1;


    public MyHelper(Context context)
    {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(StudentContract.StudentData.SQL_CREATE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        //if different version number call this method
        sqLiteDatabase.execSQL(StudentContract.StudentData.SQL_DELETE);
        onCreate(sqLiteDatabase);
    }
}
