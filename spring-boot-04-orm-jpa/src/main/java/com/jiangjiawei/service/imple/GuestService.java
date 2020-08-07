package com.jiangjiawei.service.imple;


import com.jiangjiawei.domain.Guest;
import com.jiangjiawei.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService implements com.jiangjiawei.service.GuestService {

    @Autowired
    private GuestRepository repository;

    @Override
    public List<Guest> list() {
        //查询所有的嘉宾
        return repository.findAll();
    }

}
