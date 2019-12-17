package cn.yuliang.navigation.demo.java;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import androidx.navigation.Navigation;
import cn.yuliang.navigation.demo.R;

/**
 * @author YuLiang
 * update  2019-08-09
 * <a href="750749212@qq.com">Contact me</a>
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_main);
    }


    @Override
    public boolean onSupportNavigateUp() {
        //app:defaultNavHost="true" 表示使用默认的导航host,
        // 自动覆盖Activity的back按钮,不用再覆写[AppCompatActivity.onSupportNavigateUp()
        return Navigation.findNavController(this,R.id.my_nav_host_fragment).navigateUp();
    }
}


