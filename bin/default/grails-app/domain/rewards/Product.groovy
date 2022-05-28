package rewards

class Product {

    String sku
    String name
    Float price

    static hasMany = [onlineOrderItemList: OnlineOrderItem]

    static constraints = {
    }
}
