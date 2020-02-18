package models

import java.util.*
import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement
data class Message(
        var id: Long,
        var message: String,
        var created: Date = Date(),
        var author: String
) {

    constructor() : this(id = 0, message = "", author = "", created = Date())

    override fun toString(): String {
        return " $id, $message, $created, $author"
    }

}
