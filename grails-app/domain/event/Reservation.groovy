package event

class Reservation {

    Event events
    User client
    int tickets
    static hasMany = [reservation: Reservation] // un user peut avoir plusieurs réservations
    static belongsTo = [event:Event] // pour dire qu'une réservation est lié à un seul un seul événement dont la suppression entraine la suppression de ses réservations


    String toString() {
        def listReservation
        for (event in Events) {
            listReservation += Events.name + ' - '
        }
        return this.user.login + ' : ' + listReservation
    }

    static constraints = {
        nbr_places blank: false
    }
}
