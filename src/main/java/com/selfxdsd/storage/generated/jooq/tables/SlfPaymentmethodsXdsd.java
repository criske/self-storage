/*
 * This file is generated by jOOQ.
 */
package com.selfxdsd.storage.generated.jooq.tables;


import com.selfxdsd.storage.generated.jooq.Indexes;
import com.selfxdsd.storage.generated.jooq.Keys;
import com.selfxdsd.storage.generated.jooq.SelfXdsd;
import com.selfxdsd.storage.generated.jooq.tables.records.SlfPaymentmethodsXdsdRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SlfPaymentmethodsXdsd extends TableImpl<SlfPaymentmethodsXdsdRecord> {

    private static final long serialVersionUID = 1585532633;

    /**
     * The reference instance of <code>self_xdsd.slf_paymentmethods_xdsd</code>
     */
    public static final SlfPaymentmethodsXdsd SLF_PAYMENTMETHODS_XDSD = new SlfPaymentmethodsXdsd();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SlfPaymentmethodsXdsdRecord> getRecordType() {
        return SlfPaymentmethodsXdsdRecord.class;
    }

    /**
     * The column <code>self_xdsd.slf_paymentmethods_xdsd.paymentMethodId</code>.
     */
    public final TableField<SlfPaymentmethodsXdsdRecord, Integer> PAYMENTMETHODID = createField(DSL.name("paymentMethodId"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>self_xdsd.slf_paymentmethods_xdsd.repo_fullname</code>.
     */
    public final TableField<SlfPaymentmethodsXdsdRecord, String> REPO_FULLNAME = createField(DSL.name("repo_fullname"), org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * The column <code>self_xdsd.slf_paymentmethods_xdsd.provider</code>.
     */
    public final TableField<SlfPaymentmethodsXdsdRecord, String> PROVIDER = createField(DSL.name("provider"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>self_xdsd.slf_paymentmethods_xdsd.type</code>.
     */
    public final TableField<SlfPaymentmethodsXdsdRecord, String> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>self_xdsd.slf_paymentmethods_xdsd.identifier</code>.
     */
    public final TableField<SlfPaymentmethodsXdsdRecord, String> IDENTIFIER = createField(DSL.name("identifier"), org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * The column <code>self_xdsd.slf_paymentmethods_xdsd.active</code>.
     */
    public final TableField<SlfPaymentmethodsXdsdRecord, Boolean> ACTIVE = createField(DSL.name("active"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * Create a <code>self_xdsd.slf_paymentmethods_xdsd</code> table reference
     */
    public SlfPaymentmethodsXdsd() {
        this(DSL.name("slf_paymentmethods_xdsd"), null);
    }

    /**
     * Create an aliased <code>self_xdsd.slf_paymentmethods_xdsd</code> table reference
     */
    public SlfPaymentmethodsXdsd(String alias) {
        this(DSL.name(alias), SLF_PAYMENTMETHODS_XDSD);
    }

    /**
     * Create an aliased <code>self_xdsd.slf_paymentmethods_xdsd</code> table reference
     */
    public SlfPaymentmethodsXdsd(Name alias) {
        this(alias, SLF_PAYMENTMETHODS_XDSD);
    }

    private SlfPaymentmethodsXdsd(Name alias, Table<SlfPaymentmethodsXdsdRecord> aliased) {
        this(alias, aliased, null);
    }

    private SlfPaymentmethodsXdsd(Name alias, Table<SlfPaymentmethodsXdsdRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> SlfPaymentmethodsXdsd(Table<O> child, ForeignKey<O, SlfPaymentmethodsXdsdRecord> key) {
        super(child, key, SLF_PAYMENTMETHODS_XDSD);
    }

    @Override
    public Schema getSchema() {
        return SelfXdsd.SELF_XDSD;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SLF_PAYMENTMETHODS_XDSD_WALLETFK);
    }

    @Override
    public Identity<SlfPaymentmethodsXdsdRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SLF_PAYMENTMETHODS_XDSD;
    }

    @Override
    public UniqueKey<SlfPaymentmethodsXdsdRecord> getPrimaryKey() {
        return Keys.KEY_SLF_PAYMENTMETHODS_XDSD_PRIMARY;
    }

    @Override
    public List<UniqueKey<SlfPaymentmethodsXdsdRecord>> getKeys() {
        return Arrays.<UniqueKey<SlfPaymentmethodsXdsdRecord>>asList(Keys.KEY_SLF_PAYMENTMETHODS_XDSD_PRIMARY);
    }

    @Override
    public List<ForeignKey<SlfPaymentmethodsXdsdRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SlfPaymentmethodsXdsdRecord, ?>>asList(Keys.WALLETFK);
    }

    public SlfWalletsXdsd slfWalletsXdsd() {
        return new SlfWalletsXdsd(this, Keys.WALLETFK);
    }

    @Override
    public SlfPaymentmethodsXdsd as(String alias) {
        return new SlfPaymentmethodsXdsd(DSL.name(alias), this);
    }

    @Override
    public SlfPaymentmethodsXdsd as(Name alias) {
        return new SlfPaymentmethodsXdsd(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SlfPaymentmethodsXdsd rename(String name) {
        return new SlfPaymentmethodsXdsd(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SlfPaymentmethodsXdsd rename(Name name) {
        return new SlfPaymentmethodsXdsd(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, String, String, Boolean> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
