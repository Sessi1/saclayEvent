package event

class Event {
    String name
    Date eventDate
    String description
    //Lieu lieu
    User owner
    int available_tikets

    static hasMany = [reservation: Reservation]

    String toString() {
        return this.name;
    }

    static constraints = {
        name blank: false
        eventDate nullable: true
        owner nullable: true
    }

    static mapping = {
        owner defaulValue: 'theswede'
        lieu defaultValue: null

    }

}
