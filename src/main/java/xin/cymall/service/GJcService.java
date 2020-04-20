package xin.cymall.service;

import xin.cymall.entity.GJc;

import java.util.List;
import java.util.Map;

/**
 *
 *
 */
public interface GJcService {

	GJc get(String id);

	List<GJc> getList(Map<String, Object> map);

	int getCount(Map<String, Object> map);

	void save(GJc gJc);

	void update(GJc gJc);

	void delete(String id);

	void deleteBatch(String[] ids);

    void updateState(String[] ids, String stateValue);
}
