package pro.phoenix.datasqlite;

import android.net.Uri;
import android.provider.BaseColumns;


public final class StudentContract {

    //for every table inner class
    public static final class StudentData implements BaseColumns{
        public static final String TABLE_NAME = "student";
        public static final String NAME = "name";
        public static final String GENDER = "gender";

        public static final int MALE=0;
        public static final int FEMALE=1;

        public static final String SQL_CREATE =
                "create table "+TABLE_NAME + "("+_ID+
                        " INTEGER primary key Autoincrement,"+
                        NAME + " Text, "+GENDER+ " integer);";

        public static final String SQL_DELETE = "Drop table if exists "+ TABLE_NAME +";";
    }
}
