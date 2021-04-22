/*
 * This file is generated by jOOQ.
 */
package com.selfxdsd.storage.generated.jooq.tables;


import com.selfxdsd.storage.generated.jooq.Indexes;
import com.selfxdsd.storage.generated.jooq.Keys;
import com.selfxdsd.storage.generated.jooq.SelfXdsd;
import com.selfxdsd.storage.generated.jooq.tables.records.SlfPlatforminvoicesXdsdRecord;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
public class SlfPlatforminvoicesXdsd extends TableImpl<SlfPlatforminvoicesXdsdRecord> {

    private static final long serialVersionUID = -1907070898;

    /**
     * The reference instance of <code>self_xdsd.slf_platforminvoices_xdsd</code>
     */
    public static final SlfPlatforminvoicesXdsd SLF_PLATFORMINVOICES_XDSD = new SlfPlatforminvoicesXdsd();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SlfPlatforminvoicesXdsdRecord> getRecordType() {
        return SlfPlatforminvoicesXdsdRecord.class;
    }

    /**
     * The column <code>self_xdsd.slf_platforminvoices_xdsd.id</code>.
     */
    public final TableField<SlfPlatforminvoicesXdsdRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>self_xdsd.slf_platforminvoices_xdsd.createdAt</code>.
     */
    public final TableField<SlfPlatforminvoicesXdsdRecord, LocalDateTime> CREATEDAT = createField(DSL.name("createdAt"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>self_xdsd.slf_platforminvoices_xdsd.billedTo</code>.
     */
    public final TableField<SlfPlatforminvoicesXdsdRecord, String> BILLEDTO = createField(DSL.name("billedTo"), org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false), this, "");

    /**
     * The column <code>self_xdsd.slf_platforminvoices_xdsd.commission</code>.
     */
    public final TableField<SlfPlatforminvoicesXdsdRecord, BigInteger> COMMISSION = createField(DSL.name("commission"), org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(20).nullable(false), this, "");

    /**
     * The column <code>self_xdsd.slf_platforminvoices_xdsd.vat</code>.
     */
    public final TableField<SlfPlatforminvoicesXdsdRecord, BigInteger> VAT = createField(DSL.name("vat"), org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(20).nullable(false), this, "");

    /**
     * The column <code>self_xdsd.slf_platforminvoices_xdsd.transactionId</code>.
     */
    public final TableField<SlfPlatforminvoicesXdsdRecord, String> TRANSACTIONID = createField(DSL.name("transactionId"), org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * The column <code>self_xdsd.slf_platforminvoices_xdsd.payment_timestamp</code>.
     */
    public final TableField<SlfPlatforminvoicesXdsdRecord, LocalDateTime> PAYMENT_TIMESTAMP = createField(DSL.name("payment_timestamp"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>self_xdsd.slf_platforminvoices_xdsd.invoiceId</code>.
     */
    public final TableField<SlfPlatforminvoicesXdsdRecord, Integer> INVOICEID = createField(DSL.name("invoiceId"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>self_xdsd.slf_platforminvoices_xdsd.eurToRon</code>.
     */
    public final TableField<SlfPlatforminvoicesXdsdRecord, BigInteger> EURTORON = createField(DSL.name("eurToRon"), org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(20).nullable(false), this, "");

    /**
     * Create a <code>self_xdsd.slf_platforminvoices_xdsd</code> table reference
     */
    public SlfPlatforminvoicesXdsd() {
        this(DSL.name("slf_platforminvoices_xdsd"), null);
    }

    /**
     * Create an aliased <code>self_xdsd.slf_platforminvoices_xdsd</code> table reference
     */
    public SlfPlatforminvoicesXdsd(String alias) {
        this(DSL.name(alias), SLF_PLATFORMINVOICES_XDSD);
    }

    /**
     * Create an aliased <code>self_xdsd.slf_platforminvoices_xdsd</code> table reference
     */
    public SlfPlatforminvoicesXdsd(Name alias) {
        this(alias, SLF_PLATFORMINVOICES_XDSD);
    }

    private SlfPlatforminvoicesXdsd(Name alias, Table<SlfPlatforminvoicesXdsdRecord> aliased) {
        this(alias, aliased, null);
    }

    private SlfPlatforminvoicesXdsd(Name alias, Table<SlfPlatforminvoicesXdsdRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> SlfPlatforminvoicesXdsd(Table<O> child, ForeignKey<O, SlfPlatforminvoicesXdsdRecord> key) {
        super(child, key, SLF_PLATFORMINVOICES_XDSD);
    }

    @Override
    public Schema getSchema() {
        return SelfXdsd.SELF_XDSD;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SLF_PLATFORMINVOICES_XDSD_INVOICEFK);
    }

    @Override
    public Identity<SlfPlatforminvoicesXdsdRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SLF_PLATFORMINVOICES_XDSD;
    }

    @Override
    public UniqueKey<SlfPlatforminvoicesXdsdRecord> getPrimaryKey() {
        return Keys.KEY_SLF_PLATFORMINVOICES_XDSD_PRIMARY;
    }

    @Override
    public List<UniqueKey<SlfPlatforminvoicesXdsdRecord>> getKeys() {
        return Arrays.<UniqueKey<SlfPlatforminvoicesXdsdRecord>>asList(Keys.KEY_SLF_PLATFORMINVOICES_XDSD_PRIMARY);
    }

    @Override
    public List<ForeignKey<SlfPlatforminvoicesXdsdRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SlfPlatforminvoicesXdsdRecord, ?>>asList(Keys.INVOICEFK);
    }

    public SlfInvoicesXdsd slfInvoicesXdsd() {
        return new SlfInvoicesXdsd(this, Keys.INVOICEFK);
    }

    @Override
    public SlfPlatforminvoicesXdsd as(String alias) {
        return new SlfPlatforminvoicesXdsd(DSL.name(alias), this);
    }

    @Override
    public SlfPlatforminvoicesXdsd as(Name alias) {
        return new SlfPlatforminvoicesXdsd(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SlfPlatforminvoicesXdsd rename(String name) {
        return new SlfPlatforminvoicesXdsd(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SlfPlatforminvoicesXdsd rename(Name name) {
        return new SlfPlatforminvoicesXdsd(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, LocalDateTime, String, BigInteger, BigInteger, String, LocalDateTime, Integer, BigInteger> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
