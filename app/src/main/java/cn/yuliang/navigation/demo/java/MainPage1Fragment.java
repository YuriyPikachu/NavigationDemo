package cn.yuliang.navigation.demo.java;

import android.os.Bundle;
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
public class MainPage1Fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.navigation_flow_step_one_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.next_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Bundle bundle = new Bundle();
                bundle.putString("MainPage1Fragment", "MainPage1Fragment 传送来的这个数据~~~");
                Navigation.findNavController(v).navigate(R.id.navigation_page1_next_button,bundle);
            }
        });
    }
}
