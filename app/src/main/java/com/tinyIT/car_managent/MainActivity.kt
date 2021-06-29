package com.tinyIT.car_managent

import android.content.Intent
import android.graphics.PorterDuff
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var texttitle:TextView
    private lateinit var btnContinue:Button
    lateinit var toggle:ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


       var toolbar:androidx.appcompat.widget.Toolbar = findViewById(R.id.barmain)
        setSupportActionBar(toolbar)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24)

        var drawer: DrawerLayout = findViewById(R.id.drawerLayout)
        var navview: NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this, drawer,toolbar,R.string.open, R.string.close)
        drawer.addDrawerListener(toggle)
        toggle.syncState()


        navview.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.service -> {
                    var i:Intent = Intent(this, MainActivity::class.java)
                    startActivity(i)
                }
                R.id.phone -> {
                    var i:Intent = Intent(this, PhoneActivity::class.java)
                    startActivity(i)
                }
                R.id.sign -> {
                    var i:Intent = Intent(this, SignUpActivity::class.java)
                    startActivity(i)
                }
            }
            true
        }
        //setting the custum appbar title
//        texttitle = findViewById(R.id.appBarTitle)
        btnContinue = findViewById(R.id.btncontinue)



    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}