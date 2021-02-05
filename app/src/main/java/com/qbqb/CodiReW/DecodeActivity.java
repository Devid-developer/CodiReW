package com.qbqb.CodiReW;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DecodeActivity extends AppCompatActivity {


    ImageButton btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM, btnN, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ;
    Button btnSpace, btnBack, btnCanc;
    TextView txtvPrinc;
    String testo="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrivi);

        txtvPrinc = findViewById(R.id.txtvPrinc);
        txtvPrinc.setText(testo);

        btnBack = (Button)findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DecodeActivity.this, MenuActivity.class));
                finish();
                System.exit(0);
            }
        });


        btnCanc = (Button) findViewById((R.id.btnCanc));
        btnCanc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!testo.isEmpty()) {
                    testo = testo.substring(0, testo.length() - 1);
                    txtvPrinc.setText(testo);
                }
            }
        });

        btnSpace = (Button) findViewById((R.id.btnSpace));
        btnSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += " ";
                txtvPrinc.setText(testo);
            }
        });

        btnA = (ImageButton) findViewById((R.id.btnA));
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "a";
                txtvPrinc.setText(testo);
            }
        });

        btnB = (ImageButton) findViewById((R.id.btnB));
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "b";
                txtvPrinc.setText(testo);
            }
        });

        btnC = (ImageButton) findViewById((R.id.btnC));
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "c";
                txtvPrinc.setText(testo);
            }
        });

        btnD = (ImageButton) findViewById((R.id.btnD));
        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "d";
                txtvPrinc.setText(testo);
            }
        });

        btnE = (ImageButton) findViewById((R.id.btnE));
        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "e";
                txtvPrinc.setText(testo);
            }
        });

        btnF = (ImageButton) findViewById((R.id.btnF));
        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "f";
                txtvPrinc.setText(testo);
            }
        });

        btnG = (ImageButton) findViewById((R.id.btnG));
        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "g";
                txtvPrinc.setText(testo);
            }
        });

        btnH = (ImageButton) findViewById((R.id.btnH));
        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "h";
                txtvPrinc.setText(testo);
            }
        });

        btnI = (ImageButton) findViewById((R.id.btnI));
        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "i";
                txtvPrinc.setText(testo);
            }
        });

        btnJ = (ImageButton) findViewById((R.id.btnJ));
        btnJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "j";
                txtvPrinc.setText(testo);
            }
        });

        btnK = (ImageButton) findViewById((R.id.btnK));
        btnK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "k";
                txtvPrinc.setText(testo);
            }
        });

        btnL = (ImageButton) findViewById((R.id.btnL));
        btnL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "l";
                txtvPrinc.setText(testo);
            }
        });

        btnM = (ImageButton) findViewById((R.id.btnM));
        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "m";
                txtvPrinc.setText(testo);
            }
        });

        btnN = (ImageButton) findViewById((R.id.btnN));
        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "n";
                txtvPrinc.setText(testo);
            }
        });

        btnO = (ImageButton) findViewById((R.id.btnO));
        btnO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "o";
                txtvPrinc.setText(testo);
            }
        });

        btnP = (ImageButton) findViewById((R.id.btnP));
        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "p";
                txtvPrinc.setText(testo);
            }
        });

        btnQ = (ImageButton) findViewById((R.id.btnQ));
        btnQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "q";
                txtvPrinc.setText(testo);
            }
        });

        btnR = (ImageButton) findViewById((R.id.btnR));
        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "r";
                txtvPrinc.setText(testo);
            }
        });

        btnS = (ImageButton) findViewById((R.id.btnS));
        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "s";
                txtvPrinc.setText(testo);
            }
        });

        btnT = (ImageButton) findViewById((R.id.btnT));
        btnT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "t";
                txtvPrinc.setText(testo);
            }
        });

        btnU = (ImageButton) findViewById((R.id.btnU));
        btnU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "u";
                txtvPrinc.setText(testo);
            }
        });

        btnV = (ImageButton) findViewById((R.id.btnV));
        btnV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "v";
                txtvPrinc.setText(testo);
            }
        });

        btnW = (ImageButton) findViewById((R.id.btnW));
        btnW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "w";
                txtvPrinc.setText(testo);
            }
        });

        btnX = (ImageButton) findViewById((R.id.btnX));
        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "x";
                txtvPrinc.setText(testo);
            }
        });

        btnY = (ImageButton) findViewById((R.id.btnY));
        btnY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "y";
                txtvPrinc.setText(testo);
            }
        });

        btnZ = (ImageButton) findViewById((R.id.btnZ));
        btnZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo += "z";
                txtvPrinc.setText(testo);
            }
        });

    }
}