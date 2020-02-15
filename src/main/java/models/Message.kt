package models

import java.util.*
import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement
public class Message (
        private var text: String,
        private var id: Long,
        private var created: Date = Date(),
        private var author: String
)