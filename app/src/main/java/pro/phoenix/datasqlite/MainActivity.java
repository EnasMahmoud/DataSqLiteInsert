package pro.phoenix.datasqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    /*
     * 0- Design Contract Class.
     * 1- Connect Database , Create Class extends SqliteOpenHelper.
     * 2. obj from myHelper , SQLiteDatabase and ContentValues
     *
     * */

    long rowID;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.resultTV);

        MyHelper myHelper = new MyHelper(this);
        SQLiteDatabase sqlLiteDB = myHelper.getWritableDatabase();

        ContentValues values= new ContentValues();

        values.put(StudentContract.StudentData.NAME , "Ahmed");
        values.put(StudentContract.StudentData.GENDER , StudentContract.StudentData.MALE);
        sqlLiteDB.insert(StudentContract.StudentData.TABLE_NAME , null , values);

        values.put(StudentContract.StudentData.NAME , "Mohamed");
        values.put(StudentContract.StudentData.GENDER , StudentContract.StudentData.MALE);
         sqlLiteDB.insert(StudentContract.StudentData.TABLE_NAME , null , values);

        values.put(StudentContract.StudentData.NAME , "Enas");
        values.put(StudentContract.StudentData.GENDER , StudentContract.StudentData.FEMALE);
         sqlLiteDB.insert(StudentContract.StudentData.TABLE_NAME , null , values);

        values.put(StudentContract.StudentData.NAME , "Esraa");
        values.put(StudentContract.StudentData.GENDER , StudentContract.StudentData.FEMALE);
        rowID = sqlLiteDB.insert(StudentContract.StudentData.TABLE_NAME , null , values);

        result.setText(""+rowID);




    }
}
