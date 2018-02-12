package com.debug.prueba.aplicacion.juanpedrog.laboratorio12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    int num;
    String[][] datos=new String[30][5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista=(ListView) findViewById(R.id.lista);
    }
    public void calcular(View v){
        num=Integer.parseInt(((TextView)findViewById(R.id.txtNum)).getText().toString());
        for(int i=0;i<30;i++){
            datos[i][0]=i+1+"";
            datos[i][1]="X";
            datos[i][2]=num+"";
            datos[i][3]="=";
            datos[i][4]=(i+1)*num+"";
        }
        lista.setAdapter(new Adaptador(datos,this));
    }
}
