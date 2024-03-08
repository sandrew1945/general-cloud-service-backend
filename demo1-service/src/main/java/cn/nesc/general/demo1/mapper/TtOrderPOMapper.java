package cn.nesc.general.demo1.mapper;

import cn.nesc.general.demo1.model.TtOrderPO;
import cn.nesc.general.demo1.model.TtOrderPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TtOrderPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_order
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    long countByExample(TtOrderPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_order
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    int deleteByExample(TtOrderPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_order
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    int deleteByPrimaryKey(Integer orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_order
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    int insert(TtOrderPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_order
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    int insertSelective(TtOrderPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_order
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    List<TtOrderPO> selectByExample(TtOrderPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_order
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    TtOrderPO selectByPrimaryKey(Integer orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_order
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    int updateByExampleSelective(@Param("record") TtOrderPO record, @Param("example") TtOrderPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_order
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    int updateByExample(@Param("record") TtOrderPO record, @Param("example") TtOrderPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_order
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    int updateByPrimaryKeySelective(TtOrderPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_order
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    int updateByPrimaryKey(TtOrderPO record);
}