package cs4760progassign

class Book {

    String title
    Integer publishYear

    static constraints = {

    }

    static belongsTo = [author:Author]

    String toString(){
        "${title}"
    }
}
