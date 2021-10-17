package br.com.guilhermemesquita.procoserviceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    class Usuario(val email: String, val senha: String);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var credenciais = Usuario("aluno", "impacta");

        var login = findViewById<EditText>(R.id.editTextTextPersonName);
        var senha = findViewById<EditText>(R.id.editTextTextPersonName);
        button.setOnClickListener(View.OnClickListener {
            var usuario = Usuario(email = login.text.toString(), senha = senha.text.toString());
            this.efetuarLogin(usuario = usuario, credenciais = credenciais);


        });


        }
    private fun efetuarLogin(usuario: Usuario, credenciais: Usuario) {
        if (usuario.email.isEmpty() || usuario.senha.isEmpty()) {
            this.exibirMensagemDeErro();
        };

        if (usuario.email == credenciais.email && usuario.senha == credenciais.senha) {
            this.exibirMensagemDeSucesso();
        } else {
            this.exibirMensagemDeErro();
        }

    }

    private fun exibirMensagemDeErro() {
        Toast.makeText(this, "Usuário ou senha incorretos", Toast.LENGTH_LONG).show();
    }

    private fun exibirMensagemDeSucesso() {
        Toast.makeText(this, "Login efetuado com sucesso", Toast.LENGTH_LONG).show();
        var intent = Intent(this, TelaInicialActivity::class.java)

        startActivity(intent)

    }


}