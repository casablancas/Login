package com.example.alex.login;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Alex on 26/05/2015.
 */
public class Lista extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
    }

    //***NOTA:***
    // Invoco el método registrarEventos() en el método onCreateOptionsMenu()
    private void registrarEventos(){

        /// Selecciono la lista en pantalla según su ID.
        ListView lista1 = (ListView) findViewById(R.id.listaPaises);

        // Registro una acción para el evento CLICK, (cuando seleccionamos).
        lista1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                /// Obtengo el valor de la casilla (campo) que se eligió.
                String itemSeleccionado = adapterView.getItemAtPosition(i).toString();
                //String i = adapterView.getSelectedItem(i).toString();

                // Muestro un mensaje cuando se ha escogido un item.
                Toast.makeText(getApplicationContext(), "Haz hecho click en " + itemSeleccionado, Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        registrarEventos();

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
