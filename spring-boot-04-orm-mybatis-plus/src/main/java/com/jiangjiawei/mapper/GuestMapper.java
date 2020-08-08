package com.jiangjiawei.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jiangjiawei.domain.Guest;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

//@Mapper
@Component
public interface GuestMapper extends BaseMapper<Guest> {

}
