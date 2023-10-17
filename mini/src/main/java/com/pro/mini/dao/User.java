package com.pro.mini.dao;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private String email;
    @CreationTimestamp
    @Column
    private Timestamp createdAt;
    @Column(nullable = false)
    @ColumnDefault("N")
    private String tempYn;


}
