/*
 * This file is generated by jOOQ.
*/
package co.simplon.laposte.domain;


import co.simplon.laposte.domain.tables.Role;
import co.simplon.laposte.domain.tables.Utilisateur;
import co.simplon.laposte.domain.tables.UtilisateurRole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Dbprojet extends SchemaImpl {

    private static final long serialVersionUID = 747681683;

    /**
     * The reference instance of <code>dbprojet</code>
     */
    public static final Dbprojet DBPROJET = new Dbprojet();

    /**
     * The table <code>dbprojet.role</code>.
     */
    public final Role ROLE = co.simplon.laposte.domain.tables.Role.ROLE;

    /**
     * The table <code>dbprojet.utilisateur</code>.
     */
    public final Utilisateur UTILISATEUR = co.simplon.laposte.domain.tables.Utilisateur.UTILISATEUR;

    /**
     * The table <code>dbprojet.utilisateur_role</code>.
     */
    public final UtilisateurRole UTILISATEUR_ROLE = co.simplon.laposte.domain.tables.UtilisateurRole.UTILISATEUR_ROLE;

    /**
     * No further instances allowed
     */
    private Dbprojet() {
        super("dbprojet", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Role.ROLE,
            Utilisateur.UTILISATEUR,
            UtilisateurRole.UTILISATEUR_ROLE);
    }
}
