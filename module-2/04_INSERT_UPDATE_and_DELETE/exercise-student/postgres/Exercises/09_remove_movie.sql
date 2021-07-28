-- 9. Remove "Memento" from the movie table
-- You'll have to remove data from two other tables before you can remove it (13 rows, 2 rows, 1 row)

delete from movie_actor
where movie_id = (select movie_id from movie where title = 'Memento');


delete from movie genre
where movie_id = (select movie_id from movie where title = 'Memento');

delete from movie
where title = 'Memento';

--I can't quite figure out where I went wrong here
