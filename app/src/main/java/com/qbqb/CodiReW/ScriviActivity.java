package com.qbqb.CodiReW;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ScriviActivity  extends AppCompatActivity {


    EditText txtbox;
    TextView txtv;
    int contaImg = 0;
    Button btnBack, btnHide;
    Boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decode);

        txtv = (TextView) findViewById(R.id.textView2);

        btnHide = (Button) findViewById(R.id.btnHide);
        btnHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag){
                    flag = false;
                    txtv.setVisibility(View.INVISIBLE);
                    txtbox.setVisibility(View.INVISIBLE);
                    btnHide.setText("SHOW");
                }
                else{
                    flag = true;
                    txtv.setVisibility(View.VISIBLE);
                    txtbox.setVisibility(View.VISIBLE);
                    btnHide.setText("HIDE");
                }
            }
        });

        btnBack = (Button)findViewById(R.id.btnBack3);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ScriviActivity.this, MenuActivity.class));
                finish();
                System.exit(0);
            }
        });
        txtbox = (EditText) findViewById(R.id.txtbox);
            txtbox.addTextChangedListener(new TextWatcher() {
                public void beforeTextChanged(CharSequence s, int start,
                                              int count, int after) {
                }
                public void onTextChanged(CharSequence s, int start,
                                          int before, int count) {
                }
                public void afterTextChanged(Editable s) {

            String str = txtbox.getText().toString();
            char aux = str.charAt(str.length()-1);
            ImageView corrente;

            switch(aux){
                case 'a':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.mya); break; //aggiungi aux ad un arraylist per poi passarla a ScreenShot
                case 'b':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.myb); break;
                case 'c':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.myc); break;
                case 'd':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.myd); break;
                case 'e':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.mye); break;
                case 'f':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.myf); break;
                case 'g':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.myg); break;
                case 'h':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.myh); break;
                case 'i':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.myi); break;
                case 'j':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.myj); break;
                case 'k':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.myk); break;
                case 'l':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.myl); break;
                case 'm':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.mym); break;
                case 'n':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.myn); break;
                case 'o':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.myo); break;
                case 'p':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.myp); break;
                case 'q':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.myq); break;
                case 'r':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.myr); break;
                case 's':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.mys); break;
                case 't':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.myt); break;
                case 'u':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.myu); break;
                case 'v':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.myv); break;
                case 'w':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.myw); break;
                case 'x':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.myx); break;
                case 'y':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.myy); break;
                case 'z':  corrente = Disegna(contaImg); corrente.setImageResource(R.drawable.myz); break;
                default: contaImg++;
                    avviso();
           }
                    contaImg++;
                }
            });


    }

    public void avviso ()
    {

        Toast.makeText(this, "Character not allowed", Toast.LENGTH_LONG).show(); contaImg--;
    }

    public ImageView Disegna(int num)//non devi passare il carattere ma il nome della foto
    {
        ImageView img = (ImageView) findViewById(R.id.igv1);
        switch(num){
            case 0: img = (ImageView) findViewById(R.id.igv1);
                    break;
            case 1: img = (ImageView) findViewById(R.id.igv2);
                break;
            case 2: img = (ImageView) findViewById(R.id.igv3);
                break;
            case 3: img = (ImageView) findViewById(R.id.igv4);
                break;
            case 4: img = (ImageView) findViewById(R.id.igv5);
                break;
            case 5: img = (ImageView) findViewById(R.id.igv6);
                break;
            case 6: img = (ImageView) findViewById(R.id.igv7);
                break;
            case 7: img = (ImageView) findViewById(R.id.igv8);
                break;
            case 8: img = (ImageView) findViewById(R.id.igv9);
                break;
            case 9: img = (ImageView) findViewById(R.id.igv10);
                break;
            case 10: img = (ImageView) findViewById(R.id.igv11);
                break;
            case 11: img = (ImageView) findViewById(R.id.igv12);
                break;
            case 12: img = (ImageView) findViewById(R.id.igv13);
                break;
            case 13: img = (ImageView) findViewById(R.id.igv14);
                break;
            case 14: img = (ImageView) findViewById(R.id.igv15);
                break;
            case 15: img = (ImageView) findViewById(R.id.igv16);
                break;
            case 16: img = (ImageView) findViewById(R.id.igv17);
                break;
            case 17: img = (ImageView) findViewById(R.id.igv18);
                break;
            case 18:  img = (ImageView) findViewById(R.id.igv19);
                break;
            case 19:  img = (ImageView) findViewById(R.id.igv20);
                break;
            case 20: img = (ImageView) findViewById(R.id.igv21);
                break;
            case 21: img = (ImageView) findViewById(R.id.igv22);
                break;
            case 22: img = (ImageView) findViewById(R.id.igv23);
                break;
            case 23: img = (ImageView) findViewById(R.id.igv24);
                break;
            case 24: img = (ImageView) findViewById(R.id.igv25);
                break;
        }
        img.setVisibility(View.VISIBLE);
        return img;
    }


}
