-- 3. For all actors with the last name of "Jones", display the actor's name and movie titles they appeared in. Order the results by the actor names (A-Z). (48 rows)
SELECT person_name, title
FROM person
JOIN movie_actor on person.person_id = movie_actor.actor_id
JOIN movie on movie_actor.movie_id = movie.movie_id
WHERE person_name like '% Jones'
ORDER BY person_name


