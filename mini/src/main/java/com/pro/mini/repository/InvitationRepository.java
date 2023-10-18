package com.pro.mini.repository;

import com.pro.mini.vo.InvitationVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvitationRepository extends JpaRepository<InvitationVO, Integer> {
    public InvitationVO findById(String id);
    public InvitationVO findByInvitationLink(String invtLink);

    public List<InvitationVO> findAllByInvitationYn(String invtYn);
    public List<InvitationVO> findAllByResponseYn(String resYn);
    public List<InvitationVO> findAllByUserId(Integer userId);
    public List<InvitationVO> findAllByGroupId(Integer groupId);
    public List<InvitationVO> findAllByUserIdByGroupId(Integer userId, Integer groupId);
}
