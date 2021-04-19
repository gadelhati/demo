--DROP TABLE IF EXISTS billionaires;

CREATE TABLE tutorials (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  title VARCHAR(250) NOT NULL,
  description VARCHAR(250) NOT NULL,
  published VARCHAR(250) DEFAULT NULL
);

INSERT INTO tutorials (id, title, description, published) VALUES
  (1, 'Um', 'Alpha', true),
  (2, 'Dois', 'Bravo', true),
  (3, 'Três', 'Charlie', true);