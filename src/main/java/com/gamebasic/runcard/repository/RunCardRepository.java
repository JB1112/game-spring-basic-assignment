package com.gamebasic.runcard.repository;

import com.gamebasic.game.entity.Game;
import com.gamebasic.runcard.dto.DeckCount;
import com.gamebasic.runcard.entity.RunCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RunCardRepository extends JpaRepository<RunCard, Long> {
    List<RunCard> findAllByGameOrderByIdAsc(Game game);

    void deleteAllByGame(Game game); //게임을 지울때 이걸 사용

    Game game(Game game);

    @Query("""
    SELECT new com.gamebasic.runcard.dto.DeckCount(r.game.id, COUNT(r.id))
    FROM RunCard r
    WHERE r.game IN :games
    GROUP BY r.game.id
""")
    List<DeckCount> countByGames(List<Game> games);
}
