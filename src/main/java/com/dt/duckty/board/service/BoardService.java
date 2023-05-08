package com.dt.duckty.board.service;

import com.dt.duckty.board.domain.Board;
import com.dt.duckty.board.domain.support.BoardDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BoardService {

    /**
     * 게시글 목록 가져오기
     */
    List<BoardDto> getBoardList();

    /**
     * 게시글 가져오기
     */
    BoardDto getBoard(Long id);

    /**
     * 게시글 등록
     */
    Board create(BoardDto boardDto);

    /**
     * 게시글 수정
     */
    Board update(BoardDto boardDto);

    /**
     * 게시글 삭제
     */
    void delete(Long id);

}
