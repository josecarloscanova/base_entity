------------------------------------------------------------------
-- DataNucleus SchemaTool (ran at 07/08/2014 20:46:07)
------------------------------------------------------------------
-- Complete schema required for the following classes:-
--     org.nanotek.base.AbstractBase
--     org.nanotek.base.BirthDateBase
--     org.nanotek.base.LongBase
--     org.nanotek.base.Name
--     org.nanotek.base.NameString
--     org.nanotek.base.StringBase
--     org.nanotek.base.StringPositionBase
--     org.nanotek.base.Work
--     org.nanotek.base.artist.Artist
--     org.nanotek.base.author.Author
--     org.nanotek.base.author.AuthorArtisticName
--     org.nanotek.base.music.Record
--     org.nanotek.base.music.gender.MusicalGender
--     org.nanotek.base.person.Person
--
-- Table "AUTHOR" for classes [org.nanotek.base.LongBase, org.nanotek.base.person.Person, org.nanotek.base.author.Author]
CREATE TABLE "AUTHOR"
(
    "ID" SERIAL,
    "DATEBIRTH_ID" int8 NULL,
    "ATTRIBUTES_ID" int8 NULL,
    CONSTRAINT "AUTHOR_PK" PRIMARY KEY ("ID")
);

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

-- Table "AUTHORARTISTICNAME" for classes [org.nanotek.base.LongBase, org.nanotek.base.author.AuthorArtisticName]
CREATE TABLE "AUTHORARTISTICNAME"
(
    "ID" SERIAL,
    "ATTRIBUTES_ID" int8 NULL,
    CONSTRAINT "AUTHORARTISTICNAME_PK" PRIMARY KEY ("ID")
);

-- Table "STRINGPOSITIONBASE" for classes [org.nanotek.base.StringPositionBase, org.nanotek.base.LongBase]
CREATE TABLE "STRINGPOSITIONBASE"
(
    "ID" SERIAL,
    "POSITION" int4 NULL,
    "STRINGBASE_ID" int8 NULL,
    "ATTRIBUTES_ID" int8 NULL,
    CONSTRAINT "STRINGPOSITIONBASE_PK" PRIMARY KEY ("ID")
);

-- Table "NAMESTRING" for classes [org.nanotek.base.NameString]
CREATE TABLE "NAMESTRING"
(
    "ID" int8 NOT NULL,
    "NAMESTRINGTYPE" int4 NOT NULL,
    CONSTRAINT "NAMESTRING_PK" PRIMARY KEY ("ID")
);

-- Table "STRINGBASE" for classes [org.nanotek.base.LongBase, org.nanotek.base.StringBase]
CREATE TABLE "STRINGBASE"
(
    "ID" SERIAL,
    "VALUE" varchar(1000) NOT NULL,
    "ATTRIBUTES_ID" int8 NULL,
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

-- Table "ARTIST" for classes [org.nanotek.base.artist.Artist, org.nanotek.base.LongBase, org.nanotek.base.person.Person]
CREATE TABLE "ARTIST"
(
    "ID" SERIAL,
    "ARTISTTYPE" int4 NOT NULL,
    "DATEBIRTH_ID" int8 NULL,
    "PARTICIPANTS_ID" int8 NULL,
    "ATTRIBUTES_ID" int8 NULL,
    CONSTRAINT "ARTIST_PK" PRIMARY KEY ("ID")
);

-- Table "PERSON" for classes [org.nanotek.base.LongBase, org.nanotek.base.person.Person]
CREATE TABLE "PERSON"
(
    "ID" SERIAL,
    "DATEBIRTH_ID" int8 NULL,
    "ATTRIBUTES_ID" int8 NULL,
    CONSTRAINT "PERSON_PK" PRIMARY KEY ("ID")
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

-- Table "WORK" for classes [org.nanotek.base.Work, org.nanotek.base.LongBase]
CREATE TABLE "WORK"
(
    "ID" SERIAL,
    "WORKTYPE" int4 NOT NULL,
    "ATTRIBUTES_ID" int8 NULL,
    CONSTRAINT "WORK_PK" PRIMARY KEY ("ID")
);

-- Table "PERSON_NAMESTRING" for join relationship
CREATE TABLE "PERSON_NAMESTRING"
(
    "PERSON_ID" int8 NOT NULL,
    "NAME_ID" int8 NOT NULL
);

-- Table "AUTHOR_AUTHORARTISTICNAME" for join relationship
CREATE TABLE "AUTHOR_AUTHORARTISTICNAME"
(
    "AUTHOR_ID" int8 NOT NULL,
    "ARTISTICNAMES_ID" int8 NOT NULL
);

-- Table "NAME_STRINGPOSITIONBASE" for join relationship
CREATE TABLE "NAME_STRINGPOSITIONBASE"
(
    "NAME_ID" int8 NOT NULL,
    "NAMES_ID" int8 NOT NULL
);

-- Table "AUTHORARTISTICNAME_NAMESTRING" for join relationship
CREATE TABLE "AUTHORARTISTICNAME_NAMESTRING"
(
    "AUTHORARTISTICNAME_ID" int8 NOT NULL,
    "AUTHORNAMES_ID" int8 NOT NULL
);


------------------------------------------------------------------
-- Sequences and SequenceTables
