package com.service;

import com.dao.BusinessDao;
import com.entity.Business;
import com.entity.Detail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BusinessServceimpl implements BusinessService {
   @Autowired
   private BusinessDao businessDao;


    @Override
    public int add(Business business) {

        int i=businessDao.add(business);
        return i;
    }

    @Override
    public int increase(Detail detail) {

        int i=businessDao.increase(detail);
        return i;
    }
}
