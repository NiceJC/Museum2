package entity;

import java.util.List;

/**
 *
 * 用户的实体类
 * Created by wjc on 2017/2/28.
 *
 */

public class User {


    private List<Integer> likeCollections; //喜欢的藏品的ID

    private List<Integer> watchMuseums; //关注的博物馆的ID

    private List<Integer> postBlogs; //发表的状态的ID

    private List<Integer> watchUsers; //关注的其他用户

    private List<Integer> fans; //粉丝

    private String nickName;  //用户昵称


    private boolean isMan; //性别

    private String phoneNum;  //电话号码


    public User() {
    }


    public User(List<Integer> likeCollections, List<Integer> watchMuseums, List<Integer> postBlogs, List<Integer> watchUsers, List<Integer> fans, String nickName, boolean isMan, String phoneNum) {
        this.likeCollections = likeCollections;
        this.watchMuseums = watchMuseums;
        this.postBlogs = postBlogs;
        this.watchUsers = watchUsers;
        this.fans = fans;
        this.nickName = nickName;
        this.isMan = isMan;
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "User{" +
                "likeCollections=" + likeCollections +
                ", watchMuseums=" + watchMuseums +
                ", postBlogs=" + postBlogs +
                ", watchUsers=" + watchUsers +
                ", fans=" + fans +
                ", nickName='" + nickName + '\'' +
                ", isMan=" + isMan +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }

    public List<Integer> getLikeCollections() {
        return likeCollections;
    }

    public void setLikeCollections(List<Integer> likeCollections) {
        this.likeCollections = likeCollections;
    }

    public List<Integer> getWatchMuseums() {
        return watchMuseums;
    }

    public void setWatchMuseums(List<Integer> watchMuseums) {
        this.watchMuseums = watchMuseums;
    }

    public List<Integer> getPostBlogs() {
        return postBlogs;
    }

    public void setPostBlogs(List<Integer> postBlogs) {
        this.postBlogs = postBlogs;
    }

    public List<Integer> getWatchUsers() {
        return watchUsers;
    }

    public void setWatchUsers(List<Integer> watchUsers) {
        this.watchUsers = watchUsers;
    }

    public List<Integer> getFans() {
        return fans;
    }

    public void setFans(List<Integer> fans) {
        this.fans = fans;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        isMan = man;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
