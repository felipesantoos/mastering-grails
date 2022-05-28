package rewards

class OnlineOrder {

    Date date
    Integer number
    Float total

    static belongsTo = [customer: Customer]
    static hasMany = [onlineOrderItemList: OnlineOrderItem]

    static constraints = {
    }
}
