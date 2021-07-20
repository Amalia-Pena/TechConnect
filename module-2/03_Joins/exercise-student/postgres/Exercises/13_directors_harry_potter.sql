-- 13. The directors of the movies in the "Harry Potter Collection" (4 rows)
SELECT DISTINCT person_name
FROM movie
JOIN collection on movie.collection_id = collection.collection_id
JOIN person p on movie.director_id = p.person_id
WHERE collection_name = 'Harry Potter Collection';

