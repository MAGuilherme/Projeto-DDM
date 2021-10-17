package br.com.guilhermemesquita.procoserviceapp

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Config
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

class TelaInicialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)

        supportActionBar?.title = "ProcoService"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if (id == R.id.action_buscar) {
            Toast.makeText(this, "Botão de Buscar", Toast.LENGTH_SHORT).show()
        }
        else if (id == R.id.action_atualizar){
            Toast.makeText(this, "Botão de Atualizar", Toast.LENGTH_SHORT).show()

        }
        else if (id == R.id.action_config) {
            Toast.makeText(this, "Configuração", Toast.LENGTH_SHORT).show()
            var intent = Intent(this, ConfigInicial::class.java)

            startActivity(intent)

        } else if (id == android.R.id.home)
            finish()

        return super.onOptionsItemSelected(item)
    }

}