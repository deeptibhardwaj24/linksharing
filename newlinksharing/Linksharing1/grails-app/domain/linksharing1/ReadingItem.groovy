package linksharing1

class ReadingItem {
Boolean isRead
static belongsTo=[user:User,resource:Resource]
    static constraints = {
    }
}
