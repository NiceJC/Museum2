package fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import MyView.GridItemDecoration;
import adapter.CollectionGridAdapter;
import entity.Collection;
import jintong.museum2.R;

/**
 * Created by wjc on 2017/2/9.
 */
public class MuseumFragment extends Fragment {
    private View view ;
    private RecyclerView recyclerView;
    private List<Collection> collections =new ArrayList<Collection>();
    private CollectionGridAdapter adapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.museum_fragment, container, false);


        initViews();
        initDatas();

        adapter=new CollectionGridAdapter(getActivity(),collections);
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));


        //设置RecycerView的Item间分割线
//        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL_LIST));


        recyclerView.addItemDecoration(new GridItemDecoration(10,getActivity()));
        return view;

    }

    private void initDatas() {
        for(int i=0;i<=5;i++){
            Collection colt=new Collection();
            colt.setColtLikeNum(i*100);
            colt.setColtName("伟大的作品"+i);
            List<String> urls=new ArrayList<>();
            urls.add("http://bmob-cdn-4183.b0.upaiyun.com/2016/08/03/c4f89b0540d7cf3d80a77d13ca4e04b2.jpg");
            colt.setColtImageURLs(urls);
            colt.setColtToMuseumName("黄山帝国博物馆");
            collections.add(colt);

        }


    }

    private void initViews() {
        recyclerView= (RecyclerView) view.findViewById(R.id.colt_recyclerView);



    }
}
