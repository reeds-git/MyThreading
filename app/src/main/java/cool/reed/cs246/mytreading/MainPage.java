package cool.reed.cs246.mytreading;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;



public class MainPage extends AppCompatActivity {

    String filename = "numbers.txt";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }

    

}
