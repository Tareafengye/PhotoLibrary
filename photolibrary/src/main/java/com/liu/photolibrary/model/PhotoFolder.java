package com.liu.photolibrary.model;

import java.io.Serializable;
import java.util.List;

/**
 * @Class: PhotoFolder
 * @Description: 相片文件夹实体类
 * @author: lling(www.liuling123.com)
 * @Date: 2015/11/4
 */
public class PhotoFolder implements Serializable {

    /* 文件夹名 */
    private String name;
    /* 文件夹路径 */
    private String dirPath;
    /* 该文件夹下图片列表 */
    private List<PhotoPick> photoList;
    /* 标识是否选中该文件夹 */
    private boolean isSelected;

    public boolean isSelected() {
        return isSelected;
    }

    public void setIsSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirPath() {
        return dirPath;
    }

    public void setDirPath(String dirPath) {
        this.dirPath = dirPath;
    }

    public List<PhotoPick> getPhotoList() {
        return photoList;
    }

    public void setPhotoList(List<PhotoPick> photoList) {
        this.photoList = photoList;
    }
}
