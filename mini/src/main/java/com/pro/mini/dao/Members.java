package com.pro.mini.dao;

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
@Table(name = "Members")
public class Members {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "group_id", nullable = false)
    private String groupId;
    @Column(name = "user_id", nullable = false)
    private String userId;
    @Column(name = "manager_yn", nullable = false)
    @ColumnDefault("'N'")
    private String managerYn;
    @CreationTimestamp
    @Column(name = "joined_at")
    private Timestamp joinedAt;

}
