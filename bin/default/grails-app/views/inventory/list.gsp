<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product List</title>
</head>
<body>
    ${productList}<br />
    ${productList.name} ${productList.sku} ${productList.price}<br />
    <table border="1">
        <g:each in="${productList}" var="product">
            <tr>
                <td>${product.sku}</td>
                <td>${product.name}</td>
                <td>${product.price}</td>
            </tr>
        </g:each>
    </table>
</body>
</html>
