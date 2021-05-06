package sg.edu.rp.c346.id20039529.ca1pratical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView gamesRoom;
    EditText editID;
    ToggleButton NormPri;
    RadioGroup days;
    Button book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editID = findViewById(R.id.editID);
        NormPri = findViewById(R.id.NormPri);
        days = findViewById(R.id.days);
        book = findViewById(R.id.book);
    }
    
}