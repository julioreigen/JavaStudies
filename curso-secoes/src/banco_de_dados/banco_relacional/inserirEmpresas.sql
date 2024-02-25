INSERT INTO empresas
    (nome, cnpj)
VALUES
    ('Bradesco', 95694186000132),
    ('Vale', 95694186000146),
    ('Cielo', 0159831000134);

ALTER TABLE empresas MODIFY  cnpj VARCHAR(14);

desc empresas;
select * from empresas;
select * from cidades;

INSERT INTO empresas_unidades
    (empresa_id, cidade_id, sede)
VALUES
    (1, 1, 1),
    (1, 2, 0),
    (2, 1, 0),
    (2, 2, 1);

select *
from empresas;

update empresas
set id = 3
where id = 6;