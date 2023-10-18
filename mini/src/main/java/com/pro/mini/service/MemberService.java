package com.pro.mini.service;


import com.pro.mini.vo.MemberVO;
import com.pro.mini.repository.MemberRepository;
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
    public List<MemberVO> getMembersByGroupId(Integer groupId) {
        return memberRepository.findAllByGroupId(groupId);
    }
    public List<MemberVO> getMemberByUserId(Integer userId){
        return memberRepository.findAllByUserId(userId);
    }

    public List<MemberVO> getMembersByManagerYn(String managerYn){
        return memberRepository.findAllByManagerYn(managerYn);
    }

    @Transactional
    public void deleteMember(Integer id){
        memberRepository.deleteById(id);
    }
}
