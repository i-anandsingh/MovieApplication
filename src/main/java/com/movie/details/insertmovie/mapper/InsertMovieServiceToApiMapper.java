package com.movie.details.insertmovie.mapper;

import com.movie.details.insertmovie.api.models.request.MovieDetailsRequestModel;
import com.movie.details.insertmovie.service.models.request.MovieDetailsInputDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface InsertMovieServiceToApiMapper {
    InsertMovieServiceToApiMapper INSTANCE = Mappers.getMapper(InsertMovieServiceToApiMapper.class);
    public MovieDetailsInputDTO getServiceInput(MovieDetailsRequestModel movieDetailsRequestModel);
}
