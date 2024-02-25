SELECT
    c.nome Cidade,
    e.nome Estado,
    regiao 'Região'
FROM
    estados e,
    cidades c
WHERE
    e.id = c.estado_id;


SELECT
    c.nome Cidade,
    e.nome Estado,
    regiao 'Região'
FROM
    estados e
INNER JOIN cidades c
    ON e.id = c.estado_id
