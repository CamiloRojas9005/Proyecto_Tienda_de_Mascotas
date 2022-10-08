var username = new URL(location.href).searchParams.get("username");
var user;

$(document).ready(function () {


    fillUsuario().then(function () {

        $("#user-saldo").html("$" + user.saldo.toFixed());

        getAlquiladas(user.username);
    });

    $("#reservar-btn").attr("href", `home.html?username=${username}`);

    $("#form-modificar").on("submit", function (event) {

        event.preventDefault();
        modificarUsuario();
    });

    $("#aceptar-eliminar-cuenta-btn").click(function () {

        eliminarCuenta().then(function () {
            location.href = "index.html";
        })
    })

});


async function fillUsuario() {
    await $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioPedir",
        data: $.param({
            username: username,
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);

            if (parsedResult != false) {
                user = parsedResult;

                $("#input-username").val(parsedResult.username);
                $("#input-password").val(parsedResult.password);
                $("#input-nombre").val(parsedResult.nombre);
                $("#input-apellidos").val(parsedResult.apellidos);
                $("#input-ciudad").val(parsedResult.ciudad);
                $("#input-telefono").val(parsedResult.telefono);
                $("#input-email").val(parsedResult.email);
                $("#input-direccion").val(parsedResult.direccion);


            } else {
                console.log("Error recuperando los datos del usuario");
            }
        }
    });
}


async function eliminarCuenta() {

    await $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioEliminar",
        data: $.param({
            username: username
        }),
        success: function (result) {

            if (result != false) {

                console.log("Usuario eliminado")

            } else {
                console.log("Error eliminando el usuario");
            }
        }
    });
}

function modificarUsuario() {

    let username = $("#input-username").val();
    let password = $("#input-password").val();
    let nombre = $("#input-nombre").val();
    let apellidos = $("#input-apellidos").val();
    let email = $("#input-email").val();
    let telefono = $("#input-telefono").val();
    let ciudad = $("#input-ciudad").val();
    let direccion = $("#input-direccion").val();
    
    
    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioModificar",
        data: $.param({
            username: username,
            password: password,
            nombre: nombre,
            apellidos: apellidos,
            email:email,
            telefono:telefono,
            ciudad:ciudad,
            direccion:direccion,
           
        }),
        success: function (result) {

            if (result != false) {
                $("#modificar-error").addClass("d-none");
                $("#modificar-exito").removeClass("d-none");
            } else {
                $("#modificar-error").removeClass("d-none");
                $("#modificar-exito").addClass("d-none");
            }

            setTimeout(function () {
                location.reload();
            }, 3000);

        }
    });
}






