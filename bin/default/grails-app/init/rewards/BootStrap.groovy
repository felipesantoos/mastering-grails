package rewards

class BootStrap {

    def init = { servletContext ->
        new Product(sku: 'PDT1', name: 'Product 1', price: 10.00).save()
        new Product(sku: 'PDT2', name: 'Product 2', price: 20.00).save()
    }
    def destroy = {
    }
}
