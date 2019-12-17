package cn.yuliang.navigation.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun gotoJavaDemo(v:View){
        val intent = Intent(this,cn.yuliang.navigation.demo.java.MainActivity::class.java)
        startActivity(intent)
    }

    fun gotoKotlinDemo(v:View){
        val intent = Intent(this,cn.yuliang.navigation.demo.kotlin.MainActivity::class.java)
        startActivity(intent)
    }
}
