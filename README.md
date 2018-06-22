# PhotoLibrary
# 依赖地址
# 在gridle配置 maven仓库
# 如图
#### 图片
![image.png](https://upload-images.jianshu.io/upload_images/6624077-0579d3ffde25182d.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
```

implementation 'com.github.Tareafengye:PhotoLibrary:1.1.0'
```
查看大图
# 用法
# 查看大图、相册，图片缓存等
在Application中
```
Awen.init(this);
```
# 在AndroidManifest.xml文件中配置Activity
```
 <activity android:name="com.liu.photolibrary.activity.ClipPictureActivity" />
        <activity android:name="com.liu.photolibrary.activity.PhotoPagerActivity" />
        <activity android:name="com.liu.photolibrary.activity.PhotoPickActivity" />
        <activity android:name="com.liu.photolibrary.activity.PhotoPreviewActivity" />
```
# 查看单例
```
 new PhotoPagerConfig.Builder(activity)//上下文
                //添加大图
                .addSingleBigImageUrl(url)//图片地址
                .setSavaImage(true)//true开启缓存
                .setSaveImageLocalPath("fileurl")//保存地址
                .build();
```
# 打开图库
# 一
```
 new PhotoPickConfig.Builder(activity)
                .pickMode(PhotoPickConfig.MODE_MULTIP_PICK)
                .maxPickSize(15)
                .showCamera(false)
                .build();
```
# 二
```
 PhotoPickBean bean = new PhotoPickBean();
//                bean.setMaxPickSize(15);
//                bean.setShowCamera(false);
//                bean.setSpanCount(3);
//                bean.setPickMode(PhotoPickConfig.MODE_MULTIP_PICK);
//                new PhotoPickConfig.Builder(this)
//                        .setPhotoPickBean(bean)
//                        .build();
```
# 带有相机的
```
  new PhotoPickConfig.Builder(activity)
                .pickMode(PhotoPickConfig.MODE_MULTIP_PICK)
                .maxPickSize(15)
                .showCamera(true)
                .setOriginalPicture(true)//让用户可以选择原图
                .build();
                
   
```
# 剪切头像
```
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
```
# 查看集合大图
```
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
```
# 具体请看MeiUtilPhotoUtil工具类，最后不要忘记添加相应的权限，网络、文件读取等



