/**
 * Copyright (C), 2015-2023, 东北证券股份有限公司
 * FileName: RoleManagerConvertor
 * Author:   summer
 * Date:     2023/2/27 14:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 **/

package cn.nesc.general.demo1.mapperconvertor;


import cn.nesc.general.demo1.model.OrderBO;
import cn.nesc.general.demo1.model.OrderDTO;
import cn.nesc.general.demo1.model.OrderVO;
import cn.nesc.general.demo1.model.TtOrderPO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @ClassName RoleManagerConvertor
 * @Description
 * @Author summer
 * @Date 2023/2/27 14:25
 **/
@Mapper(componentModel = "spring")
public interface Demo1MapperConvertor
{
    /**
     *  分页查询列表转换
     **/
    List<OrderVO> toOrderPageQuery(List<OrderBO> orderBOList);

    /**
     *  PO BO DTO VO 基础类型转换
     **/
    OrderBO toOderBO(TtOrderPO orderPO);

    OrderDTO toOrderDTO(TtOrderPO orderPO);
    @Mapping(source = "orderPO.orderStatus", target = "orderStatus")
    OrderVO toOrderVO(TtOrderPO orderPO);
    @Mapping(source = "orderBO.orderStatus", target = "orderStatus")
    OrderVO toOrderVOFromBO(OrderBO orderBO);

    /**
     *  转换为PO
     **/
    TtOrderPO createOrderFromDTO(OrderDTO orderDTO);

}
