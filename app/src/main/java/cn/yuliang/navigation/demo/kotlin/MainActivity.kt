package cn.yuliang.navigation.demo.kotlin

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import cn.yuliang.navigation.demo.R

/**
 * @author YuLiang
 * update  2019-08-09
 * [Contact me](750749212@qq.com)
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin_navigation_main)
    }

    override fun onSupportNavigateUp(): Boolean {
        //app:defaultNavHost="true" 表示使用默认的导航host,
        // 自动覆盖Activity的back按钮,不用再覆写[AppCompatActivity.onSupportNavigateUp()
        return findNavController(this, R.id.my_nav_host_fragment).navigateUp();
    }
}
