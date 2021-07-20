BEGIN TRANSACTION ;
TRUNCATE park_state, park, city, state CASCADE;

INSERT INTO state (state_abbreviation, state_name, population, area, sales_tax, state_nickname, census_region) VALUES ('AL', 'Alabama', 4903185, 135767, 4, 'Heart of Dixie', 'South');
INSERT INTO state (state_abbreviation, state_name, population, area, sales_tax, state_nickname, census_region) VALUES ('AK', 'Alaska', 731545, 1723337, 0, 'The Last Frontier', 'West');
INSERT INTO state (state_abbreviation, state_name, population, area, sales_tax, state_nickname, census_region) VALUES ('AS', 'American Samoa', 57400, 1505, 0, 'Motu o Fiafiaga', NULL);

-- data collected February 10, 2021
-- city name, population (see notes below), area (sq km, 2016 data) - https://en.wikipedia.org/wiki/List_of_United_States_cities_by_population
-- population notes:
--		For the cities listed on wikipedia page link above, 2019 population estimate used
--		Some capitals aren't "cities" because population < 100,000. Population/area data retrieved from those individual Wikipedia pages or other sources, usually with 2019 estimates, but some is 2010 census
INSERT INTO city (city_name, state_abbreviation, population, area) VALUES ('Abilene', 'TX', 123420, 276.4);
INSERT INTO city (city_name, state_abbreviation, population, area) VALUES ('Akron', 'OH', 197597, 160.6);
INSERT INTO city (city_name, state_abbreviation, population, area) VALUES ('Albany', 'NY', 96460, 56.8243806);


-- set captials now that cities are populated
UPDATE state SET capital = (SELECT city_id FROM city c WHERE city_name = 'Montgomery' and state_abbreviation = 'AL') WHERE state_name = 'Alabama';
UPDATE state SET capital = (SELECT city_id FROM city c WHERE city_name = 'Juneau' and state_abbreviation = 'AK') WHERE state_name = 'Alaska';
UPDATE state SET capital = (SELECT city_id FROM city c WHERE city_name = 'Phoenix' and state_abbreviation = 'AZ') WHERE state_name = 'Arizona';

-- data collected February 10, 2021
-- park name, area (sq km, 2019 data) - https://en.wikipedia.org/wiki/List_of_national_parks_of_the_United_States
-- has_camping - https://www.nps.gov/subjects/camping/campground.htm
INSERT INTO park (park_name, date_established, area, has_camping) VALUES ('Acadia', '2/26/1919', 198.6, true);
INSERT INTO park (park_name, date_established, area, has_camping) VALUES ('American Samoa', '10/31/1988', 33.4, false);
INSERT INTO park (park_name, date_established, area, has_camping) VALUES ('Arches', '11/12/1971', 310.3, true);

-- park states - https://en.wikipedia.org/wiki/List_of_national_parks_of_the_United_States
INSERT INTO park_state (park_id, state_abbreviation) VALUES ((SELECT park_id FROM park WHERE park_name = 'Acadia'), 'ME');
INSERT INTO park_state (park_id, state_abbreviation) VALUES ((SELECT park_id FROM park WHERE park_name = 'American Samoa'), 'AS');
INSERT INTO park_state (park_id, state_abbreviation) VALUES ((SELECT park_id FROM park WHERE park_name = 'Arches'), 'UT');

-- foreign keys
ALTER TABLE state ADD CONSTRAINT FK_state_city FOREIGN KEY(capital) REFERENCES city(city_id);

ALTER TABLE city ADD CONSTRAINT FK_city_state FOREIGN KEY(state_abbreviation) REFERENCES state(state_abbreviation);

ALTER TABLE park_state ADD CONSTRAINT FK_park_state_park FOREIGN KEY(park_id) REFERENCES park(park_id);

ALTER TABLE park_state ADD CONSTRAINT FK_park_state_state FOREIGN KEY(state_abbreviation) REFERENCES state(state_abbreviation);

ALTER TABLE state ALTER COLUMN capital SET NOT NULL;

COMMIT ;
