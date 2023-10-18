package com.pro.mini.repository;

import com.pro.mini.dao.GroupDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GroupRepository extends JpaRepository<GroupDAO, Integer> {
    public GroupDAO findById(String id);

    public Optional<GroupDAO> findByGroupName(String groupName);

}
