package cool.reed.cs246.mytreading;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class MainPage extends AppCompatActivity {

    public final String FILE_NAME = "numbers.txt";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }


    public void clickCreate(View view) {


        // create a FileWriter to write from the file
        try (FileWriter fileWriter = new FileWriter(new File(getFilesDir(), FILE_NAME))) {
            // add the numbers 1 - 10 to a file
            for (int i = 1; i <= 10; i++) {
                fileWriter.write(i + System.getProperty("line.separator"));

                Thread.sleep(250);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.out.println("you will never get here unless you broke it bad");
        }

    }

    public void clickLoad(View view) {
        System.out.println("I was loaded!!!!!!!");

    }

    public void clickClear(View view) {
        System.out.println("I was cleared!!!!!!!");

    }

}
