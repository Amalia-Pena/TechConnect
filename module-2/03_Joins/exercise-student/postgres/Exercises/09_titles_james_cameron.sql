-- 9. The titles of movies directed by James Cameron (6 rows)
SELECT title
FROM movie
JOIN person on movie.director_id = person.person_id
WHERE person_name = 'James Cameron'

