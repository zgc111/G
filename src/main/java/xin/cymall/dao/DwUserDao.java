package xin.cymall.dao;


import xin.cymall.entity.DwUser;

public interface DwUserDao {

    /**
     *根据用户名查找
     * @return
     */
    DwUser selectByUserName(String username);

}
