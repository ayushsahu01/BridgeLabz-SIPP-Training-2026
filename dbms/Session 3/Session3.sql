USE covid;

-- Question 1
SELECT c.country_name, cc.confirmed_cases
FROM covid_cases cc
INNER JOIN countries c
ON cc.country_id = c.country_id
WHERE cc.date = '2021-05-01'
ORDER BY cc.confirmed_cases DESC
LIMIT 1;

-- Question 2
SELECT
c.country_name,
d.date,
d.deaths,
v.vaccination_status
FROM covid_deaths d
LEFT JOIN covid_vaccines v
ON d.country_id = v.country_id
AND d.date = v.date
INNER JOIN countries c
ON d.country_id = c.country_id;

-- Question 3
SELECT
ct.continent_name,
SUM(cc.deaths) AS total_deaths
FROM covid_cases cc
INNER JOIN countries c
ON cc.country_id = c.country_id
INNER JOIN continents ct
ON c.continent_id = ct.continent_id
GROUP BY ct.continent_name;

-- Question 4
SELECT
date,
AVG(deaths) AS average_daily_deaths
FROM covid_deaths
GROUP BY date
ORDER BY date;

-- Question 5
SELECT
country_name,
confirmed_cases,
population,
(confirmed_cases * 100.0 / population) AS infection_rate
FROM covid_cases cc
INNER JOIN countries c
ON cc.country_id = c.country_id
ORDER BY infection_rate DESC;