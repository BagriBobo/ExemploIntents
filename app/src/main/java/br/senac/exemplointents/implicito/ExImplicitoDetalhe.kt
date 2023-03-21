package br.senac.exemplointents.implicito

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exemplointents.R
import br.senac.exemplointents.databinding.ActivityExExplicitoBinding
import br.senac.exemplointents.databinding.ActivityExImplicitoBinding

class ExImplicitoDetalhe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex_implicito_detalhe)
    }
}