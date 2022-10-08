var username = new URL(location.href).searchParams.get("username");
var user;

$(document).ready(function () {

    $(function () {
        $('[data-toggle="tooltip"]').tooltip();
    });

    getUsuario().then(function () {

        $("#mi-perfil-btn").attr("href", "profile.html?username=" + username);
        $("#modificar-perfil-btn").attr("href", "modificar.html?username=" + username);
        //$("#user-saldo").html(user.saldo.toFixed(2) + "$");
        getJuegos(false, "ASC");
        //$("#ordenar-genero").click(ordenarPeliculas);
    });
});


async function getUsuario() {

    await $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioPedir",
        data: $.param({
            username: username
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);

            if (parsedResult != false) {
                user = parsedResult;
            } else {
                console.log("Error recuperando los datos del usuario");
            }
        }
    });

}

function getJuegos(ordenar, orden) {
    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletJuegosListar",
        data: $.param({
            ordenar: ordenar,
            orden: orden
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);

            if (parsedResult != false) {
                mostrarJuegos(parsedResult);
            } else {
                console.log("Error recuperando los datos de las juegos");
            }
        }
    });
}

function mostrarJuegos(videojuego) {
    let contenido = "";
    $.each(videojuego, function (index, juego) {

        juego = JSON.parse(juego);
        
        contenido += '<tr><th scope="row">' + juego.id + '</th>' +
                    '<td>' + juego.titulo + '</td>' +
                    '<td>' + juego.plataforma + '</td>' +
                    '<td>' + juego.categoria + '</td>' +
                    '<td>' + juego.genero + '</td>' +
                    '<td>' + juego.stock + '</td>' +
                    '<td>' + juego.alquiler + '</td>' +
                    '<td>' + juego.compra + '</td>' +
                    '<td>' + juego.descripcion + '</td>' +
                    '<td>' + juego.valor + '</td></tr>'
    });
    $("#videojuego-tbody").html(contenido);
}
