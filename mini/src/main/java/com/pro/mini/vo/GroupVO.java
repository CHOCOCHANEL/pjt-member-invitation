package com.pro.mini.vo;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
@Table(name = "Groups")
public class GroupVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "group_name", nullable = false, unique = true)
    private String groupName;
    @CreationTimestamp
    @Column(name = "created_at")
    private Timestamp createdAt;
    @OneToMany(mappedBy = "groupVO", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MemberVO> MemberVOs = new ArrayList<>();
    @OneToMany(mappedBy = "groupVO", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<InvitationVO> invitationVOs = new ArrayList<>();

    public GroupVO(String groupName) {
        this.groupName = groupName;
    }
}
