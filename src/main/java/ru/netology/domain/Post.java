package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private String imageURL;
    private String text;
    private String copyright;
    private String postType;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private CommentsInfo commentsInfo;
    private GeoInfo geoInfo;
    private MoreInfo moreInfo;
    private LikesInfo likeInfo;
    private ShareInfo shareInfo;
    private ViewsInfo viewInfo;
    private PostSource postSource;
    private LocationInfo locationInfo;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markAsAds;
    private boolean isFavorite;
    private int postponedId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }
    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }
    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String ImageURL) {
        this.imageURL = imageURL;
    }
    public String getText() {
        return text;
    }

    public void setText(String Text) {
        this.text = text;
    }
    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String Copyright) {
        this.copyright = copyright;
    }
    public String getPostType() {
        return postType;
    }

    public void setPostType(String PostType) {
        this.postType = postType;
    }
    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }
    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }
    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
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
    public PostSource getPostSource(){
        return postSource;
    }
    public void setPostSource(PostSource postSource){
        this.postSource= postSource;
    }
    public LocationInfo getLocationInfo(){
        return locationInfo;
    }
    public void setLocationInfo(LocationInfo locationInfo){
        this.locationInfo= locationInfo;
    }
    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }
    public int getCanPin() {
        return canPin;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }
    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }
    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }
    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }
    public int getMarkAsAds() {
        return markAsAds;
    }

    public void setMarkAsAds(int markAsAds) {
        this.markAsAds = markAsAds;
    }
    public boolean getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(boolean isFavorite) {
        this.isFavorite = isFavorite;
    }
    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }
}
