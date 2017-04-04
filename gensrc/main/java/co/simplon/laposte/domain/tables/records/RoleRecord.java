/*
 * This file is generated by jOOQ.
*/
package co.simplon.laposte.domain.tables.records;


import co.simplon.laposte.domain.tables.Role;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class RoleRecord extends UpdatableRecordImpl<RoleRecord> implements Record3<Integer, String, Timestamp> {

    private static final long serialVersionUID = -647884634;

    /**
     * Setter for <code>jooqdatabase.role.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jooqdatabase.role.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jooqdatabase.role.nom</code>.
     */
    public void setNom(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>jooqdatabase.role.nom</code>.
     */
    public String getNom() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jooqdatabase.role.derniere_maj</code>.
     */
    public void setDerniereMaj(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>jooqdatabase.role.derniere_maj</code>.
     */
    public Timestamp getDerniereMaj() {
        return (Timestamp) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Timestamp> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Timestamp> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Role.ROLE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Role.ROLE.NOM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Role.ROLE.DERNIERE_MAJ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getDerniereMaj();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRecord value2(String value) {
        setNom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRecord value3(Timestamp value) {
        setDerniereMaj(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRecord values(Integer value1, String value2, Timestamp value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoleRecord
     */
    public RoleRecord() {
        super(Role.ROLE);
    }

    /**
     * Create a detached, initialised RoleRecord
     */
    public RoleRecord(Integer id, String nom, Timestamp derniereMaj) {
        super(Role.ROLE);

        set(0, id);
        set(1, nom);
        set(2, derniereMaj);
    }
}
