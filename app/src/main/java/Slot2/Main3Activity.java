package Slot2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.R;

public class Main3Activity extends AppCompatActivity {
     TextView tv1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        tv1=findViewById(R.id.textView2);
        //receive data
        Intent i = getIntent();
        //extract data package
        double a = Double.parseDouble(i.getExtras().getString("a"));
        double b = Double.parseDouble(i.getExtras().getString("b"));
        double c = a+b;
        tv1.setText(String.valueOf(c));



    }
}