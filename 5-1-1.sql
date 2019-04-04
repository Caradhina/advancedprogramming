SELECT logins.email, logins.password, students.name, students.phone, major.name, major.credis
FROM logins
JOIN students
ON students.login_id = logins.id
JOIN major
ON students.major_id = major.id