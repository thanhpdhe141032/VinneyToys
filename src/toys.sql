INSERT INTO toys.toys_role (role_id, role_name) VALUES(1, 'ADMIN');
INSERT INTO toys.toys_role (role_id, role_name) VALUES(2, 'USER');

INSERT INTO toys.toys_account (account_name, account_password, account_role) VALUES('user', 'user', '2');
INSERT INTO toys.toys_account (account_name, account_password, account_role) VALUES('admin', 'admin', '1');

INSERT INTO toys.toys_user_profile (user_first_name, user_last_name, user_gender, user_dob, account_id, user_phone_number) VALUES('thanh', 'dang', 'male', '14/10/2000', 0, '0944808998');


INSERT INTO toys.toys_ewallet (user_id) VALUES(0);
INSERT INTO toys.toys_ewallet (user_id) VALUES(1);

INSERT INTO toys.toys_ewallet_balance (ewallet_id, ewallet_balance) VALUES(0, 500000);
INSERT INTO toys.toys_ewallet_balance (ewallet_id, ewallet_balance) VALUES(1, 500000);







