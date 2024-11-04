package com.example.firstactivity

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()

    Log.d("FirstActivity", "onCreate chamado")
    Toast.makeText(this, "onCreate chamado", Toast.LENGTH_SHORT).show()

    setContentView(R.layout.activity_main)
    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
      val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
      v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
      insets
    }
  };

  override fun onStart() {
    super.onStart()

    // Mensagem de log e Toast para onStart
    Log.d("FirstActivity", "onStart chamado")
    Toast.makeText(this, "onStart chamado", Toast.LENGTH_SHORT).show()
  };

  override fun onResume() {
    super.onResume();

    // Mensagem de log e Toast para onStart
    Log.d("FirstActivity", "onResume chamado")
    Toast.makeText(this, "onResume chamado", Toast.LENGTH_SHORT).show()
  }

  override fun onPause() {
    super.onPause()

    // Mensagem de log e Toast para onStart
    Log.d("FirstActivity", "onPause chamado")
    Toast.makeText(this, "onPause chamado", Toast.LENGTH_SHORT).show()
  }

  override fun onStop() {
    super.onStop()

    // Mensagem de log e Toast para onStart
    Log.d("FirstActivity", "onStop chamado")
    Toast.makeText(this, "onStop chamado", Toast.LENGTH_SHORT).show()
  }

  override fun onDestroy() {
    super.onDestroy()

    // Mensagem de log e Toast para onStart
    Log.d("FirstActivity", "onDestroy chamado")
    Toast.makeText(this, "onDestroy chamado", Toast.LENGTH_SHORT).show()
  }


}
