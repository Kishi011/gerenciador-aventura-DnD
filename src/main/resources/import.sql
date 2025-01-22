INSERT INTO tb_aventura(title, adventure_type, adventure_description, creation_date) VALUES ('Ravenloft', 'Loren Ipsum', 'Ipsum Loren', '2025-01-20');

INSERT INTO tb_perfil(nome, game_role) VALUES ('Matheus', 'ADMIN');
INSERT INTO tb_perfil(nome, game_role) VALUES ('Vinicius', 'JOGADOR');

INSERT INTO tb_ficha(perfil_id, nome_personagem, classe, raca, hp, xp, forca, destreza, constituicao, inteligencia, sabedoria, carisma, inspiracao, bonus_proficiencia) VALUES (2, 'Paschek', 'Xamã', 'Goblin', 10, 280, 10, 10, 13, 14, 15, 10, 0, 2);