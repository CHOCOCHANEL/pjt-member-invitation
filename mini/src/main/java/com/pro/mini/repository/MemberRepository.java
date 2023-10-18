package com.pro.mini.repository;

import com.pro.mini.vo.MemberVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<MemberVO, Integer> {
    public Optional<MemberVO> findById(Integer id);
    public List<MemberVO> findAllByGroupId(Integer groupId);
    public List<MemberVO> findAllByUserId(Integer userId);
    public List<MemberVO> findAllByManagerYn(String managerYn);

}
