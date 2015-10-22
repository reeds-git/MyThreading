package cool.reed.cs246.mytreading;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.io.File;


public class MainPage extends AppCompatActivity {

    String filename = "numbers.txt";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }

    public void writeFile(String filename) {
        File file = new File(getFilesDir(), filename);

    }

    public void clickCreate(View view) {
        System.out.println("I was created!!!!!!!");

    }

    public void clickLoad(View view) {
        System.out.println("I was loaded!!!!!!!");

    }

    public void clickClear(View view) {
        System.out.println("I was cleared!!!!!!!");

    }

}
