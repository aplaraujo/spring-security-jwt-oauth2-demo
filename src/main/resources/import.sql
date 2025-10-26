INSERT INTO tb_user (username, password) VALUES ('maria@gmail.com', '$2a$10$lRo76SOP3HtDgeKw65fs0.SqG7TreUeAWrStp.ZqDEpYocO2H/znG');
INSERT INTO tb_user (username, password) VALUES ('alex@gmail.com', '$2a$10$lRo76SOP3HtDgeKw65fs0.SqG7TreUeAWrStp.ZqDEpYocO2H/znG');
INSERT INTO tb_user (username, password) VALUES ('bob@gmail.com', '$2a$10$lRo76SOP3HtDgeKw65fs0.SqG7TreUeAWrStp.ZqDEpYocO2H/znG');

INSERT INTO tb_role (authority) VALUES ('ROLE_USER');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);

INSERT INTO tb_tweet (author, content, moment, user_id) VALUES ('Alex Green', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.', '2022-07-25T13:00:00Z', 1);
INSERT INTO tb_tweet (author, content, moment, user_id) VALUES ('Bob Grey', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.', '2022-07-20T13:00:00Z', 3);