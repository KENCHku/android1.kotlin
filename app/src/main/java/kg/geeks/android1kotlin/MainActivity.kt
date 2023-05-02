package kg.geeks.android1kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import kg.geeks.android1kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //INSTANT
    val name = "Kench"
    val myName: String = "Kench"
    var year = 2023 //Int

    //LATER - write data type
    lateinit var age: Integer
    private lateinit var liName: String

    //NULL
    var date: Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(parent))
        setContentView(binding.root)

        navigateFragments()
    }

    private fun navigateFragments() {
        val fragment = FillFragment()
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container_view_main, fragment)
            .commit()
    }
}