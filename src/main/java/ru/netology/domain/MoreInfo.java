package ru.netology.domain;

public class MoreInfo {
    private boolean complain;
    private boolean saveInBookmarks;
    private boolean commentsSubscribe;

    public boolean getComplain() {
        return complain;
    }

    public void setComplain(boolean complain) {
        this.complain = complain;
    }

    public boolean getSaveInBookmarks() {
        return saveInBookmarks;
    }

    public void setSaveInBookmarks(boolean saveInBookmarks) {
        this.saveInBookmarks = saveInBookmarks;
    }

    public boolean getCommentsSubscribe() {
        return commentsSubscribe;
    }

    public void setCommentsSubscribe(boolean commentsSubscribe) {
        this.commentsSubscribe = commentsSubscribe;
    }
}
