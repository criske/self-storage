/*
 * This file is generated by jOOQ.
 */
package com.selfxdsd.storage.generated.jooq.tables;


import com.selfxdsd.storage.generated.jooq.Keys;
import com.selfxdsd.storage.generated.jooq.SelfXdsd;
import com.selfxdsd.storage.generated.jooq.tables.records.SlfJsonstorageXdsdRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class SlfJsonstorageXdsd extends TableImpl<SlfJsonstorageXdsdRecord> {

    private static final long serialVersionUID = -188559250;

    /**
     * The reference instance of <code>self_xdsd.slf_jsonstorage_xdsd</code>
     */
    public static final SlfJsonstorageXdsd SLF_JSONSTORAGE_XDSD = new SlfJsonstorageXdsd();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SlfJsonstorageXdsdRecord> getRecordType() {
        return SlfJsonstorageXdsdRecord.class;
    }

    /**
     * The column <code>self_xdsd.slf_jsonstorage_xdsd.url</code>.
     */
    public final TableField<SlfJsonstorageXdsdRecord, String> URL = createField(DSL.name("url"), org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false), this, "");

    /**
     * The column <code>self_xdsd.slf_jsonstorage_xdsd.etag</code>.
     */
    public final TableField<SlfJsonstorageXdsdRecord, String> ETAG = createField(DSL.name("etag"), org.jooq.impl.SQLDataType.VARCHAR(2048).nullable(false), this, "");

    /**
     * The column <code>self_xdsd.slf_jsonstorage_xdsd.jsonBody</code>.
     */
    public final TableField<SlfJsonstorageXdsdRecord, String> JSONBODY = createField(DSL.name("jsonBody"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>self_xdsd.slf_jsonstorage_xdsd</code> table reference
     */
    public SlfJsonstorageXdsd() {
        this(DSL.name("slf_jsonstorage_xdsd"), null);
    }

    /**
     * Create an aliased <code>self_xdsd.slf_jsonstorage_xdsd</code> table reference
     */
    public SlfJsonstorageXdsd(String alias) {
        this(DSL.name(alias), SLF_JSONSTORAGE_XDSD);
    }

    /**
     * Create an aliased <code>self_xdsd.slf_jsonstorage_xdsd</code> table reference
     */
    public SlfJsonstorageXdsd(Name alias) {
        this(alias, SLF_JSONSTORAGE_XDSD);
    }

    private SlfJsonstorageXdsd(Name alias, Table<SlfJsonstorageXdsdRecord> aliased) {
        this(alias, aliased, null);
    }

    private SlfJsonstorageXdsd(Name alias, Table<SlfJsonstorageXdsdRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> SlfJsonstorageXdsd(Table<O> child, ForeignKey<O, SlfJsonstorageXdsdRecord> key) {
        super(child, key, SLF_JSONSTORAGE_XDSD);
    }

    @Override
    public Schema getSchema() {
        return SelfXdsd.SELF_XDSD;
    }

    @Override
    public UniqueKey<SlfJsonstorageXdsdRecord> getPrimaryKey() {
        return Keys.KEY_SLF_JSONSTORAGE_XDSD_PRIMARY;
    }

    @Override
    public List<UniqueKey<SlfJsonstorageXdsdRecord>> getKeys() {
        return Arrays.<UniqueKey<SlfJsonstorageXdsdRecord>>asList(Keys.KEY_SLF_JSONSTORAGE_XDSD_PRIMARY);
    }

    @Override
    public SlfJsonstorageXdsd as(String alias) {
        return new SlfJsonstorageXdsd(DSL.name(alias), this);
    }

    @Override
    public SlfJsonstorageXdsd as(Name alias) {
        return new SlfJsonstorageXdsd(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SlfJsonstorageXdsd rename(String name) {
        return new SlfJsonstorageXdsd(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SlfJsonstorageXdsd rename(Name name) {
        return new SlfJsonstorageXdsd(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
