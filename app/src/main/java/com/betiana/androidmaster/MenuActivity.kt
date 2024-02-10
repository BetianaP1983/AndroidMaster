package com.betiana.androidmaster

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.betiana.androidmaster.Superheroapp.SuperHeroList1Activity
import com.betiana.androidmaster.firstapp.FirstAppActivity
import com.betiana.androidmaster.imccalculator.ImcCalculatorActivity
import com.betiana.androidmaster.settings.SettingsActivity
import com.betiana.androidmaster.todoapp.TodoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)
        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)
        val btnTODO = findViewById<Button>(R.id.btnTODO)
        val btnSuperhero = findViewById<Button>(R.id.btnSuperhero)
        val btnSettings = findViewById<Button>(R.id.btnSettings)

        btnSaludApp.setOnClickListener { navigateToSaludApp() }
        btnIMCApp.setOnClickListener { navigateToImcApp() }
        btnTODO.setOnClickListener { navigateToTodoApp() }
        btnSuperhero.setOnClickListener { navigateToSuperheroApp() }
        btnSettings.setOnClickListener{ navigateToSettings()}

    }

    private fun navigateToSettings() {
        val intent = Intent( this, SettingsActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTodoApp(){
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)

    }

    private fun navigateToImcApp(){
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludApp(){ 
        val intent: Intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSuperheroApp(){
        val intent: Intent = Intent(this, SuperHeroList1Activity::class.java)
        startActivity(intent)
    }
}