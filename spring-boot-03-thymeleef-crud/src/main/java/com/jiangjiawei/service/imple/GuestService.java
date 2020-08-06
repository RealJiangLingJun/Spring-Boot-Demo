package com.jiangjiawei.service.imple;

import com.jiangjiawei.dao.GuestDao;
import com.jiangjiawei.domain.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService implements com.jiangjiawei.service.GuestService {

    @Autowired
    private GuestDao guestDao;

    @Override
    public List<Guest> list() {
        //查询所有的嘉宾
        return guestDao.list();
    }

    @Override
    public void add(Guest guest) {
        guestDao.add(guest);
    }

    @Override
    public void update(Guest guest) {
        guestDao.update(guest);
    }

    @Override
    public Guest selectByName(String name) {
        return guestDao.getGuest(name);
    }

    @Override
    public void delete(String name) {
        guestDao.delete(name);
    }


}
