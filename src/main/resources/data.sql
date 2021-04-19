--DROP TABLE IF EXISTS tutorials;

CREATE TABLE tutorials (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  title VARCHAR(250) NOT NULL,
  description VARCHAR(250),
  published VARCHAR(250) DEFAULT NULL
);

INSERT INTO tutorials (id, title, description, published) VALUES
  (14546345, 'Um', 'Alpha', true),
  (45134564, 'Dois', 'Bravo', true),
  (45643645, 'Três', 'Charlie', true);