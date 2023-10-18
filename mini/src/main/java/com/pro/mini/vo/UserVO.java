package com.pro.mini.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@RequiredArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@DynamicInsert
@Entity
@Table(name = "Users")
public class UserVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @CreationTimestamp
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "temp_yn")
    @ColumnDefault("'N'")
    private String tempYn;
    @OneToMany(mappedBy = "userVO", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MemberVO> MemberVOs = new ArrayList<>();
    @OneToMany(mappedBy = "userVO", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<InvitationVO> invitationVOs = new ArrayList<>();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public String getTempYn() {
        return tempYn;
    }

    public List<MemberVO> getMemberVOs() {
        return MemberVOs;
    }

    public List<InvitationVO> getInvitationVOs() {
        return invitationVOs;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "name = " + name + ", " +
                "phone = " + phone + ", " +
                "email = " + email + ", " +
                "createdAt = " + createdAt + ", " +
                "tempYn = " + tempYn + ")";
    }
}
