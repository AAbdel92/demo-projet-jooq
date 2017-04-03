/*
 * This file is generated by jOOQ.
*/
package co.simplon.laposte.domain;


import co.simplon.laposte.domain.tables.Role;
import co.simplon.laposte.domain.tables.Utilisateur;
import co.simplon.laposte.domain.tables.UtilisateurRole;
import co.simplon.laposte.domain.tables.records.RoleRecord;
import co.simplon.laposte.domain.tables.records.UtilisateurRecord;
import co.simplon.laposte.domain.tables.records.UtilisateurRoleRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>dbprojet</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<RoleRecord, Integer> IDENTITY_ROLE = Identities0.IDENTITY_ROLE;
    public static final Identity<UtilisateurRecord, Integer> IDENTITY_UTILISATEUR = Identities0.IDENTITY_UTILISATEUR;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<RoleRecord> KEY_ROLE_PRIMARY = UniqueKeys0.KEY_ROLE_PRIMARY;
    public static final UniqueKey<UtilisateurRecord> KEY_UTILISATEUR_PRIMARY = UniqueKeys0.KEY_UTILISATEUR_PRIMARY;
    public static final UniqueKey<UtilisateurRoleRecord> KEY_UTILISATEUR_ROLE_PRIMARY = UniqueKeys0.KEY_UTILISATEUR_ROLE_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<UtilisateurRoleRecord, UtilisateurRecord> FK6KIFVRSFKPQN502R5IPJL5PVU = ForeignKeys0.FK6KIFVRSFKPQN502R5IPJL5PVU;
    public static final ForeignKey<UtilisateurRoleRecord, UtilisateurRecord> FK_UTILISATEUR_HAS_ROLE_UTILISATEUR = ForeignKeys0.FK_UTILISATEUR_HAS_ROLE_UTILISATEUR;
    public static final ForeignKey<UtilisateurRoleRecord, RoleRecord> FKAD9WF1U7GJBX2P2Y9HS8OW39X = ForeignKeys0.FKAD9WF1U7GJBX2P2Y9HS8OW39X;
    public static final ForeignKey<UtilisateurRoleRecord, RoleRecord> FK_UTILISATEUR_HAS_ROLE_ROLE1 = ForeignKeys0.FK_UTILISATEUR_HAS_ROLE_ROLE1;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<RoleRecord, Integer> IDENTITY_ROLE = createIdentity(Role.ROLE, Role.ROLE.ID);
        public static Identity<UtilisateurRecord, Integer> IDENTITY_UTILISATEUR = createIdentity(Utilisateur.UTILISATEUR, Utilisateur.UTILISATEUR.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<RoleRecord> KEY_ROLE_PRIMARY = createUniqueKey(Role.ROLE, "KEY_role_PRIMARY", Role.ROLE.ID);
        public static final UniqueKey<UtilisateurRecord> KEY_UTILISATEUR_PRIMARY = createUniqueKey(Utilisateur.UTILISATEUR, "KEY_utilisateur_PRIMARY", Utilisateur.UTILISATEUR.ID);
        public static final UniqueKey<UtilisateurRoleRecord> KEY_UTILISATEUR_ROLE_PRIMARY = createUniqueKey(UtilisateurRole.UTILISATEUR_ROLE, "KEY_utilisateur_role_PRIMARY", UtilisateurRole.UTILISATEUR_ROLE.UTILISATEUR_ID, UtilisateurRole.UTILISATEUR_ROLE.ROLE_ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<UtilisateurRoleRecord, UtilisateurRecord> FK6KIFVRSFKPQN502R5IPJL5PVU = createForeignKey(co.simplon.laposte.domain.Keys.KEY_UTILISATEUR_PRIMARY, UtilisateurRole.UTILISATEUR_ROLE, "FK6kifvrsfkpqn502r5ipjl5pvu", UtilisateurRole.UTILISATEUR_ROLE.UTILISATEUR_ID);
        public static final ForeignKey<UtilisateurRoleRecord, UtilisateurRecord> FK_UTILISATEUR_HAS_ROLE_UTILISATEUR = createForeignKey(co.simplon.laposte.domain.Keys.KEY_UTILISATEUR_PRIMARY, UtilisateurRole.UTILISATEUR_ROLE, "fk_utilisateur_has_role_utilisateur", UtilisateurRole.UTILISATEUR_ROLE.UTILISATEUR_ID);
        public static final ForeignKey<UtilisateurRoleRecord, RoleRecord> FKAD9WF1U7GJBX2P2Y9HS8OW39X = createForeignKey(co.simplon.laposte.domain.Keys.KEY_ROLE_PRIMARY, UtilisateurRole.UTILISATEUR_ROLE, "FKad9wf1u7gjbx2p2y9hs8ow39x", UtilisateurRole.UTILISATEUR_ROLE.ROLE_ID);
        public static final ForeignKey<UtilisateurRoleRecord, RoleRecord> FK_UTILISATEUR_HAS_ROLE_ROLE1 = createForeignKey(co.simplon.laposte.domain.Keys.KEY_ROLE_PRIMARY, UtilisateurRole.UTILISATEUR_ROLE, "fk_utilisateur_has_role_role1", UtilisateurRole.UTILISATEUR_ROLE.ROLE_ID);
    }
}
