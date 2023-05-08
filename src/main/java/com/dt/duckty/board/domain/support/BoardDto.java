package com.dt.duckty.board.domain.support;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class BoardDto {
    private Long idx;
    private String title;
    private String contents;
    private String author;
    private String createdAt;

    public BoardDto(Long idx, String title, String contents, String author, String createdAt) {
        this.idx = idx;
        this.title = title;
        this.contents = contents;
        this.author = author;
        this.createdAt = createdAt;
    }
}


