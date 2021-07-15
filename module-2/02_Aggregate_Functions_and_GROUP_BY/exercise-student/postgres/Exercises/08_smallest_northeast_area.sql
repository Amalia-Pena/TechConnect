-- 8. The area of the state with the smallest population in the "Northeast" census region. Name the column 'smallest_northeast_area'.
-- Expected answer is around 4,000
-- (1 row)
SELECT MIN(population) AS smallest_northeast_area, area
FROM state
WHERE census_region = 'Northeast'
GROUP BY area
ORDER BY area

-- need to include MIN(population)

