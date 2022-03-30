package com.br.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.br.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var btnEnviar: Button;
    lateinit var eNome: EditText;
    lateinit var ePin : EditText;

    /* Cria variável binding */
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /* Inicializa o binding */
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnEnviar.setOnClickListener() {

            var pessoa = Pessoa(binding.txtNome.text.toString(), binding.txtPIN.text.toString() )
            var relatorio : String = pessoa.codPin + " - " + pessoa.nome + " - " + pessoa.retornarPais()

            Toast.makeText(applicationContext, relatorio, Toast.LENGTH_LONG).show()

            Log.i("A", relatorio)
        }

    }
}