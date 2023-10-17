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

    @Column(name = "invt_link", nullable = false, unique = true)
    private String invtLink;
    @Column(name = "invt_yn")
    private String invtYn;
    @Column(name = "res_yn", nullable = false)
    @ColumnDefault("'N'")
    private String resYn;
    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "id", nullable = false) // foreign key (userId) references User (id)
    private Groups groups;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false) // foreign key (user_id) references User (id)
    private Users users;
    @CreationTimestamp
    @Column(name = "created_at")
    private Timestamp createdAt;

}
