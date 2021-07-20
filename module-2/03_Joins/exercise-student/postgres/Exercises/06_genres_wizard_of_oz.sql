-- 6. The genres of "The Wizard of Oz" (3 rows)
SELECT genre_name
FROM movie
JOIN movie_genre on movie.movie_id = movie_genre.movie_id
JOIN genre on movie_genre.genre_id = genre.genre_id
WHERE title = 'The Wizard of Oz';

