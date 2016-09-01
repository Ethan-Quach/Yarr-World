package edu.orangecoastcollege.cs273.yarrworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Defining the button as an instance variable
    Button speakButton;
    // Note that speakButton, prior to being coded in onCreate, is not linked to the one in the View.

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Restoring user settings from a previous session
        super.onCreate(savedInstanceState);
        // Inflating (opening) the layout known as activity_main (activity_main.xml)
        setContentView(R.layout.activity_main);

        // Linking the speakButton in MainActivity to the View.
        speakButton = (Button) findViewById(R.id.speakButton);
        /* Debriefing this: This statement casts the speakButton in here to the speakButton in the View.
         * findViewById finds a View in activity_main.xml by its id. However, id is an int, so it's not
         * as easy as typing "speakButton". Rather, you need to use R, which stands for resources,
         * followed by a . and "id", then another . and the name of the View (in the id field).
         *
         * You also need to cast the View by what kind of View/widget it is.
         */
    }
}
