package com.project.smics_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private val firstFragment = FirstFragment();
    private val secondFragment = SecondFragment();
    private val thirdFragment = ThirdFragment();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigation: BottomNavigationView = findViewById(R.id.button_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private val mOnNavigationItemSelectedListener: BottomNavigationView.OnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener {
            input -> when(input.itemId) {
                        R.id.firsFragment -> loadFragment(firstFragment)
                        R.id.secondFragment -> loadFragment(secondFragment)
                        R.id.thirdFragment -> loadFragment(thirdFragment)
                        else -> {false}
                    }
    }

    fun loadFragment(fragment:Fragment): Boolean {
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction();
        transaction.replace(R.id.frameContainer, fragment);
        transaction.commit();
        return true;
    }
}