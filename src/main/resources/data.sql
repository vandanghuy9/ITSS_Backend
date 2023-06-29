INSERT INTO GYM_STAFF(id, name,phone_Num,address) VALUES(1, 'John Doe', '3749201836', '123 Main St'),
                                                       (2, 'Jane Smith', '4928103746', '456 Elm St'),
                                                       (3, 'Bob Johnson', '1029384756', '789 Oak St'),
                                                       (4, 'Alice Williams', '6574839201', '321 Pine St'),
                                                       (5, 'Charlie Brown', '1827364950', '654 Maple St'),
                                                       (6, 'Dave Wilson', '8473920657', '987 Cedar St'),
                                                       (7, 'Eve Black', '3847562910', '246 Birch St'),
                                                       (8, 'Frank White', '1029384756', '369 Spruce St'),
                                                       (9, 'Grace Green', '3847562910', '159 Willow St'),
                                                       (10, 'Henry Blue', '8473920657', '753 Aspen St');

INSERT INTO Memberships(membership_name,
 training_time,
 price,
 price_per_month,
 price_per_day,
 number_of_session,
 training_card_type,
 including_trainer,
 training_class,
 description)
VALUES ('Membership 1', '12', 500.00, 100, 10, 20, 'Short-term', true, 'Class A', 'Membership 1 description'),
       ('Membership 2', '24', 600.00, 120, 12, 30, 'Long-term', false, 'Class B', 'Membership 2 description'),
       ('Membership 3', '36', 700.00, 150, 15, 40, 'Diamond', true, 'Class C', 'Membership 3 description'),
       ('Membership 4', '48', 800.00, 180, 18, 50, 'Short-term', false, 'Class D', 'Membership 4 description'),
       ('Membership 5', 'One day', 100.00, 0, 20, 10, 'Short-term', true, 'Class E', 'Membership 5 description');

INSERT INTO Members(name, age, gender, email, phone_number, occupation, birthday, job, member_type)
VALUES ('John Doe', 30, 'Male', 'johndoe@example.com', '1234567890', 'Engineer', '1990-01-01', 'Software Developer', 'Classic'),
       ('Jane Smith', 25, 'Female', 'janesmith@example.com', '9876543210', 'Designer', '1995-02-15', 'Graphic Designer', 'Diamond'),
       ('Bob Johnson', 35, 'Male', 'bobjohnson@example.com', '5555555555', 'Teacher', '1986-06-10', 'English Teacher', 'Classic'),
       ('Alice Williams', 28, 'Female', 'alicewilliams@example.com', '2222222222', 'Doctor', '1993-09-20', 'Surgeon', 'Diamond'),
       ('Charlie Brown', 32, 'Male', 'charliebrown@example.com', '3333333333', 'Lawyer', '1989-04-05', 'Attorney', 'Classic'),
       ('Dave Wilson', 27, 'Male', 'davewilson@example.com', '4444444444', 'Accountant', '1994-11-15', 'CPA', 'Classic'),
       ('Eve Black', 29, 'Female', 'eveblack@example.com', '6666666666', 'Artist', '1992-07-25', 'Painter', 'Diamond'),
       ('Frank White', 31, 'Male', 'frankwhite@example.com', '7777777777', 'Engineer', '1991-12-05', 'Mechanical Engineer', 'Classic');

INSERT INTO Training_History(Member_id, training_day, training_time, trainer_id)
VALUES
    (1, '2022-01-01', '10:00', 1),
    (1, '2022-01-02', '14:00', NULL),
    (2, '2022-01-03', '09:30', 2),
    (2, '2022-01-04', '16:00', NULL),
    (3, '2022-01-05', '11:00', 3),
    (3, '2022-01-06', '15:30', NULL),
    (4, '2022-01-07', '08:00', 4),
    (4, '2022-01-08', '17:00', NULL),
    (5, '2022-01-09', '13:30', 5),
    (5, '2022-01-10', '10:30', NULL);

INSERT INTO Trainer (id, address, citizen_identityid, dob, finish_contract_date, name, phone_num, start_date, trainer_type) VALUES
(1, '123 ABC Street, XYZ City', '123456789', '1990-01-01', '2023-12-31', 'John Doe', '987654321', '2021-01-01', 'PT gym'),
(2, '456 DEF Street, XYZ City', '987654321', '1992-03-15', '2023-12-31', 'Jane Smith', '123456789', '2021-01-01', 'PT gym'),
(3, '789 GHI Street, XYZ City', '456789123', '1985-07-20', '2023-12-31', 'Michael Johnson', '543216789', '2021-01-01', 'Giáo viên yoga'),
(4, '321 JKL Street, XYZ City', '789123456', '1993-12-05', '2023-12-31', 'Emily Davis', '987654321', '2021-01-01', 'PT gym'),
(5, '654 MNO Street, XYZ City', '321654987', '1988-09-10', '2023-12-31', 'Samantha Wilson', '123456789', '2021-01-01', 'Giáo viên Arobic'),
(6, '987 PQR Street, XYZ City', '654987321', '1991-06-25', '2023-12-31', 'David Thompson', '543216789', '2021-01-01', 'Giáo viên Arobic'),
(7, '321 STU Street, XYZ City', '987321654', '1987-04-12', '2023-12-31', 'Amanda Lee', '987654321', '2021-01-01', 'PT gym'),
(8, '456 VWX Street, XYZ City', '654321987', '1994-08-03', '2023-12-31', 'Daniel Anderson', '123456789', '2021-01-01', 'Giáo viên Arobic'),
(9, '789 YZA Street, XYZ City', '321987654', '1986-11-18', '2023-12-31', 'Sophia Moore', '543216789', '2021-01-01', 'Giáo viên yoga'),
(10, '987 BCD Street, XYZ City', '987654321', '1995-02-28', '2023-12-31', 'William Clark', '987654321', '2021-01-01', 'PT gym');


INSERT INTO Registration (registration_id, member_id, membership_id, registration_date, registration_type, trainer_id)
VALUES
  (1, 1, 1, '2023-06-01 09:00:00', 'monthly', 2),
  (2, 2, 2, '2023-06-05 14:30:00', 'hourly', 1),
  (3, 3, 1, '2023-06-15 18:45:00', 'monthly', 5),
  (4, 4, 2, '2023-06-02 11:15:00', 'hourly', 7),
  (5, 5, 1, '2023-06-10 16:30:00', 'monthly', 4),
  (6, 1, 2, '2023-06-12 13:45:00', 'hourly', 8),
  (7, 2, 1, '2023-06-18 17:30:00', 'monthly', 3),
  (8, 3, 2, '2023-06-07 10:00:00', 'hourly', 2),
  (9, 4, 1, '2023-06-20 15:15:00', 'monthly', 1),
  (10, 5, 2, '2023-06-25 19:45:00', 'hourly', 9);

INSERT INTO Users(username ,password,role)
 VALUES
     ('admin','123456','admin'),
     ('staff','123456','staff'),
     ('trainer','123456','trainer'),
     ('member','123456','member');