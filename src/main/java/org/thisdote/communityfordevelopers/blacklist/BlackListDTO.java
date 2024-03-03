package org.thisdote.communityfordevelopers.blacklist;

public class BlackListDTO {
    private int blackListId;
    private int blackListStatus;
    private int userCode;
    private int blackListCount;

    public BlackListDTO() {
    }

    public BlackListDTO(int blackListId, int blackListStatus, int userCode, int blackListCount) {
        this.blackListId = blackListId;
        this.blackListStatus = blackListStatus;
        this.userCode = userCode;
        this.blackListCount = blackListCount;
    }

    public int getBlackListId() {
        return blackListId;
    }

    public void setBlackListId(int blackListId) {
        this.blackListId = blackListId;
    }

    public int getBlackListStatus() {
        return blackListStatus;
    }

    public void setBlackListStatus(int blackListStatus) {
        this.blackListStatus = blackListStatus;
    }

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    public int getBlackListCount() {
        return blackListCount;
    }

    public void setBlackListCount(int blackListCount) {
        this.blackListCount = blackListCount;
    }

    @Override
    public String toString() {
        return "BlackListDTO{" +
                "blackListId=" + blackListId +
                ", blackListStatus=" + blackListStatus +
                ", userCode=" + userCode +
                ", blackListCount=" + blackListCount +
                '}';
    }
}