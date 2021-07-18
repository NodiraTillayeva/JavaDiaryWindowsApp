use Diary;
 create table Plans(
    Id INT DEFAULT NULL,
    Dates VARCHAR(10) DEFAULT NULL,
    Plan1 TEXT,
    Plan2 TEXT,
    Plan3 TEXT,
    Plan4 TEXT,
    Plan5 TEXT,
    Plan6 TEXT,
    Plan7 TEXT,
    Plan8 TEXT,
    FOREIGN KEY(Id) REFERENCES users(Id));