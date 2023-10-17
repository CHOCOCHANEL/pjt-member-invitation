package com.pro.mini.service;


import com.pro.mini.dao.MemberDAO;
import com.pro.mini.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public MemberDAO saveMember(MemberDAO memberDAO){
        return memberRepository.save(memberDAO);
    }

    public List<MemberDAO> getAllMembers() {
        return memberRepository.findAll();
    }
    public List<MemberDAO> getMembersByGroupId(Integer groupId) {
        return memberRepository.findAllByGroupId(groupId);
    }
    public List<MemberDAO> getMemberByUserId(Integer userId){
        return memberRepository.findAllByUserId(userId);
    }

    public List<MemberDAO> getMembersByManagerYn(String managerYn){
        return memberRepository.findAllByManagerYn(managerYn);
    }

    public void deleteMember(Integer id){
        memberRepository.deleteById(id);
    }
}
