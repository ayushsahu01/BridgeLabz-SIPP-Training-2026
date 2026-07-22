CREATE DATABASE covid_db;
USE covid_db;

CREATE TABLE covid_cases (
    country VARCHAR(100),
    report_date DATE,
    confirmed_cases INT,
    deaths INT,
    recovered INT,
    infection_rate DECIMAL(5,2)
);

CREATE TABLE covid_vaccines (
    country VARCHAR(100),
    report_date DATE,
    total_vaccinated INT
);

-- Composite Index
CREATE INDEX idx_country_date
ON covid_cases(country, report_date);

-- Single Column Index
CREATE INDEX idx_report_date
ON covid_cases(report_date);

-- Example Query
SELECT *
FROM covid_cases
WHERE country = 'India'
AND report_date = '2024-05-01';


CREATE INDEX idx_infection_rate
ON covid_cases(infection_rate, country);

-- Top 10 Countries by Infection Rate
SELECT country, infection_rate
FROM covid_cases
ORDER BY infection_rate DESC
LIMIT 10;


EXPLAIN
SELECT c.country,
       c.confirmed_cases,
       v.total_vaccinated
FROM covid_cases c
JOIN covid_vaccines v
ON c.country = v.country
WHERE c.country = 'India';


START TRANSACTION;

INSERT INTO covid_vaccines
VALUES ('India','2024-05-01',1000000);

INSERT INTO covid_vaccines
VALUES ('USA','2024-05-01',1500000);

COMMIT;

-- Rollback Example

START TRANSACTION;

INSERT INTO covid_vaccines
VALUES ('India','2024-05-02',1200000);

INSERT INTO covid_vaccines
VALUES (NULL,'2024-05-02',100000);

ROLLBACK;


-- Transaction 1
START TRANSACTION;

UPDATE covid_cases
SET confirmed_cases = 50000
WHERE country = 'India';


-- Transaction 2
SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED;

SELECT confirmed_cases
FROM covid_cases
WHERE country = 'India';

SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED;


SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED;

START TRANSACTION;

SELECT confirmed_cases
FROM covid_cases
WHERE country = 'India';

-- Another Transaction
UPDATE covid_cases
SET confirmed_cases = 70000
WHERE country = 'India';

COMMIT;

-- Transaction 1 reads again
SELECT confirmed_cases
FROM covid_cases
WHERE country = 'India';

SET SESSION TRANSACTION ISOLATION LEVEL REPEATABLE READ;


START TRANSACTION;

SELECT *
FROM covid_cases
WHERE confirmed_cases > 50000;

-- Another Transaction
INSERT INTO covid_cases
VALUES ('Brazil','2024-05-01',60000,500,55000,85.30);

COMMIT;

-- Transaction 1 reads again
SELECT *
FROM covid_cases
WHERE confirmed_cases > 50000;

-- Prevent Phantom Read
SET SESSION TRANSACTION ISOLATION LEVEL SERIALIZABLE;
