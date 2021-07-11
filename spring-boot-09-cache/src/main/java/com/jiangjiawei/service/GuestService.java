package com.jiangjiawei.service;

import com.jiangjiawei.domain.Guest;

import java.util.List;

public interface GuestService {

    List<Guest> list();

    Guest getGuestById(int id);

    /**
     * 使用缓存，将方法的返回值放在缓存中
     */
    Guest updateGuest(Guest guest);

    void deleteGuest(int id);

    void deleteAll();
}
