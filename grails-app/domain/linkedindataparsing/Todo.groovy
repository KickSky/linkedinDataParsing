package linkedindataparsing

class Todo {
    long id
    String message
    Boolean isActive = true
    Date dateCreated
    String createdBy
    String updatedBy
    Date lastUpdated
    static constraints = {
        updatedBy nullable: true
        lastUpdated nullable: true
    }
}
