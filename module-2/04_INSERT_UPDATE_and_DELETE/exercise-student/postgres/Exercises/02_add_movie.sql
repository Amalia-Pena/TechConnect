-- 2. Add "Euclidean Pi" to the movie table. The overview
-- is "The epic story of Euclid as a pizza delivery boy in ancient Greece" and
-- was released 3/14/2015. Since its an epic, the run length
-- is 3 hours and 14 minutes (194 minutes). (1 row)

insert into movie (title, overview, tagline, poster_path, home_page, release_date, length_minutes, director_id, collection_id)
values ('Euclidean Pi','The epic story of Euclid as a pizza delivery boy in ancient Greece', 'none', 'none', 'none', '3/14/2015', 194, 4, 5)

-- I think I need to include a sub select statement for the director_id and collection_id

