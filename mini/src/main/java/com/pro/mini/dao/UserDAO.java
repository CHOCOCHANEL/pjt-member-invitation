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
@Table(name = "Users")
public class UserDAO {
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

    public UserDAO(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    public UserDAO(String name, String phone, String email, String tempYn) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.tempYn = tempYn;
    }
}
