/**
 * Copyright (C), 2015-2023, 东北证券股份有限公司
 * FileName: OrderBO
 * Author:   summer
 * Date:     2023/3/10 14:51
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 **/

package cn.nesc.general.demo1.model;

import cn.nesc.general.core.bean.BO;
import lombok.Data;

/**
 * @ClassName OrderBO
 * @Description
 * @Author summer
 * @Date 2023/3/10 14:51
 **/
@Data
public class OrderBO implements BO
{
    private Integer orderId;

    private String orderNo;

    private String orderName;

    private Integer orderStatus;
}
