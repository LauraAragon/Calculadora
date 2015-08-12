package com.example.lauraaragon.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    Double numero1,numero2,resultado;
    String operador;

    public void onClickIgual(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView2);
        numero2 = Double.parseDouble(tv.getText().toString());

        if(operador.equals("+"))
        {
            resultado= numero1+numero2;
        }
        else if(operador.equals("-"))
        {
            resultado= numero1-numero2;
        }
        else if(operador.equals("x"))
        {
            resultado= numero1*numero2;
        }
        else if(operador.equals("÷"))
        {
            resultado= numero1/numero2;
        }
        tv.setText(resultado.toString());
    }

    public void onClickSuma(View miView)
    {
        operador="+";
        if(onClickOperacionCapturaNumero1(miView)!= 0){
            numero1 = numero1+numero2;
            TextView tv = (TextView) findViewById(R.id.textView2) ;
            tv.setText("");

    }
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickResta(View miView)
    {
        operador="-";
        if(onClickOperacionCapturaNumero1(miView)!= 0){
            numero1 = numero1-numero2;
            TextView tv = (TextView) findViewById(R.id.textView2) ;
            tv.setText("");
        }

        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickMultiplicacion(View miView)
    {
        operador="x";
        if(onClickOperacionCapturaNumero1(miView)!= 0){
            numero1 = numero1*numero2;
            TextView tv = (TextView) findViewById(R.id.textView2) ;
            tv.setText("");
        }
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickDivision(View miView)
    {
        operador="÷";
        if(onClickOperacionCapturaNumero1(miView)!= 0){
            numero1 = numero1/numero2;
            TextView tv = (TextView) findViewById(R.id.textView2) ;
            tv.setText("");
        }
        onClickOperacionCapturaNumero1(miView);
    }

    public double onClickOperacionCapturaNumero1(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView2) ;
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
        return numero1;
    }

    public void onClickLimpia(View miView)
    {
        numero1=0.0;
        numero2=0.0;
        TextView tv = (TextView) findViewById(R.id.textView2) ;
        tv.setText("");
    }

    public void onClickBorrarEntrada(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView2) ;
        tv.setText("");
    }


    public void onClickBtn1(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView2) ;
        tv.setText(tv.getText() + "1");
    }
    public void onClickBtn2(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView2) ;
        tv.setText(tv.getText() + "2");
    }
    public void onClickBtn3(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView2) ;
        tv.setText(tv.getText() + "3");
    }
    public void onClickBtn4(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView2) ;
        tv.setText(tv.getText() + "4");
    }
    public void onClickBtn5(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView2) ;
        tv.setText(tv.getText() + "5");
    }
    public void onClickBtn6(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView2) ;
        tv.setText(tv.getText() + "6");
    }
    public void onClickBtn7(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView2) ;
        tv.setText(tv.getText() + "7");
    }
    public void onClickBtn8(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView2) ;
        tv.setText(tv.getText() + "8");
    }
    public void onClickBtn9(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView2) ;
        tv.setText(tv.getText() + "9");
    }
    public void onClickBtn0(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView2) ;
        tv.setText(tv.getText() + "0");
    }
    public void onClickBtnPunto(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView2) ;
        tv.setText(tv.getText() + ".");
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
