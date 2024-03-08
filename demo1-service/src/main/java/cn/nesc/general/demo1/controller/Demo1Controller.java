package cn.nesc.general.demo1.controller;


import cn.nesc.general.client.controller.ClientBaseController;
import cn.nesc.general.core.bean.AclUserBean;
import cn.nesc.general.core.exception.JsonException;
import cn.nesc.general.demo1.mapperconvertor.Demo1MapperConvertor;
import cn.nesc.general.demo1.model.OrderDTO;
import cn.nesc.general.demo1.service.Demo1Service;
import cn.nesc.general.stub.authcenter.AuthCenterStub;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@Slf4j
@RequestMapping("order")
public class Demo1Controller extends ClientBaseController
{

    @Resource
    private Demo1Service demo1Service;

    @Resource
    private Demo1MapperConvertor demo1MapperConvertor;

    @Resource
    private AuthCenterStub authCenterStub;

    @PostMapping(value = "/createOrder")
    public Boolean createOrder(OrderDTO orderDTO) throws JsonException
    {
        try
        {
//            System.out.println(1/0);
            AclUserBean loginUser = getLoginUser();
            cn.nesc.general.authcenter.model.TmUserVO userVO = authCenterStub.getUserInfoById(loginUser.getUserId());
            log.debug("userVO ========> " + userVO.getUserName());
            log.debug("loginUser ======>" + loginUser);
            return true;
        }
        catch (Exception e)
        {
            log.error(e.getMessage(), e);
            throw new JsonException(e.getMessage(), e);
        }
    }
}
