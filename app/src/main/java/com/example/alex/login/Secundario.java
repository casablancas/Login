package com.example.alex.login;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Alex on 24/05/2015.
 */
public class Secundario extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Button boton = (Button)findViewById(R.id.botonLista);
        boton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                //Intent nuevoFormulario1 = new Intent(Secundario.this,Lista.class);
                Intent nuevoFormulario1 = new Intent(getApplicationContext(), Lista.class);
                startActivity(nuevoFormulario1);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    //Cuando presionan BACK desde la ventana de bienvenida, los regresa al Log In y pide de nuevo usuario y pass.
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if (keyCode == event.KEYCODE_BACK)
        {
            Intent nuevoFormulario1 = new Intent(Secundario.this,MainActivity.class);
            startActivity(nuevoFormulario1);
        }
        return super.onKeyDown(keyCode, event);
    }


}
