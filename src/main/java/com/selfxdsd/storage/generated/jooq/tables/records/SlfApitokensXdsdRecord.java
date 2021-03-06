/*
 * This file is generated by jOOQ.
 */
package com.selfxdsd.storage.generated.jooq.tables.records;


import com.selfxdsd.storage.generated.jooq.tables.SlfApitokensXdsd;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SlfApitokensXdsdRecord extends UpdatableRecordImpl<SlfApitokensXdsdRecord> implements Record5<String, LocalDateTime, String, String, String> {

    private static final long serialVersionUID = -1447542101;

    /**
     * Setter for <code>self_xdsd.slf_apitokens_xdsd.token</code>.
     */
    public void setToken(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>self_xdsd.slf_apitokens_xdsd.token</code>.
     */
    public String getToken() {
        return (String) get(0);
    }

    /**
     * Setter for <code>self_xdsd.slf_apitokens_xdsd.expiresAt</code>.
     */
    public void setExpiresat(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>self_xdsd.slf_apitokens_xdsd.expiresAt</code>.
     */
    public LocalDateTime getExpiresat() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>self_xdsd.slf_apitokens_xdsd.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>self_xdsd.slf_apitokens_xdsd.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>self_xdsd.slf_apitokens_xdsd.username</code>.
     */
    public void setUsername(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>self_xdsd.slf_apitokens_xdsd.username</code>.
     */
    public String getUsername() {
        return (String) get(3);
    }

    /**
     * Setter for <code>self_xdsd.slf_apitokens_xdsd.provider</code>.
     */
    public void setProvider(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>self_xdsd.slf_apitokens_xdsd.provider</code>.
     */
    public String getProvider() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, LocalDateTime, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, LocalDateTime, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SlfApitokensXdsd.SLF_APITOKENS_XDSD.TOKEN;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return SlfApitokensXdsd.SLF_APITOKENS_XDSD.EXPIRESAT;
    }

    @Override
    public Field<String> field3() {
        return SlfApitokensXdsd.SLF_APITOKENS_XDSD.NAME;
    }

    @Override
    public Field<String> field4() {
        return SlfApitokensXdsd.SLF_APITOKENS_XDSD.USERNAME;
    }

    @Override
    public Field<String> field5() {
        return SlfApitokensXdsd.SLF_APITOKENS_XDSD.PROVIDER;
    }

    @Override
    public String component1() {
        return getToken();
    }

    @Override
    public LocalDateTime component2() {
        return getExpiresat();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getUsername();
    }

    @Override
    public String component5() {
        return getProvider();
    }

    @Override
    public String value1() {
        return getToken();
    }

    @Override
    public LocalDateTime value2() {
        return getExpiresat();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getUsername();
    }

    @Override
    public String value5() {
        return getProvider();
    }

    @Override
    public SlfApitokensXdsdRecord value1(String value) {
        setToken(value);
        return this;
    }

    @Override
    public SlfApitokensXdsdRecord value2(LocalDateTime value) {
        setExpiresat(value);
        return this;
    }

    @Override
    public SlfApitokensXdsdRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public SlfApitokensXdsdRecord value4(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public SlfApitokensXdsdRecord value5(String value) {
        setProvider(value);
        return this;
    }

    @Override
    public SlfApitokensXdsdRecord values(String value1, LocalDateTime value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SlfApitokensXdsdRecord
     */
    public SlfApitokensXdsdRecord() {
        super(SlfApitokensXdsd.SLF_APITOKENS_XDSD);
    }

    /**
     * Create a detached, initialised SlfApitokensXdsdRecord
     */
    public SlfApitokensXdsdRecord(String token, LocalDateTime expiresat, String name, String username, String provider) {
        super(SlfApitokensXdsd.SLF_APITOKENS_XDSD);

        set(0, token);
        set(1, expiresat);
        set(2, name);
        set(3, username);
        set(4, provider);
    }
}
