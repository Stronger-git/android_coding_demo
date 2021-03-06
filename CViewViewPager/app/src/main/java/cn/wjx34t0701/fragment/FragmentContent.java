package cn.wjx34t0701.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.wjx34t0701.R;

/**
 * @author WuChangJian
 * @date 2020/4/30 7:55
 * Fragment的有两个版本的包：
 *      1）android.app.Fragment
 *          所加载的Activity类可以继承最简单的Activity
 *      2）android.support.v4.app.Fragment
 *          加载Fragment的Activity必须继承FragmentActivity，否则他不会认为这是一个Fragment
 */
public class FragmentContent extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_content, container, false);
        return view;
    }
}
