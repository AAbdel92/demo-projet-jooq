INSERT INTO utilisateur (pseudo, mot_de_passe, email) VALUES ('Abdel', 'rico', 'abdel@laposte.fr');
INSERT INTO utilisateur (pseudo, mot_de_passe, email) VALUES ('Franck', 'osef', 'franck@laposte.fr');
INSERT INTO utilisateur (pseudo, mot_de_passe, email) VALUES ('Damien', 'rien', 'damien@laposte.fr');

insert into role(nom, derniere_maj) values ('Admin', '2016-01-03');
insert into role(nom, derniere_maj) values ('Formateur', '2016-01-03');
insert into role(nom, derniere_maj) values ('Tuteur', '2016-01-03');
insert into role(nom, derniere_maj) values ('Apprenant', '2016-01-03');

insert into utilisateur_role (utilisateur_id, role_id) values (1, 1);
insert into utilisateur_role (utilisateur_id, role_id) values (1, 4);
insert into utilisateur_role (utilisateur_id, role_id) values (2, 1);
insert into utilisateur_role (utilisateur_id, role_id) values (2, 2);
insert into utilisateur_role (utilisateur_id, role_id) values (3, 1);
insert into utilisateur_role (utilisateur_id, role_id) values (3, 3);

