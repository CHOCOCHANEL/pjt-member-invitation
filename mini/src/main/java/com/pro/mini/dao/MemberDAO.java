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
public class MemberDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "id", nullable = false) // foreign key (userId) references User (id)
    private GroupDAO groupDAO;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false) // foreign key (user_id) references User (id)
    private UserDAO userDAO;
    @Column(name = "manager_yn", nullable = false)
    @ColumnDefault("'N'")
    private String managerYn;
    @CreationTimestamp
    @Column(name = "joined_at")
    private Timestamp joinedAt;

    public MemberDAO(GroupDAO groupDAO, UserDAO userDAO, String managerYn) {
        this.groupDAO = groupDAO;
        this.userDAO = userDAO;
        this.managerYn = managerYn;
    }
}
