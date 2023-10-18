package com.pro.mini.repository;

import com.pro.mini.vo.MemberVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<MemberVO, Integer> {
    public MemberVO findById(String id);
    public List<MemberVO> findAllByGroupId(Integer groupId);
    public List<MemberVO> findAllByUserId(Integer userId);
    public List<MemberVO> findAllByManagerYn(String managerYn);

}
