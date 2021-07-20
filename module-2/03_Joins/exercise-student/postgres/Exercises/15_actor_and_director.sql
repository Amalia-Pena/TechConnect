-- 15. The title of the movie and the name of director for movies where the director was also an actor in the same movie (73 rows)
SELECT title, person_name
FROM movie
JOIN movie_actor on movie.movie_id = movie_actor.movie_id
JOIN person on movie_actor.actor_id = person.person_id
WHERE actor_id = director_id;
