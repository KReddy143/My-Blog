package com.myblog.payload;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data

public class PostDto {

    private Long id;
    @NotEmpty(message = "title is Mandatory")
    @Size(min = 2, message = "post title should have at least 2 characters")
    private String title;
    @NotEmpty(message = "description is Mandatory")
    @Size(min = 10, message = "post description should have at least 10 characters")
    private String description;
    @NotEmpty(message = "is Mandatory")
    @Size(min = 10, message = "post content should have at least 10 characters")
    private String content;
}
