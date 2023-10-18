package com.pro.mini.repository;

import com.pro.mini.vo.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserVO, Integer> {
    public Optional<UserVO> findById(Integer id);

    public List<UserVO> findAllByName(String name);
    public List<UserVO> findAllByEmail(String email);
}
