/**
 * Copyright (C), 2015-2023, 东北证券股份有限公司
 * FileName: Demo1ServiceImpl
 * Author:   summer
 * Date:     2023/3/10 15:28
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 **/

package cn.nesc.general.demo1.service.impl;


import cn.nesc.general.core.bean.AclUserBean;
import cn.nesc.general.core.bean.PageResult;
import cn.nesc.general.core.exception.DAOException;
import cn.nesc.general.core.exception.ServiceException;
import cn.nesc.general.core.mybatis.PageQueryBuilder;
import cn.nesc.general.demo1.dictionary.Fixcode;
import cn.nesc.general.demo1.mapper.TtOrderPOMapper;
import cn.nesc.general.demo1.mapper.custom.Demo1Mapper;
import cn.nesc.general.demo1.mapperconvertor.Demo1MapperConvertor;
import cn.nesc.general.demo1.model.OrderBO;
import cn.nesc.general.demo1.model.OrderDTO;
import cn.nesc.general.demo1.model.TtOrderPO;
import cn.nesc.general.demo1.service.Demo1Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @ClassName Demo1ServiceImpl
 * @Description
 * @Author summer
 * @Date 2023/3/10 15:28
 **/
@Service
@Slf4j
public class Demo1ServiceImpl implements Demo1Service
{
    @Resource
    private Demo1Mapper demo1Mapper;

    @Resource
    private TtOrderPOMapper ttOrderPOMapper;

    @Resource
    private Demo1MapperConvertor demo1MapperConvertor;

    @Override
    public PageResult<OrderBO> orderPageQuery(OrderDTO condition, int limt, int curPage) throws ServiceException
    {
        try
        {
            return PageQueryBuilder.pageQuery(demo1Mapper, "orderPageQuery", condition, curPage, limt);
        }
        catch (DAOException e)
        {
            throw new ServiceException(e.getMessage(), e);
        }
    }

    @Override
    public Boolean createOrder(OrderDTO orderDTO, AclUserBean loginUser) throws ServiceException
    {
        try
        {
            TtOrderPO orderPO = demo1MapperConvertor.createOrderFromDTO(orderDTO);
            orderPO.setOrderId(Fixcode.IF_TYPE_NO.getCode());
            orderPO.setOrderStatus(Fixcode.STATUS_ENABLE.getCode());
            orderPO.setCreateBy(loginUser.getUserCode());
            orderPO.setCreateDate(new Date());
            int count = ttOrderPOMapper.insertSelective(orderPO);
            return count > 0;
        }
        catch (Exception e)
        {
            throw new ServiceException(e.getMessage(), e);
        }
    }

    @Override
    public Boolean deleteOrderById(Integer orderId, AclUserBean loginUser) throws ServiceException
    {
        try
        {
            TtOrderPO cond = new TtOrderPO();
            cond.setOrderId(orderId);
            cond.setIsDelete(Fixcode.IF_TYPE_YES.getCode());
            cond.setUpdateBy(loginUser.getUserCode());
            cond.setUpdateDate(new Date());
            int count = ttOrderPOMapper.updateByPrimaryKeySelective(cond);
            return count > 0;
        }
        catch (Exception e)
        {
            throw new ServiceException(e.getMessage(), e);
        }
    }
}
