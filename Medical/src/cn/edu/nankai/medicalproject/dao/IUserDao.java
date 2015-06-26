package cn.edu.nankai.medicalproject.dao;

import cn.edu.nankai.medicalproject.po.User;

public interface IUserDao {
	public abstract User selectById(final String name);

}
