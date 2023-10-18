package com.pro.mini.service;

import com.pro.mini.vo.InvitationVO;
import com.pro.mini.repository.InvitationRepository;
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
        return invitationRepository.findByInvitationLink(invtLink);
    }

    public List<InvitationVO> getInvitationsByInvtYn(String invtYn){
        return invitationRepository.findAllByInvitationYn(invtYn);
    }
    public List<InvitationVO> getInvitationsByResponseYn(String resYn){
        return invitationRepository.findAllByResponseYn(resYn);
    }
    public List<InvitationVO> getInvitationsByUserId(Integer userId){
        return invitationRepository.findAllByUserId(userId);
    }
    public List<InvitationVO> getInvitationsByGroupId(Integer groupId){
        return invitationRepository.findAllByGroupId(groupId);
    }
    public List<InvitationVO> getInvitationsByUserIdByGroupId(Integer userId, Integer groupId){
        return invitationRepository.findAllByUserIdByGroupId(userId, groupId);
    }

    @Transactional
    public void deleteInvitation(Integer id){
        invitationRepository.deleteById(id);
    }
}
