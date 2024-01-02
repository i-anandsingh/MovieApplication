package com.movie.details.insertmovie.controller;

import com.movie.details.insertmovie.api.models.request.MovieDetailsRequestModel;
import com.movie.details.insertmovie.api.models.response.MovieDetailsResponseModel;
import com.movie.details.insertmovie.mapper.InsertMovieServiceToApiMapper;
import com.movie.details.insertmovie.service.InsertMovieDetailsService;
import com.movie.details.insertmovie.service.models.request.MovieDetailsInputDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@Validated
public class InsertMovieDetailsController {
    @Autowired
    InsertMovieDetailsService insertMovieDetailsService;

    InsertMovieServiceToApiMapper mapper = InsertMovieServiceToApiMapper.INSTANCE;

    @Operation(summary = "Enables the User to insert movie data into the database.", response = {
            @ApiResponse(responseCode = "400", description = "Bad Request", content = {
                    @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "401", description = "Unauthorized User", content = {
                    @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "405", description = "Unsupported Http Method", content = {
                    @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "415", description = "Unsupported Media Type", content = {
                    @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "201", description = "Operation Successful", content =
                @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = MovieDetailsResponseModel.class))
            )})
    @PostMapping(value = "/insert-movie", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MovieDetailsResponseModel> insertMovieDetails( @RequestBody MovieDetailsRequestModel movieDetailsRequestModel) {
        MovieDetailsInputDTO movieDetailsInputDTO = mapper.getServiceInput(movieDetailsRequestModel);

    }
}
