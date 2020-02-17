package models

import java.util.*
import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement
data class Message (
        private var text: String,
        private var id: Long,
        private var created: Date = Date(),
        private var author: String
) {
    constructor(): this("", 0, Date(), "")
}