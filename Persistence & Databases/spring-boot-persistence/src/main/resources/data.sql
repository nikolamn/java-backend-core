INSERT INTO app_user (id, username) VALUES 
  (1, 'marc_user'), 
  (2, 'jenny_user'), 
  (3, 'sarah_user');

INSERT INTO post (id, title, author_id) VALUES 
  (1, 'Data Persistence Demo 1', 1),
  (2, 'JPA Lazy Loading', 1),
  (3, 'Transactions in databases', 2),
  (4, 'Trying out this test data', 3);

INSERT INTO comment (id, content, post_id) VALUES
  (1, 'Thanks!', 1),
  (2, 'Hello', 2),
  (3, 'Can you?', 3),
  (4, 'Hahahah', 4),
  (5, 'Alright', 2);