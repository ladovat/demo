CREATE TABLE person (
  id VARCHAR(50) NOT NULL PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  age INT NOT NULL
);

INSERT INTO person (id, name, age) VALUES
  ('a6734980-e892-11ea-adc1-0242ac120002', 'John Doe', 15),
  ('ca7b24d8-e892-11ea-adc1-0242ac120002', 'Jane Doe', 30),
  ('d021e610-e892-11ea-adc1-0242ac120002', 'Peter Parker', 45);
