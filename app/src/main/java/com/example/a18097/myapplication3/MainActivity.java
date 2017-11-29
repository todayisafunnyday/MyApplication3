package com.example.a18097.myapplication3;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.a18097.myapplication3.WeaponAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private WeaponAdapter mAdapter=null;
    private ListView list_weapon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext=MainActivity.this;

        String[] strName={"轻武器","装甲车辆","军舰","飞行器"};

        /**找到live_weapon控件*/
        list_weapon = (ListView) findViewById(R.id.list_weapon);
        /**给找到的控件配置适配器 */

        /**将数组内容和Main.this添加到新适配器中*/
        mAdapter = new WeaponAdapter(strName,mContext);
           /**将适配器放入setAdapter方法里*/
        list_weapon.setAdapter(mAdapter);
    }
}
