package com.example.liugang.repository;


import com.example.liugang.model.UserBeanPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author liugang
 * @Classname UserBeanPriceDao
 * @Description 用户趣豆单价
 * @Date 2020/12/8 10:28
 */
@Repository
public interface UserBeanPriceDao extends JpaRepository<UserBeanPrice,Integer> {
}
