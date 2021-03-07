/*
 * This file is generated by jOOQ.
 */
package com.selfxdsd.storage.generated.jooq.tables.records;


import com.selfxdsd.storage.generated.jooq.tables.SldPaymentsXdsd;

import java.math.BigInteger;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SldPaymentsXdsdRecord extends UpdatableRecordImpl<SldPaymentsXdsdRecord> implements Record6<Integer, String, LocalDateTime, BigInteger, String, String> {

    private static final long serialVersionUID = 1046390145;

    /**
     * Setter for <code>self_xdsd.sld_payments_xdsd.invoiceId</code>.
     */
    public void setInvoiceid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>self_xdsd.sld_payments_xdsd.invoiceId</code>.
     */
    public Integer getInvoiceid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>self_xdsd.sld_payments_xdsd.transactionId</code>.
     */
    public void setTransactionid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>self_xdsd.sld_payments_xdsd.transactionId</code>.
     */
    public String getTransactionid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>self_xdsd.sld_payments_xdsd.payment_timestamp</code>.
     */
    public void setPaymentTimestamp(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>self_xdsd.sld_payments_xdsd.payment_timestamp</code>.
     */
    public LocalDateTime getPaymentTimestamp() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>self_xdsd.sld_payments_xdsd.value</code>.
     */
    public void setValue(BigInteger value) {
        set(3, value);
    }

    /**
     * Getter for <code>self_xdsd.sld_payments_xdsd.value</code>.
     */
    public BigInteger getValue() {
        return (BigInteger) get(3);
    }

    /**
     * Setter for <code>self_xdsd.sld_payments_xdsd.status</code>.
     */
    public void setStatus(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>self_xdsd.sld_payments_xdsd.status</code>.
     */
    public String getStatus() {
        return (String) get(4);
    }

    /**
     * Setter for <code>self_xdsd.sld_payments_xdsd.failReason</code>.
     */
    public void setFailreason(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>self_xdsd.sld_payments_xdsd.failReason</code>.
     */
    public String getFailreason() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<Integer, String, LocalDateTime> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, LocalDateTime, BigInteger, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, String, LocalDateTime, BigInteger, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return SldPaymentsXdsd.SLD_PAYMENTS_XDSD.INVOICEID;
    }

    @Override
    public Field<String> field2() {
        return SldPaymentsXdsd.SLD_PAYMENTS_XDSD.TRANSACTIONID;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return SldPaymentsXdsd.SLD_PAYMENTS_XDSD.PAYMENT_TIMESTAMP;
    }

    @Override
    public Field<BigInteger> field4() {
        return SldPaymentsXdsd.SLD_PAYMENTS_XDSD.VALUE;
    }

    @Override
    public Field<String> field5() {
        return SldPaymentsXdsd.SLD_PAYMENTS_XDSD.STATUS;
    }

    @Override
    public Field<String> field6() {
        return SldPaymentsXdsd.SLD_PAYMENTS_XDSD.FAILREASON;
    }

    @Override
    public Integer component1() {
        return getInvoiceid();
    }

    @Override
    public String component2() {
        return getTransactionid();
    }

    @Override
    public LocalDateTime component3() {
        return getPaymentTimestamp();
    }

    @Override
    public BigInteger component4() {
        return getValue();
    }

    @Override
    public String component5() {
        return getStatus();
    }

    @Override
    public String component6() {
        return getFailreason();
    }

    @Override
    public Integer value1() {
        return getInvoiceid();
    }

    @Override
    public String value2() {
        return getTransactionid();
    }

    @Override
    public LocalDateTime value3() {
        return getPaymentTimestamp();
    }

    @Override
    public BigInteger value4() {
        return getValue();
    }

    @Override
    public String value5() {
        return getStatus();
    }

    @Override
    public String value6() {
        return getFailreason();
    }

    @Override
    public SldPaymentsXdsdRecord value1(Integer value) {
        setInvoiceid(value);
        return this;
    }

    @Override
    public SldPaymentsXdsdRecord value2(String value) {
        setTransactionid(value);
        return this;
    }

    @Override
    public SldPaymentsXdsdRecord value3(LocalDateTime value) {
        setPaymentTimestamp(value);
        return this;
    }

    @Override
    public SldPaymentsXdsdRecord value4(BigInteger value) {
        setValue(value);
        return this;
    }

    @Override
    public SldPaymentsXdsdRecord value5(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public SldPaymentsXdsdRecord value6(String value) {
        setFailreason(value);
        return this;
    }

    @Override
    public SldPaymentsXdsdRecord values(Integer value1, String value2, LocalDateTime value3, BigInteger value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SldPaymentsXdsdRecord
     */
    public SldPaymentsXdsdRecord() {
        super(SldPaymentsXdsd.SLD_PAYMENTS_XDSD);
    }

    /**
     * Create a detached, initialised SldPaymentsXdsdRecord
     */
    public SldPaymentsXdsdRecord(Integer invoiceid, String transactionid, LocalDateTime paymentTimestamp, BigInteger value, String status, String failreason) {
        super(SldPaymentsXdsd.SLD_PAYMENTS_XDSD);

        set(0, invoiceid);
        set(1, transactionid);
        set(2, paymentTimestamp);
        set(3, value);
        set(4, status);
        set(5, failreason);
    }
}
