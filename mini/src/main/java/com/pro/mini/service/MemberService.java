package com.pro.mini.service;


import com.pro.mini.vo.GroupVO;
import com.pro.mini.vo.MemberVO;
import com.pro.mini.repository.MemberRepository;
import com.pro.mini.vo.UserVO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    @Transactional
    public MemberVO saveMember(MemberVO memberVO){
        return memberRepository.save(memberVO);
    }

    public List<MemberVO> getAllMembers() {
        return memberRepository.findAll();
    }
    public List<MemberVO> getMembersByGroupVO(GroupVO groupVO) {
        return memberRepository.findAllByGroupVO(groupVO);
    }
    public List<MemberVO> getMemberByUserVO(UserVO userVO){
        return memberRepository.findAllByUserVO(userVO);
    }

    public List<MemberVO> getMembersByManagerYn(String managerYn){
        return memberRepository.findAllByManagerYn(managerYn);
    }

    @Transactional
    public void deleteMember(Integer id){
        memberRepository.deleteById(id);
    }
}
