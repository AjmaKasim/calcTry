package com.ajmakasim.calctry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText one,two;
    Button add,sub,mul,div;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one=(EditText)findViewById(R.id.one);
        two=(EditText)findViewById(R.id.two);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);


    }

    public void calc(View view)
    {
        result=(TextView)findViewById(R.id.result);

        int x=Integer.parseInt(one.getText().toString());
        int y= Integer.parseInt(two.getText().toString());

        if(view.getId()==R.id.add)
        {
           int z=x+y;
            result.setText("Sum is"+ z);

        }
        else

        if(view.getId()==R.id.sub)
        {
           int z=x-y;
            result.setText("Diff is"+ z);

        }
        else

        if(view.getId()==R.id.mul)
        {
            int z=x*y;
            result.setText("Product is"+ z);

        }
        else

        if(view.getId()==R.id.div) {

            if (y != 0) {
                int z = x / y;
                result.setText("Quotient is" + z);
            } else {
                result.setText("Division by zero is not possible");
            }
        }


    }
}
