package xin.cymall.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.cymall.dao.DwUserDao;
import xin.cymall.entity.DwUser;
import xin.cymall.service.DwUserService;

@Service
public class DwUserServiceImpl implements DwUserService {

    @Autowired
    DwUserDao dwUserDao;

    @Override
    public DwUser selectByUserName(String username) {
       return dwUserDao.selectByUserName(username);
    }
}
