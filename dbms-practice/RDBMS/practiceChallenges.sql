-- Challenge 1: Create database and select it
CREATE DATABASE covid_db;

USE covid_db;


-- Challenge 1: Create covid_cases table
CREATE TABLE covid_cases (
    id INT PRIMARY KEY AUTO_INCREMENT,
    `date` DATE NOT NULL,
    `time` TIME NOT NULL,
    state VARCHAR(100) NOT NULL,
    confirmed_indian_national INT DEFAULT 0,
    confirmed_foreign_national INT DEFAULT 0,
    recoveries INT DEFAULT 0,
    deaths INT DEFAULT 0,
    confirmed_cases INT DEFAULT 0
);


-- Challenge 2: Insert initial COVID data
INSERT INTO covid_cases (
    `date`,
    `time`,
    state,
    confirmed_indian_national,
    confirmed_foreign_national,
    recoveries,
    deaths,
    confirmed_cases
)
VALUES (
    '2020-03-15',
    '10:00:00',
    'India',
    0,
    0,
    50,
    2,
    100
);


-- Challenge 3: Update confirmed cases from 100 to 120
UPDATE covid_cases
SET confirmed_cases = 120
WHERE state = 'India'
  AND `date` = '2020-03-15';


-- Challenge 4: Delete incorrect record
DELETE FROM covid_cases
WHERE state = 'IN';


-- Challenge 5: Add vaccination rate column
ALTER TABLE covid_cases
ADD COLUMN vaccination_rate DECIMAL(5,2) DEFAULT 0.00;


-- Display final table data
SELECT * FROM covid_cases;