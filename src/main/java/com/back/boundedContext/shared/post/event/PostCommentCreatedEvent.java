package com.back.boundedContext.shared.post.event;

import com.back.boundedContext.shared.post.dto.PostCommentDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PostCommentCreatedEvent {
    private final PostCommentDto postComment;
}
