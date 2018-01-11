package com.example.coffees.palleuniversity;

/**
 * Created by Coffees on 1/11/2018.
 */

public class Chapter {
    private String cNo,cDuration,cName,youTubeId;

    public Chapter(String cNo, String cDuration, String cName, String youTubeId) {
        this.cNo = cNo;
        this.cDuration = cDuration;
        this.cName = cName;
        this.youTubeId = youTubeId;
    }

    public String getcNo() {
        return cNo;
    }

    public void setcNo(String cNo) {
        this.cNo = cNo;
    }

    public String getcDuration() {
        return cDuration;
    }

    public void setcDuration(String cDuration) {
        this.cDuration = cDuration;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getYouTubeId() {
        return youTubeId;
    }

    public void setYouTubeId(String youTubeId) {
        this.youTubeId = youTubeId;
    }
}
