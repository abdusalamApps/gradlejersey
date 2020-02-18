package models

import java.util.*
import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement
class Message (
        var id: Long,
        var message: String,
        var created: Date = Date(),
        var author: String
) {

    constructor(): this(0L, "", Date(),"")

    }
