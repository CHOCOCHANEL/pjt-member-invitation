package com.pro.mini.repository;

import com.pro.mini.vo.InvitationVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InvitationRepository extends JpaRepository<InvitationVO, Integer> {
    public Optional<InvitationVO> findById(Integer id);
    public InvitationVO findByInvtLink(String invtLink);

    public List<InvitationVO> findAllByInvtYn(String invtYn);
    public List<InvitationVO> findAllByResYn(String resYn);
    public List<InvitationVO> findAllByUserId(Integer userId);
    public List<InvitationVO> findAllByGroupId(Integer groupId);
    public List<InvitationVO> findAllByUserIdAndGroupId(Integer userId, Integer groupId);
}
