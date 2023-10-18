package com.pro.mini.repository;

import com.pro.mini.vo.GroupVO;
import com.pro.mini.vo.InvitationVO;
import com.pro.mini.vo.UserVO;
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
    public List<InvitationVO> findAllByUserVO(UserVO userVO);
    public List<InvitationVO> findAllByGroupVO(GroupVO groupVO);
    public List<InvitationVO> findAllByUserVOAndGroupVO(UserVO userVO, GroupVO groupVO);
}
