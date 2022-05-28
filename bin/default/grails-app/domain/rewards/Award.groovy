package rewards

class Award {

    Date date
    String type
    Integer points

    static belongsTo = [customer: Customer]

    static constraints = {
    }
}
