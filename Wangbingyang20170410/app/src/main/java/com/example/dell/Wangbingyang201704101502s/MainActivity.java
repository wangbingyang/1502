package com.example.dell.Wangbingyang201704101502s;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import Fragemt.f1;

import static android.R.attr.width;

public class MainActivity extends FragmentActivity implements View.OnClickListener{
    private ViewPager vp;
    private LinearLayout ll;
    private HorizontalScrollView sv;
    private TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    private List<TextView> list=new ArrayList<>();
    private List<TextView> t_list=new ArrayList<>();
    private String str[]={"头条","社会","国内","国际","娱乐"
            ,"军事","体育","时尚","财经","科技"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x.view().inject(this);
        initView();
        vp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                Fragment f=null;
                switch (position){
                    case 0:
                        f=new f1("tt");
                        break;
                    case 1:
                        f=new f1("shehui");
                        break;
                    case 2:
                        f=new f1("gn");
                        break;
                    case 3:
                        f=new f1("gj");
                        break;
                    case 4:
                        f=new f1("yl");
                        break;
                    case 5:
                        f=new f1("js");
                        break;
                    case 6:
                        f=new f1("ty");
                        break;
                    case 7:
                        f=new f1("ss");
                        break;
                    case 8:
                        f=new f1("cj");
                        break;
                    case 9:
                        f=new f1("kj");
                        break;
                }
                return f;
            }

            @Override
            public int getCount() {
                return 10;
            }
        });
        vp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                //判断滑到那页
                getpage(position);

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        //最上面导航
        t_list = new ArrayList<TextView>();
        for(int i=0;i<str.length;i++){

            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(width/3, ViewPager.LayoutParams.WRAP_CONTENT);

            list.get(i).setText(str[i]);

            list.get(i).setOnClickListener(this);
        }
    }

    private void initView() {
        sv= (HorizontalScrollView) findViewById(R.id.sv);
        ll= (LinearLayout) findViewById(R.id.ll);
        vp= (ViewPager) findViewById(R.id.vp);
        t1= (TextView) findViewById(R.id.t1);
        t2= (TextView) findViewById(R.id.t2);
        t3= (TextView) findViewById(R.id.t3);
        t4= (TextView) findViewById(R.id.t4);
        t5= (TextView) findViewById(R.id.t5);
        t6= (TextView) findViewById(R.id.t6);
        t7= (TextView) findViewById(R.id.t7);
        t8= (TextView) findViewById(R.id.t8);
        t9= (TextView) findViewById(R.id.t9);
        t10= (TextView) findViewById(R.id.t10);
        list.add(t1);list.add(t2);list.add(t3);list.add(t4);list.add(t5);
        list.add(t6);list.add(t7);list.add(t8);list.add(t9);list.add(t10);

    }
    private void getpage(int arg0) {

        TextView textView1 = list.get(arg0);
        for (int i = 0; i < list.size(); i++) {
            TextView text=list.get(arg0);

            int l = text.getLeft();

            sv.smoothScrollTo(l, 0);

            TextView t = list.get(i);
            if (!t.equals(textView1)) {

                t.setTextColor(Color.BLACK);
            } else {
                t.setTextColor(Color.RED);
            }
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.t1:
                vp.setCurrentItem(0);
            break;
            case R.id.t2:
                vp.setCurrentItem(1);
                break;
            case R.id.t3:
                vp.setCurrentItem(2);
                break;
            case R.id.t4:
                vp.setCurrentItem(3);
                break;
            case R.id.t5:
                vp.setCurrentItem(4);
                break;
            case R.id.t6:
                vp.setCurrentItem(5);
                break;
            case R.id.t7:
                vp.setCurrentItem(6);
                break;
            case R.id.t8:
                vp.setCurrentItem(7);
                break;
            case R.id.t9:
                vp.setCurrentItem(8);
                break;
            case R.id.t10:
                vp.setCurrentItem(9);
                break;

        }
    }
}

