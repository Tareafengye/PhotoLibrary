package com.mygithubtestdemo;

import android.app.Activity;

import com.liu.photolibrary.controller.PhotoPagerConfig;
import com.liu.photolibrary.controller.PhotoPickConfig;
import com.liu.photolibrary.model.PhotoPagerBean;
import com.liu.photolibrary.util.ImageProvider;

import java.util.ArrayList;

public class MeiUtilPhotoUtil {
    //    查看单列
    public static void onMeizi(Activity activity, String url) {
        new PhotoPagerConfig.Builder(activity)
                //添加大图
                .addSingleBigImageUrl(url)
                .setSavaImage(true)
                .setSaveImageLocalPath("Smalplent")
                .build();
    }

    /**
     * 打开图库
     *
     * @param activity
     */
    public static void PhotoConfi(Activity activity) {
//方法1
        new PhotoPickConfig.Builder(activity)
                .pickMode(PhotoPickConfig.MODE_MULTIP_PICK)
                .maxPickSize(15)
                .showCamera(false)
                .build();

        //方法2可查看大图预览
//                PhotoPickBean bean = new PhotoPickBean();
//                bean.setMaxPickSize(15);
//                bean.setShowCamera(false);
//                bean.setSpanCount(3);
//                bean.setPickMode(PhotoPickConfig.MODE_MULTIP_PICK);
//                new PhotoPickConfig.Builder(this)
//                        .setPhotoPickBean(bean)
//                        .build();
    }

    /***
     * 带有相机的
     *
     * @param activity
     */
    public static void PhotoPickConfig(Activity activity) {
        new PhotoPickConfig.Builder(activity)
                .pickMode(PhotoPickConfig.MODE_MULTIP_PICK)
                .maxPickSize(15)
                .showCamera(true)
                .setOriginalPicture(true)//让用户可以选择原图
                .build();
    }

    /***
     * 剪切头像
     *
     * @param activity
     */
    public static void onPhotoHead(Activity activity) {
        new PhotoPickConfig.Builder(activity)
                .pickMode(PhotoPickConfig.MODE_SINGLE_PICK)
                .clipPhoto(true)
                .build();
    }

    /**
     * 查看网络大图
     * position 下标
     * @param activity
     */
    public static void setNetWorkBigPicture(Activity activity, ArrayList<String> list, int position) {
        new PhotoPagerConfig.Builder(activity)
                .setBigImageUrls(list)
                .setSavaImage(true)
                .setPosition(position)
                .setSaveImageLocalPath("这里是你想保存的图片地址")
                .build();
    }

    /**
     * 大图展示，先显示小图
     *
     * @param activity
     */
    public static void BigPhotoMin(Activity activity) {
        new PhotoPagerConfig.Builder(activity)
                .setBigImageUrls(ImageProvider.getBigImgUrls())
                .setLowImageUrls(ImageProvider.getLowImgUrls())
                .setSavaImage(true)
                .build();

    }

    /***
     * 一张张图片添加
     *
     * @param activity
     */
    public static void onYiZhangZhang(Activity activity) {
        new PhotoPagerConfig.Builder(activity)
                //添加大图
                .addSingleBigImageUrl("http://img.qq745.com/uploads/hzbimg/0907/hzb33617.png")
                .addSingleBigImageUrl("http://img.qq745.com/uploads/hzbimg/0907/hzb33616.png")
                .setSavaImage(true)
                .build();
    }

    /**
     * 先构建实体类,在实体类里设置好参数
     *
     * @param activity
     */
    public static void onBeanPhoto(Activity activity) {

        PhotoPagerBean bean = new PhotoPagerBean();
        bean.setBigImgUrls(ImageProvider.getBigImgUrls());
        bean.setLowImgUrls(ImageProvider.getLowImgUrls());
        bean.setSaveImage(true);
        //再设置实体类
        new PhotoPagerConfig.Builder(activity)
                .setPhotoPagerBean(bean)
                .build();
    }

/*
选择相册拍照回调地址
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != Activity.RESULT_OK || data == null) {
            return;
        }
        switch (requestCode) {
            case PhotoPickConfig.PICK_REQUEST_CODE://图片
                ArrayList<String> photoLists = data.getStringArrayListExtra(PhotoPickConfig.EXTRA_STRING_ARRAYLIST);
                //用户选择的是否是原图
                boolean isOriginalPicture = data.getBooleanExtra(PhotoPreviewConfig.EXTRA_ORIGINAL_PIC,false);
                if (photoLists != null && !photoLists.isEmpty()) {
                    Log.i("MainActivity","selected photos = " + photoLists.toString());
                    Toast.makeText(this,"selected photos size = " + photoLists.size() + "\n" + photoLists.toString(),Toast.LENGTH_LONG).show();
                    File file = new File(photoLists.get(0));
                    if (file.exists()) {
                        //you can do something

                    } else {
                        //toast error

                    }
                }
                break;
        }
    }*/
}
