package com.jiangjiawei.tk_mapper;

import com.jiangjiawei.domain.Guest;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

/**
 * 继承由tk.myabtis 提供的 mapper
 */
@Component
public interface TkGuestMapper extends Mapper<Guest> {
}
