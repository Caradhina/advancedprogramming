SELECT superheroes.name, superheroes.power, superheroes.gender, details2.age, details2.country
FROM superheroes
INNER JOIN details2
ON superheroes.id = details2.superheroes_id
where country = 'USA'