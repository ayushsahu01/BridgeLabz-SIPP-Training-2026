-- Use Case 16
SELECT country,deaths
FROM covid_deaths
WHERE deaths>(
SELECT AVG(deaths)
FROM covid_deaths
);

-- Use Case 17
SELECT DISTINCT country
FROM covid_cases
WHERE country IN(
SELECT country
FROM covid_cases
GROUP BY country
HAVING MAX(confirmed_cases)>1000000
);

-- Use Case 18
SELECT c1.date,
       c1.confirmed_cases
FROM covid_cases c1
WHERE c1.state='Mumbai'
AND c1.confirmed_cases=(
SELECT MAX(c2.confirmed_cases)
FROM covid_cases c2
WHERE c2.state=c1.state
);

-- Use Case 19
SELECT country,
       vaccinated AS population_count,
       'Vaccinated' AS status
FROM covid_vaccines
UNION
SELECT country,
       population-vaccinated AS population_count,
       'Unvaccinated' AS status
FROM covid_vaccines;

-- Use Case 20
SELECT DISTINCT country
FROM covid_deaths
WHERE country NOT IN(
SELECT country
FROM covid_cases
);