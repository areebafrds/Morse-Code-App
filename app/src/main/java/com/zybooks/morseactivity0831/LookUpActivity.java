package com.zybooks.morseactivity0831;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LookUpActivity extends AppCompatActivity implements View.OnClickListener {
TextView lookupText, a, b, c,d,e,accent,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,
     tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tvpunc2,tvpunc3,tvpunc19,
        tvpunc5,tvpunc6,tvpunc18, tvPick;
int RESULT_OK;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_look_up);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        a = (TextView) findViewById(R.id.tva);
        b = (TextView) findViewById(R.id.tvb);
        c = (TextView) findViewById(R.id.tvc);
        d = (TextView) findViewById(R.id.tvd);
        e = (TextView) findViewById(R.id.tve);
        accent = (TextView) findViewById(R.id.tveaccent);
        g = (TextView) findViewById(R.id.tvg);
        h = (TextView) findViewById(R.id.tvh);
        i = (TextView) findViewById(R.id.tvi);
        j = (TextView) findViewById(R.id.tvj);
        k = (TextView) findViewById(R.id.tvk);
        l = (TextView) findViewById(R.id.tvl);
        m = (TextView) findViewById(R.id.tvm);
        n = (TextView) findViewById(R.id.tvn);
        o = (TextView) findViewById(R.id.tvo);
        p = (TextView) findViewById(R.id.tvp);
        q = (TextView) findViewById(R.id.tvq);
        r = (TextView) findViewById(R.id.tvr);
        s = (TextView) findViewById(R.id.tvs);
        t = (TextView) findViewById(R.id.tvt);
        u = (TextView) findViewById(R.id.tvu);
        v = (TextView) findViewById(R.id.tvv);
        w = (TextView) findViewById(R.id.tvw);
        x = (TextView) findViewById(R.id.tvx);
        y = (TextView) findViewById(R.id.tvy);
        z = (TextView) findViewById(R.id.tvz);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv6 = (TextView) findViewById(R.id.tv6);
        tv7 = (TextView) findViewById(R.id.tv7);
        tv8 = (TextView) findViewById(R.id.tv8);
        tv9 = (TextView) findViewById(R.id.tv9);
        tvpunc2 = (TextView) findViewById(R.id.tvpunc2);
        tvpunc3 = (TextView) findViewById(R.id.tvpunc3);
        tvpunc5 = (TextView) findViewById(R.id.tvpunc5);
        tvpunc6 = (TextView) findViewById(R.id.tvpunc6);
        tvpunc18 = (TextView) findViewById(R.id.tvpunc18);
        tvpunc19 = (TextView) findViewById(R.id.tvpunc19);
        lookupText = (TextView) findViewById(R.id.lookupText);
        tvPick = (TextView) findViewById(R.id.tvPick);

        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        v.setOnClickListener(this);
        w.setOnClickListener(this);
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        z.setOnClickListener(this);
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);
        tv4.setOnClickListener(this);
        tv5.setOnClickListener(this);
        tv6.setOnClickListener(this);
        tv7.setOnClickListener(this);
        tv8.setOnClickListener(this);
        tv9.setOnClickListener(this);
        tvpunc5.setOnClickListener(this);
        tvpunc6.setOnClickListener(this);
        tvpunc2.setOnClickListener(this);
        tvpunc3.setOnClickListener(this);
        tvpunc18.setOnClickListener(this);



    }
        public void morseClick(View view){
            Intent data = new Intent();
            data.putExtra("key1", "value1");
            data.putExtra("key2", "value2");
            data.putExtra("MyData", data);
            setResult(RESULT_OK, data);
            finish();
            Log.i("Morse Code", "symbol pair");


    }

    @Override
    public void onClick(View view) {
        TextView output = (TextView) view;



        Log.v("Morse Code",output.getText().toString() + " was pressed!");


    }
}




