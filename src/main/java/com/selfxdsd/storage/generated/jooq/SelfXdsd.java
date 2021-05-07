/*
 * This file is generated by jOOQ.
 */
package com.selfxdsd.storage.generated.jooq;


import com.selfxdsd.storage.generated.jooq.tables.SlfApitokensXdsd;
import com.selfxdsd.storage.generated.jooq.tables.SlfContractsXdsd;
import com.selfxdsd.storage.generated.jooq.tables.SlfContributorsXdsd;
import com.selfxdsd.storage.generated.jooq.tables.SlfInvoicedtasksXdsd;
import com.selfxdsd.storage.generated.jooq.tables.SlfInvoicesXdsd;
import com.selfxdsd.storage.generated.jooq.tables.SlfJsonstorageXdsd;
import com.selfxdsd.storage.generated.jooq.tables.SlfPaymentmethodsXdsd;
import com.selfxdsd.storage.generated.jooq.tables.SlfPaymentsXdsd;
import com.selfxdsd.storage.generated.jooq.tables.SlfPayoutmethodsXdsd;
import com.selfxdsd.storage.generated.jooq.tables.SlfPlatforminvoicesXdsd;
import com.selfxdsd.storage.generated.jooq.tables.SlfPmsXdsd;
import com.selfxdsd.storage.generated.jooq.tables.SlfProjectsXdsd;
import com.selfxdsd.storage.generated.jooq.tables.SlfResignationsXdsd;
import com.selfxdsd.storage.generated.jooq.tables.SlfTasksXdsd;
import com.selfxdsd.storage.generated.jooq.tables.SlfUsersXdsd;
import com.selfxdsd.storage.generated.jooq.tables.SlfWalletsXdsd;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SelfXdsd extends SchemaImpl {

    private static final long serialVersionUID = 1768965955;

    /**
     * The reference instance of <code>self_xdsd</code>
     */
    public static final SelfXdsd SELF_XDSD = new SelfXdsd();

    /**
     * The table <code>self_xdsd.slf_apitokens_xdsd</code>.
     */
    public final SlfApitokensXdsd SLF_APITOKENS_XDSD = SlfApitokensXdsd.SLF_APITOKENS_XDSD;

    /**
     * The table <code>self_xdsd.slf_contracts_xdsd</code>.
     */
    public final SlfContractsXdsd SLF_CONTRACTS_XDSD = SlfContractsXdsd.SLF_CONTRACTS_XDSD;

    /**
     * The table <code>self_xdsd.slf_contributors_xdsd</code>.
     */
    public final SlfContributorsXdsd SLF_CONTRIBUTORS_XDSD = SlfContributorsXdsd.SLF_CONTRIBUTORS_XDSD;

    /**
     * The table <code>self_xdsd.slf_invoicedtasks_xdsd</code>.
     */
    public final SlfInvoicedtasksXdsd SLF_INVOICEDTASKS_XDSD = SlfInvoicedtasksXdsd.SLF_INVOICEDTASKS_XDSD;

    /**
     * The table <code>self_xdsd.slf_invoices_xdsd</code>.
     */
    public final SlfInvoicesXdsd SLF_INVOICES_XDSD = SlfInvoicesXdsd.SLF_INVOICES_XDSD;

    /**
     * The table <code>self_xdsd.slf_jsonstorage_xdsd</code>.
     */
    public final SlfJsonstorageXdsd SLF_JSONSTORAGE_XDSD = SlfJsonstorageXdsd.SLF_JSONSTORAGE_XDSD;

    /**
     * The table <code>self_xdsd.slf_paymentmethods_xdsd</code>.
     */
    public final SlfPaymentmethodsXdsd SLF_PAYMENTMETHODS_XDSD = SlfPaymentmethodsXdsd.SLF_PAYMENTMETHODS_XDSD;

    /**
     * The table <code>self_xdsd.slf_payments_xdsd</code>.
     */
    public final SlfPaymentsXdsd SLF_PAYMENTS_XDSD = SlfPaymentsXdsd.SLF_PAYMENTS_XDSD;

    /**
     * The table <code>self_xdsd.slf_payoutmethods_xdsd</code>.
     */
    public final SlfPayoutmethodsXdsd SLF_PAYOUTMETHODS_XDSD = SlfPayoutmethodsXdsd.SLF_PAYOUTMETHODS_XDSD;

    /**
     * The table <code>self_xdsd.slf_platforminvoices_xdsd</code>.
     */
    public final SlfPlatforminvoicesXdsd SLF_PLATFORMINVOICES_XDSD = SlfPlatforminvoicesXdsd.SLF_PLATFORMINVOICES_XDSD;

    /**
     * The table <code>self_xdsd.slf_pms_xdsd</code>.
     */
    public final SlfPmsXdsd SLF_PMS_XDSD = SlfPmsXdsd.SLF_PMS_XDSD;

    /**
     * The table <code>self_xdsd.slf_projects_xdsd</code>.
     */
    public final SlfProjectsXdsd SLF_PROJECTS_XDSD = SlfProjectsXdsd.SLF_PROJECTS_XDSD;

    /**
     * The table <code>self_xdsd.slf_resignations_xdsd</code>.
     */
    public final SlfResignationsXdsd SLF_RESIGNATIONS_XDSD = SlfResignationsXdsd.SLF_RESIGNATIONS_XDSD;

    /**
     * The table <code>self_xdsd.slf_tasks_xdsd</code>.
     */
    public final SlfTasksXdsd SLF_TASKS_XDSD = SlfTasksXdsd.SLF_TASKS_XDSD;

    /**
     * The table <code>self_xdsd.slf_users_xdsd</code>.
     */
    public final SlfUsersXdsd SLF_USERS_XDSD = SlfUsersXdsd.SLF_USERS_XDSD;

    /**
     * The table <code>self_xdsd.slf_wallets_xdsd</code>.
     */
    public final SlfWalletsXdsd SLF_WALLETS_XDSD = SlfWalletsXdsd.SLF_WALLETS_XDSD;

    /**
     * No further instances allowed
     */
    private SelfXdsd() {
        super("self_xdsd", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            SlfApitokensXdsd.SLF_APITOKENS_XDSD,
            SlfContractsXdsd.SLF_CONTRACTS_XDSD,
            SlfContributorsXdsd.SLF_CONTRIBUTORS_XDSD,
            SlfInvoicedtasksXdsd.SLF_INVOICEDTASKS_XDSD,
            SlfInvoicesXdsd.SLF_INVOICES_XDSD,
            SlfJsonstorageXdsd.SLF_JSONSTORAGE_XDSD,
            SlfPaymentmethodsXdsd.SLF_PAYMENTMETHODS_XDSD,
            SlfPaymentsXdsd.SLF_PAYMENTS_XDSD,
            SlfPayoutmethodsXdsd.SLF_PAYOUTMETHODS_XDSD,
            SlfPlatforminvoicesXdsd.SLF_PLATFORMINVOICES_XDSD,
            SlfPmsXdsd.SLF_PMS_XDSD,
            SlfProjectsXdsd.SLF_PROJECTS_XDSD,
            SlfResignationsXdsd.SLF_RESIGNATIONS_XDSD,
            SlfTasksXdsd.SLF_TASKS_XDSD,
            SlfUsersXdsd.SLF_USERS_XDSD,
            SlfWalletsXdsd.SLF_WALLETS_XDSD);
    }
}
