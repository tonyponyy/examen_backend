create database game_party_app;
use game_party_app;

CREATE TABLE users (
  id int auto_increment ,
  name VARCHAR(100),
  password VARCHAR(255),
  id_steam VARCHAR(255),
  email VARCHAR(100),
  role varchar(100),
  PRIMARY KEY (id)
) ;

CREATE TABLE games (
  id int auto_increment ,
  name VARCHAR(100),
  PRIMARY KEY (id)
) ;

CREATE TABLE partys (
  id int auto_increment ,
  creator_id int,
  game_id int,
  title varchar(100),
  description varchar(200),
  PRIMARY KEY (id),
  FOREIGN KEY (creator_id) REFERENCES users (id) ON DELETE CASCADE ON UPDATE CASCADE,
  FOREIGN KEY (game_id) REFERENCES games (id) ON DELETE CASCADE ON UPDATE CASCADE
) ;

CREATE TABLE party_users (
  id int auto_increment ,
  user_id int,
  party_id int,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE ON UPDATE CASCADE,
  FOREIGN KEY (party_id) REFERENCES partys (id) ON DELETE CASCADE ON UPDATE CASCADE
) ;

CREATE TABLE messages (
  id int auto_increment ,
  user_id int,
  party_id int,
  title varchar(100),
  description varchar(200),
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE ON UPDATE CASCADE,
  FOREIGN KEY (party_id) REFERENCES partys (id) ON DELETE CASCADE ON UPDATE CASCADE
) ;

