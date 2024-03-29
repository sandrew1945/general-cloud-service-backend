package cn.nesc.general.demo1.model;

import java.io.Serializable;
import java.util.Date;

public class TtOrderPO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_order.order_id
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    private Integer orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_order.order_no
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    private String orderNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_order.order_name
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    private String orderName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_order.order_status
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    private Integer orderStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_order.is_delete
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    private Integer isDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_order.create_by
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_order.create_date
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_order.update_by
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    private String updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_order.update_date
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tt_order
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_order.order_id
     *
     * @return the value of tt_order.order_id
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_order.order_id
     *
     * @param orderId the value for tt_order.order_id
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_order.order_no
     *
     * @return the value of tt_order.order_no
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_order.order_no
     *
     * @param orderNo the value for tt_order.order_no
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_order.order_name
     *
     * @return the value of tt_order.order_name
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    public String getOrderName() {
        return orderName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_order.order_name
     *
     * @param orderName the value for tt_order.order_name
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_order.order_status
     *
     * @return the value of tt_order.order_status
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_order.order_status
     *
     * @param orderStatus the value for tt_order.order_status
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_order.is_delete
     *
     * @return the value of tt_order.is_delete
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_order.is_delete
     *
     * @param isDelete the value for tt_order.is_delete
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_order.create_by
     *
     * @return the value of tt_order.create_by
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_order.create_by
     *
     * @param createBy the value for tt_order.create_by
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_order.create_date
     *
     * @return the value of tt_order.create_date
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_order.create_date
     *
     * @param createDate the value for tt_order.create_date
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_order.update_by
     *
     * @return the value of tt_order.update_by
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_order.update_by
     *
     * @param updateBy the value for tt_order.update_by
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_order.update_date
     *
     * @return the value of tt_order.update_date
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_order.update_date
     *
     * @param updateDate the value for tt_order.update_date
     *
     * @mbg.generated Fri Mar 10 15:25:38 CST 2023
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}