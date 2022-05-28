package rewards

class OnlineOrderItem {

    Integer quantity
    Float total

    static belongsTo = [onlineOrder: OnlineOrder, product: Product]

    static constraints = {
    }
}
