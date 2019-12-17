package cn.yuliang.navigation.demo.java;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import cn.yuliang.navigation.demo.R;

/**
 * @author YuLiang
 * update  2019-08-09
 * <a href="750749212@qq.com">Contact me</a>
 */
public class MainPage2Fragment extends Fragment {
    private String TAG = "MainPage2Fragment";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.navigation_flow_step_two_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final Bundle bundle = new Bundle();
        bundle.putString("argument", "MainPage2Fragment 传送我这个数据~~~");
        Log.d(TAG, "MainPage2Fragment onCreateView" );

        if (getArguments() != null) {
            String arguments = getArguments().getString("argumentForMainPage3");
            String page1Fragment = getArguments().getString("MainPage1Fragment");
            Log.d(TAG, "argumentForMainPage3: " + arguments);
            Log.d(TAG, "MainPage1Fragment: " + page1Fragment);
        }

        view.findViewById(R.id.next_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.navigation_page2_next_button, bundle);
            }
        });

        view.findViewById(R.id.next_button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.navigation_page_next_to_four_button, bundle);
            }
        });
    }
}
