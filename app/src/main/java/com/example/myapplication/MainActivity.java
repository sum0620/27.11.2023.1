package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText number;
    Button button;
    private final String TAG="Etiket";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        number=findViewById(R.id.editTextNumber);
        Log.d(TAG,"debug (hata ayıklama");
    }
    public void kontrolEt(View view){
       
        try {
            int sayi=Integer.parseInt(number.getText().toString());
            Log.i(TAG,"Yazı sayıya çevrilemedi");
            
        } catch (Exception e) {
            Log.e(TAG,"Çevirim Hatası");
        }
        finally {
            int sayi=Integer.parseInt(number.getText().toString());
            if(sayi>100){
                Toast.makeText(this,"100'den büyük not olamaz.",Toast.LENGTH_LONG).show();
            }
            Log.i(TAG,"not:"+sayi);
            
        }
        
        
    }
}