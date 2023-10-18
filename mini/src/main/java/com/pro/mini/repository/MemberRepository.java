package com.pro.mini.repository;

import com.pro.mini.vo.GroupVO;
import com.pro.mini.vo.MemberVO;
import com.pro.mini.vo.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<MemberVO, Integer> {
    public Optional<MemberVO> findById(Integer id);
    public List<MemberVO> findAllByGroupVO(GroupVO groupVO);
    public List<MemberVO> findAllByUserVO(UserVO userVO);
    public List<MemberVO> findAllByManagerYn(String managerYn);

}
