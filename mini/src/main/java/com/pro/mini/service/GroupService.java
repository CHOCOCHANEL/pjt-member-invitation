package com.pro.mini.service;

import com.pro.mini.vo.GroupVO;
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
    public GroupVO saveGroup(GroupVO groupVO){
        return groupRepository.save(groupVO);
    }

    public List<GroupVO> getAllGroups() {
        return groupRepository.findAll();
    }

    public Optional<GroupVO> getGroupById(Integer id){
        return groupRepository.findById(id);
    }

    public Optional<GroupVO> getGroupByGroupName(String groupName){
        return groupRepository.findByGroupName(groupName);
    }

    @Transactional
    public void deleteUser(Integer id){
        groupRepository.deleteById(id);
    }

}
