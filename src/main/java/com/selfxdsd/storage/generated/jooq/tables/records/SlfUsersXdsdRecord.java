/*
 * This file is generated by jOOQ.
 */
package com.selfxdsd.storage.generated.jooq.tables.records;


import com.selfxdsd.storage.generated.jooq.tables.SlfUsersXdsd;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SlfUsersXdsdRecord extends UpdatableRecordImpl<SlfUsersXdsdRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = -1894317345;

    /**
     * Setter for <code>self_xdsd.slf_users_xdsd.username</code>.
     */
    public void setUsername(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>self_xdsd.slf_users_xdsd.username</code>.
     */
    public String getUsername() {
        return (String) get(0);
    }

    /**
     * Setter for <code>self_xdsd.slf_users_xdsd.role</code>.
     */
    public void setRole(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>self_xdsd.slf_users_xdsd.role</code>.
     */
    public String getRole() {
        return (String) get(1);
    }

    /**
     * Setter for <code>self_xdsd.slf_users_xdsd.provider</code>.
     */
    public void setProvider(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>self_xdsd.slf_users_xdsd.provider</code>.
     */
    public String getProvider() {
        return (String) get(2);
    }

    /**
     * Setter for <code>self_xdsd.slf_users_xdsd.email</code>.
     */
    public void setEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>self_xdsd.slf_users_xdsd.email</code>.
     */
    public String getEmail() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SlfUsersXdsd.SLF_USERS_XDSD.USERNAME;
    }

    @Override
    public Field<String> field2() {
        return SlfUsersXdsd.SLF_USERS_XDSD.ROLE;
    }

    @Override
    public Field<String> field3() {
        return SlfUsersXdsd.SLF_USERS_XDSD.PROVIDER;
    }

    @Override
    public Field<String> field4() {
        return SlfUsersXdsd.SLF_USERS_XDSD.EMAIL;
    }

    @Override
    public String component1() {
        return getUsername();
    }

    @Override
    public String component2() {
        return getRole();
    }

    @Override
    public String component3() {
        return getProvider();
    }

    @Override
    public String component4() {
        return getEmail();
    }

    @Override
    public String value1() {
        return getUsername();
    }

    @Override
    public String value2() {
        return getRole();
    }

    @Override
    public String value3() {
        return getProvider();
    }

    @Override
    public String value4() {
        return getEmail();
    }

    @Override
    public SlfUsersXdsdRecord value1(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public SlfUsersXdsdRecord value2(String value) {
        setRole(value);
        return this;
    }

    @Override
    public SlfUsersXdsdRecord value3(String value) {
        setProvider(value);
        return this;
    }

    @Override
    public SlfUsersXdsdRecord value4(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public SlfUsersXdsdRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SlfUsersXdsdRecord
     */
    public SlfUsersXdsdRecord() {
        super(SlfUsersXdsd.SLF_USERS_XDSD);
    }

    /**
     * Create a detached, initialised SlfUsersXdsdRecord
     */
    public SlfUsersXdsdRecord(String username, String role, String provider, String email) {
        super(SlfUsersXdsd.SLF_USERS_XDSD);

        set(0, username);
        set(1, role);
        set(2, provider);
        set(3, email);
    }
}
