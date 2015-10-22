package cool.reed.cs246.mytreading;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.File;

public class MainPage extends AppCompatActivity {

    String filename = numbers.txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }

    
    File file = new File(context.getFileDir(), filename);
}
