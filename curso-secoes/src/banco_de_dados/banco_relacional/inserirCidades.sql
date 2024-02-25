select * from estados;
select * from cidades;
show index from cidades;

INSERT INTO cidades (nome, area, estado_id)
VALUES ('Campinas', 795, 28);

INSERT INTO cidades (nome, area, estado_id)
VALUES ('Niterói', 133.9, 22);

INSERT INTO cidades (id, nome, area, estado_id)
VALUES (
        3,
        'Caruaru',
        920.6,
        (select id from estados where sigla = 'PE')
);

INSERT INTO cidades (id, nome, area, estado_id)
VALUES (
        4,
        'Juazeiro do Norte',
        248.2,
        (select id from estados where sigla = 'CE')
);

