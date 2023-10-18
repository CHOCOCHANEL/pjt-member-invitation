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
@RequiredArgsConstructor
@Entity
@Table(name = "Members")
public class MemberVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @ManyToOne
    private GroupVO groupVO;
    @ManyToOne
    private UserVO userVO;
    @Column(name = "manager_yn", nullable = false)
    @ColumnDefault("'N'")
    private String managerYn;
    @CreationTimestamp
    @Column(name = "joined_at")
    private Timestamp joinedAt;

    @Override
    public String toString() {
        return "MemberVO{" +
                "id=" + id +
                ", groupVO=" + groupVO +
                ", userVO=" + userVO +
                ", managerYn='" + managerYn + '\'' +
                ", joinedAt=" + joinedAt +
                '}';
    }
}
