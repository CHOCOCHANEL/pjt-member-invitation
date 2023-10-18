package com.pro.mini.dao;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
@Table(name = "Groups")
public class GroupDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "group_name", nullable = false, unique = true)
    private String groupName;

    @CreationTimestamp
    @Column(name = "created_at")
    private Timestamp createdAt;

    public GroupDAO(String groupName) {
        this.groupName = groupName;
    }
}
