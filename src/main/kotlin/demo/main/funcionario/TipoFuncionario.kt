package demo.main.funcionario

enum class TipoFuncionario(
    private val id: Int,
    private val desc: String,
    private val bonificacao: Double
) {
    DIRETOR(0, "Diretor", 0.4),
    GERENTE(1, "Gerente master", 0.1),
    GERENTE_ARQUITETURA(2, "Gerente de arquitetura", 0.1),
    GERENTE_PROJETO(3, "Gerente de projeto", 0.12),
    ANALISTA_SISTEMA(4, "Analista de sistema", 0.09),
    ANALISTA_PROGRAMA(5, "Analista de programa", 0.12),
    DESENVOLVEDOR_SN(6, "Desenvolvedor Senior", 0.21),
    DESENVOLVEDOR_MD(7, "Desensvolvedor Mid-level", 0.18),
    DESENVOLVEDOR_JR(8, "Desenvolvedor junior", 0.10),
    DESENVOLVEDOR_TR(9, "Trainee", 0.05),
    ESTAGIARIO(10, "Estagiario", 0.05);

    public fun salario(salary: Double): Double {
        return this.bonificacao * salary;
    }

}
