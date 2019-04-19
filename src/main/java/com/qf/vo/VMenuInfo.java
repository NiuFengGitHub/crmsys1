package com.qf.vo;

import java.util.List;

public class VMenuInfo {
	private Integer id;
	private String menuName;
	private String url;
	//子菜单
	private List<VMenuInfo> menuList;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<VMenuInfo> getMenuList() {
		return menuList;
	}
	public void setMenuList(List<VMenuInfo> menuList) {
		this.menuList = menuList;
	}
	
}
