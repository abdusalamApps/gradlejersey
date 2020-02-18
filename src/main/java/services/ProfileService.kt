package services

import database.Database
import models.Message
import models.Profile


class ProfileService {

    var profiles: HashMap<Long, Profile> = Database.profiles

    init {
        profiles[0L] = Profile(id = 0L, profileName = "Abdo", firstName = "Abdo", lastName = "Abdo")
        profiles[1L] = Profile(id = 1L, profileName = "Hassan", firstName = "Hassan", lastName = "Hassan")
    }

    fun getProfiles(): List<Profile> {
        return ArrayList(profiles.values)
    }

    fun getProfileById(id: Long): Profile? {
        return profiles[id]
    }

    fun addProfile(profile: Profile): Profile? {
        profile.id = profiles.size + 1L
        profiles[profile.id] = profile
        return profile
    }

    fun updateProfile(profile: Profile): Profile? {
        if (profile.id < 0) return null
        profiles[profile.id] = profile
        return profile
    }

    fun removeMessage(id: Long): Profile? {
        return profiles.remove(id)
    }

}