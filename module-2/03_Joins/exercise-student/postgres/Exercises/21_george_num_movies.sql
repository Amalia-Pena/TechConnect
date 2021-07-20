-- 21. For every person in the person table with the first name of "George", list the number of movies they've been in
-- --include all Georges, even those that have not appeared in any movies. Display the names in alphabetical order. (59 rows)
-- Name the count column 'num_of_movies'

SELECT person_name, COUNT(person_name) AS num_of_movies
FROM movie
         JOIN movie_actor on movie.movie_id = movie_actor.movie_id
         JOIN person on movie_actor.actor_id = person.person_id
WHERE person_name like 'George %'
GROUP BY person_name

-- I think I was supposed to do a left or right join but I couldn't figure out how to do that.
-- This right here doesn't show the Georges that have not appeared in any movies.
