package com.example.ejemplouicontrol;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView miPrimerTexto;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button miPrimerBoton = (Button) findViewById(R.id.button);
        miPrimerBoton.setText("Ingresar");

        EditText campoMensaje = (EditText) findViewById(R.id.textoEntrada);
        campoMensaje.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                TextView contador = (TextView) findViewById(R.id.textView3);
                String tamanoString = String.valueOf(s.length());
                contador.setText(String.valueOf(s));
                contador.setText(tamanoString);
            }
        });
    }

    public void createTextView2(View v) {
        layout = (LinearLayout) findViewById(R.id.layout);
        miPrimerTexto = new TextView(this);
        miPrimerTexto.setText("bug-1789"); // (2)
        miPrimerTexto.setTextAppearance(androidx.appcompat.R.style.TextAppearance_AppCompat_Headline);
        miPrimerTexto.setTextColor(Color.RED); // (5)
        miPrimerTexto.setTypeface(Typeface.MONOSPACE, Typeface.BOLD); // (6)
        miPrimerTexto.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        layout.addView(miPrimerTexto,0);
    }
}