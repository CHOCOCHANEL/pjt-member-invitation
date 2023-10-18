package com.pro.mini.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import java.sql.Timestamp;

@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@RequiredArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@DynamicInsert
@Entity
@Table(name = "Members")
public class MemberVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @ManyToOne
    private GroupVO groupVO;
    @ManyToOne
    private UserVO userVO;
    @Column(name = "manager_yn", nullable = false)
    @ColumnDefault("'N'")
    private String managerYn;
    @CreationTimestamp
    @Column(name = "joined_at")
    private Timestamp joinedAt;

    public int getId() {
        return id;
    }

    public GroupVO getGroupVO() {
        return groupVO;
    }

    public UserVO getUserVO() {
        return userVO;
    }

    public String getManagerYn() {
        return managerYn;
    }

    public Timestamp getJoinedAt() {
        return joinedAt;
    }

    @Override
    public String toString() {
        return "MemberVO{" +
                "id=" + id +
                ", groupVO=" + groupVO +
                ", userVO=" + userVO +
                ", managerYn='" + managerYn + '\'' +
                ", joinedAt=" + joinedAt +
                '}';
    }
}
