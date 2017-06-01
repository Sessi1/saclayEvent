package event

class User {

    String name
    String lastName
    String login
    String password
    String email
    //boolean est_organisateur = false
    boolean admin= false
    static hasMany = [reservation: Reservation]

    String toString() {
        return this.lastName + ' ' + this.name
    }

    static constraints = {
        name blank: false
        lastName blank: false
        login size: 5..15, blank: false, unique: true
        password size: 5..15, blank: false, password:true
        email email: true
    }
}
