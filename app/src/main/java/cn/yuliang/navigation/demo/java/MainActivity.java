package cn.yuliang.navigation.demo.java;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import androidx.navigation.Navigation;
import cn.yuliang.navigation.demo.R;

/**
 * @author YuLiang
 * update  2019-08-09
 * <a href="beiming@webuy.ai">Contact me</a>
 */
public class MainActivity extends AppCompatActivity {
    View fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_main);
        fragment = findViewById(R.id.my_nav_host_fragment);
    }

    @Override
    public boolean onSupportNavigateUp() {
        return Navigation.findNavController(fragment).navigateUp();
    }
}
