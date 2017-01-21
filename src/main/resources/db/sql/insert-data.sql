
INSERT INTO `users` (`userId`,`name`,`phone`,`email`) VALUES (1,'Coby Kim','(284) 363-0901','feugiat@euodio.org');
INSERT INTO `users` (`userId`,`name`,`phone`,`email`) VALUES (2,'Sylvester Blake','(141) 303-7349','elit.dictum@nuncullamcorpereu.com');
INSERT INTO `users` (`userId`,`name`,`phone`,`email`) VALUES (3,'Tanek Dawson','(631) 836-4311','mauris@elit.ca');
INSERT INTO `users` (`userId`,`name`,`phone`,`email`) VALUES (4,'Colton Spence','(698) 800-5196','sodales.Mauris.blandit@quamelementum.net');
INSERT INTO `users` (`userId`,`name`,`phone`,`email`) VALUES (5,'Anthony Finch','(422) 727-1952','ridiculus@eutelluseu.com');
INSERT INTO `users` (`userId`,`name`,`phone`,`email`) VALUES (6,'Jarrod Benson','(208) 967-8384','metus.Aenean@vitaesodalesnisi.com');
INSERT INTO `users` (`userId`,`name`,`phone`,`email`) VALUES (7,'Herman Hogan','(769) 529-8542','ac.orci.Ut@vitaepurusgravida.ca');
INSERT INTO `users` (`userId`,`name`,`phone`,`email`) VALUES (8,'Erich Sparks','(287) 722-0245','vehicula.et.rutrum@Praesent.org');
INSERT INTO `users` (`userId`,`name`,`phone`,`email`) VALUES (9,'Leonard Battle','(740) 789-9818','feugiat@non.co.uk');
INSERT INTO `users` (`userId`,`name`,`phone`,`email`) VALUES (10,'Wang Huber','(291) 717-3762','a@NullamnislMaecenas.co.uk');



INSERT INTO `books` (`bookId`,`title`,`author`,`isbn`) VALUES (1,'arcu. Sed et libero.','Hedda Griffith','E53402F0-1292-0398-D0C8-A4FFEC436E00');
INSERT INTO `books` (`bookId`,`title`,`author`,`isbn`) VALUES (2,'augue id ante dictum','Laurel Christensen','26FD4405-E36A-D14E-A598-DCE416E08DC1');
INSERT INTO `books` (`bookId`,`title`,`author`,`isbn`) VALUES (3,'Nullam velit dui, semper','Georgia Horton','EDB8252E-52A9-BE16-A3DA-8AA7C51E6F38');
INSERT INTO `books` (`bookId`,`title`,`author`,`isbn`) VALUES (4,'Duis risus odio, auctor','Sylvia Henry','5B358421-4537-E6D3-9539-0F2306006483');
INSERT INTO `books` (`bookId`,`title`,`author`,`isbn`) VALUES (5,'tincidunt, neque vitae semper','Serina Yates','276C14DC-C790-CD8F-4A27-5B5E1BB0F96F');
INSERT INTO `books` (`bookId`,`title`,`author`,`isbn`) VALUES (6,'parturient montes, nascetur ridiculus','Stacy Swanson','85CC4B42-FC04-D179-CD66-B19E033CD3BD');
INSERT INTO `books` (`bookId`,`title`,`author`,`isbn`) VALUES (7,'parturient montes, nascetur ridiculus','Phoebe Erickson','AADDDF04-6359-697E-6318-03C86E481F27');
INSERT INTO `books` (`bookId`,`title`,`author`,`isbn`) VALUES (8,'Nunc ut erat. Sed','Xerxes Pope','24F2B158-92ED-543D-7EA4-1B5B95777F7C');
INSERT INTO `books` (`bookId`,`title`,`author`,`isbn`) VALUES (9,'vel, venenatis vel, faucibus','Odessa Ellis','0F6D0C6F-04E5-9BFA-C25E-5D3A64933298');
INSERT INTO `books` (`bookId`,`title`,`author`,`isbn`) VALUES (10,'erat. Etiam vestibulum massa','Simone Irwin','67E058B5-BF79-599D-7240-C962601D7563');


INSERT INTO users_books (`userId`,`bookId`,`learningDate`) VALUES (1,2, TIMESTAMPADD(MONTH,-2, CURRENT_TIMESTAMP));
INSERT INTO users_books (`userId`,`bookId`,`learningDate`) VALUES (2,4, TIMESTAMPADD(DAY,-9, CURRENT_TIMESTAMP));
INSERT INTO users_books (`userId`,`bookId`,`learningDate`) VALUES (3,5, TIMESTAMPADD(MONTH,-3, CURRENT_TIMESTAMP));
INSERT INTO users_books (`userId`,`bookId`,`learningDate`) VALUES (3,3, TIMESTAMPADD(YEAR,-2, CURRENT_TIMESTAMP));
INSERT INTO users_books (`userId`,`bookId`,`learningDate`) VALUES (3,1, TIMESTAMPADD(YEAR,-2, CURRENT_TIMESTAMP));
INSERT INTO users_books (`userId`,`bookId`,`learningDate`) VALUES (4,3, TIMESTAMPADD(DAY,-12, CURRENT_TIMESTAMP));
INSERT INTO users_books (`userId`,`bookId`,`learningDate`) VALUES (5,7, TIMESTAMPADD(DAY,-2, CURRENT_TIMESTAMP));