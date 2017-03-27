package jintong.museum2;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by wjc on 2017/2/27.
 */

public class SetUpActivity extends BaseActivity implements View.OnClickListener {

    private ImageView mBack;

    private ImageView mIcon;
    private LinearLayout mClickIcon;

    private TextView mNickName;
    private LinearLayout mClickNickName;

    private TextView mGender;
    private LinearLayout mClickGender;

    private TextView mVersion;
    private LinearLayout mClickVersion;

    private TextView mPhone;
    private LinearLayout mClickPhone;

    private LinearLayout mClickAboutUs;

    private LinearLayout mClickFeedBack;

    private LinearLayout mClickLogOut;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("TAG", "oncreate2");

        setContentView(R.layout.activity_setup);

        //配合状态浸入，这句一定在setContentView之后
        //透明状态栏，API小于19时。。。。。
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);


        initView();
        initData();
        initEvents();


    }

    private void initView() {

        mBack = (ImageView) findViewById(R.id.setup_back);
        mIcon = (ImageView) findViewById(R.id.setup_icon);
        mNickName = (TextView) findViewById(R.id.setup_userName);
        mGender = (TextView) findViewById(R.id.setup_gender);
        mVersion = (TextView) findViewById(R.id.setup_version);
        mPhone = (TextView) findViewById(R.id.setup_phone);

        mClickIcon = (LinearLayout) findViewById(R.id.setup_change_icon);
        mClickNickName = (LinearLayout) findViewById(R.id.setup_change_userName);
        mClickGender = (LinearLayout) findViewById(R.id.setup_change_gender);
        mClickVersion = (LinearLayout) findViewById(R.id.setup_check_version);
        mClickPhone = (LinearLayout) findViewById(R.id.setup_change_phone);
        mClickAboutUs = (LinearLayout) findViewById(R.id.setup_change_aboutUs);
        mClickFeedBack = (LinearLayout) findViewById(R.id.setup_change_feedBack);
        mClickLogOut = (LinearLayout) findViewById(R.id.setup_change_logOut);


    }


    private void initData() {


    }

    private void initEvents() {
        mBack.setOnClickListener(this);
        mClickIcon.setOnClickListener(this);
        mClickNickName.setOnClickListener(this);
        mClickGender.setOnClickListener(this);
        mClickVersion.setOnClickListener(this);
        mClickPhone.setOnClickListener(this);
        mClickAboutUs.setOnClickListener(this);
        mClickFeedBack.setOnClickListener(this);
        mClickLogOut.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.setup_back:
                finish();
                overridePendingTransition(R.anim.none,R.anim.out_to_right);
                break;
            case R.id.setup_change_logOut:
                Intent intent=new Intent(this,LogInActivity.class);


                startActivity(intent);

                overridePendingTransition(R.anim.in_from_right,R.anim.none);
                finish();

                break;
            default:
                break;



        }




    }
}
