package com.example.trabajopractico1_ep;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class UsbConnected extends BroadcastReceiver {
    private int bandera=0;
    @Override
    public void onReceive(Context context, Intent intent) {
        boolean res =intent.getExtras().getBoolean("connected");

        if(res && bandera == 0)
        {
            Toast.makeText(context, "Conectado", Toast.LENGTH_LONG).show();
            bandera=1;
            Intent i= new Intent(context, LlamadaActivity.class);
            context.startActivity(i);
        }
        else{
            bandera=0;
            Toast.makeText(context, "Desconectado",Toast.LENGTH_LONG).show();
        }
    }
}
