/*
 * This file is generated by jOOQ.
*/
package co.simplon.laposte.domain;


import co.simplon.laposte.domain.tables.Role;
import co.simplon.laposte.domain.tables.Utilisateur;
import co.simplon.laposte.domain.tables.UtilisateurRole;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in dbprojet
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>dbprojet.role</code>.
     */
    public static final Role ROLE = co.simplon.laposte.domain.tables.Role.ROLE;

    /**
     * The table <code>dbprojet.utilisateur</code>.
     */
    public static final Utilisateur UTILISATEUR = co.simplon.laposte.domain.tables.Utilisateur.UTILISATEUR;

    /**
     * The table <code>dbprojet.utilisateur_role</code>.
     */
    public static final UtilisateurRole UTILISATEUR_ROLE = co.simplon.laposte.domain.tables.UtilisateurRole.UTILISATEUR_ROLE;
}