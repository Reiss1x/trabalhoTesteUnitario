Trabalho sobre técnicas de geração de casos de teste e teste estrutural.

11. Quando a empresa se encontra em modo NORMAL de operação o salário líquido de um
funcionário é calculado da seguinte forma: desconta-se a previdência (INSS) e o imposto
de renda (IR) do seu salário bruto. O desconto de INSS é de 4,5% até o limite de R$
5000,00. Já o IR é de 12% sobre o que excede R$ 2500,00. O IR e o INSS são calculados
sobre o salário bruto original, sem os descontos. Quando a empresa opera em modo
CRITICO ela tem autorização para reduzir o salário bruto em 20% e parar de descontar
o IR (como compensação). Já quando opera em modo OTIMO a empresa paga um bônus
de 25% do salário bruto. Este bônus deve ser acrescentado no salário bruto de maneira
que o INSS e o IR incidam sobre ele. Explorando as técnicas vistas até então, defina um
conjunto de casos de teste potencialmente revelador de erros.

13. Recupere os projetos do exercício 11 e faça análise de cobertura dos casos de teste.
Acrescente casos de teste até obter 100% de cobertura de condição.


Técnicas utilizadas: Test e AssertEquals.
Defeitos encontrados: Criando uma condição para cada estado fazia com que fosse obrigatório retornar
um valor que nunca seria acessado, assim, o test coverage nunca chegava a 100%. Retirando a condição
do último estado o erro foi corrigido e o test coverage atingiu 100%
Qualidade dos testes: Os testes desenvolvidos são de boa qualidade pois atingem todas as condições possíveis.
