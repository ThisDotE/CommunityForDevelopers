package org.thisdote.communityfordevelopers.blacklist.command.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "blacklist")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BlackList {

    @Id
    @Column(name = "blacklist_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int blackListId;

    @Column(name = "blacklist_status")
    private int blackListStatus;

    @Column(name = "user_code")
    private int userCode;

    @Column(name = "blacklist_count")
    private int blackListCount;
}
