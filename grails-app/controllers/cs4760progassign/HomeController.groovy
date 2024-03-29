package cs4760progassign

class HomeController {
    private static final boolean debugTime = true //flag for debug printing
    def showTime() {
        if(debugTime)println "In showTime"
        render "The time is ${new Date()}"
    }

    def showLastBook() {
        if(debugTime)println "In showLastBook"
        render "${Book.last()} by ${Book.last().author}"
    }

    def index() { }
}
