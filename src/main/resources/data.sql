INSERT INTO EMPLOYEE(name,salary,address) VALUES('John Doe', 50000.00, '123 Main St'),
                                                       ('Jane Smith', 60000.00, '456 Elm St'),
                                                       ('Bob Johnson', 55000.00, '789 Oak St'),
                                                       ('Alice Williams', 65000.00, '321 Pine St'),
                                                       ('Charlie Brown', 60000.00, '654 Maple St'),
                                                       ('Dave Wilson', 70000.00, '987 Cedar St'),
                                                       ('Eve Black', 75000.00, '246 Birch St'),
                                                       ('Frank White', 80000.00, '369 Spruce St'),
                                                       ('Grace Green', 85000.00, '159 Willow St'),
                                                       ('Henry Blue', 90000.00, '753 Aspen St');

INSERT INTO Membership(membership_name,
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

INSERT INTO Member(name, age, gender, email, phone_number, occupation, birthday, job, member_type)
VALUES ('John Doe', 30, 'Male', 'johndoe@example.com', '1234567890', 'Engineer', '1990-01-01', 'Software Developer', 'Classic'),
       ('Jane Smith', 25, 'Female', 'janesmith@example.com', '9876543210', 'Designer', '1995-02-15', 'Graphic Designer', 'Diamond'),
       ('Bob Johnson', 35, 'Male', 'bobjohnson@example.com', '5555555555', 'Teacher', '1986-06-10', 'English Teacher', 'Classic'),
       ('Alice Williams', 28, 'Female', 'alicewilliams@example.com', '2222222222', 'Doctor', '1993-09-20', 'Surgeon', 'Diamond'),
       ('Charlie Brown', 32, 'Male', 'charliebrown@example.com', '3333333333', 'Lawyer', '1989-04-05', 'Attorney', 'Classic'),
       ('Dave Wilson', 27, 'Male', 'davewilson@example.com', '4444444444', 'Accountant', '1994-11-15', 'CPA', 'Classic'),
       ('Eve Black', 29, 'Female', 'eveblack@example.com', '6666666666', 'Artist', '1992-07-25', 'Painter', 'Diamond'),
       ('Frank White', 31, 'Male', 'frankwhite@example.com', '7777777777', 'Engineer', '1991-12-05', 'Mechanical Engineer', 'Classic');
