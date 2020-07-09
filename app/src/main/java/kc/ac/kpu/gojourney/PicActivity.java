package kc.ac.kpu.gojourney;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class PicActivity extends AppCompatActivity {

    String s1[], s2[];
    int images[]={R.drawable.canada, R.drawable.china, R.drawable.spain, R.drawable.korea, R.drawable.japan};


    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        s1=getResources().getStringArray(R.array.Country);
        s2=getResources().getStringArray(R.array.descriptions);

/*
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
*/
        /*String[] myDataset = {"잉잉"};
*/
        // specify an adapter (see also next example)
        /*mAdapter = new MyAdapter(ct:this, s1, s2, images);
        recyclerView.setAdapter(mAdapter);*/

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}