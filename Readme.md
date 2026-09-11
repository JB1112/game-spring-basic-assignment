# Crimson Citadel

Spring Boot를 이용한 게임 관리 API 프로젝트입니다.

## 기술 스택

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Docker

## 주요 기능

- 게임 생성
- 게임 목록 조회
- 게임 상세 조회
- 게임 진행도 저장
- 플레이어 이름 변경
- 게임 삭제

## API

### 게임 생성

`POST /games`

### 게임 목록 조회

`GET /games`

### 게임 상세 조회

`GET /games/{gameId}`

### 게임 진행도 저장

`PUT /games/{gameId}/progress`

### 게임 이름 변경

`PATCH /games/{gameId}`

### 게임 삭제

`DELETE /games/{gameId}`