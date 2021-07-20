-- 2. The names and birthdays of actors in "The Fifth Element" (15 rows)
SELECT person_name, birthday
FROM movie
JOIN movie_actor on movie.movie_id = movie_actor.movie_id
JOIN person on movie_actor.actor_id = person.person_id
WHERE title = 'The Fifth Element';


