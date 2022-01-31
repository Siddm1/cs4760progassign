package cs4760progassign

class AuthorsController {
    static final boolean debugIndex = true
    def index() {
        // Book.list() gets all Book instances from the database and puts them in a list.
        def authors = Author.listOrderByName()

        // println outputs to console
        /*if(debugIndex){
            println ""
            authors.each{ println it.name+" \n "}
        }*/

        // Make a list of all books title and authors
        def authorList = []
        def bookList = []
        for(int i=0; i < authors.size(); i++){
            def authorBk = [author:[:]]
            def bkTitle = [:]

            for(int j = 0; j < authors[i].books.size(); j++){
                bkTitle.put('title'+(j+1), authors[i].books[j].title)
                authorBk.put('author', authors[i].name)
                authorBk.put('book',  bkTitle)
            }

            authorList << authorBk
        }
        if(debugIndex){
            println " "
            println authorList
        }

        // So that the unit test can access the model, we need
        // to explicitly use the render method and specify the model.
        // We also have to explicitly specify the view, or
        // text will be rendered and not the view.
        render view: "index", model: [authorList: authorList]

        // If we did not have to access the model in the view
        // then we could use the default behavior and return
        // [bkList: bkList]
    }
}
