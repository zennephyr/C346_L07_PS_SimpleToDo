package sg.edu.rp.c346.id21015762.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etTask;
    Button btnAdd;
    Button btnClear;
    ListView lvTask;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etTask = findViewById(R.id.textView);
        btnAdd = findViewById(R.id.button);
        btnClear= findViewById(R.id.button2);
        lvTask = findViewById(R.id.listView);

        ArrayList<String> alTasks;
        alTasks = new ArrayList<String>();

        ArrayAdapter aaTask = new ArrayAdapter(this,android.R.layout.simple_list_item_1,alTasks);

        lvTask.setAdapter(aaTask);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                if(etTask!=null){
                    alTasks.add(etTask.getText().toString());
                    etTask.getText().clear(); //remove aft input
                    aaTask.notifyDataSetChanged();
                }

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                if(etTask!=null){
                    alTasks.clear();
                    aaTask.notifyDataSetChanged();
                }

            }
        });
    }
}