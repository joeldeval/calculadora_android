package com.example.calca;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity implements OnClickListener{
	double num1;
	double num2;
	double res;
	int bandera;
	
private EditText resultado;
private Button btnborrar;
private Button btnlimpiar;
private Button btnlimpiartodo;
private Button btnsumar;
private Button btnrestar;
private Button btnmultiplicar;
private Button btndividir;
private Button btnuno;
private Button btndos;
private Button btntres;
private Button btncuatro;
private Button btncinco;
private Button btnseis;
private Button btnsiete;
private Button btnocho;
private Button btnnueve;
private Button btncero;
private Button btnpunto;
private Button btnigual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    this.resultado = (EditText)findViewById(R.id.resultado);
    this.btnborrar = (Button)findViewById(R.id.btnborrar);
    this.btnlimpiar = (Button)findViewById(R.id.btnlimpiar);
    this.btnlimpiartodo = (Button)findViewById(R.id.btnlimpiartodo);
    this.btnsumar = (Button)findViewById(R.id.btnsumar);
    this.btnrestar = (Button)findViewById(R.id.btnrestar);
    this.btnmultiplicar = (Button)findViewById(R.id.btnmultiplicar);
    this.btndividir = (Button)findViewById(R.id.btndividir);
    this.btnuno = (Button)findViewById(R.id.btnuno);
    this.btndos = (Button)findViewById(R.id.btndos);
    this.btntres = (Button)findViewById(R.id.btntres);
    this.btncuatro = (Button)findViewById(R.id.btncuatro);
    this.btncinco = (Button)findViewById(R.id.btncinco);
    this.btnseis = (Button)findViewById(R.id.btnseis);
    this.btnsiete = (Button)findViewById(R.id.btnsiete);
    this.btnocho = (Button)findViewById(R.id.btnocho);
    this.btnnueve = (Button)findViewById(R.id.btnnueve);
    this.btncero = (Button)findViewById(R.id.btncero);
    this.btnpunto = (Button)findViewById(R.id.btnpunto);
    this.btnigual = (Button)findViewById(R.id.btnigual);
    }
    
 

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

	@Override
	public void onClick(View arg0) {
		if(arg0==btnigual){
			switch(bandera){
			case 1:
				res=num1+num2;
				break;
			case 2:
				res=num1-num2;
				break;
			case 3:
				res=num1*num2;
				break;
			case 4:
				res=num1/num2;
				break;
			}
		}
		
      if(arg0==btnuno || arg0==btndos || arg0==btntres 
                      || arg0==btncuatro || arg0==btncinco || arg0==btnseis
                      || arg0==btnsiete || arg0==btnocho || arg0==btnnueve 
                      || arg0==btnpunto){
    	  Button boton = (Button)arg0;
    	  String caption = boton.getText().toString();
    	  resultado.setText(resultado.getText()+caption);
    	}
		
	}
}
