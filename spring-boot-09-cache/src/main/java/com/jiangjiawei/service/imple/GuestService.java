package com.jiangjiawei.service.imple;


import com.jiangjiawei.domain.Guest;
import com.jiangjiawei.mapper.GuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = "guests")
//通过CacheConfig可以将一些相同的属性值抽取出来
public class GuestService implements com.jiangjiawei.service.GuestService {

    @Autowired
    private GuestMapper guestMapper;

    @Override
    public List<Guest> list() {
        //查询所有的嘉宾
        return guestMapper.getGuests();
    }

    @Override
    @Cacheable(/*cacheNames = "guests",*/key = "#id",condition = "#id>1")
    //缓存的名称，在 spring 配置文件 中定义，必须指定至少一个
    // condition 表示条件，满足条件缓存
    // unless 表示缓存不生效的条件
    public Guest getGuestById(int id) {
        System.out.println("查询"+id+"号嘉宾");
        return guestMapper.getGuestsById(id);
    }

    /**
     * 这里要设置@CachePut和@Cacheable两个注解的key要一致
     * 法一：将key设置为参数的id          "#guest.id"
     * 法二：将key设置为结果返回值的id    "#result.id"
     * @param guest
     * @return
     */
    @Override
    @CachePut(/*cacheNames = "guests",*/key = "#result.id")
    public Guest updateGuest(Guest guest) {
        System.out.println("更新"+guest.getId()+"号嘉宾");
        guestMapper.updateGuest(guest);
        return guest;
    }

    @Override
    @CacheEvict(/*cacheNames = "guests",*/key = "#id")
    //从缓存中删除对应的缓存信息
    public void deleteGuest(int id) {
        System.out.println("删除"+id+"号嘉宾");
        guestMapper.deleteGuest(id);
    }

    @Override
    @CacheEvict(/*cacheNames = "guests",*/allEntries = true)
    // @CacheEvict 独有注解
    // allEntries 清楚所有的缓存
    // beforeInvocation 表示在方法执行之前执行删除缓存操作，默认为false，即为方法执行后执行删除缓存
    public void deleteAll() {
        System.out.println("删除所有嘉宾");
        guestMapper.deleteAll();
    }


}
