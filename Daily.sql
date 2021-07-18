use Diary;
 create table Daily(
    Id INT DEFAULT NULL,
    Dates VARCHAR(10) DEFAULT NULL,
    ChBox1 INT(1),
    ChBox2 INT(1),
    ChBox3 INT(1),
    ChBox4 INT(1),
    FOREIGN KEY(Id) REFERENCES users(Id));