package org.mbc.board.repository;

import org.mbc.board.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
    // extends JpaRepository<엔티티 클래스, pk 타입>
    // JpaRepository는 jpa에서 미리 만들어놓은 인터페이스로 crud와 페이징 처리, 정렬 등이 존재한다.
}
