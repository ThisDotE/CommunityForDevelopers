package org.thisdote.communityfordevelopers.blacklist.command.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "blacklist")
public class BlackListEntity {

    @Id
    @Column(name = "blacklist_id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer blackListId;

    @Column(name = "blacklist_status")
    private Integer blackListStatus;

    @Column(name = "user_code")
    private Integer userCode;

    @Column(name = "blacklist_count")
    private Integer blackListCount;

    public BlackListEntity() {
    }

    public BlackListEntity(Integer blackListId, Integer blackListStatus, Integer userCode, Integer blackListCount) {
        this.blackListId = blackListId;
        this.blackListStatus = blackListStatus;
        this.userCode = userCode;
        this.blackListCount = blackListCount;
    }

    public int getBlackListId() {
        return blackListId;
    }

    public int getBlackListStatus() {
        return blackListStatus;
    }

    public int getUserCode() {
        return userCode;
    }

    public int getBlackListCount() {
        return blackListCount;
    }

    public void setBlackListId(int blackListId) {
        this.blackListId = blackListId;
    }

    public void setBlackListStatus(int blackListStatus) {
        this.blackListStatus = blackListStatus;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    public void setBlackListCount(int blackListCount) {
        this.blackListCount = blackListCount;
    }

    @Override
    public String toString() {
        return "BlackListEntity{" +
                "blackListId=" + blackListId +
                ", blackListStatus=" + blackListStatus +
                ", userCode=" + userCode +
                ", blackListCount=" + blackListCount +
                '}';
    }
}
