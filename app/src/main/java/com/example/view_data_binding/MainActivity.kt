package com.example.view_data_binding

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.view_data_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // activity_second.xml

    private lateinit var binding: ActivityMainBinding

    private lateinit var viewModel: MyViewModel

    private var showName: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        binding.myButton.setOnClickListener {
            viewModel.setMyName("Carlos")
            viewModel.setGreeting("Hola a todos!!")
        }
        setContentView(binding.root)
    }
}