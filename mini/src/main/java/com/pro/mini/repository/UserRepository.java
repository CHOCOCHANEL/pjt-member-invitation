package com.pro.mini.repository;

import com.pro.mini.vo.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserVO, Integer> {
    public UserVO findById(String id);

    public List<UserVO> findAllByName(String name);
    public List<UserVO> findAllByEmail(String email);
}
