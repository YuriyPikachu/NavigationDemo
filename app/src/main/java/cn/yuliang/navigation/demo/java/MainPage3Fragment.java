package cn.yuliang.navigation.demo.java;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.navigation.Navigation;
import cn.yuliang.navigation.demo.R;

/**
 * @author YuLiang
 * update  2019-08-09
 * <a href="750749212@qq.com">Contact me</a>
 */
public class MainPage3Fragment extends Fragment {
    private String TAG = "MainPage3Fragment";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.navigation_flow_step_three_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getArguments() != null) {
            String arguments = getArguments().getString("argument");
            Log.d(TAG, "argument: " + arguments);
        }

        view.findViewById(R.id.next_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Bundle bundle = new Bundle();
                bundle.putString("argumentForMainPage3", "MainPage3Fragment传送我这个数据~~~");

                Navigation.findNavController(v).navigate(R.id.navigation_page3_next_button, bundle);
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
