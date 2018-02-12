package com.debug.prueba.aplicacion.juanpedrog.laboratorio12;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by juanpedrog on 11/02/18.
 */

public class Adaptador extends BaseAdapter {
    private static LayoutInflater inflater;
    Context context;
    String[][] datos=new String[30][5];

    public Adaptador(String[][] dat,Context contexto){
        datos=dat;
        context=contexto;
        inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return datos.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final View vista=inflater.inflate(R.layout.formato,null);
        TextView lblMul=(TextView) vista.findViewById(R.id.lblMult);
        TextView lblX=(TextView) vista.findViewById(R.id.lblX);
        TextView lblNum=(TextView) vista.findViewById(R.id.lblNum);
        TextView lblIgual=(TextView) vista.findViewById(R.id.lblIgual);
        TextView lblRes=(TextView) vista.findViewById(R.id.lblRes);
        lblMul.setText(datos[i][0]);
        lblX.setText(datos[i][1]);
        lblNum.setText(datos[i][2]);
        lblIgual.setText(datos[i][3]);
        lblRes.setText(datos[i][4]);
        return vista;
    }
}
