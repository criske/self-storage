/*
 * This file is generated by jOOQ.
 */
package com.selfxdsd.storage.generated.jooq;


import com.selfxdsd.storage.generated.jooq.tables.SlfContractsXdsd;
import com.selfxdsd.storage.generated.jooq.tables.SlfContributorsXdsd;
import com.selfxdsd.storage.generated.jooq.tables.SlfInvoicedtasksXdsd;
import com.selfxdsd.storage.generated.jooq.tables.SlfInvoicesXdsd;
import com.selfxdsd.storage.generated.jooq.tables.SlfPmsXdsd;
import com.selfxdsd.storage.generated.jooq.tables.SlfProjectsXdsd;
import com.selfxdsd.storage.generated.jooq.tables.SlfTasksXdsd;
import com.selfxdsd.storage.generated.jooq.tables.SlfUsersXdsd;
import com.selfxdsd.storage.generated.jooq.tables.records.SlfContractsXdsdRecord;
import com.selfxdsd.storage.generated.jooq.tables.records.SlfContributorsXdsdRecord;
import com.selfxdsd.storage.generated.jooq.tables.records.SlfInvoicedtasksXdsdRecord;
import com.selfxdsd.storage.generated.jooq.tables.records.SlfInvoicesXdsdRecord;
import com.selfxdsd.storage.generated.jooq.tables.records.SlfPmsXdsdRecord;
import com.selfxdsd.storage.generated.jooq.tables.records.SlfProjectsXdsdRecord;
import com.selfxdsd.storage.generated.jooq.tables.records.SlfTasksXdsdRecord;
import com.selfxdsd.storage.generated.jooq.tables.records.SlfUsersXdsdRecord;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>self_xdsd</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<SlfInvoicedtasksXdsdRecord, Integer> IDENTITY_SLF_INVOICEDTASKS_XDSD = Identities0.IDENTITY_SLF_INVOICEDTASKS_XDSD;
    public static final Identity<SlfInvoicesXdsdRecord, Integer> IDENTITY_SLF_INVOICES_XDSD = Identities0.IDENTITY_SLF_INVOICES_XDSD;
    public static final Identity<SlfPmsXdsdRecord, Integer> IDENTITY_SLF_PMS_XDSD = Identities0.IDENTITY_SLF_PMS_XDSD;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<SlfContractsXdsdRecord> KEY_SLF_CONTRACTS_XDSD_PRIMARY = UniqueKeys0.KEY_SLF_CONTRACTS_XDSD_PRIMARY;
    public static final UniqueKey<SlfContributorsXdsdRecord> KEY_SLF_CONTRIBUTORS_XDSD_PRIMARY = UniqueKeys0.KEY_SLF_CONTRIBUTORS_XDSD_PRIMARY;
    public static final UniqueKey<SlfInvoicedtasksXdsdRecord> KEY_SLF_INVOICEDTASKS_XDSD_PRIMARY = UniqueKeys0.KEY_SLF_INVOICEDTASKS_XDSD_PRIMARY;
    public static final UniqueKey<SlfInvoicesXdsdRecord> KEY_SLF_INVOICES_XDSD_PRIMARY = UniqueKeys0.KEY_SLF_INVOICES_XDSD_PRIMARY;
    public static final UniqueKey<SlfPmsXdsdRecord> KEY_SLF_PMS_XDSD_PRIMARY = UniqueKeys0.KEY_SLF_PMS_XDSD_PRIMARY;
    public static final UniqueKey<SlfProjectsXdsdRecord> KEY_SLF_PROJECTS_XDSD_PRIMARY = UniqueKeys0.KEY_SLF_PROJECTS_XDSD_PRIMARY;
    public static final UniqueKey<SlfTasksXdsdRecord> KEY_SLF_TASKS_XDSD_PRIMARY = UniqueKeys0.KEY_SLF_TASKS_XDSD_PRIMARY;
    public static final UniqueKey<SlfUsersXdsdRecord> KEY_SLF_USERS_XDSD_PRIMARY = UniqueKeys0.KEY_SLF_USERS_XDSD_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<SlfContractsXdsdRecord, SlfProjectsXdsdRecord> PROJECT = ForeignKeys0.PROJECT;
    public static final ForeignKey<SlfContractsXdsdRecord, SlfContributorsXdsdRecord> CONTRIBUTOR = ForeignKeys0.CONTRIBUTOR;
    public static final ForeignKey<SlfInvoicesXdsdRecord, SlfContractsXdsdRecord> FKCONTRACT = ForeignKeys0.FKCONTRACT;
    public static final ForeignKey<SlfProjectsXdsdRecord, SlfUsersXdsdRecord> OWNER = ForeignKeys0.OWNER;
    public static final ForeignKey<SlfProjectsXdsdRecord, SlfPmsXdsdRecord> PM = ForeignKeys0.PM;
    public static final ForeignKey<SlfTasksXdsdRecord, SlfProjectsXdsdRecord> PARENT_PROJECT = ForeignKeys0.PARENT_PROJECT;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<SlfInvoicedtasksXdsdRecord, Integer> IDENTITY_SLF_INVOICEDTASKS_XDSD = Internal.createIdentity(SlfInvoicedtasksXdsd.SLF_INVOICEDTASKS_XDSD, SlfInvoicedtasksXdsd.SLF_INVOICEDTASKS_XDSD.ID);
        public static Identity<SlfInvoicesXdsdRecord, Integer> IDENTITY_SLF_INVOICES_XDSD = Internal.createIdentity(SlfInvoicesXdsd.SLF_INVOICES_XDSD, SlfInvoicesXdsd.SLF_INVOICES_XDSD.INVOICEID);
        public static Identity<SlfPmsXdsdRecord, Integer> IDENTITY_SLF_PMS_XDSD = Internal.createIdentity(SlfPmsXdsd.SLF_PMS_XDSD, SlfPmsXdsd.SLF_PMS_XDSD.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<SlfContractsXdsdRecord> KEY_SLF_CONTRACTS_XDSD_PRIMARY = Internal.createUniqueKey(SlfContractsXdsd.SLF_CONTRACTS_XDSD, "KEY_slf_contracts_xdsd_PRIMARY", new TableField[] { SlfContractsXdsd.SLF_CONTRACTS_XDSD.REPO_FULLNAME, SlfContractsXdsd.SLF_CONTRACTS_XDSD.USERNAME, SlfContractsXdsd.SLF_CONTRACTS_XDSD.PROVIDER, SlfContractsXdsd.SLF_CONTRACTS_XDSD.ROLE }, true);
        public static final UniqueKey<SlfContributorsXdsdRecord> KEY_SLF_CONTRIBUTORS_XDSD_PRIMARY = Internal.createUniqueKey(SlfContributorsXdsd.SLF_CONTRIBUTORS_XDSD, "KEY_slf_contributors_xdsd_PRIMARY", new TableField[] { SlfContributorsXdsd.SLF_CONTRIBUTORS_XDSD.USERNAME, SlfContributorsXdsd.SLF_CONTRIBUTORS_XDSD.PROVIDER }, true);
        public static final UniqueKey<SlfInvoicedtasksXdsdRecord> KEY_SLF_INVOICEDTASKS_XDSD_PRIMARY = Internal.createUniqueKey(SlfInvoicedtasksXdsd.SLF_INVOICEDTASKS_XDSD, "KEY_slf_invoicedtasks_xdsd_PRIMARY", new TableField[] { SlfInvoicedtasksXdsd.SLF_INVOICEDTASKS_XDSD.ID }, true);
        public static final UniqueKey<SlfInvoicesXdsdRecord> KEY_SLF_INVOICES_XDSD_PRIMARY = Internal.createUniqueKey(SlfInvoicesXdsd.SLF_INVOICES_XDSD, "KEY_slf_invoices_xdsd_PRIMARY", new TableField[] { SlfInvoicesXdsd.SLF_INVOICES_XDSD.INVOICEID }, true);
        public static final UniqueKey<SlfPmsXdsdRecord> KEY_SLF_PMS_XDSD_PRIMARY = Internal.createUniqueKey(SlfPmsXdsd.SLF_PMS_XDSD, "KEY_slf_pms_xdsd_PRIMARY", new TableField[] { SlfPmsXdsd.SLF_PMS_XDSD.ID }, true);
        public static final UniqueKey<SlfProjectsXdsdRecord> KEY_SLF_PROJECTS_XDSD_PRIMARY = Internal.createUniqueKey(SlfProjectsXdsd.SLF_PROJECTS_XDSD, "KEY_slf_projects_xdsd_PRIMARY", new TableField[] { SlfProjectsXdsd.SLF_PROJECTS_XDSD.REPO_FULLNAME, SlfProjectsXdsd.SLF_PROJECTS_XDSD.PROVIDER }, true);
        public static final UniqueKey<SlfTasksXdsdRecord> KEY_SLF_TASKS_XDSD_PRIMARY = Internal.createUniqueKey(SlfTasksXdsd.SLF_TASKS_XDSD, "KEY_slf_tasks_xdsd_PRIMARY", new TableField[] { SlfTasksXdsd.SLF_TASKS_XDSD.ISSUEID, SlfTasksXdsd.SLF_TASKS_XDSD.PROVIDER, SlfTasksXdsd.SLF_TASKS_XDSD.REPO_FULLNAME }, true);
        public static final UniqueKey<SlfUsersXdsdRecord> KEY_SLF_USERS_XDSD_PRIMARY = Internal.createUniqueKey(SlfUsersXdsd.SLF_USERS_XDSD, "KEY_slf_users_xdsd_PRIMARY", new TableField[] { SlfUsersXdsd.SLF_USERS_XDSD.USERNAME, SlfUsersXdsd.SLF_USERS_XDSD.PROVIDER }, true);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<SlfContractsXdsdRecord, SlfProjectsXdsdRecord> PROJECT = Internal.createForeignKey(Keys.KEY_SLF_PROJECTS_XDSD_PRIMARY, SlfContractsXdsd.SLF_CONTRACTS_XDSD, "project", new TableField[] { SlfContractsXdsd.SLF_CONTRACTS_XDSD.REPO_FULLNAME, SlfContractsXdsd.SLF_CONTRACTS_XDSD.PROVIDER }, true);
        public static final ForeignKey<SlfContractsXdsdRecord, SlfContributorsXdsdRecord> CONTRIBUTOR = Internal.createForeignKey(Keys.KEY_SLF_CONTRIBUTORS_XDSD_PRIMARY, SlfContractsXdsd.SLF_CONTRACTS_XDSD, "contributor", new TableField[] { SlfContractsXdsd.SLF_CONTRACTS_XDSD.USERNAME, SlfContractsXdsd.SLF_CONTRACTS_XDSD.PROVIDER }, true);
        public static final ForeignKey<SlfInvoicesXdsdRecord, SlfContractsXdsdRecord> FKCONTRACT = Internal.createForeignKey(Keys.KEY_SLF_CONTRACTS_XDSD_PRIMARY, SlfInvoicesXdsd.SLF_INVOICES_XDSD, "fkContract", new TableField[] { SlfInvoicesXdsd.SLF_INVOICES_XDSD.REPO_FULLNAME, SlfInvoicesXdsd.SLF_INVOICES_XDSD.USERNAME, SlfInvoicesXdsd.SLF_INVOICES_XDSD.PROVIDER, SlfInvoicesXdsd.SLF_INVOICES_XDSD.ROLE }, true);
        public static final ForeignKey<SlfProjectsXdsdRecord, SlfUsersXdsdRecord> OWNER = Internal.createForeignKey(Keys.KEY_SLF_USERS_XDSD_PRIMARY, SlfProjectsXdsd.SLF_PROJECTS_XDSD, "owner", new TableField[] { SlfProjectsXdsd.SLF_PROJECTS_XDSD.USERNAME, SlfProjectsXdsd.SLF_PROJECTS_XDSD.PROVIDER }, true);
        public static final ForeignKey<SlfProjectsXdsdRecord, SlfPmsXdsdRecord> PM = Internal.createForeignKey(Keys.KEY_SLF_PMS_XDSD_PRIMARY, SlfProjectsXdsd.SLF_PROJECTS_XDSD, "pm", new TableField[] { SlfProjectsXdsd.SLF_PROJECTS_XDSD.PMID }, true);
        public static final ForeignKey<SlfTasksXdsdRecord, SlfProjectsXdsdRecord> PARENT_PROJECT = Internal.createForeignKey(Keys.KEY_SLF_PROJECTS_XDSD_PRIMARY, SlfTasksXdsd.SLF_TASKS_XDSD, "parent_project", new TableField[] { SlfTasksXdsd.SLF_TASKS_XDSD.REPO_FULLNAME, SlfTasksXdsd.SLF_TASKS_XDSD.PROVIDER }, true);
    }
}
