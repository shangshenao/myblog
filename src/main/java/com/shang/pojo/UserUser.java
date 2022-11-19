package com.shang.pojo;

import java.util.Date;

public class UserUser {
    private int mainuserid;
    private int fanuserid;
    private User usermain;
    private User userfan;
    private Date followtime;

    @Override
    public String toString() {
        return "UserUser{" +
                "mainuserid=" + mainuserid +
                ", fanuserid=" + fanuserid +
                ", usermain=" + usermain +
                ", userfan=" + userfan +
                ", followtime=" + followtime +
                '}';
    }

    public int getMainuserid() {
        return mainuserid;
    }

    public void setMainuserid(int mainuserid) {
        this.mainuserid = mainuserid;
    }

    public int getFanuserid() {
        return fanuserid;
    }

    public void setFanuserid(int fanuserid) {
        this.fanuserid = fanuserid;
    }

    public User getUsermain() {
        return usermain;
    }

    public void setUsermain(User usermain) {
        this.usermain = usermain;
    }

    public User getUserfan() {
        return userfan;
    }

    public void setUserfan(User userfan) {
        this.userfan = userfan;
    }

    public Date getFollowtime() {
        return followtime;
    }

    public void setFollowtime(Date followtime) {
        this.followtime = followtime;
    }
}
