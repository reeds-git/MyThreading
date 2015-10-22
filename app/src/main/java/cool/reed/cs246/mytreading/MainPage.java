package cool.reed.cs246.mytreading;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class MainPage extends AppCompatActivity {

    public final String FILE_NAME = "numbers.txt";
    ArrayAdapter<Integer> arrayAdapter;

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

                // go to sleep for 250 milliseconds or .25 seconds
                Thread.sleep(250);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
           System.out.println("you will never get here unless you broke it bad");
        }
    }

    public void clickLoad(View view) {

        // create a FileWriter to write from the file
        try (Scanner scanner = new Scanner(new File(getFilesDir(), FILE_NAME))) {

            // create a ArrayList to hold the contents of the file
            ArrayList<Integer> intList = new ArrayList<>();


            // read in the file with a scanner
            while (scanner.hasNextInt()){

                // add each one to the list
                intList.add(scanner.nextInt());

                // go to sleep for 250 milliseconds or .25 seconds
                Thread.sleep(250);
            }

            // attach the arrayList to the arrayAdapter, choose the layout from a list that
            //   android has
            arrayAdapter =
                    new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, intList);

            // get the listView from the xml screen
            ListView loadView = (ListView)findViewById(R.id.listView);

            // set the arrayAdapter to the ListView
            loadView.setAdapter(arrayAdapter);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.out.println("you will never get here unless you broke it bad");
        }

    }

    public void clickClear(View view) {
        arrayAdapter.clear();
        System.out.println("I was cleared!!!!!!!");

    }

}
