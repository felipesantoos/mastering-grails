package rewards

class Customer {

    String cpf
    String firstName
    String lastName
    String phone
    String email
    Integer totalPoints

    static hasMany = [awardList: Award, onlineOrderList: OnlineOrder]

    static constraints = {
        cpf(nullable: false)
        firstName(nullable: false, size: 1..255)
        lastName(nullable: false, size: 1..255)
        phone(nullable: true, maxSize: 15)
        email(nullable: true, maxSize: 255, email: true)
        totalPoints(nullable: true, min: 0, max: 100)
        awardList(nullable: true)
        onlineOrderList(nullable: true)
    }
}
