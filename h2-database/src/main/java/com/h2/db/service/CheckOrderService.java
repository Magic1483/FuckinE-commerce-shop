package com.h2.db.service;

import com.h2.db.exception.RecordNotFoundException;
import com.h2.db.model.CheckorderEntity;
import com.h2.db.model.TblProduct;
import com.h2.db.model.repository.CheckOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CheckOrderService {

    @Autowired
    CheckOrderRepository repository;

    public List<CheckorderEntity> getAllCheckOrders()
    {
        System.out.println("get all orders");
        List<CheckorderEntity> result=(List<CheckorderEntity>) repository.findAll();
        if(result.size() > 0) {
            return result;
        } else {
            return new ArrayList<CheckorderEntity>();
        }
    }

    public List<CheckorderEntity> getCheckOrderByLogin(String login) throws RecordNotFoundException
    {
        List<CheckorderEntity> checkorderEntity=(List<CheckorderEntity>) repository.findCheckorderEntityByLogin(login);

        if(checkorderEntity.size()>0) {
            return checkorderEntity;
        } else {
            throw new RecordNotFoundException("No employee record exist for given id");
        }
    }
}
