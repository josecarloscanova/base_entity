------------------------------------------------------------------
-- DataNucleus SchemaTool (ran at 02/08/2014 11:30:34)
------------------------------------------------------------------
-- Complete schema required for the following classes:-
--     org.nanotek.base.AbstractBase
--     org.nanotek.base.BirthDateBase
--     org.nanotek.base.LongBase
--     org.nanotek.base.Name
--     org.nanotek.base.StringBase
--     org.nanotek.base.Work
--     org.nanotek.base.artist.Artist
--     org.nanotek.base.music.Record
--     org.nanotek.base.music.gender.MusicalGender
--
-- Table "MUSICALGENDER" for classes [org.nanotek.base.LongBase, org.nanotek.base.music.gender.MusicalGender]
CREATE TABLE "MUSICALGENDER"
(
    "ID" SERIAL,
    "GENDER" varchar(255) NULL,
    "ATTRIBUTES_ID" int8 NULL,
    CONSTRAINT "MUSICALGENDER_PK" PRIMARY KEY ("ID")
);

-- Table "NAME" for classes [org.nanotek.base.Name, org.nanotek.base.LongBase]
CREATE TABLE "NAME"
(
    "ID" SERIAL,
    "LASTNAME_ID" int8 NOT NULL,
    "FIRSTNAME_ID" int8 NOT NULL,
    "ATTRIBUTES_ID" int8 NULL,
    CONSTRAINT "NAME_PK" PRIMARY KEY ("ID")
);

-- Table "BIRTHDATEBASE" for classes [org.nanotek.base.LongBase, org.nanotek.base.BirthDateBase]
CREATE TABLE "BIRTHDATEBASE"
(
    "ID" SERIAL,
    "DATEBIRTH" date NOT NULL,
    "ATTRIBUTES_ID" int8 NULL,
    CONSTRAINT "BIRTHDATEBASE_PK" PRIMARY KEY ("ID")
);

-- Table "STRINGBASE" for classes [org.nanotek.base.LongBase, org.nanotek.base.StringBase]
CREATE TABLE "STRINGBASE"
(
    "ID" SERIAL,
    "VALUE" varchar(1000) NOT NULL,
    "ATTRIBUTES_ID" int8 NULL,
    "NICKNAMES_ID" int8 NULL,
    CONSTRAINT "STRINGBASE_PK" PRIMARY KEY ("ID")
);

-- Table "RECORD" for classes [org.nanotek.base.LongBase, org.nanotek.base.music.Record]
CREATE TABLE "RECORD"
(
    "ID" SERIAL,
    "TITLE_ID" int8 NULL,
    "ATTRIBUTES_ID" int8 NULL,
    CONSTRAINT "RECORD_PK" PRIMARY KEY ("ID")
);

-- Table "ARTIST" for classes [org.nanotek.base.LongBase, org.nanotek.base.artist.Artist]
CREATE TABLE "ARTIST"
(
    "ID" SERIAL,
    "BIRTHDATE_ID" int8 NULL,
    "NAME_ID" int8 NULL,
    "REALNAME_ID" int8 NULL,
    "ATTRIBUTES_ID" int8 NULL,
    "PARTICIPANTS_ID" int8 NULL,
    CONSTRAINT "ARTIST_PK" PRIMARY KEY ("ID")
);

-- Table "LOCALIZEDSTRING" for classes [org.nanotek.base.LongBase, org.nanotek.base.LocalizedString]
CREATE TABLE "LOCALIZEDSTRING"
(
    "ID" SERIAL,
    "LOCALE" varchar(255) NULL,
    "VALUE_ID" int8 NULL,
    "ATTRIBUTES_ID" int8 NULL,
    CONSTRAINT "LOCALIZEDSTRING_PK" PRIMARY KEY ("ID")
);

-- Table "WORK" for classes [org.nanotek.base.LongBase, org.nanotek.base.Work]
CREATE TABLE "WORK"
(
    "ID" SERIAL,
    "WORKTYPE" int4 NOT NULL,
    "ATTRIBUTES_ID" int8 NULL,
    CONSTRAINT "WORK_PK" PRIMARY KEY ("ID")
);

-- Constraints for table "MUSICALGENDER" for class(es) [org.nanotek.base.LongBase, org.nanotek.base.music.gender.MusicalGender]
ALTER TABLE "MUSICALGENDER" ADD CONSTRAINT "MUSICALGENDER_FK1" FOREIGN KEY ("ATTRIBUTES_ID") REFERENCES "RECORD" ("ID") INITIALLY DEFERRED ;


-- Constraints for table "NAME" for class(es) [org.nanotek.base.Name, org.nanotek.base.LongBase]
ALTER TABLE "NAME" ADD CONSTRAINT "NAME_U1" UNIQUE ("FIRSTNAME_ID");

ALTER TABLE "NAME" ADD CONSTRAINT "NAME_U2" UNIQUE ("LASTNAME_ID");

ALTER TABLE "NAME" ADD CONSTRAINT "NAME_FK1" FOREIGN KEY ("FIRSTNAME_ID") REFERENCES "STRINGBASE" ("ID") INITIALLY DEFERRED ;

ALTER TABLE "NAME" ADD CONSTRAINT "NAME_FK2" FOREIGN KEY ("LASTNAME_ID") REFERENCES "STRINGBASE" ("ID") INITIALLY DEFERRED ;

ALTER TABLE "NAME" ADD CONSTRAINT "NAME_FK3" FOREIGN KEY ("ATTRIBUTES_ID") REFERENCES "RECORD" ("ID") INITIALLY DEFERRED ;

CREATE INDEX "NAME_N50" ON "NAME" ("LASTNAME_ID");

CREATE INDEX "NAME_N49" ON "NAME" ("FIRSTNAME_ID");


-- Constraints for table "BIRTHDATEBASE" for class(es) [org.nanotek.base.LongBase, org.nanotek.base.BirthDateBase]
ALTER TABLE "BIRTHDATEBASE" ADD CONSTRAINT "BIRTHDATEBASE_FK1" FOREIGN KEY ("ATTRIBUTES_ID") REFERENCES "RECORD" ("ID") INITIALLY DEFERRED ;


-- Constraints for table "STRINGBASE" for class(es) [org.nanotek.base.LongBase, org.nanotek.base.StringBase]
ALTER TABLE "STRINGBASE" ADD CONSTRAINT "STRINGBASE_FK2" FOREIGN KEY ("ATTRIBUTES_ID") REFERENCES "RECORD" ("ID") INITIALLY DEFERRED ;

ALTER TABLE "STRINGBASE" ADD CONSTRAINT "STRINGBASE_FK1" FOREIGN KEY ("NICKNAMES_ID") REFERENCES "ARTIST" ("ID") INITIALLY DEFERRED ;


-- Constraints for table "RECORD" for class(es) [org.nanotek.base.LongBase, org.nanotek.base.music.Record]
ALTER TABLE "RECORD" ADD CONSTRAINT "RECORD_FK1" FOREIGN KEY ("TITLE_ID") REFERENCES "LOCALIZEDSTRING" ("ID") INITIALLY DEFERRED ;

ALTER TABLE "RECORD" ADD CONSTRAINT "RECORD_FK2" FOREIGN KEY ("ATTRIBUTES_ID") REFERENCES "RECORD" ("ID") INITIALLY DEFERRED ;

CREATE INDEX "RECORD_N49" ON "RECORD" ("TITLE_ID");


-- Constraints for table "ARTIST" for class(es) [org.nanotek.base.LongBase, org.nanotek.base.artist.Artist]
ALTER TABLE "ARTIST" ADD CONSTRAINT "ARTIST_U1" UNIQUE ("BIRTHDATE_ID");

ALTER TABLE "ARTIST" ADD CONSTRAINT "ARTIST_FK1" FOREIGN KEY ("BIRTHDATE_ID") REFERENCES "BIRTHDATEBASE" ("ID") INITIALLY DEFERRED ;

ALTER TABLE "ARTIST" ADD CONSTRAINT "ARTIST_FK2" FOREIGN KEY ("NAME_ID") REFERENCES "NAME" ("ID") INITIALLY DEFERRED ;

ALTER TABLE "ARTIST" ADD CONSTRAINT "ARTIST_FK3" FOREIGN KEY ("REALNAME_ID") REFERENCES "NAME" ("ID") INITIALLY DEFERRED ;

ALTER TABLE "ARTIST" ADD CONSTRAINT "ARTIST_FK4" FOREIGN KEY ("ATTRIBUTES_ID") REFERENCES "RECORD" ("ID") INITIALLY DEFERRED ;

ALTER TABLE "ARTIST" ADD CONSTRAINT "ARTIST_FK5" FOREIGN KEY ("PARTICIPANTS_ID") REFERENCES "RECORD" ("ID") INITIALLY DEFERRED ;

CREATE INDEX "ARTIST_N49" ON "ARTIST" ("BIRTHDATE_ID");

CREATE INDEX "ARTIST_N51" ON "ARTIST" ("NAME_ID");

CREATE INDEX "ARTIST_N50" ON "ARTIST" ("REALNAME_ID");


-- Constraints for table "LOCALIZEDSTRING" for class(es) [org.nanotek.base.LongBase, org.nanotek.base.LocalizedString]
ALTER TABLE "LOCALIZEDSTRING" ADD CONSTRAINT "LOCALIZEDSTRING_U1" UNIQUE ("VALUE_ID");

ALTER TABLE "LOCALIZEDSTRING" ADD CONSTRAINT "LOCALIZEDSTRING_FK1" FOREIGN KEY ("VALUE_ID") REFERENCES "STRINGBASE" ("ID") INITIALLY DEFERRED ;

ALTER TABLE "LOCALIZEDSTRING" ADD CONSTRAINT "LOCALIZEDSTRING_FK2" FOREIGN KEY ("ATTRIBUTES_ID") REFERENCES "RECORD" ("ID") INITIALLY DEFERRED ;

CREATE INDEX "LOCALIZEDSTRING_N49" ON "LOCALIZEDSTRING" ("VALUE_ID");


-- Constraints for table "WORK" for class(es) [org.nanotek.base.LongBase, org.nanotek.base.Work]
ALTER TABLE "WORK" ADD CONSTRAINT "WORK_FK1" FOREIGN KEY ("ATTRIBUTES_ID") REFERENCES "RECORD" ("ID") INITIALLY DEFERRED ;



------------------------------------------------------------------
-- Sequences and SequenceTables
