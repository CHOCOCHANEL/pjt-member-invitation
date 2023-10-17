package com.pro.mini.service;

import com.pro.mini.dao.InvitationDAO;
import com.pro.mini.repository.InvitationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvitationService {
    @Autowired
    private InvitationRepository invitationRepository;

    public InvitationDAO saveInvitation(InvitationDAO invitationDAO){
        return invitationRepository.save(invitationDAO);
    }

    public List<InvitationDAO> getAllInvitations() {
        return invitationRepository.findAll();
    }

    public Optional<InvitationDAO> getInvitationById(Integer id){
        return invitationRepository.findById(id);
    }

    public InvitationDAO getInvitationsByLink(String invtLink){
        return invitationRepository.findByInvitationLink(invtLink);
    }

    public List<InvitationDAO> getInvitationsByInvtYn(String invtYn){
        return invitationRepository.findAllByInvitationYn(invtYn);
    }
    public List<InvitationDAO> getInvitationsByResponseYn(String resYn){
        return invitationRepository.findAllByResponseYn(resYn);
    }
    public List<InvitationDAO> getInvitationsByUserId(Integer userId){
        return invitationRepository.findAllByUserId(userId);
    }
    public List<InvitationDAO> getInvitationsByGroupId(Integer groupId){
        return invitationRepository.findAllByGroupId(groupId);
    }
    public List<InvitationDAO> getInvitationsByUserIdByGroupId(Integer userId, Integer groupId){
        return invitationRepository.findAllByUserIdByGroupId(userId, groupId);
    }

    public void deleteInvitation(Integer id){
        invitationRepository.deleteById(id);
    }
}
