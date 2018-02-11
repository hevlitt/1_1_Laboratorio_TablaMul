package com.example.desk.a11_laboratorio_tablamul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView txtView;
    EditText txtEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button);
        txtView=(TextView)findViewById(R.id.textView2);
        txtEdit=(EditText)findViewById(R.id.editText);

        btn.setOnClickListener(new View.OnClickListener(){
         public void onClick(View view){
            int x=Integer.parseInt(txtEdit.getText().toString());
            int r=0;
            String s="";
            txtView.setText("");
            for(int i=10;i>0;i--){
                r=x*i;
                s=s+x+"X"+i+"="+r+"\n";
            }
            txtView.setText(s);
         }
        });

    }
}
