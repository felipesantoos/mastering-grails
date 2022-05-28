package rewards

class InventoryController {

    def index() {
        render 'Hello! This is the Inventory Home Page.'
    }

    def list() {
        def productList = Product.list()
        [productList: productList]
    }

    def edit() {
        def sku = 'ABC123'
        def name = 'Notebook'
        [sku: sku, name: name]
    }

    def remove() {
        render 'Removing an item...'
    }
}
