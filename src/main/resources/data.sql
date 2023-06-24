INSERT INTO GYM_STAFF(name,phone_Num,address) VALUES('John Doe', '3749201836', '123 Main St'),
                                                       ('Jane Smith', '4928103746', '456 Elm St'),
                                                       ('Bob Johnson', '1029384756', '789 Oak St'),
                                                       ('Alice Williams', '6574839201', '321 Pine St'),
                                                       ('Charlie Brown', '1827364950', '654 Maple St'),
                                                       ('Dave Wilson', '8473920657', '987 Cedar St'),
                                                       ('Eve Black', '3847562910', '246 Birch St'),
                                                       ('Frank White', '1029384756', '369 Spruce St'),
                                                       ('Grace Green', '3847562910', '159 Willow St'),
                                                       ('Henry Blue', '8473920657', '753 Aspen St');

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
