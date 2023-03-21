package br.senac.exemplointents.extras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exemplointents.R
import br.senac.exemplointents.databinding.ActivityExExtrasBinding

class ExExtras : AppCompatActivity() {
    lateinit var binding: ActivityExExtrasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExExtrasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonIr.setOnClickListener {
            val intent = Intent(this, ExExtrasDetalhe::class.java)

            intent.putExtra("nome", binding.editNome2.text.toString())

            startActivity(intent)
        }
    }
}