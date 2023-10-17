package com.pro.mini.dao;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
@Table(name = "Invitations")
public class Invitations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "invt_link", nullable = false)
    private String invtLink;
    @Column(name = "invt_yn", nullable = false)
    private String invtYn;
    @Column(name = "res_yn", nullable = false)
    @ColumnDefault("'N'")
    private String resYn;
    @Column(name = "group_id", nullable = false)
    private String groupId;
    @Column(name = "user_id", nullable = false)
    private String userId;
    @CreationTimestamp
    @Column(name = "created_at")
    private Timestamp createdAt;

}
