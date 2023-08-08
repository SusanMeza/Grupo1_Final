package pe.idat.ec3.susan.grupo1_final

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pe.idat.ec3.susan.grupo1_final.databinding.ActivityLoginCorBinding


class LoginCorActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginCorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginCorBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}