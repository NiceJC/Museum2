package jintong.museum2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import adapter.ColtListAdapter;
import adapter.ExhibitRoomAdapter;
import entity.Collection;
import entity.ExhibitRoom;
import entity.Exhibition;
import interfaces.OnItemClickListener;

/**
 * 展厅展示页面
 * Created by wjc on 2017/3/7.
 */

public class ExhibitionRoomActivity extends BaseActivity implements View.OnClickListener{


    private RecyclerView recyclerView;

    private ImageView back;

    private TextView roomName;

    private List<Collection> datas;

    private ExhibitRoom exhibitRoomData;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_exbitroom);

        //配合状态浸入，这句一定在setContentView之后
        //透明状态栏，API小于19时。。。。。
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);


        initView();
        initData();
        setData();
        initEvents();


        ColtListAdapter adapter = new ColtListAdapter(this, datas);

        adapter.setmOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(ExhibitionRoomActivity.this,"click"+position,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void OnItemLongClick(View view, int position) {

            }
        });


        recyclerView.setAdapter(adapter);
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);


    }

    private void setData() {

        roomName.setText(exhibitRoomData.getName());

    }

    private void initView() {

        back= (ImageView) findViewById(R.id.museum_room_back);
        roomName= (TextView) findViewById(R.id.museum_room_name);
        recyclerView = (RecyclerView) findViewById(R.id.exhibitRoom_recyclerView);



    }


    private void initData() {

        exhibitRoomData=new ExhibitRoom();
        exhibitRoomData.setName("沧海展厅");


        datas=new ArrayList<Collection>();
        for (int i=0;i<4;i++){
            Collection collection=new Collection();
            List<String> urls=new ArrayList<String>();
            urls.add("http://bmob-cdn-4183.b0.upaiyun.com/2016/08/03/38ef58db401620a38093b48211c1a027.jpg");
            collection.setColtLikeNum(9955);
            collection.setColtImageURLs(urls);
            collection.setColtName("鸟纹包月瓶");
            collection.setColtDynasty("清朝");
            collection.setColtSize("高十米，宽十米");
            collection.setColtIntru("清末民国时期使用的称量粮食的工具，一面书“㕠聚号记”，一面书“校准市斗”。");

            collection.setColtCommentNum(996);
            datas.add(collection);



        }



    }

    private void initEvents() {

        back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.museum_room_back:
                finish();
                overridePendingTransition(R.anim.none,R.anim.out_to_right);
                break;
            default:
                break;




        }


    }
}
