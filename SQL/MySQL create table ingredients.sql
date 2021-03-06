create table INGREDIENTS(
   ID INT NOT NULL AUTO_INCREMENT,
   NAME VARCHAR(200) NOT NULL,
   QUANTITY VARCHAR(500) NOT NULL,
   UNIT VARCHAR(1000) NOT NULL,
   RECIPE_ID INT NOT NULL,
   PRIMARY KEY ( ID ),
   FOREIGN KEY (RECIPE_ID)
        REFERENCES RECIPES(ID)
        ON DELETE CASCADE
);