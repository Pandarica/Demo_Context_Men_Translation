package sg.edu.rp.c346.id20022226.democontextmenutranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    TextView tv2;

    String wordClicked = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
        tv2 = findViewById(R.id.tv2);

        registerForContextMenu(tv);
        registerForContextMenu(tv2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0,0,0,"English");
        menu.add(0,1,1,"Italian");

        if (v == tv) {
            wordClicked = "hello";
        } else if (v == tv2) {
            wordClicked = "bye";
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (wordClicked.equalsIgnoreCase("hello")) {
            if(item.getItemId()==0) { //check whether the selected menu item ID is 0
                //code for action
                tv.setText("Hello");

                return true; //menu item successfully handled
            }
            else if(item.getItemId()==1) { //check if the selected menu item ID is 1
                //code for action
                tv.setText("Ciao");

                return true;  //menu item successfully handled
            }
        } else if (wordClicked.equalsIgnoreCase("bye")) {
            if(item.getItemId()==0) { //check whether the selected menu item ID is 0
                //code for action
                tv2.setText("Bye");

                return true; //menu item successfully handled
            }
            else if(item.getItemId()==1) { //check if the selected menu item ID is 1
                //code for action
                tv2.setText("Addio");

                return true;  //menu item successfully handled
            }
        }
        return super.onContextItemSelected(item); //pass menu item to the superclass implementation
    }
}