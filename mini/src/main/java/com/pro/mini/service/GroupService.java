package com.pro.mini.service;

import com.pro.mini.dao.GroupDAO;
import com.pro.mini.repository.GroupRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupService {
    @Autowired
    private GroupRepository groupRepository;

    @Transactional
    public GroupDAO saveGroup(GroupDAO groupDAO){
        return groupRepository.save(groupDAO);
    }

    public List<GroupDAO> getAllGroups() {
        return groupRepository.findAll();
    }

    public Optional<GroupDAO> getGroupById(Integer id){
        return groupRepository.findById(id);
    }

    public Optional<GroupDAO> getGroupByGroupName(String groupName){
        return groupRepository.findByGroupName(groupName);
    }

    @Transactional
    public void deleteUser(Integer id){
        groupRepository.deleteById(id);
    }

}
