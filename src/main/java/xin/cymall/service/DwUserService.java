package xin.cymall.service;


import xin.cymall.entity.DwUser;

public interface DwUserService {
    /**
     *根据用户名查找
     * @return
     */
    DwUser selectByUserName(String username);
}
