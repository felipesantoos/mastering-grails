package rewards

class Customer {
    
    String firstName
    String lastName
    String phone
    String email
    Integer totalPoints

    static hasMany = [awardList: Award, onlineOrderList: OnlineOrder]

    static constraints = {
    }
}
