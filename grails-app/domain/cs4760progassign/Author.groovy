package cs4760progassign

class Author {

    String name


    static constraints = {

    }
    static hasMany = [books:Book]

    String toString(){
        "${name}"
    }
}
