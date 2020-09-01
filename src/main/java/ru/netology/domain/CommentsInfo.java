package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private int CanPost;
    private int groupCanPost;
    private boolean canClose;
    private boolean canOpen;

    public int getCount()

    {
        return count;

    }

    public void setCount(int count)

    {
        this.count= count;
    }

    public int getCanPost()

    {
        return CanPost;
    }

    public void setCanPost(int CanPost)

    {
        this.CanPost= CanPost;
    }
    public int getGroupCanPost()

    {
        return groupCanPost;
    }

    public void setGroupCanPost(int groupCanPost)

    {
        this.groupCanPost= groupCanPost;
    }
    public boolean getCanClose()

    {
        return canClose;
    }

    public void setCanClose(boolean canClose)

    {
        this.canClose= canClose;
    }
    public boolean getCanOpen()

    {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen)

    {
        this.canOpen= canOpen;
    }

}
