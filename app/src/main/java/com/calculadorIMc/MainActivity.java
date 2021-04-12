package com.calculadorIMc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.calculadorIMc.R.id.btCalcular;

public class MainActivity extends AppCompatActivity {

    EditText varPeso, varAltura;
    Button btCalcular;
    TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        varPeso= findViewById(R.id.editTextPeso);
        varAltura=findViewById(R.id.editTextAltura);
        btCalcular=findViewById(R.id.btCalcular);
        Resultado= findViewById(R.id.lblResultado);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int valorPeso=Integer.parseInt(varPeso.getText().toString());
                float valorAltura=Float.parseFloat(varAltura.getText().toString());

                float valorResultado= valorPeso/(valorAltura*valorAltura);

                TextView Verdados=(TextView) findViewById(R.id.lblResultado);

                Verdados.setText("O seu IMC equivale a: \n "+ valorResultado);


            }
    });
}
}