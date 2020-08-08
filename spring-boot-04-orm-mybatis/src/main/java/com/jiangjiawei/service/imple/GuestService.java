package com.jiangjiawei.service.imple;


import com.jiangjiawei.domain.Guest;
import com.jiangjiawei.mapper.GuestMapper;
import com.jiangjiawei.mapper2.GuestMapper2;
import com.jiangjiawei.tk_mapper.TkGuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class GuestService implements com.jiangjiawei.service.GuestService {

    @Autowired
    private GuestMapper guestMapper;

    @Autowired
    private GuestMapper2 guestMapper2;

//    @Autowired
//    private TkGuestMapper guestMapper;

    @Override
    public List<Guest> list() {
        //查询所有的嘉宾
//        return guestMapper.getGuests();
        return guestMapper2.getGuests();
//        return guestMapper.selectAll();
    }

}
