package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.GJcDao;
import xin.cymall.entity.GJc;
import xin.cymall.service.GJcService;




@Service("gJcService")
@Transactional
public class GJcServiceImpl implements GJcService {
	@Autowired
	private GJcDao gJcDao;

	@Override
	public GJc get(String id){
		return gJcDao.get(id);
	}

	@Override
	public List<GJc> getList(Map<String, Object> map){

		return gJcDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return gJcDao.getCount(map);
	}

	@Override
	public void save(GJc gJc){
		gJcDao.save(gJc);
	}

	@Override
	public void update(GJc gJc){
		String status = gJc.getStatus();
		if (status.equals("G系统退回")) {
			status = "-1";
		}
		if (status.equals("已保存")) {
			status = "2";
		}
		if (status.equals("待入账")) {
			status = "3";
		}
		if (status.equals("已记账")) {
			status = "4";
		}
		if (status.equals("G系统正在处理中")) {
			status = "5";
		}
		gJc.setStatus(status);
		gJcDao.update(gJc);
	}

	@Override
	public void delete(String id){
		gJcDao.delete(id);
	}

	@Override
	public void deleteBatch(String[] ids){
		gJcDao.deleteBatch(ids);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			GJc gJc=get(id);
//			gJc.setState(stateValue);
            update(gJc);
        }
    }

}
