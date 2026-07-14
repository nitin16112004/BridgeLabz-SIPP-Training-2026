CREATE DATABASE covid_database;

USE covid_database;

CREATE TABLE covid_cases (
    case_id INT PRIMARY KEY AUTO_INCREMENT,
    country VARCHAR(100) NOT NULL,
    report_date DATE NOT NULL,
    confirmed_cases BIGINT DEFAULT 0,
    recoveries BIGINT DEFAULT 0,
    population BIGINT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE covid_deaths (
    death_id INT PRIMARY KEY AUTO_INCREMENT,
    country VARCHAR(100) NOT NULL,
    report_date DATE NOT NULL,
    deaths BIGINT DEFAULT 0
);

CREATE TABLE covid_vaccines (
    vaccine_id INT PRIMARY KEY AUTO_INCREMENT,
    country VARCHAR(100) NOT NULL,
    report_date DATE NOT NULL,
    vaccine_name VARCHAR(100),
    total_doses_given BIGINT DEFAULT 0,
    fully_vaccinated BIGINT DEFAULT 0
);

INSERT INTO covid_cases (
    country,
    report_date,
    confirmed_cases,
    recoveries,
    population
)
VALUES
('India', '2026-01-01', 5000, 4200, 1400000000),
('India', '2026-01-02', 5500, 4500, 1400000000),
('India', '2026-01-03', 5900, 4800, 1400000000),
('USA', '2026-01-01', 8000, 7000, 340000000),
('USA', '2026-01-02', 8500, 7300, 340000000),
('USA', '2026-01-03', 9000, 7600, 340000000),
('UK', '2026-01-01', 3000, 2600, 68000000),
('UK', '2026-01-02', 3200, 2750, 68000000),
('UK', '2026-01-03', 3500, 2900, 68000000);

UPDATE covid_cases
SET confirmed_cases = 5650
WHERE country = 'India'
  AND report_date = '2026-01-02';

INSERT INTO covid_cases (
    country,
    report_date,
    confirmed_cases,
    recoveries,
    population
)
VALUES
('IN', '2026-01-04', 6000, 5000, 1400000000);

DELETE FROM covid_cases
WHERE country = 'IN';

ALTER TABLE covid_cases
ADD COLUMN vaccination_rate DECIMAL(5,2) DEFAULT 0.00;

UPDATE covid_cases
SET vaccination_rate = 72.50
WHERE country = 'India'
  AND report_date = '2026-01-03';

ALTER TABLE covid_cases
ADD CONSTRAINT unique_country_date
UNIQUE (country, report_date);

SELECT * FROM covid_cases;