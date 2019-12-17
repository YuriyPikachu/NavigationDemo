package cn.yuliang.navigation.demo.kotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import cn.yuliang.navigation.demo.R

/**
 * @author YuLiang
 * update  2019-08-09
 * [Contact me](750749212@qq.com)
 */
class MainPage2Fragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.navigation_flow_step_two_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = Bundle()
        bundle.putString("argument", "MainPage2Fragment 传送来的这个数据~~~")

        view.findViewById<View>(R.id.next_button).setOnClickListener {
            findNavController().navigate(R.id.navigation_page2_next_button, bundle)
        }
    }
}
