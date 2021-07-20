-- 14. The names of actors who've appeared in the movies in the "Back to the Future Collection" (28 rows)

SELECT DISTINCT person_name
FROM movie
JOIN collection on movie.collection_id = collection.collection_id
JOIN movie_actor on movie.movie_id = movie_actor.movie_id
JOIN person on movie_actor.actor_id = person.person_id
WHERE collection_name = 'Back to the Future Collection'
