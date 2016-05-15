package com.wenming.weiswift.mvp.model;

import android.content.Context;

import com.wenming.weiswift.entity.Comment;

import java.util.ArrayList;

/**
 * Created by wenmingvs on 16/5/15.
 */
public interface CommentModel {

    interface OnDataFinishedListener {
        void noMoreDate();

        void onDataFinish(ArrayList<Comment> commentlist);

        void onError(String error);

    }


    public void getLatestComment(Context context, OnDataFinishedListener onDataFinishedListener);

    public void getNextPageComment(Context context, OnDataFinishedListener onDataFinishedListener);

    public void saveCommentCache(Context context, String response);

    public ArrayList<Comment> getCommentCache(Context context);


}
