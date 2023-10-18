package com.pro.mini.repository;

import com.pro.mini.dao.MemberDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<MemberDAO, Integer> {
    public MemberDAO findById(String id);
    public List<MemberDAO> findAllByGroupId(Integer groupId);
    public List<MemberDAO> findAllByUserId(Integer userId);
    public List<MemberDAO> findAllByManagerYn(String managerYn);

}
