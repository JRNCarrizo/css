function calcular() {
    //console.log("se ejecuto una función")

    nro1 = document.getElementById("nro1").value;
    nro2 = document.getElementById("nro2").value;
    operacion = document.getElementById("operacion").value

    //console.log(nro1)
    //console.log(nro2)
    //console.log(operacion)

    //ejemplo http request
    // const xhr = new XMLHttpRequest();
    // xhr.open("GET", "https://jsonplaceholder.typicode.com/users");
    // xhr.send();
    // xhr.responseType = "json";
    // xhr.onload = () => {
    //     if (xhr.readyState == 4 && xhr.status == 200) {
    //         const data = xhr.response;
    //         console.log(data);
    //     } else {
    //         console.log(`Error: ${xhr.status}`);
    //     }
    // };

    const xhr = new XMLHttpRequest();
    var url="http://localhost:8080/calculadora?nro1="+
                nro1+"&nro2="+nro2+"&operacion="+operacion
    //console.log(url)
    xhr.open("GET", url);
    
    xhr.send();
    xhr.responseType = "text";
    xhr.onload = () => {
        if (xhr.readyState == 4 && xhr.status == 200) {
            const data = xhr.response;
            //console.log(data);
            document.getElementById("resultado").value=data
        } else {
            console.log(`Error: ${xhr.status}`);
        }
    };
    //TODO usar AXIOS

}