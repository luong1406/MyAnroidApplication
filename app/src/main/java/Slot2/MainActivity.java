package Slot2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {
    EditText txt1,txt2;
    Button btn1,btn2;
    TextView textView;
    @SuppressLint("MissingInflatedId")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        //reference control to memory
        txt1 = findViewById(R.id.slot2txt1);
        txt2 = findViewById(R.id.slot2txt2);
        btn1 = findViewById(R.id.slot2btn);
        textView=findViewById(R.id.slot2tv);
        btn2 = findViewById(R.id.slot2btn2);
        //entent
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sum();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set round from A to B
                Intent i = new Intent(MainActivity.this, Main3Activity.class);
                i.putExtra("a",txt1.getText().toString());
                i.putExtra( "b",txt2.getText().toString());
                //start
                startActivity(i);
            }
        });

    }
    //write a function for sum
    void Sum(){
        //get data of the input
        double a = Double.parseDouble(txt1.getText().toString());
        double b = Double.parseDouble(txt2.getText().toString());
        double c = a+b;
        textView.setText(String.valueOf(c));
    }
}