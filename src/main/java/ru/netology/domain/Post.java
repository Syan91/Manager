package ru.netology.domain;

public class Post {
    private int id;
    private String imageURL;
    private CommentsInfo commentsInfo;
    private GeoInfo geoInfo;
    private MoreInfo moreInfo;
    private LikesInfo likeInfo;
    private ShareInfo shareInfo;
    private ViewsInfo viewInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String getImageURL) {
        this.imageURL = imageURL;
    }

    public CommentsInfo getCommentsInfo(){
        return commentsInfo;
    }
    public void setCommentsInfo(CommentsInfo commentsInfo){
        this.commentsInfo= commentsInfo;
    }
    public GeoInfo getGeoInfo(){
        return geoInfo;
    }
    public void setGeoInfo(GeoInfo geoInfo){
        this.geoInfo=geoInfo;
    }
    public MoreInfo getMoreInfo(){
        return moreInfo;
    }
    public void setMoreInfo(MoreInfo moreInfo){
        this.moreInfo= moreInfo;
    }
    public LikesInfo getLikeInfo(){
        return likeInfo;
    }
    public void setLikeInfo(LikesInfo likeInfo){
        this.likeInfo= likeInfo;
    }
    public ShareInfo getShareInfo(){
        return shareInfo;
    }
    public void setShareInfo(ShareInfo shareInfo){
        this.shareInfo= shareInfo;
    }
    public ViewsInfo getViewInfo(){
        return viewInfo;
    }
    public void setViewsInfo(ViewsInfo viewInfo){
        this.viewInfo= viewInfo;
    }
}
