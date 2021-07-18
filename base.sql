Create database Diary;
use Diary;
Create table Users(Id INT(3) not null auto_increment primary key,
                    UserName VARCHAR(20) not null,
                    Name VARCHAR(20) not null,
                    Password VARCHAR(20) not null);
