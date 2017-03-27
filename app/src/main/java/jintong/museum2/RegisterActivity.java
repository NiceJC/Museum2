package jintong.museum2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

/**
 *
 *
 *
 * 注册页面
 * Created by wjc on 2017/3/1.
 */

public class RegisterActivity extends BaseActivity implements View.OnClickListener{

    private EditText phone;
    private EditText checkNum;
    private EditText passWord;

    private Button getCheckNum;
    private Button registerCommit;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_register);

        //配合状态浸入，这句一定在setContentView之后
        //透明状态栏，API小于19时。。。。。
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);


        initView();
        initData();
        initEvents();
    }



    private void initView() {

        phone= (EditText) findViewById(R.id.register_phone);
        checkNum= (EditText) findViewById(R.id.register_checkNum);
        passWord= (EditText) findViewById(R.id.register_passWord);
        getCheckNum= (Button) findViewById(R.id.get_check_num);
        registerCommit= (Button) findViewById(R.id.register_commit);


    }


    private void initData() {




    }


    private void initEvents() {
        getCheckNum.setOnClickListener(this);
        registerCommit.setOnClickListener(this);



    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.get_check_num:
                break;
            case R.id.register_commit:

                finish();
                overridePendingTransition(R.anim.none,R.anim.out_to_right);
                break;
            default:
                break;



        }



    }
}
