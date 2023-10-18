package com.pro.mini.vo;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "Users")
public class UserVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "email", nullable = false)
    private String email;
    @CreationTimestamp
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "temp_yn", nullable = false)
    @ColumnDefault("'N'")
    private String tempYn;
    @OneToMany(mappedBy = "userVO", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MemberVO> MemberVOs = new ArrayList<>();
    @OneToMany(mappedBy = "userVO", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<InvitationVO> invitationVOs = new ArrayList<>();

}
