package cn.nesc.general.demo1.mapper.custom;


import cn.nesc.general.core.mybatis.Pager;
import cn.nesc.general.demo1.model.OrderBO;

import java.util.List;


public interface Demo1Mapper
{
	public List<OrderBO> orderPageQuery(Pager pager);

}