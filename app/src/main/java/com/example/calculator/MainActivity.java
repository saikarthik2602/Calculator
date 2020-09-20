package com.example.calculator;
import android.os.Build;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {


    public double Convert(String s)
    {
        double ans;
        Log.e("Entered the function 28",s);
        if(s.charAt(0)=='+'||s.charAt(0)=='-'||s.charAt(0)=='*'||s.charAt(0)=='/')
        {
            String p1 = s.substring(1,s.length());
            ans = Double.parseDouble(p1);
        }
        else
        {
            ans = Double.parseDouble(s);
        }
        return ans;
    }

    double fans = 0.0;
    char p = ' ';

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btn_0 = (Button) findViewById(R.id.b0);
        Button btn_1 = (Button) findViewById(R.id.b1);
        Button btn_2 = (Button) findViewById(R.id.b2);
        Button btn_3 = (Button) findViewById(R.id.b3);
        Button btn_4 = (Button) findViewById(R.id.b4);
        Button btn_5 = (Button) findViewById(R.id.b5);
        Button btn_6 = (Button) findViewById(R.id.b6);
        Button btn_7 = (Button) findViewById(R.id.b7);
        Button btn_8 = (Button) findViewById(R.id.b8);
        Button btn_9 = (Button) findViewById(R.id.b9);

        Button btn_eql = (Button) findViewById(R.id.bequal);
        Button btn_div = (Button) findViewById(R.id.bdivision);
        Button btn_mul = (Button) findViewById(R.id.bmultiply);
        Button btn_sub = (Button) findViewById(R.id.bsub);
        Button btn_add = (Button) findViewById(R.id.badd);
        Button btn_clear = (Button) findViewById(R.id.ballclear);
        Button btn_dot = (Button) findViewById(R.id.bdot);
        Button btn_delete = (Button) findViewById(R.id.bdelete);

        final TextView result = (TextView) findViewById(R.id.display1);
        final TextView display = (TextView) findViewById(R.id.display2);

        // double fans = 0.0;
        // char p = ' ';

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String present = display.getText().toString();
                if(present.indexOf('.')!=-1)
                {

                }
                else
                {
                    display.setText(display.getText().toString()+".");
                }

            }
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"4");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"9");
            }
        });

        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String present = display.getText().toString();
                if(present.length()==0)
                {
                    display.setText("");
                }
                else if(present.length()==1)
                {
                    display.setText("");
                }
                else
                {
                    display.setText(present.substring(0,present.length()-1));
                }
            }
        });


        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String pre = display.getText().toString();
                if(pre.length()==0)
                {
                    display.setText("+");
                    p='+';
                }
                else if(pre.length()==1 && (pre=="+" || pre=="-" || pre=="/" || pre=="*"))
                {

                }
                else
                {

                    Log.e("Entered 151",pre);

                    double pre_2 = Convert(pre);

                    Log.e("Entered 151",String.valueOf(pre_2));
                    // double pre_2 = Double.parseDouble(pre);

                    // if(p[0] == ' ')

                    char c2 = ' ';
                    char c1 = p;

                    Log.e("The first character c1 ",String.valueOf(c1)+" "+String.valueOf(c2));
                    // c1.equals(c2);

                    if(c1-c2==0)
                    {
                        Log.e("HERE","Entered the first if");
                        fans = pre_2;
                        result.setText(String.valueOf(fans));
                    }

                    else
                    {
                        if(p -'+' == 0)
                        {
                            fans = fans+pre_2;
                            result.setText(String.valueOf(fans));
                        }
                        else if(p - '-' == 0)
                        {
                            fans = fans-pre_2;
                            result.setText(String.valueOf(fans));
                        }
                        else if(p - '*' == 0)
                        {
                            fans=fans*pre_2;
                            result.setText(String.valueOf(fans));
                        }
                        else if(p - '/' == 0)
                        {
                            fans = fans/pre_2;
                            result.setText(String.valueOf(fans));
                        }
                    }
                    Log.e("Entered end of if ","Correct go"+" "+String.valueOf(fans)+" "+result.getText());

                    display.setText("+");

                    Log.e("Entered 178  ","Correct go 178"+" "+String.valueOf(fans)+" "+display.getText());

                    p = '+';

                    Log.e("Entered 180  ","Correct go 180"+" "+String.valueOf(p));
                }
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pre = display.getText().toString();

                if(pre.length()==0)
                {
                    display.setText("-");
                    p='-';
                }
                else if(pre.length()==1  && (pre=="+" || pre=="-" || pre=="/" || pre=="*"))
                {

                }
                else
                {
                    double pre_2 = Convert(pre);

                    Log.e("Entered 189 ",String.valueOf(pre_2));

                    char c2 = ' ';
                    char c1 = p;

                    if(c1-c2==0)
                    {
                        fans = pre_2;
                        result.setText(String.valueOf(fans));
                    }

                    else
                    {
                        if(p - '+'==0)
                        {
                            fans = fans+pre_2;
                            result.setText(String.valueOf(fans));
                        }
                        else if(p - '-'==0)
                        {
                            fans = fans-pre_2;
                            result.setText(String.valueOf(fans));
                            Log.e("Entered 210 ",String.valueOf(p)+" "+String.valueOf(fans));
                        }
                        else if(p - '*' == 0)
                        {
                            fans = fans*pre_2;
                            result.setText(String.valueOf(fans));
                        }
                        else if(p -'/' == 0)
                        {
                            fans = fans/pre_2;
                            result.setText(String.valueOf(fans));
                        }
                    }
                    display.setText("-");
                    p = '-';
                    Log.e("Entered 225  ","Correct go 225"+" "+String.valueOf(p));
                }
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String pre = display.getText().toString();

                if(pre.length()==0)
                {
                    String l = result.getText().toString();
                    if(l.length()==0)
                    {

                    }
                    else
                    {
                        p='*';
                        display.setText("*");
                    }
                }
                else if(pre.length()==1  && (pre=="+" || pre=="-" || pre=="/" || pre=="*"))
                {

                }
                else
                {
                    double pre_2 = Convert(pre);

                    char c2 = ' ';
                    char c1 = p;

                    if(c1-c2==0)
                    {
                        fans = pre_2;
                        result.setText(String.valueOf(fans));
                    }

                    else
                    {
                        if(p -'+' ==0)
                        {
                            fans = fans+pre_2;
                            result.setText(String.valueOf(fans));
                        }
                        else if(p-'-'==0)
                        {
                            fans = fans-pre_2;
                            result.setText(String.valueOf(fans));
                        }
                        else if(p-'*'==0)
                        {
                            fans = fans*pre_2;
                            result.setText(String.valueOf(fans));
                        }
                        else if(p - '/' ==0)
                        {
                            fans = fans/pre_2;
                            result.setText(String.valueOf(fans));
                        }
                    }
                    display.setText("*");
                    p = '*';
                }
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pre = display.getText().toString();
                if(pre.length()==0)
                {
                    String l = result.getText().toString();
                    if(l.length()==0)
                    {

                    }
                    else
                    {
                        p='/';
                        display.setText("/");
                    }
                }
                else if(pre.length()==1  && (pre=="+" || pre=="-" || pre=="/" || pre=="*"))
                {

                }
                else
                {
                    double pre_2 = Convert(pre);

                    char c2 = ' ';
                    char c1 = p;

                    if(c1-c2==0)
                    {
                        fans = pre_2;
                        result.setText(String.valueOf(fans));
                    }

                    else
                    {
                        if(p  - '+' ==0)
                        {
                            fans = fans+pre_2;
                            result.setText(String.valueOf(fans));
                        }
                        else if(p - '-' == 0)
                        {
                            fans = fans-pre_2;
                            result.setText(String.valueOf(fans));
                        }
                        else if(p - '*'== 0)
                        {
                            fans = fans*pre_2;
                            result.setText(String.valueOf(fans));
                        }
                        else if(p -'/'==0)
                        {
                            fans = fans/pre_2;
                            result.setText(String.valueOf(fans));
                        }
                    }
                    display.setText("/");
                    p = '/';
                }
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("");
                result.setText("");
                fans=0.0;
                p=' ';
            }
        });

        btn_eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pre = display.getText().toString();

                String result1 = result.getText().toString();

                if(pre.length()==0)
                {

                }
                else if(pre.length()==1)
                {
                    if(pre.charAt(0)=='+'||pre.charAt(0)=='-'||pre.charAt(0)=='*'||pre.charAt(0)=='/')
                    {
                        result.setText(String.valueOf(fans));
                        display.setText("");
                        p = ' ';
                    }
                    else
                    {
                        p=' ';
                        result.setText(display.getText().toString());
                    }
                }
                else
                {
                    double pre_2 = Convert(pre);
                    int flag=-1;
                    if(p-'+' == 0)
                    {
                        fans = fans+pre_2;
                        p=' ';
                        flag=1;
                    }
                    else if(p-'-'==0)
                    {
                        fans = fans-pre_2;
                        p=' ';
                        flag=1;
                    }
                    else if(p-'*'==0)
                    {
                        fans = fans*pre_2;
                        p=' ';
                        flag=1;
                    }
                    else if(p-'/'==0)
                    {
                        p=' ';
                        fans = fans/pre_2;
                        flag=1;
                    }
                    if(flag==-1)
                    {
                        result.setText(display.getText().toString());
                        p=' ';
                    }
                    else
                    {
                        result.setText(String.valueOf(fans));
                        display.setText("");
                        p=' ';
                    }
                }
            }
        });
    }
}