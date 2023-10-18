package com.pro.mini.vo;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
@Table(name = "Invitations")
public class InvitationVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "invt_link", nullable = false, unique = true)
    private String invtLink;
    @Column(name = "invt_yn")
    private String invtYn;
    @Column(name = "res_yn", nullable = false)
    @ColumnDefault("'N'")
    private String resYn;
    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "id", nullable = false) // foreign key (userId) references User (id)
    private GroupVO groupVO;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false) // foreign key (user_id) references User (id)
    private UserVO userVO;
    @CreationTimestamp
    @Column(name = "created_at")
    private Timestamp createdAt;

    public InvitationVO(String invtLink, String invtYn, String resYn, GroupVO groupVO, UserVO userVO) {
        this.invtLink = invtLink;
        this.invtYn = invtYn;
        this.resYn = resYn;
        this.groupVO = groupVO;
        this.userVO = userVO;
    }
}
