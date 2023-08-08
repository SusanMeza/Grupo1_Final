package pe.idat.ec3.susan.grupo1_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pe.idat.ec3.susan.grupo1_final.databinding.ActivityLoginBinding
import pe.idat.ec3.susan.grupo1_final.databinding.ActivityLoginCorBinding



class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btncorreo.setOnClickListener {
            val intent = Intent(this, LoginCorActivity::class.java)
            startActivity(intent)

        }
    }
}