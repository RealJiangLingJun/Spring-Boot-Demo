package com.jiangjiawei.service.imple;


import com.jiangjiawei.domain.Guest;
import com.jiangjiawei.mapper.GuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class GuestService implements com.jiangjiawei.service.GuestService {

    @Autowired
    private GuestMapper guestMapper;

    @Override
    public List<Guest> list() {
        //查询所有的嘉宾
        return guestMapper.getGuests();
    }

}
