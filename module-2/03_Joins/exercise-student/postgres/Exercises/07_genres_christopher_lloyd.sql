-- 7. The genres of movies that Christopher Lloyd has appeared in (8 rows)
-- Hint: DISTINCT will prevent duplicate values in your query results.

SELECT DISTINCT genre_name
FROM movie
JOIN movie_genre on movie.movie_id = movie_genre.movie_id
JOIN genre on movie_genre.genre_id = genre.genre_id
JOIN movie_actor on movie.movie_id = movie_actor.movie_id
JOIN person on movie_actor.actor_id = person.person_id
WHERE person_name = 'Christopher Lloyd'

