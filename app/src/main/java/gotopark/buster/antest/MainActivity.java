package gotopark.buster.antest;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

import java.util.List;
import java.util.Set;

public class MainActivity extends AppCompatActivity {


    TextView text1, text2, text3, text4;
    List <String> databases;
    String DB_NAME;
    MongoClient mongoClient;
    String MongoDB_IP;
    int MongoDB_PORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        text1 = (TextView) findViewById (R.id.textView1);
        text2 = (TextView) findViewById (R.id.textView2);
        text3 = (TextView) findViewById (R.id.textView3);
        text4 = (TextView) findViewById (R.id.textView4);


        MongoDB_IP = "10.10.10.1";
        MongoDB_PORT = 27017;
        DB_NAME = "admin";


        //View Database List

        new Mongo_Con();
        SystemOutput ();

    }


    @SuppressLint("StaticFieldLeak")
    private class Mongo_Con extends AsyncTask<Void, Void, Void> {


        @Override
        protected Void doInBackground(Void... voids) {

            mongoClient = new MongoClient (new ServerAddress (MongoDB_IP, MongoDB_PORT));

            databases = mongoClient.getDatabaseNames ();

            return null;
        }

    }

    private void SystemOutput() {
        int num = 1;
        text1.setText ("===============DB List================");
        for (String dbName : databases) {
            text2.setText (num + ". " + dbName);
            num++;
        }
        DB db = mongoClient.getDB (DB_NAME);
        Set <String> collections = db.getCollectionNames ();

        text3.setText ("Database : " + DB_NAME);
        for (String colName : collections) {
            text4.setText (" + Collection: " + colName);

        }


    }

}
