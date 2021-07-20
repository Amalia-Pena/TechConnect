-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas (5 rows)

SELECT title
FROM movie
JOIN collection c on movie.collection_id = c.collection_id
JOIN person p on movie.director_id = p.person_id
WHERE collection_name = 'Star Wars Collection' AND person_name != 'George Lucas'
