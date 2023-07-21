Um sistema desenvolvido em linguagem Java para gerenciar guarda-volumes em praias. 
Os armários serão exibidos com informações de nome, ponto x, ponto y (usados para localização no mapa na parte do front-end), e quantos compartimentos disponíveis há.
Os compartimentos tem número(ex: 1, 2, etc) e tamanho (ex: “100x500cm”), portanto, um armário pode ter muitos compartimentos que serão cadastrados pelo administrador do sistema.
Quando um usuário encontra o armário, ele escolhe o compartimento que ele quer e registra no aplicativo, para que seja liberado seu acesso.
O compartimento então se associa ao usuário e nesse momento fica como indisponível. 
No momento que for consultado a quantidade de compartimentos disponíveis no armário, já deve constar a quantidade atualizada de armários.
O usuário também deverá retirar as coisas do compartimento, que por sua vez, tornará disponível aquele compartimento e quem consultar, já terá acesso ao número atualizado de compartimentos disponíveis no armário.
