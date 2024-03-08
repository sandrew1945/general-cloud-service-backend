package cn.nesc.general.demo1.service;


import cn.nesc.general.core.bean.AclUserBean;
import cn.nesc.general.core.bean.PageResult;
import cn.nesc.general.core.exception.ServiceException;
import cn.nesc.general.demo1.model.OrderBO;
import cn.nesc.general.demo1.model.OrderDTO;


/**
 * Function    : 
 * @author     : zhao.feng
 * CreateDate  : 2010-11-5
 * @version    :
 */
public interface Demo1Service
{

	/**
	 *  分页查询订单
	 * @param condition
	 * @return
	 * @throws ServiceException
	 */
	PageResult<OrderBO> orderPageQuery(OrderDTO condition, int limit, int curPage) throws ServiceException;

	/**
	 * @Author summer
	 * @Description 创建订单
	 * @Date 14:56 2023/3/10
	 * @Param [orderDTO]
	 * @return java.lang.Boolean
	 **/
	Boolean createOrder(OrderDTO orderDTO, AclUserBean loginUser) throws ServiceException;

	/**
	 * @Author summer
	 * @Description 根据id删除订单
	 * @Date 14:56 2023/3/10
	 * @Param [orderId]
	 * @return java.lang.Boolean
	 **/
	Boolean deleteOrderById(Integer orderId, AclUserBean loginUser) throws ServiceException;
}
