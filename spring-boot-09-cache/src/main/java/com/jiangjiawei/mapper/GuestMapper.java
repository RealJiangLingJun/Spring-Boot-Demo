package com.jiangjiawei.mapper;


import com.jiangjiawei.domain.Guest;
import lombok.Data;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface GuestMapper{

    @Select("select * from guest")
    List<Guest> getGuests();


    @Select("select * from guest where id = #{id}")
    Guest getGuestsById(int id);

    @Update("update Guest set name=#{name},role=#{role} where id=#{id}")
    int updateGuest(Guest guest);

    @Delete("delete from Guest where id=#{id}")
     int deleteGuest(int id);

    @Delete("delete from Guest")
    int deleteAll();

}
