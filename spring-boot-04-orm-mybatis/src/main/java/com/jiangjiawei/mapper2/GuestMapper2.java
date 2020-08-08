package com.jiangjiawei.mapper2;


import com.jiangjiawei.domain.Guest;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface GuestMapper2 {

    @Select("select * from guest")
    List<Guest> getGuests();

}
