package com.example.billingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.example.billingapp.databinding.ActivityMainBinding
import com.example.billingapp.fragments.FragmentDashboard
import com.example.billingapp.fragments.FragmentInvoicing

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setFragment(FragmentDashboard())
        binding.bottomNav.setOnItemSelectedListener{
            when(it.itemId){
                R.id.dashboard -> setFragment(FragmentDashboard())
                R.id.invoicing-> setFragment(FragmentInvoicing())
                R.id.shopinfo -> setFragment(FragmentInvoicing())
                else -> false
            }
            return@setOnItemSelectedListener true
        }
    }
    private fun setFragment(fragment: Fragment) {
           val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.main_frame,fragment)
        transaction.disallowAddToBackStack()
        transaction.commit()
    }
}