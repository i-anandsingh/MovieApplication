package com.movie.details.insertmovie.api.models.request;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "MovieProject")
public class MovieDetailsRequestModel {
    private String Title;
}
