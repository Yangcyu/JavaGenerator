package com.ycy.demo.dao;

import com.ycy.demo.entity.PsnInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class PsnInfoDAOTest {
    @Autowired
    PsnInfoDAO psnInfoDAO;

    @Test
    public void deleteByPrimaryKey() {
        PsnInfo psnInfo = psnInfoDAO.selectByPrimaryKey("1");
        System.out.println(psnInfo);
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}