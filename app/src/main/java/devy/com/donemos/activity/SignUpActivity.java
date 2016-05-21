package devy.com.donemos.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import devy.com.donemos.R;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = SignUpActivity.class.getSimpleName();

    private EditText inputNombres;
    private EditText inputApellidos;
    private EditText inputDNI;
    private EditText inputaCelular;
    private EditText inputDireccion;
    private Button buttonDonar;
    private TextView textViewLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        inputNombres = (EditText) findViewById(R.id.input_nombres);
        inputApellidos = (EditText) findViewById(R.id.input_apellidos);
        inputDNI = (EditText) findViewById(R.id.input_dni);
        inputaCelular = (EditText) findViewById(R.id.input_celular);
        inputDireccion = (EditText) findViewById(R.id.input_direccion);
        buttonDonar = (Button) findViewById(R.id.btn_signup);
        textViewLogin = (TextView) findViewById(R.id.link_login);


        buttonDonar.setOnClickListener(this);
        textViewLogin.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_signup:
                registrar();
                break;
            case R.id.link_login:
                //finish();
                //startActivity(new Intent(this, Login.class));
                break;
        }
    }

    public void registrar(){

        String nombres = inputNombres.getText().toString();
        String apellidos = inputApellidos.getText().toString();
        String direccion  = inputDireccion.getText().toString();
        String dni = inputDNI.getText().toString();
        String celular = inputaCelular.getText().toString();

        //SAVE TO SHARED PREFERENCES.

        Log.d(TAG,"NOMBRES : " + nombres);
        Log.d(TAG,"APELLIDOS : " + apellidos);
        Log.d(TAG,"DIRECCION : " + direccion);
        Log.d(TAG,"DNI : " + dni);
        Log.d(TAG,"CELULAR : " + celular);

        SharedPreferences pref =
                PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor edit = pref.edit();
        edit.putString("nombres", nombres);
        edit.putString("apellidos", apellidos);
        edit.putString("direccion", direccion);
        edit.putString("dni", dni);
        edit.putString("celular", celular);
        edit.commit();

        //UNCOMMENT
        //startActivity(new Intent(this, DetalleDonacion.class));

    }


}
