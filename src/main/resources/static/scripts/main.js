$(document).ready(
		function() {
			listerRoles(),
			$('#boutonUtilisateur').click(
					function() {
						var Role = {};
						Role["id"] = $('#selectRole').val();
						var Utilisateur = {};
						var listeRoles = [];
						
						Utilisateur["pseudo"] = $('#pseudo').val();
						Utilisateur["motDePasse"] = $('#pass').val();
						Utilisateur["email"] = $('#email').val();
						listeRoles[0] = Role;
						Utilisateur["listeRoles"] = listeRoles;
						
						$.ajax({
							type : "POST",
							contentType : "application/json",
							url : "api/utilisateur",
							data : JSON.stringify(Utilisateur),
							dataType : 'json',
							success : function(data) {
								var date = new Date(data["derniereMaj"]);
								data["derniereMaj"] = date;
								var json = "<h4>Ajax Response</h4><pre>"
										+ JSON.stringify(data, null, 4) + "</pre>";
								$('#reponse').html(json);

								console.log("SUCCESS : ", data);
							},
							error : function(e) {

								var json = "<h4>Ajax Response</h4><pre>" + e.responseText
										+ "</pre>";
								$('#reponse').html(json);

								console.log("ERROR : ", e);
							}					
						});
					}),
			$('#boutonRole').click(
					function() {
						var Role = {};
						
						Role["nom"] = $('#nomRole').val();
						
						$.ajax({
							type : "POST",
							contentType : "application/json",
							url : "/creerRole",
							data : JSON.stringify(Role),
							dataType : 'json',
							success : function(data) {
								var date = new Date(data["derniereMaj"]);
								data["derniereMaj"] = date;
								var json = "<h4>Ajax Response</h4><pre>"
										+ JSON.stringify(data, null, 4) + "</pre>";
								$('#reponse').html(json);

								console.log("SUCCESS : ", data);
							},
							error : function(e) {

								var json = "<h4>Ajax Response</h4><pre>" + e.responseText
										+ "</pre>";
								$('#reponse').html(json);

								console.log("ERROR : ", e);
							}			
						});
					});
					
		});

function listerRoles() {
		$.ajax({
			type : "GET",
			contentType: "application/json",
			url : "api/role",			
			success : function(liste) {
				var affichage;			
				$.each(liste, function(key, value) {
					var resultat = "<option value=\"" + value.id + "\">" + value.nom;
					affichage += resultat;
				});
								
				$('#selectRole').html(affichage);				
			},
			error : function(e) {

				var json = "<h4>Ajax Response</h4><pre>" + e.responseText
						+ "</pre>";
				$('#reponse').html(json);

				console.log("ERROR : ", e);
			}	
		});
}