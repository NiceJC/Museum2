package jintong.museum2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 登录页面
 * Created by wjc on 2017/3/1.
 */

public class LogInActivity extends BaseActivity implements View.OnClickListener {

    private EditText phone;
    private EditText passWord;
    private Button toRegister;
    private Button login;
    private TextView forgetPass;
    private ImageView weChatLogin;
    private ImageView qqLogin;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        //配合状态浸入，这句一定在setContentView之后
        //透明状态栏，API小于19时。。。。。
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);


        initView();
        initData();
        initEvents();
    }

    private void initView() {
        phone = (EditText) findViewById(R.id.login_phone);
        passWord = (EditText) findViewById(R.id.login_passWord);
        toRegister = (Button) findViewById(R.id.login_to_register);
        login = (Button) findViewById(R.id.login);
        forgetPass = (TextView) findViewById(R.id.forget_passWord);
        weChatLogin = (ImageView) findViewById(R.id.login_weChat);
        qqLogin = (ImageView) findViewById(R.id.login_qq);


    }

    private void initData() {
    }

    private void initEvents() {
        toRegister.setOnClickListener(this);
        login.setOnClickListener(this);
        forgetPass.setOnClickListener(this);
        weChatLogin.setOnClickListener(this);
        qqLogin.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.login_to_register:
                Intent intent=new Intent(this,RegisterActivity.class);
                startActivity(intent);
                finish();
                //切换动画需要放在startActivity或者finish的后面
                overridePendingTransition(R.anim.in_from_right,R.anim.none);

                break;
            case R.id.login:
                break;
            case R.id.forget_passWord:
                break;
            case R.id.login_weChat:
                break;
            case R.id.login_qq:
                break;
            default:
                break;


        }

    }
}
