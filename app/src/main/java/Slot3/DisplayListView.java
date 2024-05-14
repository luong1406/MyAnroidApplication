package Slot3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.R;

public class DisplayListView extends AppCompatActivity {

    ListView listView;
    TextView tvKQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_display_list_view);
        listView = findViewById(R.id.demo32Lv);
        getDataToListview();

    }

    private void getDataToListview() {
        //1. create data source
        String[] arr = new String[]{
                "lap trinh java 1",
                "Computer science introduction",
                "Mobile programing",
                "Cross-platform with .NET",
                "Javascript introduction"
        };
        //2.Using adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(DisplayListView.this,
                android.R.layout.simple_list_item_1, arr);
        //3. attach adapter to Listview
        listView.setAdapter(adapter);
        tvKQ=findViewById(R.id.demo34TvKQ);
        //get data from intent
        Intent intent1=getIntent();
        //extract data
        int a= Integer.parseInt(intent1.getExtras().getString("hsa"));
        int b=Integer.parseInt(intent1.getExtras().getString("hsb"));
        int c=Integer.parseInt(intent1.getExtras().getString("hsc"));
        //delta=?
        int delta=b*b-4*a*c;
        if(delta<0){
            tvKQ.setText("PTVN");
        }
        else if(delta==0){
            tvKQ.setText("PT co nghiem kep x="+ (-b)/(2*a));
        }
        else {
            float x1= (float) ((-b+Math.sqrt(delta))/(2*a));
            float x2= (float) ((-b-Math.sqrt(delta))/(2*a));
            tvKQ.setText("PT co 2 nghiem x1="+x1+" va x2="+x2);
        }

    }
}