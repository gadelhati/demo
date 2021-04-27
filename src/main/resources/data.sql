--DROP TABLE IF EXISTS tutorials;

CREATE TABLE tutorial (
  id UUID DEFAULT RANDOM_UUID() PRIMARY KEY,
  title VARCHAR(250) NOT NULL,
  description VARCHAR(250),
  published VARCHAR(250) DEFAULT NULL
);

INSERT INTO tutorial (title, description, published) VALUES
  ('Um', 'Alpha', true),
  ('Dois', 'Bravo', true),
  ('Três', 'Charlie', true);