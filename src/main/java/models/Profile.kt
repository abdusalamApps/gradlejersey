package models

import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement
data class Profile(
        var id: Long = 0L,
        var profileName: String,
        var firstName: String,
        var lastName: String
) {
    constructor():this(id = 0, profileName = "", firstName = "", lastName = "")
}