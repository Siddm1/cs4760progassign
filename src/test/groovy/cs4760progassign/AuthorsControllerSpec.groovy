package cs4760progassign

import grails.testing.gorm.DataTest
import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class AuthorsControllerSpec extends Specification implements ControllerUnitTest<AuthorsController>, DataTest {
    void setupSpec(){
        mockDomains Author, Book
    }
    def 'Test the index method returns the correct model'(){
        given:
        new Author(name:"Author A")
                .addToBooks(new Book(title:"Title A", publishYear:1978))
                .addToBooks(new Book(title:"Title B", publishYear:1978))
                .save(flush: true, failOnError: true)
        new Author(name:"Author B")
                .addToBooks(new Book(title:"Title C", publishYear:1876))
                .addToBooks(new Book(title:"Title D", publishYear:1876))
                .save(flush: true, failOnError: true)
        new Author(name:"Author C")
                .addToBooks(new Book(title:"Title E", publishYear:2004))
                .addToBooks(new Book(title:"Title F", publishYear:2004))
                .save(flush: true, failOnError: true)

        when: 'The index action is executed'
        controller.index()

        then: 'The model is correct'
        model.authorList
        model.authorList.size == 3
        model.authorList == [
                [author: 'Author A', book:[title1: 'Title A', title2: 'Title B']],
                [author: 'Author B', book:[title1: 'Title C', title2: 'Title D']],
                [author: 'Author C', book:[title1: 'Title E', title2: 'Title F']]
        ]
    } // End 'Test the index method returns the correct model'
}