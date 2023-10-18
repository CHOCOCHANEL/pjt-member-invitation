package com.pro.mini.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@RequiredArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@DynamicInsert
@Entity
@Table(name = "Invitations")
public class InvitationVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "invt_link", nullable = false, unique = true)
    private String invtLink;
    @Column(name = "invt_yn")
    private String invtYn;
    @Column(name = "res_yn", nullable = false)
    @ColumnDefault("'N'")
    private String resYn;
    @ManyToOne(fetch = FetchType.LAZY)
    private GroupVO groupVO;
    @ManyToOne(fetch = FetchType.LAZY)
    private UserVO userVO;
    @CreationTimestamp
    @Column(name = "created_at")
    private Timestamp createdAt;

    @Override
    public String toString() {
        return "InvitationVO{" +
                "id=" + id +
                ", invtLink='" + invtLink + '\'' +
                ", invtYn='" + invtYn + '\'' +
                ", resYn='" + resYn + '\'' +
                ", groupVO=" + groupVO +
                ", userVO=" + userVO +
                ", createdAt=" + createdAt +
                '}';
    }
}
