package com.jiangjiawei.service;

import com.jiangjiawei.domain.Guest;

import java.util.List;

public interface GuestService {

    List<Guest> list();

    void add(Guest guest);

    void update(Guest guest);

    Guest selectByName(String name);

    void delete(String name);
}
