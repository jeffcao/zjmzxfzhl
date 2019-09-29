package com.zjmzxfzhl.modules.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zjmzxfzhl.modules.sys.entity.SysRoleUser;

/**
 * 角色和用户关系Mapper
 * 
 * @author 庄金明
 */
public interface SysRoleUserMapper extends BaseMapper<SysRoleUser> {
	public List<SysRoleUser> list(IPage<SysRoleUser> page, @Param("entity") SysRoleUser entity);
}