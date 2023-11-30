function memberInsert(){
	
	username = document.getElementById("username")
	password = document.getElementById("password")
	email = document.getElementById("email")
	userinfo={
		"username": username.value,
		"password": password.value,
		"email": email.value
	}
	alert(userinfo)
	
	$.ajax({
        type: "POST",
        url: "/user",
        data: JSON.stringify(userinfo),
        contentType: "application/json; charset=utf-8"

    }).done(function(data){
		
		console.log(data)
        $('#tarea').text(JSON.stringify(data));
        
    }).fail(function(error){

    });
}

function memberList(){
    $.ajax({
        type: "GET",
        url: "/user/list"

    }).done(function(data){
		
		console.log(data)
        $('#tarea').text(JSON.stringify(data));
        
    }).fail(function(error){

    });
}