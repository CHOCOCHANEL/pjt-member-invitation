package com.pro.mini.repository;

import com.pro.mini.vo.GroupVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GroupRepository extends JpaRepository<GroupVO, Integer> {
    public GroupVO findById(String id);

    public Optional<GroupVO> findByGroupName(String groupName);

}
