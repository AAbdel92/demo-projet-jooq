/*
 * This file is generated by jOOQ.
*/
package co.simplon.laposte.domain.tables;


import co.simplon.laposte.domain.Dbprojet;
import co.simplon.laposte.domain.Keys;
import co.simplon.laposte.domain.tables.records.UtilisateurRoleRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UtilisateurRole extends TableImpl<UtilisateurRoleRecord> {

    private static final long serialVersionUID = -1483038002;

    /**
     * The reference instance of <code>dbprojet.utilisateur_role</code>
     */
    public static final UtilisateurRole UTILISATEUR_ROLE = new UtilisateurRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UtilisateurRoleRecord> getRecordType() {
        return UtilisateurRoleRecord.class;
    }

    /**
     * The column <code>dbprojet.utilisateur_role.utilisateur_id</code>.
     */
    public final TableField<UtilisateurRoleRecord, Integer> UTILISATEUR_ID = createField("utilisateur_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>dbprojet.utilisateur_role.role_id</code>.
     */
    public final TableField<UtilisateurRoleRecord, Integer> ROLE_ID = createField("role_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>dbprojet.utilisateur_role</code> table reference
     */
    public UtilisateurRole() {
        this("utilisateur_role", null);
    }

    /**
     * Create an aliased <code>dbprojet.utilisateur_role</code> table reference
     */
    public UtilisateurRole(String alias) {
        this(alias, UTILISATEUR_ROLE);
    }

    private UtilisateurRole(String alias, Table<UtilisateurRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private UtilisateurRole(String alias, Table<UtilisateurRoleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Dbprojet.DBPROJET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UtilisateurRoleRecord> getPrimaryKey() {
        return Keys.KEY_UTILISATEUR_ROLE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UtilisateurRoleRecord>> getKeys() {
        return Arrays.<UniqueKey<UtilisateurRoleRecord>>asList(Keys.KEY_UTILISATEUR_ROLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<UtilisateurRoleRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UtilisateurRoleRecord, ?>>asList(Keys.FK6KIFVRSFKPQN502R5IPJL5PVU, Keys.FK_UTILISATEUR_HAS_ROLE_UTILISATEUR, Keys.FKAD9WF1U7GJBX2P2Y9HS8OW39X, Keys.FK_UTILISATEUR_HAS_ROLE_ROLE1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UtilisateurRole as(String alias) {
        return new UtilisateurRole(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UtilisateurRole rename(String name) {
        return new UtilisateurRole(name, null);
    }
}