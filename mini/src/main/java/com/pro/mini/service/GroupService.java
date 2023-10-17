package com.pro.mini.service;

import com.pro.mini.dao.GroupDAO;
import com.pro.mini.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupService {
    @Autowired
    private GroupRepository groupRepository;

    public GroupDAO saveGroup(GroupDAO groupDAO){
        return groupRepository.save(groupDAO);
    }

    public List<GroupDAO> getAllGroups() {
        return groupRepository.findAll();
    }

    public Optional<GroupDAO> getGroupById(Integer id){
        return groupRepository.findById(id);
    }

    public List<GroupDAO> getGroupsByGroupName(String groupName){
        return groupRepository.findByGroupName(groupName);
    }

    public void deleteUser(Integer id){
        groupRepository.deleteById(id);
    }

}
