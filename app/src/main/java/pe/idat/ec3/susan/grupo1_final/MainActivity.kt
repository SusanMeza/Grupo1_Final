package pe.idat.ec3.susan.grupo1_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pe.idat.ec3.susan.grupo1_final.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val thread = Thread {
            try {
                Thread.sleep(2000)
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                val intent = Intent(this@MainActivity, LoginActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
                startActivity(intent)
            }
        }
        thread.start()
    }

    override fun onPause() {
        super.onPause()
        finish()
    }
}