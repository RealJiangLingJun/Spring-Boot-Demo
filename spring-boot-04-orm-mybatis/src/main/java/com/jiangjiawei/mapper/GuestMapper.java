package com.jiangjiawei.mapper;


import com.jiangjiawei.domain.Guest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

//@Mapper
@Component
public interface GuestMapper{

    @Select("select * from guest")
    List<Guest> getGuests();

}
