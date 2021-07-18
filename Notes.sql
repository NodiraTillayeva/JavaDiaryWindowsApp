use Diary;
 create table Notes(
    Id INT DEFAULT NULL,
    Dates VARCHAR(10) DEFAULT NULL,
    Notes TEXT,
    FOREIGN KEY(Id) REFERENCES users(Id));