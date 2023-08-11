package com.myblog.payload;

import com.myblog.entity.Post;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class CommentDto {
    private Long id;
    @NotEmpty(message = "name is Mandatory")
    @Size(min = 4, message = "comment name should have at least 4 characters")
    private String name;
    @NotEmpty
    @Email
    private String email;
    @NotEmpty(message = "body is Mandatory")
    @Size(min = 5, message = "body should have at least 5 characters")
    private String body;

}
