package com.pro.mini.service;

import com.pro.mini.vo.GroupVO;
import com.pro.mini.vo.InvitationVO;
import com.pro.mini.repository.InvitationRepository;
import com.pro.mini.vo.UserVO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvitationService {
    @Autowired
    private InvitationRepository invitationRepository;

    @Transactional
    public InvitationVO saveInvitation(InvitationVO invitationVO){
        return invitationRepository.save(invitationVO);
    }

    public List<InvitationVO> getAllInvitations() {
        return invitationRepository.findAll();
    }

    public Optional<InvitationVO> getInvitationById(Integer id){
        return invitationRepository.findById(id);
    }

    public InvitationVO getInvitationsByLink(String invtLink){
        return invitationRepository.findByInvtLink(invtLink);
    }

    public List<InvitationVO> getInvitationsByInvtYn(String invtYn){
        return invitationRepository.findAllByInvtYn(invtYn);
    }
    public List<InvitationVO> getInvitationsByResponseYn(String resYn){
        return invitationRepository.findAllByResYn(resYn);
    }
    public List<InvitationVO> getInvitationsByUserVO(UserVO userVO){
        return invitationRepository.findAllByUserVO(userVO);
    }
    public List<InvitationVO> getInvitationsByGroupVO(GroupVO groupVO) {
        return invitationRepository.findAllByGroupVO(groupVO);
    }
    public List<InvitationVO> getInvitationsByUserVOAndGroupVO(UserVO userVO, GroupVO groupVO){
        return invitationRepository.findAllByUserVOAndGroupVO(userVO, groupVO);
    }

    @Transactional
    public void deleteInvitation(Integer id){
        invitationRepository.deleteById(id);
    }
}
