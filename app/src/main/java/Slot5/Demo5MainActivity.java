package Slot5;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class Demo5MainActivity extends AppCompatActivity {

    ListView listView;
    Demo5Adapter adapter;
    List<Demo5Product> list=new ArrayList<>();
    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_demo5_main);
        listView=findViewById(R.id.demo51Listview1);
        //Demo51SqliteHelper helper=new Demo51SqliteHelper(this);
        //SQLiteDatabase db=helper.getReadableDatabase();
        Demo5ProductDAO dao=new Demo5ProductDAO(this);
        //Demo51Product p=new Demo51Product("3","San pham 3",234,1);
        //int kq=dao.insertProduct(p);
        list=dao.getAll();
        adapter=new Demo5Adapter(list,this);
        listView.setAdapter(adapter);
        //int kq=dao.insertProduct(p);

    }
}