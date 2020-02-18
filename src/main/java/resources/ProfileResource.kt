package resources

import database.Database
import models.Profile
import services.ProfileService
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/profiles")
class ProfileResource {

    var profileService = ProfileService()

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getProfiles(): List<Profile> {
        return profileService.getProfiles()
    }


}