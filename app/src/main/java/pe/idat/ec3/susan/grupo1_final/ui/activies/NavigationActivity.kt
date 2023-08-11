package pe.idat.ec3.susan.grupo1_final.ui.activies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import pe.idat.ec3.susan.grupo1_final.R
import pe.idat.ec3.susan.grupo1_final.databinding.ActivityNavigationBinding
import pe.idat.ec3.susan.grupo1_final.ui.fragments.BlankFragment
import pe.idat.ec3.susan.grupo1_final.ui.fragments.HomeFragment
import pe.idat.ec3.susan.grupo1_final.ui.fragments.ProfileFragment

class NavigationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNavigationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> replaceFragment(HomeFragment())
                R.id.profile -> replaceFragment(ProfileFragment())
                R.id.blank -> replaceFragment(BlankFragment())
                else ->{

                }
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }
}