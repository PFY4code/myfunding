package com.firenay.leave.service.api;

import com.firenay.leave.Menu;

import java.util.List;


public interface MenuService {

	/**
	 * 获取所有节点
	 */
	List<Menu> getAll();

	void saveMenu(Menu menu);

	void updateMenu(Menu menu);

	void removeMenu(Integer id);

}
