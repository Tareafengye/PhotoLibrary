package com.liu.photolibrary.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/1/27 0027.
 */

public class PhotoPick implements Serializable {

    private int id;
    private String path;  //路径
    private boolean isCamera;

    public PhotoPick(String path) {
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean isCamera() {
        return isCamera;
    }

    public void setIsCamera(boolean isCamera) {
        this.isCamera = isCamera;
    }
}
