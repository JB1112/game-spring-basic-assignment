package com.gamebasic.runcard.dto;

public class DeckCount {
    private final Long gameId;
    private final Long cardCount;

    public DeckCount(Long gameId, Long cardCount) {
        this.gameId = gameId;
        this.cardCount = cardCount;
    }

    public Long getGameId() { return gameId; }
    public Long getCardCount() { return cardCount; }
}