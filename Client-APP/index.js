
fetch('http://localhost:9090/7-Spring-RestAPP/api/products/')
.then(response => response.json())
.then(products => {
    console.log('test')
    console.log(products);
})