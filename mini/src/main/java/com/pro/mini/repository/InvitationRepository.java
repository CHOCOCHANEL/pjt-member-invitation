package com.pro.mini.repository;

import com.pro.mini.dao.InvitationDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvitationRepository extends JpaRepository<InvitationDAO, Integer> {
    public InvitationDAO findById(String id);
    public InvitationDAO findByInvitationLink(String invtLink);

    public List<InvitationDAO> findAllByInvitationYn(String invtYn);
    public List<InvitationDAO> findAllByResponseYn(String resYn);
    public List<InvitationDAO> findAllByUserId(Integer userId);
    public List<InvitationDAO> findAllByGroupId(Integer groupId);
    public List<InvitationDAO> findAllByUserIdByGroupId(Integer userId, Integer groupId);
}
