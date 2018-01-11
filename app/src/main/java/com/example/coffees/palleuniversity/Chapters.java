package com.example.coffees.palleuniversity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Chapters extends AppCompatActivity {

    class MyApdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return al.size();
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Chapter cc = al.get(position);
            String cNo = cc.getcNo();
            String cName = cc.getcName();
            String cDuration = cc.getcDuration();
            final String youtTubeId = cc.getYouTubeId();
            View v = getLayoutInflater().inflate(R.layout.row,null);
            TextView tv1 = (TextView) v.findViewById(R.id.tv1);
            TextView tv2 = (TextView) v.findViewById(R.id.tv2);
            TextView tv3 = (TextView) v.findViewById(R.id.tv3);
            Button b = (Button) v.findViewById(R.id.button1);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent in = new Intent(Chapters.this,Video.class);
                    in.putExtra("youTubeId",youtTubeId);
                    startActivity(in);
                }
            });
            tv1.setText(cNo);
            tv2.setText(cName);
            tv3.setText("duration: "+cDuration);
            return v;

        }
    }
    MyApdapter m;
    ArrayList<Chapter> al ;
    int linearId = 0;
    ListView lv;
    private String[] arr1 = {"C# program compilation/ltgDdukzQ7I/18:47",
            "C# data types/L_gFuuSp4V0/17:53",
            "C# class/l1C4FZGCab0/10:48",
            "C# class as virtual entity/HSdIq3k51bg/9:15",
            "Objects in c#/SM_QqUdMXY0/22:14",
            "Debugging in visual studio/8hXH5HxQfFU/10:41",
            "C# Arrays/CLnA6OAlNPk/24:50",
            "Declaring and Modifying data in c# arrays/O2QI3YFupxM/9:06",
            "Arrays Assignment/Zt85ireWQWw/7:49",
            "Loops/u_k75WcEpHM/5:51"};
    private String[] arr2 = {"C# program compilation/ltgDdukzQ7I/18:47",
            "Debugging in visual studio/8hXH5HxQfFU/10:41",
            "Inheritence/TOBLe0qoA_o/9:24",
            "Inheritence Part 2/T7G8NFXDXFE/24:07",
            "base keyword/WaAbIMz2dqg/22:08",
            "Overriding Intro/w6ldKhR4YUs/23:31",
            "overriding an override method/fdPslUmRqm0/12:52",
            "Static Variables/zvk_hS4vEOw/9:27",
            "what is the use of properties in c#/UdiU6sp68Tc/16:16",
            "c# properties/5nHmt5Zi7l8/15:03"};
    private String[] arr3 = {"SQLServer Overview/Kdc84lpF4GM/16:25",
            "Normalization/7Dc7_I48ZTg/14:30",
            "Orderby clause/quuwLXzZl3g/6:59",
            "Delete drop and truncate statements/yZNyUzSMsT8/6:58",
            "Aggregate Functions/2IYykxAXaB8/13:54",
            "Group by clause/qx0j5iWajqg/20:22",
            "Joins and Inner Join with simple explanation/i0vwTFFHTU8/33:02",
            "stored procedure/jmZsXlAYe7Y/17:11",
            "User defined functions in sql/8cJFtDESxiQ/9:01",
            "Indexes/hrVpqW_Bh2o/21:09"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapters);
        lv = (ListView) findViewById(R.id.listView1);
        al = new ArrayList<Chapter>();
        Intent in = getIntent();
        Bundle b = in.getExtras();
        linearId = b.getInt("linearId");
        m = new MyApdapter();
        lv.setAdapter(m);
        fillArrayIntoArraylist();
        m.notifyDataSetChanged();
    }

    public void fillArrayIntoArraylist() {
        String[] arr = null;
        switch(linearId){
            case 1: arr = arr1;
                break;
            case 2: arr = arr2;
                break;
            case 3: arr = arr3;
                break;
        }
        int x = 1;
        for(String item: arr){

            int pos1 = item.indexOf('/');
            int pos2 = item.indexOf('/',pos1+1);
            String chapterName = item.substring(0,pos1);
            String youTubeId = item.substring(pos1+1,pos2);
            String duration = item.substring(pos2+1);
            Chapter ch = new Chapter(""+(x++),duration,chapterName,youTubeId);

            al.add(ch);
        }
    }
}
