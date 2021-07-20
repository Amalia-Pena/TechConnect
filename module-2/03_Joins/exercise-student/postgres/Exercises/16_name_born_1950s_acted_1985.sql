-- 16. The names and birthdays of actors born in the 1950s who acted in movies that were released in 1985 (20 rows)
SELECT person_name, birthday, release_date
FROM movie
         JOIN movie_actor on movie.movie_id = movie_actor.movie_id
         JOIN person on movie_actor.actor_id = person.person_id

