/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appsdeveloperblog.app.ws.ui.entrypoints;

import com.appsdeveloperblog.app.ws.annotations.Secured;
import com.appsdeveloperblog.app.ws.service.UsersService;
import com.appsdeveloperblog.app.ws.service.impl.UsersServiceImpl;
import com.appsdeveloperblog.app.ws.shared.dto.UserDTO;
import com.appsdeveloperblog.app.ws.ui.model.request.CreateUserRequestModel;
import com.appsdeveloperblog.app.ws.ui.model.request.UpdateUserRequestModel;
import com.appsdeveloperblog.app.ws.ui.model.response.DeleteUserProfileResponseModel;
import com.appsdeveloperblog.app.ws.ui.model.response.RequestOperation;
import com.appsdeveloperblog.app.ws.ui.model.response.ResponseStatus;
import com.appsdeveloperblog.app.ws.ui.model.response.UserProfileRest;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author sergeykargopolov
 */
@Path("/users")
public class UsersEntryPoint {
    
    @Autowired
    UsersService userService;
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON,  MediaType.APPLICATION_XML} )
    public UserProfileRest createUser(CreateUserRequestModel requestObject) {
        UserProfileRest returnValue = new UserProfileRest();
        
        // Prepare UserDTO
        UserDTO userDto = new UserDTO();
        BeanUtils.copyProperties(requestObject, userDto);
        
        // Create new user 
        UserDTO createdUserProfile = userService.createUser(userDto);
 
        //Prepare response
         BeanUtils.copyProperties(createdUserProfile, returnValue);
         
        return returnValue;
    }
 
    @Secured
    @GET
    @Path("/{id}")
    @Produces({ MediaType.APPLICATION_JSON,  MediaType.APPLICATION_XML} )
    public UserProfileRest getUserProfile(@PathParam("id") String id)
    {
        UserProfileRest returnValue = null;

        UserDTO userProfile = userService.getUser(id);
                
        returnValue = new UserProfileRest();
        BeanUtils.copyProperties(userProfile, returnValue);
        
        return returnValue;
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<UserProfileRest> getUsers(@DefaultValue("0") @QueryParam("start") int start, 
            @DefaultValue("50") @QueryParam("limit") int limit) {

        List<UserDTO> users = userService.getUsers(start, limit);
        
        // Prepare return value 
        List<UserProfileRest> returnValue = new ArrayList<UserProfileRest>();
        for (UserDTO userDto : users) {
            UserProfileRest userModel = new UserProfileRest();
            BeanUtils.copyProperties(userDto, userModel);
            userModel.setHref("/users/" + userDto.getUserId());
            returnValue.add(userModel);
        }
        
        return returnValue;
 }
    
    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public UserProfileRest updateUserDetails(@PathParam("id") String id,
            UpdateUserRequestModel userDetails) {
        
        UserDTO storedUserDetails = userService.getUser(id);
        
         // Set only those fields you would like to be updated with this request
        if(userDetails.getFirstName() !=null && !userDetails.getFirstName().isEmpty())
        {
            storedUserDetails.setFirstName(userDetails.getFirstName());  
        }
        storedUserDetails.setLastName(userDetails.getLastName());
        
        // Update User Details
        userService.updateUserDetails(storedUserDetails);
        
        // Prepare return value 
        UserProfileRest returnValue = new UserProfileRest();
        BeanUtils.copyProperties(storedUserDetails, returnValue);


        return returnValue;
 }
    @Secured
    @DELETE
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public DeleteUserProfileResponseModel deleteUserProfile(@PathParam("id") String id) {
        DeleteUserProfileResponseModel returnValue = new DeleteUserProfileResponseModel();
        returnValue.setRequestOperation(RequestOperation.DELETE);
        
        UserDTO storedUserDetails = userService.getUser(id);
 
        userService.deleteUser(storedUserDetails);

        returnValue.setResponseStatus(ResponseStatus.SUCCESS);
 
        return returnValue;
    }
    
}
