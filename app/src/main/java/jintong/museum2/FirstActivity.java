package jintong.museum2;



import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.WindowManager;
import android.widget.Toast;

/**
 * 先判断是否是第一次打开
 * 如果是第一次 进入引导页
 * 否则，直接进入主界面
 *
 * Created by wjc on 2017/2/14。
 */
public class FirstActivity extends BaseActivity {

    private boolean mIsFirstTime;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);  //全屏

        /**
         *
         * 判断当前是否是第一次打开app
         */
        if(ifIsFirstTime()){
            //跳转引导页
            Toast.makeText(this,"First Time",Toast.LENGTH_SHORT).show();

            setNotFirstTime();
//            return;
        }




        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(FirstActivity.this,MainActivity.class);


                startActivity(intent);

                finish();
            }
        },1000);


    }



    /**
     * 从SharedPreferences中取出数据查看是否是第一次进入
     *
     */
    private boolean ifIsFirstTime() {
        SharedPreferences preferences=getSharedPreferences("user", Context.MODE_PRIVATE);
        mIsFirstTime=preferences.getBoolean("isFirstTime",true);

        return mIsFirstTime;
    }


    /**
     *
     * 设置第一次进入的标记位为false
     */
    private void setNotFirstTime(){
        SharedPreferences preferences=getSharedPreferences("user", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferences.edit();
        editor.putBoolean("isFirstTime",false);
        editor.commit();

    }












}
