/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INTERFACE;

import java.awt.Image;
import java.time.LocalDate;
import javax.swing.ImageIcon;

/**
 *
 * @author JordanaLeite
 */
public class SIGNOS extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SIGNOS.class.getName());

    /**
     * Creates new form SIGNOS
     */
    public SIGNOS() {
        initComponents();
    }
   // TODA FUNÇÃO É CRIADA ABAIXO DO CONSTRUTOR
    
    public void RedimensionarImgaens(){
        
  // CAPTURAR AS IMAGENS Q ESTAO NA LABELl
        ImageIcon aries = (ImageIcon) imgSignoAries.getIcon();
        ImageIcon touro = (ImageIcon) imgSignoTouro.getIcon();
        ImageIcon gemeos = (ImageIcon) imgSignoGemeos.getIcon();
        ImageIcon cancer = (ImageIcon) imgSignoCancer.getIcon();
        ImageIcon leao = (ImageIcon) imgSignoLeao.getIcon();
        ImageIcon virgem = (ImageIcon) imgSignoVirgem.getIcon();
        ImageIcon libra = (ImageIcon) imgSignoLibra.getIcon(); 
        ImageIcon escorpiao = (ImageIcon) imgSignoEscorpiao.getIcon(); 
        ImageIcon sagitario = (ImageIcon) imgSignoSagitario.getIcon(); 
        ImageIcon capricornio = (ImageIcon) imgSignoCapricornio.getIcon(); 
        ImageIcon aquario = (ImageIcon) imgSignoAquario.getIcon(); 
        ImageIcon peixes = (ImageIcon) imgSignoPeixes.getIcon();
        
   // REDIMENCIONAR O TAMANHO DELAS        
        Image imgAries = aries.getImage().getScaledInstance(400, 700, Image.SCALE_SMOOTH);
        
   // JOGAR A IMAGEM REDIMENSIONADA NA LABEL NOVAMENTE
        imgSignoAries.setIcon(new ImageIcon (imgAries));
        
        Image imgTouro = touro.getImage().getScaledInstance(400, 700, Image.SCALE_SMOOTH);
        imgSignoTouro.setIcon(new ImageIcon (imgTouro));
        Image imgGemeos = gemeos.getImage().getScaledInstance(400, 700, Image.SCALE_SMOOTH);
        imgSignoGemeos.setIcon(new ImageIcon (imgGemeos));
        Image imgCancer = cancer.getImage().getScaledInstance(400, 700, Image.SCALE_SMOOTH);
        imgSignoCancer.setIcon(new ImageIcon (imgCancer));
        Image imgLeao = leao.getImage().getScaledInstance(400, 700, Image.SCALE_SMOOTH);
        imgSignoLeao.setIcon(new ImageIcon (imgLeao));
        Image imgVirgem = virgem.getImage().getScaledInstance(400, 700, Image.SCALE_SMOOTH);
        imgSignoVirgem.setIcon(new ImageIcon (imgVirgem));
        Image imgLibra = libra.getImage().getScaledInstance(400, 700, Image.SCALE_SMOOTH);
        imgSignoLibra.setIcon(new ImageIcon (imgLibra));
        Image imgEscorpiao = escorpiao.getImage().getScaledInstance(400, 700, Image.SCALE_SMOOTH);
        imgSignoEscorpiao.setIcon(new ImageIcon (imgEscorpiao));
        Image imgSagitario = sagitario.getImage().getScaledInstance(400, 700, Image.SCALE_SMOOTH);
        imgSignoSagitario.setIcon(new ImageIcon (imgSagitario));
        Image imgCapricornio = capricornio.getImage().getScaledInstance(400, 700, Image.SCALE_SMOOTH);
        imgSignoCapricornio.setIcon(new ImageIcon (imgCapricornio));
        Image imgAquario = aquario.getImage().getScaledInstance(400, 700, Image.SCALE_SMOOTH);
        imgSignoAquario.setIcon(new ImageIcon (imgAquario));
        Image imgPeixes = peixes.getImage().getScaledInstance(400, 700, Image.SCALE_SMOOTH);
        imgSignoPeixes.setIcon(new ImageIcon (imgPeixes));

    } // FIM DA FUNÇÃO
    
    public void PreencherPrevisao (){
        
        // VERIFICAR O DIA DA SEMANA
        // local date = puxa a data do computador; getDayOfWeek = puxa dia da semana
        int diaSemana = LocalDate.now().getDayOfWeek().getValue();
        
        // CRIAR A CONDICIONAL PARA PREENCHER O CAMPO PREVISAO
switch (diaSemana) {

    case 1: // DOMINGO
        txtPrevisaoAries.setText("Um dia de energia e iniciativa. Aproveite para começar algo novo.");
        txtPrevisaoTouro.setText("Momento de tranquilidade e estabilidade. Valorize o descanso.");
        txtPrevisaoGemeos.setText("Conversas agradáveis podem trazer novas ideias e oportunidades.");
        txtPrevisaoCancer.setText("Dedique tempo à família e às pessoas que fazem você se sentir bem.");
        txtPrevisaoLeao.setText("Sua confiança estará em alta. Aproveite para cuidar de si.");
        txtPrevisaoVirgem.setText("Organize seus pensamentos e aproveite o dia sem tanta cobrança.");
        txtPrevisaoLibra.setText("Um encontro ou conversa pode melhorar bastante seu humor.");
        txtPrevisaoEscorpiao.setText("Confie na sua intuição e evite se preocupar com coisas pequenas.");
        txtPrevisaoSagitario.setText("Um dia favorável para diversão, passeios e novas experiências.");
        txtPrevisaoCapricornio.setText("Desacelere um pouco e aproveite os momentos de descanso.");
        txtPrevisaoAquario.setText("Sua criatividade estará forte. Experimente fazer algo diferente.");
        txtPrevisaoPeixes.setText("Um dia tranquilo favorece a reflexão e os momentos de carinho.");
        break;

    case 2: // SEGUNDA-FEIRA
        txtPrevisaoAries.setText("Comece a semana com determinação. Evite agir por impulso.");
        txtPrevisaoTouro.setText("Mantenha o foco nas suas responsabilidades e avance com calma.");
        txtPrevisaoGemeos.setText("Novas informações podem ajudar você a tomar uma decisão importante.");
        txtPrevisaoCancer.setText("Procure manter a calma diante das tarefas e das cobranças.");
        txtPrevisaoLeao.setText("Sua liderança pode fazer diferença no trabalho ou nos estudos.");
        txtPrevisaoVirgem.setText("Organização será sua maior aliada para enfrentar a semana.");
        txtPrevisaoLibra.setText("Tente equilibrar suas obrigações com momentos de descanso.");
        txtPrevisaoEscorpiao.setText("Concentre sua energia em uma tarefa de cada vez.");
        txtPrevisaoSagitario.setText("Uma oportunidade inesperada pode despertar seu interesse.");
        txtPrevisaoCapricornio.setText("Disciplina e responsabilidade ajudarão você a alcançar seus objetivos.");
        txtPrevisaoAquario.setText("Uma ideia diferente pode solucionar um problema antigo.");
        txtPrevisaoPeixes.setText("Não deixe que as preocupações dos outros tirem sua tranquilidade.");
        break;

    case 3: // TERÇA-FEIRA
        txtPrevisaoAries.setText("Sua energia estará forte. Use-a para colocar seus planos em prática.");
        txtPrevisaoTouro.setText("Tenha paciência. Resultados importantes podem exigir mais tempo.");
        txtPrevisaoGemeos.setText("Sua comunicação estará favorecida. Aproveite para esclarecer dúvidas.");
        txtPrevisaoCancer.setText("Evite guardar sentimentos. Uma conversa sincera pode ajudar.");
        txtPrevisaoLeao.setText("Você poderá receber reconhecimento por algo que fez recentemente.");
        txtPrevisaoVirgem.setText("Um pequeno detalhe pode fazer grande diferença hoje.");
        txtPrevisaoLibra.setText("Evite indecisões e confie mais na sua capacidade de escolha.");
        txtPrevisaoEscorpiao.setText("Sua determinação ajudará a superar um obstáculo.");
        txtPrevisaoSagitario.setText("Novos planos podem surgir. Analise as possibilidades antes de decidir.");
        txtPrevisaoCapricornio.setText("Continue firme em seus objetivos e não desista diante das dificuldades.");
        txtPrevisaoAquario.setText("Uma conversa inesperada pode trazer uma nova perspectiva.");
        txtPrevisaoPeixes.setText("Sua sensibilidade estará mais forte. Use sua intuição a seu favor.");
        break;

    case 4: // QUARTA-FEIRA
        txtPrevisaoAries.setText("Evite discussões desnecessárias e concentre-se no que realmente importa.");
        txtPrevisaoTouro.setText("Um dia favorável para cuidar das finanças e organizar planos.");
        txtPrevisaoGemeos.setText("Sua curiosidade estará em alta. Aprender algo novo será prazeroso.");
        txtPrevisaoCancer.setText("Procure equilibrar suas emoções antes de tomar decisões.");
        txtPrevisaoLeao.setText("Um elogio pode aumentar sua confiança e motivação.");
        txtPrevisaoVirgem.setText("Coloque suas prioridades em ordem e evite assumir tarefas demais.");
        txtPrevisaoLibra.setText("A cooperação será importante para resolver uma situação.");
        txtPrevisaoEscorpiao.setText("Tenha cuidado com palavras ditas no calor do momento.");
        txtPrevisaoSagitario.setText("Uma mudança de planos pode acabar trazendo uma boa surpresa.");
        txtPrevisaoCapricornio.setText("Seu esforço constante começa a mostrar resultados.");
        txtPrevisaoAquario.setText("Ideias criativas podem abrir novos caminhos.");
        txtPrevisaoPeixes.setText("Reserve um momento para relaxar e cuidar do seu bem-estar.");
        break;

    case 5: // QUINTA-FEIRA
        txtPrevisaoAries.setText("Uma oportunidade pode exigir coragem. Confie mais em si mesmo.");
        txtPrevisaoTouro.setText("Evite gastos desnecessários e mantenha seus planos financeiros.");
        txtPrevisaoGemeos.setText("Boas conversas podem aproximar você de pessoas importantes.");
        txtPrevisaoCancer.setText("O apoio de alguém próximo poderá fazer diferença hoje.");
        txtPrevisaoLeao.setText("Mostre seu talento, mas lembre-se também de ouvir os outros.");
        txtPrevisaoVirgem.setText("Seu esforço e atenção aos detalhes serão percebidos.");
        txtPrevisaoLibra.setText("Um acordo pode ser alcançado se todos estiverem dispostos a conversar.");
        txtPrevisaoEscorpiao.setText("Não tenha medo de deixar para trás aquilo que já não faz sentido.");
        txtPrevisaoSagitario.setText("Um convite pode trazer diversão e novas experiências.");
        txtPrevisaoCapricornio.setText("Mantenha o foco. Uma conquista pode estar mais próxima do que parece.");
        txtPrevisaoAquario.setText("Uma ideia antiga pode finalmente encontrar uma oportunidade para acontecer.");
        txtPrevisaoPeixes.setText("Valorize as pessoas que demonstram carinho e preocupação com você.");
        break;

    case 6: // SEXTA-FEIRA
        txtPrevisaoAries.setText("A semana termina com energia. Aproveite para concluir pendências.");
        txtPrevisaoTouro.setText("Um clima mais leve favorece encontros e momentos agradáveis.");
        txtPrevisaoGemeos.setText("Diversão e boas conversas podem marcar o seu dia.");
        txtPrevisaoCancer.setText("Procure estar perto de pessoas que trazem segurança e alegria.");
        txtPrevisaoLeao.setText("Você estará mais carismático. Aproveite para socializar.");
        txtPrevisaoVirgem.setText("Finalize suas tarefas e permita-se aproveitar o fim da semana.");
        txtPrevisaoLibra.setText("Um encontro agradável pode deixar seu dia ainda melhor.");
        txtPrevisaoEscorpiao.setText("Deixe de lado preocupações e aproveite mais o presente.");
        txtPrevisaoSagitario.setText("O dia favorece passeios, diversão e planos para o fim de semana.");
        txtPrevisaoCapricornio.setText("Depois de uma semana intensa, permita-se relaxar.");
        txtPrevisaoAquario.setText("Uma experiência diferente pode tornar seu dia mais divertido.");
        txtPrevisaoPeixes.setText("Aproveite o dia para estar com quem faz você se sentir bem.");
        break;

    case 7: // SÁBADO
        txtPrevisaoAries.setText("Aventure-se e aproveite o dia para fazer algo que realmente gosta.");
        txtPrevisaoTouro.setText("Conforto e tranquilidade serão importantes. Aproveite seu tempo livre.");
        txtPrevisaoGemeos.setText("Um passeio ou encontro pode render histórias interessantes.");
        txtPrevisaoCancer.setText("O ambiente familiar será uma fonte de alegria e tranquilidade.");
        txtPrevisaoLeao.setText("Você estará com vontade de se divertir. Aproveite para brilhar.");
        txtPrevisaoVirgem.setText("Organize seu espaço e depois aproveite o restante do dia.");
        txtPrevisaoLibra.setText("Um programa especial pode trazer leveza e boas lembranças.");
        txtPrevisaoEscorpiao.setText("Aproveite o sábado para fazer algo que desperte sua paixão.");
        txtPrevisaoSagitario.setText("Dia perfeito para sair da rotina e viver uma nova experiência.");
        txtPrevisaoCapricornio.setText("Deixe as obrigações um pouco de lado e aproveite o descanso.");
        txtPrevisaoAquario.setText("Faça algo diferente. A rotina pode esperar um pouco.");
        txtPrevisaoPeixes.setText("Um momento de paz pode renovar suas energias para a próxima semana.");
        break;
}
  
        
    
    
    
    
    
    
    }
        
        
    } // FIM
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaAbas = new javax.swing.JTabbedPane();
        inicio = new javax.swing.JPanel();
        areaDescobrirSigno = new javax.swing.JPanel();
        tituloDescobrirSigno = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        mesNascimento = new javax.swing.JLabel();
        diaNascimento = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        cbDia = new javax.swing.JComboBox<>();
        cbMes = new javax.swing.JComboBox<>();
        btnDescobrirSigno = new javax.swing.JButton();
        areaCompatibilidade = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        signo1 = new javax.swing.JLabel();
        signo2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
        areaResultado = new javax.swing.JPanel();
        signo = new javax.swing.JLabel();
        compatibilidade = new javax.swing.JLabel();
        btnSigno = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        fundoInicio = new javax.swing.JLabel();
        aries = new javax.swing.JPanel();
        areaCaracteristicas = new javax.swing.JPanel();
        tituloCaracteristicaAries = new javax.swing.JLabel();
        pfortesAries = new javax.swing.JLabel();
        pMelhorarAries = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txFortesAries = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txMelhorarAries = new javax.swing.JTextArea();
        areaInformacoes = new javax.swing.JPanel();
        imgSignoAries = new javax.swing.JLabel();
        tituloAries = new javax.swing.JLabel();
        periodoAries = new javax.swing.JLabel();
        elementoAries = new javax.swing.JLabel();
        planetaAries = new javax.swing.JLabel();
        corAries = new javax.swing.JLabel();
        numeroAries = new javax.swing.JLabel();
        tfPeriodoAries = new javax.swing.JTextField();
        tfElementoAries = new javax.swing.JTextField();
        tfPlanetaAries = new javax.swing.JTextField();
        tfCorAries = new javax.swing.JTextField();
        tfNumeroAries = new javax.swing.JTextField();
        areaPrevisao = new javax.swing.JPanel();
        previsaoAries = new javax.swing.JLabel();
        txPrevisaoAries = new javax.swing.JScrollPane();
        txtPrevisaoAries = new javax.swing.JTextArea();
        btnAtualizarPrevisaoAries = new javax.swing.JButton();
        areaEnergia = new javax.swing.JPanel();
        tituloEnergiaAries = new javax.swing.JLabel();
        trabalhoAries = new javax.swing.JLabel();
        sorteAries = new javax.swing.JLabel();
        amorAries = new javax.swing.JLabel();
        saudeAries = new javax.swing.JLabel();
        tfAmorAries = new javax.swing.JTextField();
        tfTrabalhoAries = new javax.swing.JTextField();
        tfSaudeAries = new javax.swing.JTextField();
        tfSorteAries = new javax.swing.JTextField();
        areaMensagem = new javax.swing.JPanel();
        tituloMensagemAries = new javax.swing.JLabel();
        txMensagemAries = new javax.swing.JScrollPane();
        txtMensagemAries = new javax.swing.JTextArea();
        btnCopiarMsgAries = new javax.swing.JButton();
        fundoAries = new javax.swing.JLabel();
        touro = new javax.swing.JPanel();
        areaCaracteristicas1 = new javax.swing.JPanel();
        tituloCaracteristicaTouro = new javax.swing.JLabel();
        pfortesTouro = new javax.swing.JLabel();
        pMelhorarTouro = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txFortesTouro = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txMelhorarTouro = new javax.swing.JTextArea();
        areaInformacoes1 = new javax.swing.JPanel();
        imgSignoTouro = new javax.swing.JLabel();
        tituloTouro = new javax.swing.JLabel();
        periodoTouro = new javax.swing.JLabel();
        elementoTouro = new javax.swing.JLabel();
        planetaTouro = new javax.swing.JLabel();
        corTouro = new javax.swing.JLabel();
        numeroTouro = new javax.swing.JLabel();
        tfPeriodoTouro = new javax.swing.JTextField();
        tfElementoTouro = new javax.swing.JTextField();
        tfPlanetaTouro = new javax.swing.JTextField();
        tfCorTouro = new javax.swing.JTextField();
        tfNumeroTouro = new javax.swing.JTextField();
        areaPrevisao1 = new javax.swing.JPanel();
        previsaoTouro = new javax.swing.JLabel();
        txPrevisaoTouro = new javax.swing.JScrollPane();
        txtPrevisaoTouro = new javax.swing.JTextArea();
        btnAtualizarPrevisaoTouro = new javax.swing.JButton();
        areaEnergia1 = new javax.swing.JPanel();
        tituloEnergiaTouro = new javax.swing.JLabel();
        trabalhoTouro = new javax.swing.JLabel();
        sorteTouro = new javax.swing.JLabel();
        amorTouro = new javax.swing.JLabel();
        saudeTouro = new javax.swing.JLabel();
        tfAmorAries1 = new javax.swing.JTextField();
        tfTrabalhoAries1 = new javax.swing.JTextField();
        tfSaudeAries1 = new javax.swing.JTextField();
        tfSorteAries1 = new javax.swing.JTextField();
        areaMensagem1 = new javax.swing.JPanel();
        tituloMensagemTouro = new javax.swing.JLabel();
        txMensagemTouro = new javax.swing.JScrollPane();
        txtMensagemTouro = new javax.swing.JTextArea();
        btnCopiarMsgTouro = new javax.swing.JButton();
        fundoTouro = new javax.swing.JLabel();
        gemeos = new javax.swing.JPanel();
        areaCaracteristicas2 = new javax.swing.JPanel();
        tituloCaracteristicaGemeos = new javax.swing.JLabel();
        pfortesGemeos = new javax.swing.JLabel();
        pMelhorarGemeos = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txFortesGemeos = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txMelhorarGemeos = new javax.swing.JTextArea();
        areaInformacoes2 = new javax.swing.JPanel();
        imgSignoGemeos = new javax.swing.JLabel();
        tituloGemeos = new javax.swing.JLabel();
        periodoGemeos = new javax.swing.JLabel();
        elementoGemeos = new javax.swing.JLabel();
        planetaGemeos = new javax.swing.JLabel();
        corGemeos = new javax.swing.JLabel();
        numeroGemeos = new javax.swing.JLabel();
        tfPeriodoAries2 = new javax.swing.JTextField();
        tfElementoAries2 = new javax.swing.JTextField();
        tfPlanetaAries2 = new javax.swing.JTextField();
        tfCorAries2 = new javax.swing.JTextField();
        tfNumeroAries2 = new javax.swing.JTextField();
        areaPrevisao2 = new javax.swing.JPanel();
        previsaoGemeos = new javax.swing.JLabel();
        txPrevisaoAries2 = new javax.swing.JScrollPane();
        txtPrevisaoGemeos = new javax.swing.JTextArea();
        btnAtualizarPrevisaoGemeos = new javax.swing.JButton();
        areaEnergia2 = new javax.swing.JPanel();
        tituloEnergiaGemeos = new javax.swing.JLabel();
        trabalhoGemeos = new javax.swing.JLabel();
        sorteGemeos = new javax.swing.JLabel();
        amorGemeos = new javax.swing.JLabel();
        saudeGemeos = new javax.swing.JLabel();
        tfAmorGemeos = new javax.swing.JTextField();
        tfTrabalhoGemeos = new javax.swing.JTextField();
        tfSaudeGemeos = new javax.swing.JTextField();
        tfSorteGemeos = new javax.swing.JTextField();
        areaMensagem2 = new javax.swing.JPanel();
        tituloMensagemGemeos = new javax.swing.JLabel();
        txMensagemGemeos = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        btnCopiarMsgGemeos = new javax.swing.JButton();
        fundoGemeos = new javax.swing.JLabel();
        cancer = new javax.swing.JPanel();
        areaCaracteristicas3 = new javax.swing.JPanel();
        tituloCaracteristicaCancer = new javax.swing.JLabel();
        pfortesCancer = new javax.swing.JLabel();
        pMelhorarCancer = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txFortesCancer = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txMelhorarCancer = new javax.swing.JTextArea();
        areaInformacoes3 = new javax.swing.JPanel();
        imgSignoCancer = new javax.swing.JLabel();
        tituloCancer = new javax.swing.JLabel();
        periodoCancer = new javax.swing.JLabel();
        elementoCancer = new javax.swing.JLabel();
        planetaCancer = new javax.swing.JLabel();
        corCancer = new javax.swing.JLabel();
        numeroCancer = new javax.swing.JLabel();
        tfPeriodoCancer = new javax.swing.JTextField();
        tfElementoCancer = new javax.swing.JTextField();
        tfPlanetaCancer = new javax.swing.JTextField();
        tfCorCancer = new javax.swing.JTextField();
        tfNumeroCancer = new javax.swing.JTextField();
        areaPrevisao3 = new javax.swing.JPanel();
        previsaoCancer = new javax.swing.JLabel();
        txPrevisaoCancer = new javax.swing.JScrollPane();
        txtPrevisaoCancer = new javax.swing.JTextArea();
        btnAtualizarPrevisaoCancer = new javax.swing.JButton();
        areaEnergia3 = new javax.swing.JPanel();
        tituloEnergiaCancer = new javax.swing.JLabel();
        trabalhoCancer = new javax.swing.JLabel();
        sorteCancer = new javax.swing.JLabel();
        amorCancer = new javax.swing.JLabel();
        saudeCancer = new javax.swing.JLabel();
        tfAmorCancer = new javax.swing.JTextField();
        tfTrabalhoCancer = new javax.swing.JTextField();
        tfSaudeCancer = new javax.swing.JTextField();
        tfSorteCancer = new javax.swing.JTextField();
        areaMensagem3 = new javax.swing.JPanel();
        tituloMensagemCancer = new javax.swing.JLabel();
        txMensagemCancer = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        btnCopiarMsgCancer = new javax.swing.JButton();
        fundoCancer = new javax.swing.JLabel();
        leao = new javax.swing.JPanel();
        areaCaracteristicas4 = new javax.swing.JPanel();
        tituloCaracteristicaLeao = new javax.swing.JLabel();
        pfortesLeao = new javax.swing.JLabel();
        pMelhorarLeao = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txFortesLeao = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txMelhorarLeao = new javax.swing.JTextArea();
        areaInformacoes4 = new javax.swing.JPanel();
        imgSignoLeao = new javax.swing.JLabel();
        tituloLeao = new javax.swing.JLabel();
        periodoLeao = new javax.swing.JLabel();
        elementoLeao = new javax.swing.JLabel();
        planetaLeao = new javax.swing.JLabel();
        corLeao = new javax.swing.JLabel();
        numeroLeao = new javax.swing.JLabel();
        tfPeriodoLeao = new javax.swing.JTextField();
        tfElementoLeao = new javax.swing.JTextField();
        tfPlanetaLeao = new javax.swing.JTextField();
        tfCorLeao = new javax.swing.JTextField();
        tfNumeroLeao = new javax.swing.JTextField();
        areaPrevisao4 = new javax.swing.JPanel();
        previsaoLeao = new javax.swing.JLabel();
        txPrevisaoAries4 = new javax.swing.JScrollPane();
        txtPrevisaoLeao = new javax.swing.JTextArea();
        btnAtualizarPrevisaoLeao = new javax.swing.JButton();
        areaEnergia4 = new javax.swing.JPanel();
        tituloEnergiaLeao = new javax.swing.JLabel();
        trabalhoLeao = new javax.swing.JLabel();
        sorteLeao = new javax.swing.JLabel();
        amorLeao = new javax.swing.JLabel();
        saudeLeao = new javax.swing.JLabel();
        tfAmorLeao = new javax.swing.JTextField();
        tfTrabalhoLeao = new javax.swing.JTextField();
        tfSaudeLeao = new javax.swing.JTextField();
        tfSorteLeao = new javax.swing.JTextField();
        areaMensagemLeao = new javax.swing.JPanel();
        tituloMensagemLeao = new javax.swing.JLabel();
        txMensagemAries4 = new javax.swing.JScrollPane();
        txtMensagemLeao = new javax.swing.JTextArea();
        btnCopiarMsgLeao = new javax.swing.JButton();
        fundoLeao = new javax.swing.JLabel();
        virgem = new javax.swing.JPanel();
        areaCaracteristicas5 = new javax.swing.JPanel();
        tituloCaracteristicaVirgem = new javax.swing.JLabel();
        pfortesVirgem = new javax.swing.JLabel();
        pMelhorarVirgem = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txFortesVirgem = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        txMelhorarVirgem = new javax.swing.JTextArea();
        areaInformacoes5 = new javax.swing.JPanel();
        imgSignoVirgem = new javax.swing.JLabel();
        tituloVirgem = new javax.swing.JLabel();
        periodoVirgem = new javax.swing.JLabel();
        elementoVirgem = new javax.swing.JLabel();
        planetaVirgem = new javax.swing.JLabel();
        corVirgem = new javax.swing.JLabel();
        numeroVirgem = new javax.swing.JLabel();
        tfPeriodoVirgem = new javax.swing.JTextField();
        tfElementoVirgem = new javax.swing.JTextField();
        tfPlanetaVirgem = new javax.swing.JTextField();
        tfCorVirgem = new javax.swing.JTextField();
        tfNumeroVirgem = new javax.swing.JTextField();
        areaPrevisao5 = new javax.swing.JPanel();
        previsaoVirgem = new javax.swing.JLabel();
        txPrevisaoVirgem = new javax.swing.JScrollPane();
        txtPrevisaoVirgem = new javax.swing.JTextArea();
        btnAtualizarPrevisaoVirgem = new javax.swing.JButton();
        areaEnergia5 = new javax.swing.JPanel();
        tituloEnergiaVirgem = new javax.swing.JLabel();
        trabalhoVirgem = new javax.swing.JLabel();
        sorteVirgem = new javax.swing.JLabel();
        amorVirgem = new javax.swing.JLabel();
        saudeVirgem = new javax.swing.JLabel();
        tfAmorVirgem = new javax.swing.JTextField();
        tfTrabalhoVirgem = new javax.swing.JTextField();
        tfSaudeVirgem = new javax.swing.JTextField();
        tfSorteVirgem = new javax.swing.JTextField();
        areaMensagem5 = new javax.swing.JPanel();
        tituloMensagemVirgem = new javax.swing.JLabel();
        txMensagemVirgem = new javax.swing.JScrollPane();
        txtMensagemVirgem = new javax.swing.JTextArea();
        btnCopiarMsgVirgem = new javax.swing.JButton();
        fundoVirgem = new javax.swing.JLabel();
        libra = new javax.swing.JPanel();
        areaCaracteristicas6 = new javax.swing.JPanel();
        tituloCaracteristicaLibra = new javax.swing.JLabel();
        pfortesLibra = new javax.swing.JLabel();
        pMelhorarLibra = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txFortesLibra = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        txMelhorarLibra = new javax.swing.JTextArea();
        areaInformacoesLibra = new javax.swing.JPanel();
        imgSignoLibra = new javax.swing.JLabel();
        tituloLibra = new javax.swing.JLabel();
        periodoLibra = new javax.swing.JLabel();
        elementoLibra = new javax.swing.JLabel();
        planetaLibra = new javax.swing.JLabel();
        corLibra = new javax.swing.JLabel();
        numeroLibra = new javax.swing.JLabel();
        tfPeriodoLibra = new javax.swing.JTextField();
        tfElementoLibra = new javax.swing.JTextField();
        tfPlanetaLibra = new javax.swing.JTextField();
        tfCorLibra = new javax.swing.JTextField();
        tfNumeroLibra = new javax.swing.JTextField();
        areaPrevisaoLibra = new javax.swing.JPanel();
        previsaoLibra = new javax.swing.JLabel();
        txPrevisaoLibra = new javax.swing.JScrollPane();
        txtPrevisaoLibra = new javax.swing.JTextArea();
        btnAtualizarPrevisaoLibra = new javax.swing.JButton();
        areaEnergiaLibra = new javax.swing.JPanel();
        tituloEnergiaLibra = new javax.swing.JLabel();
        trabalhoLibra = new javax.swing.JLabel();
        sorteLibra = new javax.swing.JLabel();
        amorLibra = new javax.swing.JLabel();
        saudeLibra = new javax.swing.JLabel();
        tfAmorLibra = new javax.swing.JTextField();
        tfTrabalhoLibra = new javax.swing.JTextField();
        tfSaudeLibra = new javax.swing.JTextField();
        tfSorteLibra = new javax.swing.JTextField();
        areaMensagemLibra = new javax.swing.JPanel();
        tituloMensagemLibra = new javax.swing.JLabel();
        txMensagemLibra = new javax.swing.JScrollPane();
        txtMensagemLibra = new javax.swing.JTextArea();
        btnCopiarMsgLibra = new javax.swing.JButton();
        fundoLibra = new javax.swing.JLabel();
        escorpiao = new javax.swing.JPanel();
        areaCaracteristicasEscorpiao = new javax.swing.JPanel();
        tituloCaracteristicaEscorpiao = new javax.swing.JLabel();
        pfortesEscorpiao = new javax.swing.JLabel();
        pMelhorarEscorpiao = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        txFortesEscorpiao = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        txMelhorarEscorpiao = new javax.swing.JTextArea();
        areaInformacoesEscorpiao = new javax.swing.JPanel();
        imgSignoEscorpiao = new javax.swing.JLabel();
        tituloEscorpiao = new javax.swing.JLabel();
        periodoEscorpiao = new javax.swing.JLabel();
        elementoEscorpiao = new javax.swing.JLabel();
        planetaEscorpiao = new javax.swing.JLabel();
        corEscorpiao = new javax.swing.JLabel();
        numeroEscorpiao = new javax.swing.JLabel();
        tfPeriodoEscorpiao = new javax.swing.JTextField();
        tfElementoEscorpiao = new javax.swing.JTextField();
        tfPlanetaEscorpiao = new javax.swing.JTextField();
        tfCorEscorpiao = new javax.swing.JTextField();
        tfNumeroEscorpiao = new javax.swing.JTextField();
        areaPrevisaoEscorpiao = new javax.swing.JPanel();
        previsaoEscorpiao = new javax.swing.JLabel();
        txPrevisaoEscorpiao = new javax.swing.JScrollPane();
        txtPrevisaoEscorpiao = new javax.swing.JTextArea();
        btnAtualizarPrevisaoEscorpiao = new javax.swing.JButton();
        areaEnergiaEscorpiao = new javax.swing.JPanel();
        tituloEnergiaEscorpiao = new javax.swing.JLabel();
        trabalhoEscorpiao = new javax.swing.JLabel();
        sorteEscorpiao = new javax.swing.JLabel();
        amorEscorpiao = new javax.swing.JLabel();
        saudeEscorpiao = new javax.swing.JLabel();
        tfAmorEscorpiao = new javax.swing.JTextField();
        tfTrabalhoEscorpiao = new javax.swing.JTextField();
        tfSaudeEscorpiao = new javax.swing.JTextField();
        tfSorteEscorpiao = new javax.swing.JTextField();
        areaMensagemEscorpiao = new javax.swing.JPanel();
        tituloMensagemEscorpiao = new javax.swing.JLabel();
        txMensagemEscorpiao = new javax.swing.JScrollPane();
        txtMensagemEscorpiao = new javax.swing.JTextArea();
        btnCopiarMsgEscorpiao = new javax.swing.JButton();
        fundoEscorpiao = new javax.swing.JLabel();
        sagitario = new javax.swing.JPanel();
        areaCaracteristicasSagitario = new javax.swing.JPanel();
        tituloCaracteristicaSagitario = new javax.swing.JLabel();
        pfortesSagitario = new javax.swing.JLabel();
        pMelhorarSagitario = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        txFortesSagitario = new javax.swing.JTextArea();
        jScrollPane18 = new javax.swing.JScrollPane();
        txMelhorarSagitario = new javax.swing.JTextArea();
        areaInformacoesSagitario = new javax.swing.JPanel();
        imgSignoSagitario = new javax.swing.JLabel();
        tituloAriesSagitario = new javax.swing.JLabel();
        periodoAriesSagitario = new javax.swing.JLabel();
        elementoSagitario = new javax.swing.JLabel();
        planetaSagitario = new javax.swing.JLabel();
        corSagitario = new javax.swing.JLabel();
        numeroSagitario = new javax.swing.JLabel();
        tfPeriodoSagitario = new javax.swing.JTextField();
        tfElementoSagitario = new javax.swing.JTextField();
        tfPlanetaSagitario = new javax.swing.JTextField();
        tfCorSagitario = new javax.swing.JTextField();
        tfNumeroSagitario = new javax.swing.JTextField();
        areaPrevisaoSagitario = new javax.swing.JPanel();
        previsaoSagitario = new javax.swing.JLabel();
        txPrevisaoAries8 = new javax.swing.JScrollPane();
        txtPrevisaoSagitario = new javax.swing.JTextArea();
        btnAtualizarPrevisaoSagitario = new javax.swing.JButton();
        areaEnergiaSagitario = new javax.swing.JPanel();
        tituloEnergiaSagitario = new javax.swing.JLabel();
        trabalhoSagitario = new javax.swing.JLabel();
        sorteSagitario = new javax.swing.JLabel();
        amorSagitario = new javax.swing.JLabel();
        saudeSagitario = new javax.swing.JLabel();
        tfAmorSagitario = new javax.swing.JTextField();
        tfTrabalhoSagitario = new javax.swing.JTextField();
        tfSaudeSagitario = new javax.swing.JTextField();
        tfSorteSagitario = new javax.swing.JTextField();
        areaMensagemSagitario = new javax.swing.JPanel();
        tituloMensagemSagitario = new javax.swing.JLabel();
        txMensagemAries8 = new javax.swing.JScrollPane();
        txtMensagemSagitario = new javax.swing.JTextArea();
        btnCopiarMsgSagitario = new javax.swing.JButton();
        fundoSagitario = new javax.swing.JLabel();
        capricornio = new javax.swing.JPanel();
        areaCaracteristicasCapricornio = new javax.swing.JPanel();
        tituloCaracteristicaCapricornio = new javax.swing.JLabel();
        pfortesCapricornio = new javax.swing.JLabel();
        pMelhorarCapricornio = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        txFortesCapricornio = new javax.swing.JTextArea();
        jScrollPane20 = new javax.swing.JScrollPane();
        txMelhorarCapricornio = new javax.swing.JTextArea();
        areaInformacoesCapricornio = new javax.swing.JPanel();
        imgSignoCapricornio = new javax.swing.JLabel();
        tituloAriesCapricornio = new javax.swing.JLabel();
        periodoAriesCapricornio = new javax.swing.JLabel();
        elementoAriesCapricornio = new javax.swing.JLabel();
        planetaAriesCapricornio = new javax.swing.JLabel();
        corAriesCapricornio = new javax.swing.JLabel();
        numeroAriesCapricornio = new javax.swing.JLabel();
        tfPeriodoAriesCapricornio = new javax.swing.JTextField();
        tfElementoAriesCapricornio = new javax.swing.JTextField();
        tfPlanetaAriesCapricornio = new javax.swing.JTextField();
        tfCorAriesCapricornio = new javax.swing.JTextField();
        tfNumeroAriesCapricornio = new javax.swing.JTextField();
        areaPrevisaoCapricornio = new javax.swing.JPanel();
        previsaoCapricornio = new javax.swing.JLabel();
        txPrevisaoAries9 = new javax.swing.JScrollPane();
        txtPrevisaoCapricornio = new javax.swing.JTextArea();
        btnAtualizarPrevisaoCapricornio = new javax.swing.JButton();
        areaCapricornio = new javax.swing.JPanel();
        tituloEnergiaAries9 = new javax.swing.JLabel();
        trabalhoAries9 = new javax.swing.JLabel();
        sorteAries9 = new javax.swing.JLabel();
        amorAries9 = new javax.swing.JLabel();
        saudeAries9 = new javax.swing.JLabel();
        tfAmorAries9 = new javax.swing.JTextField();
        tfTrabalhoAries9 = new javax.swing.JTextField();
        tfSaudeAries9 = new javax.swing.JTextField();
        tfSorteAries9 = new javax.swing.JTextField();
        areaMensagemCapricornio = new javax.swing.JPanel();
        tituloMensagemCapricornio = new javax.swing.JLabel();
        txMensagemAries9 = new javax.swing.JScrollPane();
        txtMensagemCapricornio = new javax.swing.JTextArea();
        btnCopiarMsgCapricornio = new javax.swing.JButton();
        fundoCapricornio = new javax.swing.JLabel();
        aquario = new javax.swing.JPanel();
        areaCaracteristicasAquario = new javax.swing.JPanel();
        tituloCaracteristicaAquario = new javax.swing.JLabel();
        pfortesAquario = new javax.swing.JLabel();
        pMelhorarAquario = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        txFortesAquario = new javax.swing.JTextArea();
        jScrollPane22 = new javax.swing.JScrollPane();
        txMelhorarAquario = new javax.swing.JTextArea();
        areaInformacoesAquario = new javax.swing.JPanel();
        imgSignoAquario = new javax.swing.JLabel();
        tituloAquario = new javax.swing.JLabel();
        periodoAquario = new javax.swing.JLabel();
        elementoAquario = new javax.swing.JLabel();
        planetaAquario = new javax.swing.JLabel();
        corAquario = new javax.swing.JLabel();
        numeroAquario = new javax.swing.JLabel();
        tfPeriodoAquario = new javax.swing.JTextField();
        tfElementoAquario = new javax.swing.JTextField();
        tfPlanetaAquario = new javax.swing.JTextField();
        tfCorAquario = new javax.swing.JTextField();
        tfNumeroAquario = new javax.swing.JTextField();
        areaPrevisaoAquario = new javax.swing.JPanel();
        previsaoAquario = new javax.swing.JLabel();
        txPrevisaoAries10 = new javax.swing.JScrollPane();
        txtPrevisaoAquario = new javax.swing.JTextArea();
        btnAtualizarPrevisaoAquario = new javax.swing.JButton();
        areaEnergiaAquario = new javax.swing.JPanel();
        tituloEnergiaAquario = new javax.swing.JLabel();
        trabalhoAquario = new javax.swing.JLabel();
        sorteAquario = new javax.swing.JLabel();
        amorAquario = new javax.swing.JLabel();
        saudeAquario = new javax.swing.JLabel();
        tfAmorAquario = new javax.swing.JTextField();
        tfTrabalhoAquario = new javax.swing.JTextField();
        tfSaudeAquario = new javax.swing.JTextField();
        tfSorteAquario = new javax.swing.JTextField();
        areaMensagemAquario = new javax.swing.JPanel();
        tituloMensagemAquario = new javax.swing.JLabel();
        txMensagemAries10 = new javax.swing.JScrollPane();
        txtMensagemAquario = new javax.swing.JTextArea();
        btnCopiarMsgAquario = new javax.swing.JButton();
        fundoAquario = new javax.swing.JLabel();
        peixes = new javax.swing.JPanel();
        areaCaracteristicas11 = new javax.swing.JPanel();
        tituloCaracteristicaAries11 = new javax.swing.JLabel();
        pfortesAries11 = new javax.swing.JLabel();
        pMelhorarAries11 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        txFortesAries11 = new javax.swing.JTextArea();
        jScrollPane24 = new javax.swing.JScrollPane();
        txMelhorarAries11 = new javax.swing.JTextArea();
        areaInformacoes11 = new javax.swing.JPanel();
        imgSignoPeixes = new javax.swing.JLabel();
        tituloAries11 = new javax.swing.JLabel();
        periodoAries11 = new javax.swing.JLabel();
        elementoAries11 = new javax.swing.JLabel();
        planetaAries11 = new javax.swing.JLabel();
        corAries11 = new javax.swing.JLabel();
        numeroAries11 = new javax.swing.JLabel();
        tfPeriodoAries11 = new javax.swing.JTextField();
        tfElementoAries11 = new javax.swing.JTextField();
        tfPlanetaAries11 = new javax.swing.JTextField();
        tfCorAries11 = new javax.swing.JTextField();
        tfNumeroAries11 = new javax.swing.JTextField();
        areaPrevisao11 = new javax.swing.JPanel();
        previsaoPeixes = new javax.swing.JLabel();
        txPrevisaoPeixes = new javax.swing.JScrollPane();
        txtPrevisaoPeixes = new javax.swing.JTextArea();
        btnAtualizarPrevisaoPeixes = new javax.swing.JButton();
        areaEnergia11 = new javax.swing.JPanel();
        tituloEnergiaPeixes = new javax.swing.JLabel();
        trabalhoPeixes = new javax.swing.JLabel();
        sortePeixes = new javax.swing.JLabel();
        amorPeixes = new javax.swing.JLabel();
        saudePeixes = new javax.swing.JLabel();
        tfAmorPeixes = new javax.swing.JTextField();
        tfTrabalhoPeixes = new javax.swing.JTextField();
        tfSaudePeixes = new javax.swing.JTextField();
        tfSortePeixes = new javax.swing.JTextField();
        areaMensagem11 = new javax.swing.JPanel();
        tituloMensagemPeixes = new javax.swing.JLabel();
        txMensagemPeixes = new javax.swing.JScrollPane();
        txtMensagemPeixes = new javax.swing.JTextArea();
        btnCopiarMsgPeixes = new javax.swing.JButton();
        fundoPeixes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaAbas.setBackground(new java.awt.Color(51, 51, 51));
        areaAbas.setForeground(new java.awt.Color(204, 204, 255));
        areaAbas.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N

        inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaDescobrirSigno.setBackground(new java.awt.Color(255, 204, 204));
        areaDescobrirSigno.setPreferredSize(new java.awt.Dimension(200, 200));

        tituloDescobrirSigno.setBackground(new java.awt.Color(255, 255, 255));
        tituloDescobrirSigno.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        tituloDescobrirSigno.setForeground(new java.awt.Color(0, 0, 0));
        tituloDescobrirSigno.setText("Não sabe seu signo? Vamos descobrir!");

        nome.setBackground(new java.awt.Color(255, 255, 255));
        nome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nome.setForeground(new java.awt.Color(0, 0, 0));
        nome.setText("Nome:");

        mesNascimento.setBackground(new java.awt.Color(255, 255, 255));
        mesNascimento.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mesNascimento.setForeground(new java.awt.Color(0, 0, 0));
        mesNascimento.setText("Mês de nascimento:");

        diaNascimento.setBackground(new java.awt.Color(255, 255, 255));
        diaNascimento.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        diaNascimento.setForeground(new java.awt.Color(0, 0, 0));
        diaNascimento.setText("Dia de nascimento:");

        tfNome.setBackground(new java.awt.Color(255, 204, 204));
        tfNome.setForeground(new java.awt.Color(153, 153, 153));
        tfNome.setText("digit seu nome...");

        cbDia.setBackground(new java.awt.Color(255, 204, 204));
        cbDia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbDia.setForeground(new java.awt.Color(0, 0, 0));
        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbMes.setBackground(new java.awt.Color(255, 204, 204));
        cbMes.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbMes.setForeground(new java.awt.Color(0, 0, 0));
        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        btnDescobrirSigno.setBackground(new java.awt.Color(255, 204, 204));
        btnDescobrirSigno.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDescobrirSigno.setForeground(new java.awt.Color(0, 0, 0));
        btnDescobrirSigno.setText("Descobrir meu signo!");
        btnDescobrirSigno.addActionListener(this::btnDescobrirSignoActionPerformed);

        javax.swing.GroupLayout areaDescobrirSignoLayout = new javax.swing.GroupLayout(areaDescobrirSigno);
        areaDescobrirSigno.setLayout(areaDescobrirSignoLayout);
        areaDescobrirSignoLayout.setHorizontalGroup(
            areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tituloDescobrirSigno)
                        .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                .addComponent(nome)
                                .addGap(18, 18, 18)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(mesNascimento, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                        .addComponent(diaNascimento)
                                        .addGap(5, 5, 5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbMes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbDia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50))))
                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(btnDescobrirSigno)))
                .addGap(168, 168, 168))
        );
        areaDescobrirSignoLayout.setVerticalGroup(
            areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloDescobrirSigno)
                .addGap(47, 47, 47)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaNascimento)
                    .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesNascimento)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btnDescobrirSigno)
                .addContainerGap())
        );

        inicio.add(areaDescobrirSigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 430, 310));

        areaCompatibilidade.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Compatibilidade");

        signo1.setBackground(new java.awt.Color(255, 204, 204));
        signo1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        signo1.setForeground(new java.awt.Color(0, 0, 0));
        signo1.setText("Primeiro Signo:");

        signo2.setBackground(new java.awt.Color(255, 204, 204));
        signo2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        signo2.setForeground(new java.awt.Color(0, 0, 0));
        signo2.setText("Segundo Signo:");

        jComboBox1.setBackground(new java.awt.Color(255, 204, 204));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes" }));

        jComboBox2.setBackground(new java.awt.Color(255, 204, 204));
        jComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes" }));

        btnCalcular.setBackground(new java.awt.Color(255, 204, 204));
        btnCalcular.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(51, 51, 51));
        btnCalcular.setText("Calcule nossa compatibilidade!");

        javax.swing.GroupLayout areaCompatibilidadeLayout = new javax.swing.GroupLayout(areaCompatibilidade);
        areaCompatibilidade.setLayout(areaCompatibilidadeLayout);
        areaCompatibilidadeLayout.setHorizontalGroup(
            areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(signo2)
                    .addComponent(signo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaCompatibilidadeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addContainerGap())
        );
        areaCompatibilidadeLayout.setVerticalGroup(
            areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signo1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signo2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addContainerGap())
        );

        inicio.add(areaCompatibilidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 430, 310));

        areaResultado.setBackground(new java.awt.Color(255, 204, 204));

        signo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        signo.setForeground(new java.awt.Color(0, 0, 0));
        signo.setText("Signo");

        compatibilidade.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        compatibilidade.setForeground(new java.awt.Color(0, 0, 0));
        compatibilidade.setText("Compatibilidade");

        btnSigno.setBackground(new java.awt.Color(255, 204, 204));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout areaResultadoLayout = new javax.swing.GroupLayout(areaResultado);
        areaResultado.setLayout(areaResultadoLayout);
        areaResultadoLayout.setHorizontalGroup(
            areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaResultadoLayout.createSequentialGroup()
                .addGroup(areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(areaResultadoLayout.createSequentialGroup()
                            .addGap(108, 108, 108)
                            .addComponent(signo))
                        .addGroup(areaResultadoLayout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(btnSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaResultadoLayout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(compatibilidade))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        areaResultadoLayout.setVerticalGroup(
            areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(signo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(compatibilidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        inicio.add(areaResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 260, 660));

        fundoInicio.setBackground(new java.awt.Color(255, 204, 204));
        fundoInicio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fundoInicio.setForeground(new java.awt.Color(0, 0, 0));
        fundoInicio.setIcon(new javax.swing.ImageIcon("C:\\Users\\JordanaLeite\\Documents\\PROJETO_APP_HOROSCOPO\\HOROSCOPO\\src\\main\\resources\\assets\\zodiaco.png")); // NOI18N
        inicio.add(fundoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -60, 1690, 1050));

        areaAbas.addTab("Inicio", inicio);

        aries.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaCaracteristicas.setBackground(new java.awt.Color(255, 204, 204));

        tituloCaracteristicaAries.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaAries.setForeground(new java.awt.Color(102, 0, 102));
        tituloCaracteristicaAries.setText("Características");

        pfortesAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesAries.setForeground(new java.awt.Color(102, 0, 102));
        pfortesAries.setText("Pontos Fortes:");

        pMelhorarAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarAries.setForeground(new java.awt.Color(102, 0, 102));
        pMelhorarAries.setText("Pontos a Melhorar:");

        txFortesAries.setBackground(new java.awt.Color(255, 204, 204));
        txFortesAries.setColumns(20);
        txFortesAries.setForeground(new java.awt.Color(51, 51, 51));
        txFortesAries.setRows(5);
        txFortesAries.setText("Coragem, liderança, iniciativa e determinação.");
        jScrollPane1.setViewportView(txFortesAries);

        txMelhorarAries.setBackground(new java.awt.Color(255, 204, 204));
        txMelhorarAries.setColumns(20);
        txMelhorarAries.setForeground(new java.awt.Color(51, 51, 51));
        txMelhorarAries.setRows(5);
        txMelhorarAries.setText("Impulsividade, impaciência e dificuldade em ouvir opiniões diferentes.");
        jScrollPane2.setViewportView(txMelhorarAries);

        javax.swing.GroupLayout areaCaracteristicasLayout = new javax.swing.GroupLayout(areaCaracteristicas);
        areaCaracteristicas.setLayout(areaCaracteristicasLayout);
        areaCaracteristicasLayout.setHorizontalGroup(
            areaCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaAries, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(pMelhorarAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasLayout.setVerticalGroup(
            areaCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaAries, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addGap(27, 27, 27))
        );

        aries.add(areaCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        areaInformacoes.setBackground(new java.awt.Color(255, 204, 204));

        imgSignoAries.setBackground(new java.awt.Color(255, 204, 204));
        imgSignoAries.setIcon(new javax.swing.ImageIcon("C:\\Users\\JordanaLeite\\Documents\\PROJETO_APP_HOROSCOPO\\HOROSCOPO\\src\\main\\resources\\assets\\aries.png")); // NOI18N

        tituloAries.setBackground(new java.awt.Color(255, 204, 204));
        tituloAries.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloAries.setForeground(new java.awt.Color(102, 0, 102));
        tituloAries.setText("ÁRIES");

        periodoAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoAries.setForeground(new java.awt.Color(102, 0, 102));
        periodoAries.setText("PERIODO:");

        elementoAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoAries.setForeground(new java.awt.Color(102, 0, 102));
        elementoAries.setText("ELEMENTO:");

        planetaAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaAries.setForeground(new java.awt.Color(102, 0, 102));
        planetaAries.setText("PLANETA REGENTE:");

        corAries.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corAries.setForeground(new java.awt.Color(102, 0, 102));
        corAries.setText("COR:");

        numeroAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroAries.setText("NÚMERO DA SORTE:");

        tfPeriodoAries.setBackground(new java.awt.Color(255, 204, 204));
        tfPeriodoAries.setForeground(new java.awt.Color(51, 51, 51));
        tfPeriodoAries.setText("21 de março a 19 de abril");

        tfElementoAries.setBackground(new java.awt.Color(255, 204, 204));
        tfElementoAries.setForeground(new java.awt.Color(51, 51, 51));
        tfElementoAries.setText("Fogo");

        tfPlanetaAries.setBackground(new java.awt.Color(255, 204, 204));
        tfPlanetaAries.setForeground(new java.awt.Color(51, 51, 51));
        tfPlanetaAries.setText("Marte");

        tfCorAries.setBackground(new java.awt.Color(255, 204, 204));
        tfCorAries.setForeground(new java.awt.Color(51, 51, 51));
        tfCorAries.setText("Vermelho");

        javax.swing.GroupLayout areaInformacoesLayout = new javax.swing.GroupLayout(areaInformacoes);
        areaInformacoes.setLayout(areaInformacoesLayout);
        areaInformacoesLayout.setHorizontalGroup(
            areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLayout.createSequentialGroup()
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(areaInformacoesLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(areaInformacoesLayout.createSequentialGroup()
                                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(planetaAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(numeroAries, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPlanetaAries)
                                    .addComponent(tfNumeroAries)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLayout.createSequentialGroup()
                                .addComponent(elementoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfElementoAries))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLayout.createSequentialGroup()
                                .addComponent(periodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(tfPeriodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesLayout.createSequentialGroup()
                                .addComponent(corAries, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCorAries)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(areaInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesLayout.setVerticalGroup(
            areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloAries, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoAries)
                    .addComponent(tfPeriodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoAries)
                    .addComponent(tfElementoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaAries)
                    .addComponent(tfPlanetaAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corAries)
                    .addComponent(tfCorAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroAries)
                    .addComponent(tfNumeroAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        aries.add(areaInformacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        areaPrevisao.setBackground(new java.awt.Color(255, 204, 204));

        previsaoAries.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoAries.setForeground(new java.awt.Color(102, 0, 102));
        previsaoAries.setText("Previsão do Dia:");

        txtPrevisaoAries.setBackground(new java.awt.Color(255, 204, 204));
        txtPrevisaoAries.setColumns(20);
        txtPrevisaoAries.setForeground(new java.awt.Color(51, 51, 51));
        txtPrevisaoAries.setRows(5);
        txPrevisaoAries.setViewportView(txtPrevisaoAries);

        btnAtualizarPrevisaoAries.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoAries.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoAries.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoLayout = new javax.swing.GroupLayout(areaPrevisao);
        areaPrevisao.setLayout(areaPrevisaoLayout);
        areaPrevisaoLayout.setHorizontalGroup(
            areaPrevisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLayout.createSequentialGroup()
                .addGroup(areaPrevisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaPrevisaoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(areaPrevisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(previsaoAries, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                            .addComponent(txPrevisaoAries))))
                .addGap(13, 13, 13))
        );
        areaPrevisaoLayout.setVerticalGroup(
            areaPrevisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoAries, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        aries.add(areaPrevisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        areaEnergia.setBackground(new java.awt.Color(255, 204, 204));

        tituloEnergiaAries.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaAries.setForeground(new java.awt.Color(102, 0, 102));
        tituloEnergiaAries.setText("Energia do Dia");

        trabalhoAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoAries.setForeground(new java.awt.Color(102, 0, 102));
        trabalhoAries.setText("Trabalho:");

        sorteAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteAries.setForeground(new java.awt.Color(102, 0, 102));
        sorteAries.setText("Sorte:");

        amorAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorAries.setForeground(new java.awt.Color(102, 0, 102));
        amorAries.setText("Amor:");

        saudeAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeAries.setForeground(new java.awt.Color(102, 0, 102));
        saudeAries.setText("Saúde:");

        tfAmorAries.setBackground(new java.awt.Color(255, 204, 204));
        tfAmorAries.setForeground(new java.awt.Color(51, 51, 51));
        tfAmorAries.setText("82%");

        tfTrabalhoAries.setBackground(new java.awt.Color(255, 204, 204));
        tfTrabalhoAries.setForeground(new java.awt.Color(51, 51, 51));
        tfTrabalhoAries.setText("88%");

        tfSaudeAries.setBackground(new java.awt.Color(255, 204, 204));
        tfSaudeAries.setForeground(new java.awt.Color(51, 51, 51));
        tfSaudeAries.setText("76%");

        tfSorteAries.setBackground(new java.awt.Color(255, 204, 204));
        tfSorteAries.setForeground(new java.awt.Color(51, 51, 51));
        tfSorteAries.setText("84%");

        javax.swing.GroupLayout areaEnergiaLayout = new javax.swing.GroupLayout(areaEnergia);
        areaEnergia.setLayout(areaEnergiaLayout);
        areaEnergiaLayout.setHorizontalGroup(
            areaEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaLayout.createSequentialGroup()
                        .addComponent(amorAries, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorAries)
                    .addGroup(areaEnergiaLayout.createSequentialGroup()
                        .addComponent(trabalhoAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoAries)
                    .addGroup(areaEnergiaLayout.createSequentialGroup()
                        .addComponent(saudeAries, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeAries)
                    .addGroup(areaEnergiaLayout.createSequentialGroup()
                        .addComponent(sorteAries, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteAries)
                    .addComponent(tituloEnergiaAries, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergiaLayout.setVerticalGroup(
            areaEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaAries, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorAries)
                .addGap(16, 16, 16)
                .addComponent(trabalhoAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeAries)
                .addGap(15, 15, 15)
                .addComponent(sorteAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteAries)
                .addGap(51, 51, 51))
        );

        aries.add(areaEnergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        areaMensagem.setBackground(new java.awt.Color(255, 204, 204));

        tituloMensagemAries.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemAries.setForeground(new java.awt.Color(102, 0, 102));
        tituloMensagemAries.setText("Mensagem do dia");

        txtMensagemAries.setBackground(new java.awt.Color(255, 204, 204));
        txtMensagemAries.setColumns(20);
        txtMensagemAries.setForeground(new java.awt.Color(51, 51, 51));
        txtMensagemAries.setRows(5);
        txMensagemAries.setViewportView(txtMensagemAries);

        btnCopiarMsgAries.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgAries.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgAries.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemLayout = new javax.swing.GroupLayout(areaMensagem);
        areaMensagem.setLayout(areaMensagemLayout);
        areaMensagemLayout.setHorizontalGroup(
            areaMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLayout.createSequentialGroup()
                .addGroup(areaMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(areaMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(tituloMensagemAries, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCopiarMsgAries, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaMensagemLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txMensagemAries, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        areaMensagemLayout.setVerticalGroup(
            areaMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLayout.createSequentialGroup()
                .addComponent(tituloMensagemAries, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txMensagemAries, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgAries)
                .addGap(20, 20, 20))
        );

        aries.add(areaMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 520, 570, 420));

        fundoAries.setForeground(new java.awt.Color(102, 0, 102));
        fundoAries.setIcon(new javax.swing.ImageIcon("C:\\Users\\JordanaLeite\\Documents\\PROJETO_APP_HOROSCOPO\\HOROSCOPO\\src\\main\\resources\\assets\\zodiaco.png")); // NOI18N
        aries.add(fundoAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1670, 940));

        areaAbas.addTab("Áries", aries);

        touro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaCaracteristicas1.setBackground(new java.awt.Color(255, 204, 204));

        tituloCaracteristicaTouro.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaTouro.setForeground(new java.awt.Color(102, 0, 102));
        tituloCaracteristicaTouro.setText("Características");

        pfortesTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesTouro.setForeground(new java.awt.Color(102, 0, 102));
        pfortesTouro.setText("Pontos Fortes:");

        pMelhorarTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarTouro.setForeground(new java.awt.Color(102, 0, 102));
        pMelhorarTouro.setText("Pontos a Melhorar:");

        txFortesTouro.setBackground(new java.awt.Color(255, 204, 204));
        txFortesTouro.setColumns(20);
        txFortesTouro.setForeground(new java.awt.Color(51, 51, 51));
        txFortesTouro.setRows(5);
        txFortesTouro.setText("Lealdade, paciência, determinação e responsabilidade.");
        jScrollPane3.setViewportView(txFortesTouro);

        txMelhorarTouro.setBackground(new java.awt.Color(255, 204, 204));
        txMelhorarTouro.setColumns(20);
        txMelhorarTouro.setForeground(new java.awt.Color(51, 51, 51));
        txMelhorarTouro.setRows(5);
        txMelhorarTouro.setText("Teimosia, resistência a mudanças e apego excessivo.");
        jScrollPane4.setViewportView(txMelhorarTouro);

        javax.swing.GroupLayout areaCaracteristicas1Layout = new javax.swing.GroupLayout(areaCaracteristicas1);
        areaCaracteristicas1.setLayout(areaCaracteristicas1Layout);
        areaCaracteristicas1Layout.setHorizontalGroup(
            areaCaracteristicas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(pMelhorarTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(26, 26, 26))
        );
        areaCaracteristicas1Layout.setVerticalGroup(
            areaCaracteristicas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4)
                .addGap(27, 27, 27))
        );

        touro.add(areaCaracteristicas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        areaInformacoes1.setBackground(new java.awt.Color(255, 204, 204));

        imgSignoTouro.setBackground(new java.awt.Color(255, 204, 204));
        imgSignoTouro.setIcon(new javax.swing.ImageIcon("C:\\Users\\JordanaLeite\\Documents\\PROJETO_APP_HOROSCOPO\\HOROSCOPO\\src\\main\\resources\\assets\\touro.png")); // NOI18N

        tituloTouro.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloTouro.setForeground(new java.awt.Color(102, 0, 102));
        tituloTouro.setText("Touro");

        periodoTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoTouro.setForeground(new java.awt.Color(102, 0, 102));
        periodoTouro.setText("PERIODO:");

        elementoTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoTouro.setForeground(new java.awt.Color(102, 0, 102));
        elementoTouro.setText("ELEMENTO:");

        planetaTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaTouro.setForeground(new java.awt.Color(102, 0, 102));
        planetaTouro.setText("PLANETA REGENTE:");

        corTouro.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corTouro.setForeground(new java.awt.Color(102, 0, 102));
        corTouro.setText("COR:");

        numeroTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroTouro.setText("NÚMERO DA SORTE:");

        tfPeriodoTouro.setBackground(new java.awt.Color(255, 204, 204));
        tfPeriodoTouro.setForeground(new java.awt.Color(51, 51, 51));
        tfPeriodoTouro.setText("20 de abril a 20 de maio");

        tfElementoTouro.setBackground(new java.awt.Color(255, 204, 204));
        tfElementoTouro.setForeground(new java.awt.Color(51, 51, 51));
        tfElementoTouro.setText("Terra");

        tfPlanetaTouro.setBackground(new java.awt.Color(255, 204, 204));
        tfPlanetaTouro.setForeground(new java.awt.Color(51, 51, 51));
        tfPlanetaTouro.setText("Vênus");

        tfCorTouro.setBackground(new java.awt.Color(255, 204, 204));
        tfCorTouro.setForeground(new java.awt.Color(51, 51, 51));
        tfCorTouro.setText("Verde");

        javax.swing.GroupLayout areaInformacoes1Layout = new javax.swing.GroupLayout(areaInformacoes1);
        areaInformacoes1.setLayout(areaInformacoes1Layout);
        areaInformacoes1Layout.setHorizontalGroup(
            areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoes1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoes1Layout.createSequentialGroup()
                            .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaTouro)
                                .addComponent(tfNumeroTouro)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes1Layout.createSequentialGroup()
                            .addComponent(elementoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoTouro))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes1Layout.createSequentialGroup()
                            .addComponent(periodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoes1Layout.createSequentialGroup()
                            .addComponent(corTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorTouro))))
                .addGap(10, 10, 10))
        );
        areaInformacoes1Layout.setVerticalGroup(
            areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoTouro)
                    .addComponent(tfPeriodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoTouro)
                    .addComponent(tfElementoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaTouro)
                    .addComponent(tfPlanetaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corTouro)
                    .addComponent(tfCorTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroTouro)
                    .addComponent(tfNumeroTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        touro.add(areaInformacoes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        areaPrevisao1.setBackground(new java.awt.Color(255, 204, 204));

        previsaoTouro.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoTouro.setForeground(new java.awt.Color(102, 0, 102));
        previsaoTouro.setText("Previsão do Dia:");

        txtPrevisaoTouro.setBackground(new java.awt.Color(255, 204, 204));
        txtPrevisaoTouro.setColumns(20);
        txtPrevisaoTouro.setForeground(new java.awt.Color(51, 51, 51));
        txtPrevisaoTouro.setRows(5);
        txPrevisaoTouro.setViewportView(txtPrevisaoTouro);

        btnAtualizarPrevisaoTouro.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoTouro.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoTouro.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisao1Layout = new javax.swing.GroupLayout(areaPrevisao1);
        areaPrevisao1.setLayout(areaPrevisao1Layout);
        areaPrevisao1Layout.setHorizontalGroup(
            areaPrevisao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisao1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoTouro)
                    .addGroup(areaPrevisao1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisao1Layout.setVerticalGroup(
            areaPrevisao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        touro.add(areaPrevisao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        areaEnergia1.setBackground(new java.awt.Color(255, 204, 204));

        tituloEnergiaTouro.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaTouro.setForeground(new java.awt.Color(102, 0, 102));
        tituloEnergiaTouro.setText("Energia do Dia");

        trabalhoTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoTouro.setForeground(new java.awt.Color(102, 0, 102));
        trabalhoTouro.setText("Trabalho:");

        sorteTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteTouro.setForeground(new java.awt.Color(102, 0, 102));
        sorteTouro.setText("Sorte:");

        amorTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorTouro.setForeground(new java.awt.Color(102, 0, 102));
        amorTouro.setText("Amor:");

        saudeTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeTouro.setForeground(new java.awt.Color(102, 0, 102));
        saudeTouro.setText("Saúde:");

        tfAmorAries1.setBackground(new java.awt.Color(255, 204, 204));
        tfAmorAries1.setForeground(new java.awt.Color(51, 51, 51));
        tfAmorAries1.setText("86%");

        tfTrabalhoAries1.setBackground(new java.awt.Color(255, 204, 204));
        tfTrabalhoAries1.setForeground(new java.awt.Color(51, 51, 51));
        tfTrabalhoAries1.setText("91%");

        tfSaudeAries1.setBackground(new java.awt.Color(255, 204, 204));
        tfSaudeAries1.setForeground(new java.awt.Color(51, 51, 51));
        tfSaudeAries1.setText("80%");

        tfSorteAries1.setBackground(new java.awt.Color(255, 204, 204));
        tfSorteAries1.setForeground(new java.awt.Color(51, 51, 51));
        tfSorteAries1.setText("78%");

        javax.swing.GroupLayout areaEnergia1Layout = new javax.swing.GroupLayout(areaEnergia1);
        areaEnergia1.setLayout(areaEnergia1Layout);
        areaEnergia1Layout.setHorizontalGroup(
            areaEnergia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia1Layout.createSequentialGroup()
                        .addComponent(amorTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorAries1)
                    .addGroup(areaEnergia1Layout.createSequentialGroup()
                        .addComponent(trabalhoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoAries1)
                    .addGroup(areaEnergia1Layout.createSequentialGroup()
                        .addComponent(saudeTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeAries1)
                    .addGroup(areaEnergia1Layout.createSequentialGroup()
                        .addComponent(sorteTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteAries1)
                    .addComponent(tituloEnergiaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergia1Layout.setVerticalGroup(
            areaEnergia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorAries1)
                .addGap(16, 16, 16)
                .addComponent(trabalhoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoAries1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeAries1)
                .addGap(15, 15, 15)
                .addComponent(sorteTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteAries1)
                .addGap(51, 51, 51))
        );

        touro.add(areaEnergia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        areaMensagem1.setBackground(new java.awt.Color(255, 204, 204));

        tituloMensagemTouro.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemTouro.setForeground(new java.awt.Color(102, 0, 102));
        tituloMensagemTouro.setText("Mensagem do dia");

        txtMensagemTouro.setBackground(new java.awt.Color(255, 204, 204));
        txtMensagemTouro.setColumns(20);
        txtMensagemTouro.setForeground(new java.awt.Color(51, 51, 51));
        txtMensagemTouro.setRows(5);
        txMensagemTouro.setViewportView(txtMensagemTouro);

        btnCopiarMsgTouro.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgTouro.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgTouro.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagem1Layout = new javax.swing.GroupLayout(areaMensagem1);
        areaMensagem1.setLayout(areaMensagem1Layout);
        areaMensagem1Layout.setHorizontalGroup(
            areaMensagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagem1Layout.setVerticalGroup(
            areaMensagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgTouro)
                .addGap(20, 20, 20))
        );

        touro.add(areaMensagem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoTouro.setIcon(new javax.swing.ImageIcon("C:\\Users\\JordanaLeite\\Documents\\PROJETO_APP_HOROSCOPO\\HOROSCOPO\\src\\main\\resources\\assets\\zodiaco.png")); // NOI18N
        touro.add(fundoTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1670, 940));

        areaAbas.addTab("Touro", touro);

        gemeos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaCaracteristicas2.setBackground(new java.awt.Color(255, 204, 204));

        tituloCaracteristicaGemeos.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaGemeos.setForeground(new java.awt.Color(102, 0, 102));
        tituloCaracteristicaGemeos.setText("Características");

        pfortesGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesGemeos.setForeground(new java.awt.Color(102, 0, 102));
        pfortesGemeos.setText("Pontos Fortes:");

        pMelhorarGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarGemeos.setForeground(new java.awt.Color(102, 0, 102));
        pMelhorarGemeos.setText("Pontos a Melhorar:");

        txFortesGemeos.setBackground(new java.awt.Color(255, 204, 204));
        txFortesGemeos.setColumns(20);
        txFortesGemeos.setForeground(new java.awt.Color(51, 51, 51));
        txFortesGemeos.setRows(5);
        txFortesGemeos.setText("Comunicação, criatividade, inteligência e adaptabilidade.");
        jScrollPane5.setViewportView(txFortesGemeos);

        txMelhorarGemeos.setBackground(new java.awt.Color(255, 204, 204));
        txMelhorarGemeos.setColumns(20);
        txMelhorarGemeos.setForeground(new java.awt.Color(51, 51, 51));
        txMelhorarGemeos.setRows(5);
        txMelhorarGemeos.setText("Indecisão, distração e dificuldade em manter o foco.");
        jScrollPane6.setViewportView(txMelhorarGemeos);

        javax.swing.GroupLayout areaCaracteristicas2Layout = new javax.swing.GroupLayout(areaCaracteristicas2);
        areaCaracteristicas2.setLayout(areaCaracteristicas2Layout);
        areaCaracteristicas2Layout.setHorizontalGroup(
            areaCaracteristicas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5)
                    .addComponent(pMelhorarGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6))
                .addGap(26, 26, 26))
        );
        areaCaracteristicas2Layout.setVerticalGroup(
            areaCaracteristicas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6)
                .addGap(27, 27, 27))
        );

        gemeos.add(areaCaracteristicas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        areaInformacoes2.setBackground(new java.awt.Color(255, 204, 204));

        imgSignoGemeos.setIcon(new javax.swing.ImageIcon("C:\\Users\\JordanaLeite\\Documents\\PROJETO_APP_HOROSCOPO\\HOROSCOPO\\src\\main\\resources\\assets\\gemeos.png")); // NOI18N

        tituloGemeos.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloGemeos.setForeground(new java.awt.Color(102, 0, 102));
        tituloGemeos.setText("Gêmeos");

        periodoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoGemeos.setForeground(new java.awt.Color(102, 0, 102));
        periodoGemeos.setText("PERIODO:");

        elementoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoGemeos.setForeground(new java.awt.Color(102, 0, 102));
        elementoGemeos.setText("ELEMENTO:");

        planetaGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaGemeos.setForeground(new java.awt.Color(102, 0, 102));
        planetaGemeos.setText("PLANETA REGENTE:");

        corGemeos.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corGemeos.setForeground(new java.awt.Color(102, 0, 102));
        corGemeos.setText("COR:");

        numeroGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroGemeos.setText("NÚMERO DA SORTE:");

        tfPeriodoAries2.setBackground(new java.awt.Color(255, 204, 204));
        tfPeriodoAries2.setForeground(new java.awt.Color(51, 51, 51));
        tfPeriodoAries2.setText("21 de maio a 20 de junho.");

        tfElementoAries2.setBackground(new java.awt.Color(255, 204, 204));
        tfElementoAries2.setForeground(new java.awt.Color(51, 51, 51));
        tfElementoAries2.setText("Ar.");

        tfPlanetaAries2.setBackground(new java.awt.Color(255, 204, 204));
        tfPlanetaAries2.setForeground(new java.awt.Color(51, 51, 51));
        tfPlanetaAries2.setText("Mercúrio.");

        tfCorAries2.setBackground(new java.awt.Color(255, 204, 204));
        tfCorAries2.setForeground(new java.awt.Color(51, 51, 51));
        tfCorAries2.setText("Amarelo.");

        javax.swing.GroupLayout areaInformacoes2Layout = new javax.swing.GroupLayout(areaInformacoes2);
        areaInformacoes2.setLayout(areaInformacoes2Layout);
        areaInformacoes2Layout.setHorizontalGroup(
            areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoes2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoes2Layout.createSequentialGroup()
                            .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaAries2)
                                .addComponent(tfNumeroAries2)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes2Layout.createSequentialGroup()
                            .addComponent(elementoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoAries2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes2Layout.createSequentialGroup()
                            .addComponent(periodoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoAries2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoes2Layout.createSequentialGroup()
                            .addComponent(corGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorAries2))))
                .addGap(10, 10, 10))
        );
        areaInformacoes2Layout.setVerticalGroup(
            areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoGemeos)
                    .addComponent(tfPeriodoAries2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoGemeos)
                    .addComponent(tfElementoAries2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaGemeos)
                    .addComponent(tfPlanetaAries2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corGemeos)
                    .addComponent(tfCorAries2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroGemeos)
                    .addComponent(tfNumeroAries2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        gemeos.add(areaInformacoes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        areaPrevisao2.setBackground(new java.awt.Color(255, 204, 204));

        previsaoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoGemeos.setForeground(new java.awt.Color(102, 0, 102));
        previsaoGemeos.setText("Previsão do Dia:");

        txtPrevisaoGemeos.setBackground(new java.awt.Color(255, 204, 204));
        txtPrevisaoGemeos.setColumns(20);
        txtPrevisaoGemeos.setForeground(new java.awt.Color(51, 51, 51));
        txtPrevisaoGemeos.setRows(5);
        txPrevisaoAries2.setViewportView(txtPrevisaoGemeos);

        btnAtualizarPrevisaoGemeos.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoGemeos.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoGemeos.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisao2Layout = new javax.swing.GroupLayout(areaPrevisao2);
        areaPrevisao2.setLayout(areaPrevisao2Layout);
        areaPrevisao2Layout.setHorizontalGroup(
            areaPrevisao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisao2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoAries2)
                    .addGroup(areaPrevisao2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisao2Layout.setVerticalGroup(
            areaPrevisao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoAries2, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        gemeos.add(areaPrevisao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        areaEnergia2.setBackground(new java.awt.Color(255, 204, 204));

        tituloEnergiaGemeos.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaGemeos.setForeground(new java.awt.Color(102, 0, 102));
        tituloEnergiaGemeos.setText("Energia do Dia");

        trabalhoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoGemeos.setForeground(new java.awt.Color(102, 0, 102));
        trabalhoGemeos.setText("Trabalho:");

        sorteGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteGemeos.setForeground(new java.awt.Color(102, 0, 102));
        sorteGemeos.setText("Sorte:");

        amorGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorGemeos.setForeground(new java.awt.Color(102, 0, 102));
        amorGemeos.setText("Amor:");

        saudeGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeGemeos.setForeground(new java.awt.Color(102, 0, 102));
        saudeGemeos.setText("Saúde:");

        tfAmorGemeos.setBackground(new java.awt.Color(255, 204, 204));
        tfAmorGemeos.setForeground(new java.awt.Color(51, 51, 51));
        tfAmorGemeos.setText("79%");

        tfTrabalhoGemeos.setBackground(new java.awt.Color(255, 204, 204));
        tfTrabalhoGemeos.setForeground(new java.awt.Color(51, 51, 51));
        tfTrabalhoGemeos.setText("85%");

        tfSaudeGemeos.setBackground(new java.awt.Color(255, 204, 204));
        tfSaudeGemeos.setForeground(new java.awt.Color(51, 51, 51));
        tfSaudeGemeos.setText("74%");

        tfSorteGemeos.setBackground(new java.awt.Color(255, 204, 204));
        tfSorteGemeos.setForeground(new java.awt.Color(51, 51, 51));
        tfSorteGemeos.setText("89%");

        javax.swing.GroupLayout areaEnergia2Layout = new javax.swing.GroupLayout(areaEnergia2);
        areaEnergia2.setLayout(areaEnergia2Layout);
        areaEnergia2Layout.setHorizontalGroup(
            areaEnergia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia2Layout.createSequentialGroup()
                        .addComponent(amorGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorGemeos)
                    .addGroup(areaEnergia2Layout.createSequentialGroup()
                        .addComponent(trabalhoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoGemeos)
                    .addGroup(areaEnergia2Layout.createSequentialGroup()
                        .addComponent(saudeGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeGemeos)
                    .addGroup(areaEnergia2Layout.createSequentialGroup()
                        .addComponent(sorteGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteGemeos)
                    .addComponent(tituloEnergiaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergia2Layout.setVerticalGroup(
            areaEnergia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorGemeos)
                .addGap(16, 16, 16)
                .addComponent(trabalhoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeGemeos)
                .addGap(15, 15, 15)
                .addComponent(sorteGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteGemeos)
                .addGap(51, 51, 51))
        );

        gemeos.add(areaEnergia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        areaMensagem2.setBackground(new java.awt.Color(255, 204, 204));

        tituloMensagemGemeos.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemGemeos.setForeground(new java.awt.Color(102, 0, 102));
        tituloMensagemGemeos.setText("Mensagem do dia");

        jTextArea6.setBackground(new java.awt.Color(255, 204, 204));
        jTextArea6.setColumns(20);
        jTextArea6.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea6.setRows(5);
        txMensagemGemeos.setViewportView(jTextArea6);

        btnCopiarMsgGemeos.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgGemeos.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgGemeos.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagem2Layout = new javax.swing.GroupLayout(areaMensagem2);
        areaMensagem2.setLayout(areaMensagem2Layout);
        areaMensagem2Layout.setHorizontalGroup(
            areaMensagem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagem2Layout.setVerticalGroup(
            areaMensagem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgGemeos)
                .addGap(20, 20, 20))
        );

        gemeos.add(areaMensagem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoGemeos.setIcon(new javax.swing.ImageIcon("C:\\Users\\JordanaLeite\\Documents\\PROJETO_APP_HOROSCOPO\\HOROSCOPO\\src\\main\\resources\\assets\\zodiaco.png")); // NOI18N
        gemeos.add(fundoGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1670, 940));

        areaAbas.addTab("Gêmeos", gemeos);

        cancer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaCaracteristicas3.setBackground(new java.awt.Color(255, 204, 204));

        tituloCaracteristicaCancer.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaCancer.setForeground(new java.awt.Color(102, 0, 102));
        tituloCaracteristicaCancer.setText("Características");

        pfortesCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesCancer.setForeground(new java.awt.Color(102, 0, 102));
        pfortesCancer.setText("Pontos Fortes:");

        pMelhorarCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarCancer.setForeground(new java.awt.Color(102, 0, 102));
        pMelhorarCancer.setText("Pontos a Melhorar:");

        txFortesCancer.setBackground(new java.awt.Color(255, 204, 204));
        txFortesCancer.setColumns(20);
        txFortesCancer.setForeground(new java.awt.Color(51, 51, 51));
        txFortesCancer.setRows(5);
        txFortesCancer.setText("Empatia, carinho, proteção e sensibilidade.");
        jScrollPane7.setViewportView(txFortesCancer);

        txMelhorarCancer.setBackground(new java.awt.Color(255, 204, 204));
        txMelhorarCancer.setColumns(20);
        txMelhorarCancer.setForeground(new java.awt.Color(51, 51, 51));
        txMelhorarCancer.setRows(5);
        txMelhorarCancer.setText("Insegurança, apego ao passado e excesso de preocupação.");
        jScrollPane8.setViewportView(txMelhorarCancer);

        javax.swing.GroupLayout areaCaracteristicas3Layout = new javax.swing.GroupLayout(areaCaracteristicas3);
        areaCaracteristicas3.setLayout(areaCaracteristicas3Layout);
        areaCaracteristicas3Layout.setHorizontalGroup(
            areaCaracteristicas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane7)
                    .addComponent(pMelhorarCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane8))
                .addGap(26, 26, 26))
        );
        areaCaracteristicas3Layout.setVerticalGroup(
            areaCaracteristicas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8)
                .addGap(27, 27, 27))
        );

        cancer.add(areaCaracteristicas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        areaInformacoes3.setBackground(new java.awt.Color(255, 204, 204));

        imgSignoCancer.setIcon(new javax.swing.ImageIcon("C:\\Users\\JordanaLeite\\Documents\\PROJETO_APP_HOROSCOPO\\HOROSCOPO\\src\\main\\resources\\assets\\cancer.png")); // NOI18N

        tituloCancer.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloCancer.setForeground(new java.awt.Color(102, 0, 102));
        tituloCancer.setText("Câncer");

        periodoCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoCancer.setForeground(new java.awt.Color(102, 0, 102));
        periodoCancer.setText("PERIODO:");

        elementoCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoCancer.setForeground(new java.awt.Color(102, 0, 102));
        elementoCancer.setText("ELEMENTO:");

        planetaCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaCancer.setForeground(new java.awt.Color(102, 0, 102));
        planetaCancer.setText("PLANETA REGENTE:");

        corCancer.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corCancer.setForeground(new java.awt.Color(102, 0, 102));
        corCancer.setText("COR:");

        numeroCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroCancer.setText("NÚMERO DA SORTE:");

        tfPeriodoCancer.setBackground(new java.awt.Color(255, 204, 204));
        tfPeriodoCancer.setForeground(new java.awt.Color(51, 51, 51));
        tfPeriodoCancer.setText("21 de junho a 22 de julho.");

        tfElementoCancer.setBackground(new java.awt.Color(255, 204, 204));
        tfElementoCancer.setForeground(new java.awt.Color(51, 51, 51));
        tfElementoCancer.setText("Água.");

        tfPlanetaCancer.setBackground(new java.awt.Color(255, 204, 204));
        tfPlanetaCancer.setForeground(new java.awt.Color(51, 51, 51));
        tfPlanetaCancer.setText("Lua.");

        tfCorCancer.setBackground(new java.awt.Color(255, 204, 204));
        tfCorCancer.setForeground(new java.awt.Color(51, 51, 51));
        tfCorCancer.setText("Prata.");

        javax.swing.GroupLayout areaInformacoes3Layout = new javax.swing.GroupLayout(areaInformacoes3);
        areaInformacoes3.setLayout(areaInformacoes3Layout);
        areaInformacoes3Layout.setHorizontalGroup(
            areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoes3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoes3Layout.createSequentialGroup()
                            .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaCancer)
                                .addComponent(tfNumeroCancer)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes3Layout.createSequentialGroup()
                            .addComponent(elementoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoCancer))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes3Layout.createSequentialGroup()
                            .addComponent(periodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoes3Layout.createSequentialGroup()
                            .addComponent(corCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorCancer))))
                .addGap(10, 10, 10))
        );
        areaInformacoes3Layout.setVerticalGroup(
            areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoCancer)
                    .addComponent(tfPeriodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoCancer)
                    .addComponent(tfElementoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaCancer)
                    .addComponent(tfPlanetaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corCancer)
                    .addComponent(tfCorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroCancer)
                    .addComponent(tfNumeroCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        cancer.add(areaInformacoes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        areaPrevisao3.setBackground(new java.awt.Color(255, 204, 204));

        previsaoCancer.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoCancer.setForeground(new java.awt.Color(102, 0, 102));
        previsaoCancer.setText("Previsão do Dia:");

        txtPrevisaoCancer.setBackground(new java.awt.Color(255, 204, 204));
        txtPrevisaoCancer.setColumns(20);
        txtPrevisaoCancer.setForeground(new java.awt.Color(51, 51, 51));
        txtPrevisaoCancer.setRows(5);
        txPrevisaoCancer.setViewportView(txtPrevisaoCancer);

        btnAtualizarPrevisaoCancer.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoCancer.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoCancer.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisao3Layout = new javax.swing.GroupLayout(areaPrevisao3);
        areaPrevisao3.setLayout(areaPrevisao3Layout);
        areaPrevisao3Layout.setHorizontalGroup(
            areaPrevisao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisao3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoCancer)
                    .addGroup(areaPrevisao3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisao3Layout.setVerticalGroup(
            areaPrevisao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        cancer.add(areaPrevisao3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        areaEnergia3.setBackground(new java.awt.Color(255, 204, 204));

        tituloEnergiaCancer.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaCancer.setForeground(new java.awt.Color(102, 0, 102));
        tituloEnergiaCancer.setText("Energia do Dia");

        trabalhoCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoCancer.setForeground(new java.awt.Color(102, 0, 102));
        trabalhoCancer.setText("Trabalho:");

        sorteCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteCancer.setForeground(new java.awt.Color(102, 0, 102));
        sorteCancer.setText("Sorte:");

        amorCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorCancer.setForeground(new java.awt.Color(102, 0, 102));
        amorCancer.setText("Amor:");

        saudeCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeCancer.setForeground(new java.awt.Color(102, 0, 102));
        saudeCancer.setText("Saúde:");

        tfAmorCancer.setBackground(new java.awt.Color(255, 204, 204));
        tfAmorCancer.setForeground(new java.awt.Color(51, 51, 51));
        tfAmorCancer.setText("93%");

        tfTrabalhoCancer.setBackground(new java.awt.Color(255, 204, 204));
        tfTrabalhoCancer.setForeground(new java.awt.Color(51, 51, 51));
        tfTrabalhoCancer.setText("77%");

        tfSaudeCancer.setBackground(new java.awt.Color(255, 204, 204));
        tfSaudeCancer.setForeground(new java.awt.Color(51, 51, 51));
        tfSaudeCancer.setText("82%");

        tfSorteCancer.setBackground(new java.awt.Color(255, 204, 204));
        tfSorteCancer.setForeground(new java.awt.Color(51, 51, 51));
        tfSorteCancer.setText("80%");

        javax.swing.GroupLayout areaEnergia3Layout = new javax.swing.GroupLayout(areaEnergia3);
        areaEnergia3.setLayout(areaEnergia3Layout);
        areaEnergia3Layout.setHorizontalGroup(
            areaEnergia3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergia3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia3Layout.createSequentialGroup()
                        .addComponent(amorCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorCancer)
                    .addGroup(areaEnergia3Layout.createSequentialGroup()
                        .addComponent(trabalhoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoCancer)
                    .addGroup(areaEnergia3Layout.createSequentialGroup()
                        .addComponent(saudeCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeCancer)
                    .addGroup(areaEnergia3Layout.createSequentialGroup()
                        .addComponent(sorteCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteCancer)
                    .addComponent(tituloEnergiaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergia3Layout.setVerticalGroup(
            areaEnergia3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorCancer)
                .addGap(16, 16, 16)
                .addComponent(trabalhoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeCancer)
                .addGap(15, 15, 15)
                .addComponent(sorteCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteCancer)
                .addGap(51, 51, 51))
        );

        cancer.add(areaEnergia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        areaMensagem3.setBackground(new java.awt.Color(255, 204, 204));

        tituloMensagemCancer.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemCancer.setForeground(new java.awt.Color(102, 0, 102));
        tituloMensagemCancer.setText("Mensagem do dia");

        jTextArea8.setBackground(new java.awt.Color(255, 204, 204));
        jTextArea8.setColumns(20);
        jTextArea8.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea8.setRows(5);
        txMensagemCancer.setViewportView(jTextArea8);

        btnCopiarMsgCancer.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgCancer.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgCancer.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagem3Layout = new javax.swing.GroupLayout(areaMensagem3);
        areaMensagem3.setLayout(areaMensagem3Layout);
        areaMensagem3Layout.setHorizontalGroup(
            areaMensagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagem3Layout.setVerticalGroup(
            areaMensagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgCancer)
                .addGap(20, 20, 20))
        );

        cancer.add(areaMensagem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoCancer.setIcon(new javax.swing.ImageIcon("C:\\Users\\JordanaLeite\\Documents\\PROJETO_APP_HOROSCOPO\\HOROSCOPO\\src\\main\\resources\\assets\\zodiaco.png")); // NOI18N
        cancer.add(fundoCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1670, 940));

        areaAbas.addTab("Câncer", cancer);

        leao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaCaracteristicas4.setBackground(new java.awt.Color(255, 204, 204));

        tituloCaracteristicaLeao.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaLeao.setForeground(new java.awt.Color(102, 0, 102));
        tituloCaracteristicaLeao.setText("Características");

        pfortesLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesLeao.setForeground(new java.awt.Color(102, 0, 102));
        pfortesLeao.setText("Pontos Fortes:");

        pMelhorarLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarLeao.setForeground(new java.awt.Color(102, 0, 102));
        pMelhorarLeao.setText("Pontos a Melhorar:");

        txFortesLeao.setEditable(false);
        txFortesLeao.setBackground(new java.awt.Color(255, 204, 204));
        txFortesLeao.setColumns(20);
        txFortesLeao.setForeground(new java.awt.Color(51, 51, 51));
        txFortesLeao.setRows(5);
        txFortesLeao.setText("Confiança, criatividade, generosidade e liderança.");
        jScrollPane9.setViewportView(txFortesLeao);

        txMelhorarLeao.setEditable(false);
        txMelhorarLeao.setBackground(new java.awt.Color(255, 204, 204));
        txMelhorarLeao.setColumns(20);
        txMelhorarLeao.setForeground(new java.awt.Color(51, 51, 51));
        txMelhorarLeao.setRows(5);
        txMelhorarLeao.setText("Orgulho, necessidade de reconhecimento e dificuldade em aceitar críticas.");
        jScrollPane10.setViewportView(txMelhorarLeao);

        javax.swing.GroupLayout areaCaracteristicas4Layout = new javax.swing.GroupLayout(areaCaracteristicas4);
        areaCaracteristicas4.setLayout(areaCaracteristicas4Layout);
        areaCaracteristicas4Layout.setHorizontalGroup(
            areaCaracteristicas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane9)
                    .addComponent(pMelhorarLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane10))
                .addGap(26, 26, 26))
        );
        areaCaracteristicas4Layout.setVerticalGroup(
            areaCaracteristicas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10)
                .addGap(27, 27, 27))
        );

        leao.add(areaCaracteristicas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        areaInformacoes4.setBackground(new java.awt.Color(255, 204, 204));

        imgSignoLeao.setIcon(new javax.swing.ImageIcon("C:\\Users\\JordanaLeite\\Documents\\PROJETO_APP_HOROSCOPO\\HOROSCOPO\\src\\main\\resources\\assets\\leao.png")); // NOI18N

        tituloLeao.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloLeao.setForeground(new java.awt.Color(102, 0, 102));
        tituloLeao.setText("Leão");

        periodoLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoLeao.setForeground(new java.awt.Color(102, 0, 102));
        periodoLeao.setText("PERIODO:");

        elementoLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoLeao.setForeground(new java.awt.Color(102, 0, 102));
        elementoLeao.setText("ELEMENTO:");

        planetaLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaLeao.setForeground(new java.awt.Color(102, 0, 102));
        planetaLeao.setText("PLANETA REGENTE:");

        corLeao.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corLeao.setForeground(new java.awt.Color(102, 0, 102));
        corLeao.setText("COR:");

        numeroLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroLeao.setText("NÚMERO DA SORTE:");

        tfPeriodoLeao.setBackground(null);
        tfPeriodoLeao.setForeground(new java.awt.Color(51, 51, 51));
        tfPeriodoLeao.setText("23 de julho a 22 de agosto.");

        tfElementoLeao.setBackground(null);
        tfElementoLeao.setForeground(new java.awt.Color(51, 51, 51));
        tfElementoLeao.setText("Fogo.");

        tfPlanetaLeao.setBackground(null);
        tfPlanetaLeao.setForeground(new java.awt.Color(51, 51, 51));
        tfPlanetaLeao.setText("Sol.");

        tfCorLeao.setBackground(null);
        tfCorLeao.setForeground(new java.awt.Color(51, 51, 51));
        tfCorLeao.setText("Dourado.");

        javax.swing.GroupLayout areaInformacoes4Layout = new javax.swing.GroupLayout(areaInformacoes4);
        areaInformacoes4.setLayout(areaInformacoes4Layout);
        areaInformacoes4Layout.setHorizontalGroup(
            areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoes4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoes4Layout.createSequentialGroup()
                            .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaLeao)
                                .addComponent(tfNumeroLeao)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes4Layout.createSequentialGroup()
                            .addComponent(elementoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoLeao))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes4Layout.createSequentialGroup()
                            .addComponent(periodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoes4Layout.createSequentialGroup()
                            .addComponent(corLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorLeao))))
                .addGap(10, 10, 10))
        );
        areaInformacoes4Layout.setVerticalGroup(
            areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoLeao)
                    .addComponent(tfPeriodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoLeao)
                    .addComponent(tfElementoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaLeao)
                    .addComponent(tfPlanetaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corLeao)
                    .addComponent(tfCorLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLeao)
                    .addComponent(tfNumeroLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        leao.add(areaInformacoes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        areaPrevisao4.setBackground(new java.awt.Color(255, 204, 204));

        previsaoLeao.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoLeao.setForeground(new java.awt.Color(102, 0, 102));
        previsaoLeao.setText("Previsão do Dia:");

        txtPrevisaoLeao.setEditable(false);
        txtPrevisaoLeao.setBackground(new java.awt.Color(255, 204, 204));
        txtPrevisaoLeao.setColumns(20);
        txtPrevisaoLeao.setForeground(new java.awt.Color(51, 51, 51));
        txtPrevisaoLeao.setRows(5);
        txPrevisaoAries4.setViewportView(txtPrevisaoLeao);

        btnAtualizarPrevisaoLeao.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoLeao.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoLeao.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisao4Layout = new javax.swing.GroupLayout(areaPrevisao4);
        areaPrevisao4.setLayout(areaPrevisao4Layout);
        areaPrevisao4Layout.setHorizontalGroup(
            areaPrevisao4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisao4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisao4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoAries4)
                    .addGroup(areaPrevisao4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisao4Layout.setVerticalGroup(
            areaPrevisao4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoAries4, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        leao.add(areaPrevisao4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        areaEnergia4.setBackground(new java.awt.Color(255, 204, 204));

        tituloEnergiaLeao.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaLeao.setForeground(new java.awt.Color(102, 0, 102));
        tituloEnergiaLeao.setText("Energia do Dia");

        trabalhoLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoLeao.setForeground(new java.awt.Color(102, 0, 102));
        trabalhoLeao.setText("Trabalho:");

        sorteLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteLeao.setForeground(new java.awt.Color(102, 0, 102));
        sorteLeao.setText("Sorte:");

        amorLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorLeao.setForeground(new java.awt.Color(102, 0, 102));
        amorLeao.setText("Amor:");

        saudeLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeLeao.setForeground(new java.awt.Color(102, 0, 102));
        saudeLeao.setText("Saúde:");

        tfAmorLeao.setBackground(null);
        tfAmorLeao.setForeground(new java.awt.Color(51, 51, 51));
        tfAmorLeao.setText("87%");

        tfTrabalhoLeao.setBackground(null);
        tfTrabalhoLeao.setForeground(new java.awt.Color(51, 51, 51));
        tfTrabalhoLeao.setText("94%");

        tfSaudeLeao.setBackground(null);
        tfSaudeLeao.setForeground(new java.awt.Color(51, 51, 51));
        tfSaudeLeao.setText("85%");

        tfSorteLeao.setBackground(null);
        tfSorteLeao.setForeground(new java.awt.Color(51, 51, 51));
        tfSorteLeao.setText("92%");

        javax.swing.GroupLayout areaEnergia4Layout = new javax.swing.GroupLayout(areaEnergia4);
        areaEnergia4.setLayout(areaEnergia4Layout);
        areaEnergia4Layout.setHorizontalGroup(
            areaEnergia4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergia4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia4Layout.createSequentialGroup()
                        .addComponent(amorLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorLeao)
                    .addGroup(areaEnergia4Layout.createSequentialGroup()
                        .addComponent(trabalhoLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoLeao)
                    .addGroup(areaEnergia4Layout.createSequentialGroup()
                        .addComponent(saudeLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeLeao)
                    .addGroup(areaEnergia4Layout.createSequentialGroup()
                        .addComponent(sorteLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteLeao)
                    .addComponent(tituloEnergiaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergia4Layout.setVerticalGroup(
            areaEnergia4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorLeao)
                .addGap(16, 16, 16)
                .addComponent(trabalhoLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeLeao)
                .addGap(15, 15, 15)
                .addComponent(sorteLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteLeao)
                .addGap(51, 51, 51))
        );

        leao.add(areaEnergia4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        areaMensagemLeao.setBackground(new java.awt.Color(255, 204, 204));

        tituloMensagemLeao.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemLeao.setForeground(new java.awt.Color(102, 0, 102));
        tituloMensagemLeao.setText("Mensagem do dia");

        txtMensagemLeao.setEditable(false);
        txtMensagemLeao.setBackground(new java.awt.Color(255, 204, 204));
        txtMensagemLeao.setColumns(20);
        txtMensagemLeao.setForeground(new java.awt.Color(51, 51, 51));
        txtMensagemLeao.setRows(5);
        txMensagemAries4.setViewportView(txtMensagemLeao);

        btnCopiarMsgLeao.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgLeao.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgLeao.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemLeaoLayout = new javax.swing.GroupLayout(areaMensagemLeao);
        areaMensagemLeao.setLayout(areaMensagemLeaoLayout);
        areaMensagemLeaoLayout.setHorizontalGroup(
            areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemAries4, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemLeaoLayout.setVerticalGroup(
            areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemAries4, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgLeao)
                .addGap(20, 20, 20))
        );

        leao.add(areaMensagemLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoLeao.setBackground(null);
        fundoLeao.setForeground(new java.awt.Color(102, 0, 102));
        fundoLeao.setIcon(new javax.swing.ImageIcon("C:\\Users\\JordanaLeite\\Documents\\PROJETO_APP_HOROSCOPO\\HOROSCOPO\\src\\main\\resources\\assets\\zodiaco.png")); // NOI18N
        leao.add(fundoLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1670, -1));

        areaAbas.addTab("Leão", leao);

        virgem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaCaracteristicas5.setBackground(new java.awt.Color(255, 204, 204));

        tituloCaracteristicaVirgem.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaVirgem.setForeground(new java.awt.Color(102, 0, 102));
        tituloCaracteristicaVirgem.setText("Características");

        pfortesVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesVirgem.setForeground(new java.awt.Color(102, 0, 102));
        pfortesVirgem.setText("Pontos Fortes:");

        pMelhorarVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarVirgem.setForeground(new java.awt.Color(102, 0, 102));
        pMelhorarVirgem.setText("Pontos a Melhorar:");

        txFortesVirgem.setBackground(new java.awt.Color(255, 204, 204));
        txFortesVirgem.setColumns(20);
        txFortesVirgem.setForeground(new java.awt.Color(51, 51, 51));
        txFortesVirgem.setRows(5);
        txFortesVirgem.setText("Organização, responsabilidade, inteligência e atenção aos detalhes.");
        jScrollPane11.setViewportView(txFortesVirgem);

        txMelhorarVirgem.setBackground(new java.awt.Color(255, 204, 204));
        txMelhorarVirgem.setColumns(20);
        txMelhorarVirgem.setForeground(new java.awt.Color(51, 51, 51));
        txMelhorarVirgem.setRows(5);
        txMelhorarVirgem.setText("Perfeccionismo, excesso de crítica e preocupação.");
        jScrollPane12.setViewportView(txMelhorarVirgem);

        javax.swing.GroupLayout areaCaracteristicas5Layout = new javax.swing.GroupLayout(areaCaracteristicas5);
        areaCaracteristicas5.setLayout(areaCaracteristicas5Layout);
        areaCaracteristicas5Layout.setHorizontalGroup(
            areaCaracteristicas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane11)
                    .addComponent(pMelhorarVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane12))
                .addGap(26, 26, 26))
        );
        areaCaracteristicas5Layout.setVerticalGroup(
            areaCaracteristicas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12)
                .addGap(27, 27, 27))
        );

        virgem.add(areaCaracteristicas5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        areaInformacoes5.setBackground(new java.awt.Color(255, 204, 204));

        imgSignoVirgem.setIcon(new javax.swing.ImageIcon("C:\\Users\\JordanaLeite\\Documents\\PROJETO_APP_HOROSCOPO\\HOROSCOPO\\src\\main\\resources\\assets\\virgem.png")); // NOI18N

        tituloVirgem.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloVirgem.setForeground(new java.awt.Color(102, 0, 102));
        tituloVirgem.setText("Virgem");

        periodoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoVirgem.setForeground(new java.awt.Color(102, 0, 102));
        periodoVirgem.setText("PERIODO:");

        elementoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoVirgem.setForeground(new java.awt.Color(102, 0, 102));
        elementoVirgem.setText("ELEMENTO:");

        planetaVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaVirgem.setForeground(new java.awt.Color(102, 0, 102));
        planetaVirgem.setText("PLANETA REGENTE:");

        corVirgem.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corVirgem.setForeground(new java.awt.Color(102, 0, 102));
        corVirgem.setText("COR:");

        numeroVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroVirgem.setText("NÚMERO DA SORTE:");

        tfPeriodoVirgem.setBackground(new java.awt.Color(255, 204, 204));
        tfPeriodoVirgem.setForeground(new java.awt.Color(51, 51, 51));
        tfPeriodoVirgem.setText("23 de agosto a 22 de setembro.");

        tfElementoVirgem.setBackground(new java.awt.Color(255, 204, 204));
        tfElementoVirgem.setForeground(new java.awt.Color(51, 51, 51));
        tfElementoVirgem.setText("Terra.");

        tfPlanetaVirgem.setBackground(new java.awt.Color(255, 204, 204));
        tfPlanetaVirgem.setForeground(new java.awt.Color(51, 51, 51));
        tfPlanetaVirgem.setText("Mercúrio.");

        tfCorVirgem.setBackground(new java.awt.Color(255, 204, 204));
        tfCorVirgem.setForeground(new java.awt.Color(51, 51, 51));
        tfCorVirgem.setText("Verde-oliva.");

        javax.swing.GroupLayout areaInformacoes5Layout = new javax.swing.GroupLayout(areaInformacoes5);
        areaInformacoes5.setLayout(areaInformacoes5Layout);
        areaInformacoes5Layout.setHorizontalGroup(
            areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoes5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoes5Layout.createSequentialGroup()
                            .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaVirgem)
                                .addComponent(tfNumeroVirgem)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes5Layout.createSequentialGroup()
                            .addComponent(elementoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoVirgem))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes5Layout.createSequentialGroup()
                            .addComponent(periodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoes5Layout.createSequentialGroup()
                            .addComponent(corVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorVirgem))))
                .addGap(10, 10, 10))
        );
        areaInformacoes5Layout.setVerticalGroup(
            areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoVirgem)
                    .addComponent(tfPeriodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoVirgem)
                    .addComponent(tfElementoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaVirgem)
                    .addComponent(tfPlanetaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corVirgem)
                    .addComponent(tfCorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroVirgem)
                    .addComponent(tfNumeroVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        virgem.add(areaInformacoes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        areaPrevisao5.setBackground(new java.awt.Color(255, 204, 204));

        previsaoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoVirgem.setForeground(new java.awt.Color(102, 0, 102));
        previsaoVirgem.setText("Previsão do Dia:");

        txtPrevisaoVirgem.setBackground(new java.awt.Color(255, 204, 204));
        txtPrevisaoVirgem.setColumns(20);
        txtPrevisaoVirgem.setForeground(new java.awt.Color(51, 51, 51));
        txtPrevisaoVirgem.setRows(5);
        txPrevisaoVirgem.setViewportView(txtPrevisaoVirgem);

        btnAtualizarPrevisaoVirgem.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoVirgem.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoVirgem.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisao5Layout = new javax.swing.GroupLayout(areaPrevisao5);
        areaPrevisao5.setLayout(areaPrevisao5Layout);
        areaPrevisao5Layout.setHorizontalGroup(
            areaPrevisao5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisao5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisao5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoVirgem)
                    .addGroup(areaPrevisao5Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisao5Layout.setVerticalGroup(
            areaPrevisao5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        virgem.add(areaPrevisao5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        areaEnergia5.setBackground(new java.awt.Color(255, 204, 204));

        tituloEnergiaVirgem.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaVirgem.setForeground(new java.awt.Color(102, 0, 102));
        tituloEnergiaVirgem.setText("Energia do Dia");

        trabalhoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoVirgem.setForeground(new java.awt.Color(102, 0, 102));
        trabalhoVirgem.setText("Trabalho:");

        sorteVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteVirgem.setForeground(new java.awt.Color(102, 0, 102));
        sorteVirgem.setText("Sorte:");

        amorVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorVirgem.setForeground(new java.awt.Color(102, 0, 102));
        amorVirgem.setText("Amor:");

        saudeVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeVirgem.setForeground(new java.awt.Color(102, 0, 102));
        saudeVirgem.setText("Saúde:");

        tfAmorVirgem.setBackground(new java.awt.Color(255, 204, 204));
        tfAmorVirgem.setForeground(new java.awt.Color(51, 51, 51));
        tfAmorVirgem.setText("75%");

        tfTrabalhoVirgem.setBackground(new java.awt.Color(255, 204, 204));
        tfTrabalhoVirgem.setForeground(new java.awt.Color(51, 51, 51));
        tfTrabalhoVirgem.setText("96%");

        tfSaudeVirgem.setBackground(new java.awt.Color(255, 204, 204));
        tfSaudeVirgem.setForeground(new java.awt.Color(51, 51, 51));
        tfSaudeVirgem.setText("88%");

        tfSorteVirgem.setBackground(new java.awt.Color(255, 204, 204));
        tfSorteVirgem.setForeground(new java.awt.Color(51, 51, 51));
        tfSorteVirgem.setText("81%");

        javax.swing.GroupLayout areaEnergia5Layout = new javax.swing.GroupLayout(areaEnergia5);
        areaEnergia5.setLayout(areaEnergia5Layout);
        areaEnergia5Layout.setHorizontalGroup(
            areaEnergia5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergia5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia5Layout.createSequentialGroup()
                        .addComponent(amorVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorVirgem)
                    .addGroup(areaEnergia5Layout.createSequentialGroup()
                        .addComponent(trabalhoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoVirgem)
                    .addGroup(areaEnergia5Layout.createSequentialGroup()
                        .addComponent(saudeVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeVirgem)
                    .addGroup(areaEnergia5Layout.createSequentialGroup()
                        .addComponent(sorteVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteVirgem)
                    .addComponent(tituloEnergiaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergia5Layout.setVerticalGroup(
            areaEnergia5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorVirgem)
                .addGap(16, 16, 16)
                .addComponent(trabalhoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeVirgem)
                .addGap(15, 15, 15)
                .addComponent(sorteVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteVirgem)
                .addGap(51, 51, 51))
        );

        virgem.add(areaEnergia5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        areaMensagem5.setBackground(new java.awt.Color(255, 204, 204));

        tituloMensagemVirgem.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemVirgem.setForeground(new java.awt.Color(102, 0, 102));
        tituloMensagemVirgem.setText("Mensagem do dia");

        txtMensagemVirgem.setBackground(new java.awt.Color(255, 204, 204));
        txtMensagemVirgem.setColumns(20);
        txtMensagemVirgem.setForeground(new java.awt.Color(51, 51, 51));
        txtMensagemVirgem.setRows(5);
        txMensagemVirgem.setViewportView(txtMensagemVirgem);

        btnCopiarMsgVirgem.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgVirgem.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgVirgem.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagem5Layout = new javax.swing.GroupLayout(areaMensagem5);
        areaMensagem5.setLayout(areaMensagem5Layout);
        areaMensagem5Layout.setHorizontalGroup(
            areaMensagem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagem5Layout.setVerticalGroup(
            areaMensagem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgVirgem)
                .addGap(20, 20, 20))
        );

        virgem.add(areaMensagem5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoVirgem.setBackground(new java.awt.Color(255, 204, 204));
        fundoVirgem.setIcon(new javax.swing.ImageIcon("C:\\Users\\JordanaLeite\\Documents\\PROJETO_APP_HOROSCOPO\\HOROSCOPO\\src\\main\\resources\\assets\\zodiaco.png")); // NOI18N
        virgem.add(fundoVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 940));

        areaAbas.addTab("Virgem", virgem);

        libra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaCaracteristicas6.setBackground(new java.awt.Color(255, 204, 204));

        tituloCaracteristicaLibra.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaLibra.setForeground(new java.awt.Color(102, 0, 102));
        tituloCaracteristicaLibra.setText("Características");

        pfortesLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesLibra.setForeground(new java.awt.Color(102, 0, 102));
        pfortesLibra.setText("Pontos Fortes:");

        pMelhorarLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarLibra.setForeground(new java.awt.Color(102, 0, 102));
        pMelhorarLibra.setText("Pontos a Melhorar:");

        txFortesLibra.setBackground(new java.awt.Color(255, 204, 204));
        txFortesLibra.setColumns(20);
        txFortesLibra.setForeground(new java.awt.Color(51, 51, 51));
        txFortesLibra.setRows(5);
        txFortesLibra.setText("Diplomacia, simpatia, equilíbrio e senso de justiça.");
        jScrollPane13.setViewportView(txFortesLibra);

        txMelhorarLibra.setBackground(new java.awt.Color(255, 204, 204));
        txMelhorarLibra.setColumns(20);
        txMelhorarLibra.setForeground(new java.awt.Color(51, 51, 51));
        txMelhorarLibra.setRows(5);
        txMelhorarLibra.setText("Omdecisão, dificuldade em dizer não e preocupação excessiva com a opinião dos outros.");
        jScrollPane14.setViewportView(txMelhorarLibra);

        javax.swing.GroupLayout areaCaracteristicas6Layout = new javax.swing.GroupLayout(areaCaracteristicas6);
        areaCaracteristicas6.setLayout(areaCaracteristicas6Layout);
        areaCaracteristicas6Layout.setHorizontalGroup(
            areaCaracteristicas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane13)
                    .addComponent(pMelhorarLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane14))
                .addGap(26, 26, 26))
        );
        areaCaracteristicas6Layout.setVerticalGroup(
            areaCaracteristicas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        libra.add(areaCaracteristicas6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        areaInformacoesLibra.setBackground(new java.awt.Color(255, 204, 204));

        imgSignoLibra.setBackground(new java.awt.Color(255, 204, 204));
        imgSignoLibra.setIcon(new javax.swing.ImageIcon("C:\\Users\\JordanaLeite\\Documents\\PROJETO_APP_HOROSCOPO\\HOROSCOPO\\src\\main\\resources\\assets\\libra.png")); // NOI18N

        tituloLibra.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloLibra.setForeground(new java.awt.Color(102, 0, 102));
        tituloLibra.setText("Libra");

        periodoLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoLibra.setForeground(new java.awt.Color(102, 0, 102));
        periodoLibra.setText("PERIODO:");

        elementoLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoLibra.setForeground(new java.awt.Color(102, 0, 102));
        elementoLibra.setText("ELEMENTO:");

        planetaLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaLibra.setForeground(new java.awt.Color(102, 0, 102));
        planetaLibra.setText("PLANETA REGENTE:");

        corLibra.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corLibra.setForeground(new java.awt.Color(102, 0, 102));
        corLibra.setText("COR:");

        numeroLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroLibra.setText("NÚMERO DA SORTE:");

        tfPeriodoLibra.setBackground(new java.awt.Color(255, 204, 204));
        tfPeriodoLibra.setForeground(new java.awt.Color(51, 51, 51));
        tfPeriodoLibra.setText("23 de setembro a 22 de outubro.");

        tfElementoLibra.setBackground(new java.awt.Color(255, 204, 204));
        tfElementoLibra.setForeground(new java.awt.Color(51, 51, 51));
        tfElementoLibra.setText("Ar.");

        tfPlanetaLibra.setBackground(new java.awt.Color(255, 204, 204));
        tfPlanetaLibra.setForeground(new java.awt.Color(51, 51, 51));
        tfPlanetaLibra.setText("Vênus.");

        tfCorLibra.setBackground(new java.awt.Color(255, 204, 204));
        tfCorLibra.setForeground(new java.awt.Color(51, 51, 51));
        tfCorLibra.setText("Rosa.");

        javax.swing.GroupLayout areaInformacoesLibraLayout = new javax.swing.GroupLayout(areaInformacoesLibra);
        areaInformacoesLibra.setLayout(areaInformacoesLibraLayout);
        areaInformacoesLibraLayout.setHorizontalGroup(
            areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                            .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaLibra)
                                .addComponent(tfNumeroLibra)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLibraLayout.createSequentialGroup()
                            .addComponent(elementoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoLibra))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLibraLayout.createSequentialGroup()
                            .addComponent(periodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                            .addComponent(corLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorLibra))))
                .addGap(10, 10, 10))
        );
        areaInformacoesLibraLayout.setVerticalGroup(
            areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoLibra)
                    .addComponent(tfPeriodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoLibra)
                    .addComponent(tfElementoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaLibra)
                    .addComponent(tfPlanetaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corLibra)
                    .addComponent(tfCorLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLibra)
                    .addComponent(tfNumeroLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        libra.add(areaInformacoesLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        areaPrevisaoLibra.setBackground(new java.awt.Color(255, 204, 204));

        previsaoLibra.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoLibra.setForeground(new java.awt.Color(102, 0, 102));
        previsaoLibra.setText("Previsão do Dia:");

        txPrevisaoLibra.setBackground(new java.awt.Color(255, 204, 204));

        txtPrevisaoLibra.setBackground(new java.awt.Color(255, 204, 204));
        txtPrevisaoLibra.setColumns(20);
        txtPrevisaoLibra.setForeground(new java.awt.Color(51, 51, 51));
        txtPrevisaoLibra.setRows(5);
        txPrevisaoLibra.setViewportView(txtPrevisaoLibra);

        btnAtualizarPrevisaoLibra.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoLibra.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoLibra.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoLibraLayout = new javax.swing.GroupLayout(areaPrevisaoLibra);
        areaPrevisaoLibra.setLayout(areaPrevisaoLibraLayout);
        areaPrevisaoLibraLayout.setHorizontalGroup(
            areaPrevisaoLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoLibraLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoLibra)
                    .addGroup(areaPrevisaoLibraLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisaoLibraLayout.setVerticalGroup(
            areaPrevisaoLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        libra.add(areaPrevisaoLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        areaEnergiaLibra.setBackground(new java.awt.Color(255, 204, 204));

        tituloEnergiaLibra.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaLibra.setForeground(new java.awt.Color(102, 0, 102));
        tituloEnergiaLibra.setText("Energia do Dia");

        trabalhoLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoLibra.setForeground(new java.awt.Color(102, 0, 102));
        trabalhoLibra.setText("Trabalho:");

        sorteLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteLibra.setForeground(new java.awt.Color(102, 0, 102));
        sorteLibra.setText("Sorte:");

        amorLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorLibra.setForeground(new java.awt.Color(102, 0, 102));
        amorLibra.setText("Amor:");

        saudeLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeLibra.setForeground(new java.awt.Color(102, 0, 102));
        saudeLibra.setText("Saúde:");

        tfAmorLibra.setBackground(new java.awt.Color(255, 204, 204));
        tfAmorLibra.setForeground(new java.awt.Color(51, 51, 51));
        tfAmorLibra.setText("95%");

        tfTrabalhoLibra.setBackground(new java.awt.Color(255, 204, 204));
        tfTrabalhoLibra.setForeground(new java.awt.Color(51, 51, 51));
        tfTrabalhoLibra.setText("83%");

        tfSaudeLibra.setBackground(new java.awt.Color(255, 204, 204));
        tfSaudeLibra.setForeground(new java.awt.Color(51, 51, 51));
        tfSaudeLibra.setText("79%");

        tfSorteLibra.setBackground(new java.awt.Color(255, 204, 204));
        tfSorteLibra.setForeground(new java.awt.Color(51, 51, 51));
        tfSorteLibra.setText("90%");

        javax.swing.GroupLayout areaEnergiaLibraLayout = new javax.swing.GroupLayout(areaEnergiaLibra);
        areaEnergiaLibra.setLayout(areaEnergiaLibraLayout);
        areaEnergiaLibraLayout.setHorizontalGroup(
            areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                        .addComponent(amorLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorLibra)
                    .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                        .addComponent(trabalhoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoLibra)
                    .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                        .addComponent(saudeLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeLibra)
                    .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                        .addComponent(sorteLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteLibra)
                    .addComponent(tituloEnergiaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergiaLibraLayout.setVerticalGroup(
            areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorLibra)
                .addGap(16, 16, 16)
                .addComponent(trabalhoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeLibra)
                .addGap(15, 15, 15)
                .addComponent(sorteLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteLibra)
                .addGap(51, 51, 51))
        );

        libra.add(areaEnergiaLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        areaMensagemLibra.setBackground(new java.awt.Color(255, 204, 204));

        tituloMensagemLibra.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemLibra.setForeground(new java.awt.Color(102, 0, 102));
        tituloMensagemLibra.setText("Mensagem do dia");

        txtMensagemLibra.setBackground(new java.awt.Color(255, 204, 204));
        txtMensagemLibra.setColumns(20);
        txtMensagemLibra.setForeground(new java.awt.Color(51, 51, 51));
        txtMensagemLibra.setRows(5);
        txMensagemLibra.setViewportView(txtMensagemLibra);

        btnCopiarMsgLibra.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgLibra.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgLibra.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemLibraLayout = new javax.swing.GroupLayout(areaMensagemLibra);
        areaMensagemLibra.setLayout(areaMensagemLibraLayout);
        areaMensagemLibraLayout.setHorizontalGroup(
            areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemLibraLayout.setVerticalGroup(
            areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgLibra)
                .addGap(20, 20, 20))
        );

        libra.add(areaMensagemLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoLibra.setBackground(new java.awt.Color(255, 204, 204));
        fundoLibra.setIcon(new javax.swing.ImageIcon("C:\\Users\\JordanaLeite\\Documents\\PROJETO_APP_HOROSCOPO\\HOROSCOPO\\src\\main\\resources\\assets\\zodiaco.png")); // NOI18N
        libra.add(fundoLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Libra", libra);

        escorpiao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaCaracteristicasEscorpiao.setBackground(new java.awt.Color(255, 204, 204));

        tituloCaracteristicaEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaEscorpiao.setForeground(new java.awt.Color(102, 0, 102));
        tituloCaracteristicaEscorpiao.setText("Características");

        pfortesEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesEscorpiao.setForeground(new java.awt.Color(102, 0, 102));
        pfortesEscorpiao.setText("Pontos Fortes:");

        pMelhorarEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarEscorpiao.setForeground(new java.awt.Color(102, 0, 102));
        pMelhorarEscorpiao.setText("Pontos a Melhorar:");

        txFortesEscorpiao.setBackground(new java.awt.Color(255, 204, 204));
        txFortesEscorpiao.setColumns(20);
        txFortesEscorpiao.setForeground(new java.awt.Color(51, 51, 51));
        txFortesEscorpiao.setRows(5);
        txFortesEscorpiao.setText("Determinação, coragem, lealdade e capacidade de transformação.");
        jScrollPane15.setViewportView(txFortesEscorpiao);

        jScrollPane16.setForeground(new java.awt.Color(51, 51, 51));

        txMelhorarEscorpiao.setBackground(new java.awt.Color(255, 204, 204));
        txMelhorarEscorpiao.setColumns(20);
        txMelhorarEscorpiao.setForeground(new java.awt.Color(51, 51, 51));
        txMelhorarEscorpiao.setRows(5);
        txMelhorarEscorpiao.setText("Cúmes, desconfiançã, intensidade excessiva e dificuldade de perdoar.");
        jScrollPane16.setViewportView(txMelhorarEscorpiao);

        javax.swing.GroupLayout areaCaracteristicasEscorpiaoLayout = new javax.swing.GroupLayout(areaCaracteristicasEscorpiao);
        areaCaracteristicasEscorpiao.setLayout(areaCaracteristicasEscorpiaoLayout);
        areaCaracteristicasEscorpiaoLayout.setHorizontalGroup(
            areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane15)
                    .addComponent(pMelhorarEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane16))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasEscorpiaoLayout.setVerticalGroup(
            areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane16)
                .addGap(27, 27, 27))
        );

        escorpiao.add(areaCaracteristicasEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        areaInformacoesEscorpiao.setBackground(new java.awt.Color(255, 204, 204));

        imgSignoEscorpiao.setIcon(new javax.swing.ImageIcon("C:\\Users\\JordanaLeite\\Documents\\PROJETO_APP_HOROSCOPO\\HOROSCOPO\\src\\main\\resources\\assets\\escorpiao.png")); // NOI18N

        tituloEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEscorpiao.setForeground(new java.awt.Color(102, 0, 102));
        tituloEscorpiao.setText("Escorpião");

        periodoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoEscorpiao.setForeground(new java.awt.Color(102, 0, 102));
        periodoEscorpiao.setText("PERIODO:");

        elementoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoEscorpiao.setForeground(new java.awt.Color(102, 0, 102));
        elementoEscorpiao.setText("ELEMENTO:");

        planetaEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaEscorpiao.setForeground(new java.awt.Color(102, 0, 102));
        planetaEscorpiao.setText("PLANETA REGENTE:");

        corEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corEscorpiao.setForeground(new java.awt.Color(102, 0, 102));
        corEscorpiao.setText("COR:");

        numeroEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroEscorpiao.setText("NÚMERO DA SORTE:");

        tfPeriodoEscorpiao.setBackground(new java.awt.Color(255, 204, 204));
        tfPeriodoEscorpiao.setForeground(new java.awt.Color(51, 51, 51));
        tfPeriodoEscorpiao.setText("23 de outubro a 21 de novembro.");

        tfElementoEscorpiao.setBackground(new java.awt.Color(255, 204, 204));
        tfElementoEscorpiao.setForeground(new java.awt.Color(51, 51, 51));
        tfElementoEscorpiao.setText("Água.");
        tfElementoEscorpiao.addActionListener(this::tfElementoEscorpiaoActionPerformed);

        tfPlanetaEscorpiao.setBackground(new java.awt.Color(255, 204, 204));
        tfPlanetaEscorpiao.setForeground(new java.awt.Color(51, 51, 51));
        tfPlanetaEscorpiao.setText("Marte e Plutão.");

        tfCorEscorpiao.setBackground(new java.awt.Color(255, 204, 204));
        tfCorEscorpiao.setForeground(new java.awt.Color(51, 51, 51));
        tfCorEscorpiao.setText("Vinho.");

        javax.swing.GroupLayout areaInformacoesEscorpiaoLayout = new javax.swing.GroupLayout(areaInformacoesEscorpiao);
        areaInformacoesEscorpiao.setLayout(areaInformacoesEscorpiaoLayout);
        areaInformacoesEscorpiaoLayout.setHorizontalGroup(
            areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                            .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaEscorpiao)
                                .addComponent(tfNumeroEscorpiao)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesEscorpiaoLayout.createSequentialGroup()
                            .addComponent(elementoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoEscorpiao))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesEscorpiaoLayout.createSequentialGroup()
                            .addComponent(periodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                            .addComponent(corEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorEscorpiao))))
                .addGap(10, 10, 10))
        );
        areaInformacoesEscorpiaoLayout.setVerticalGroup(
            areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoEscorpiao)
                    .addComponent(tfPeriodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoEscorpiao)
                    .addComponent(tfElementoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaEscorpiao)
                    .addComponent(tfPlanetaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corEscorpiao)
                    .addComponent(tfCorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroEscorpiao)
                    .addComponent(tfNumeroEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        escorpiao.add(areaInformacoesEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        areaPrevisaoEscorpiao.setBackground(new java.awt.Color(255, 204, 204));

        previsaoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoEscorpiao.setForeground(new java.awt.Color(102, 0, 102));
        previsaoEscorpiao.setText("Previsão do Dia:");

        txtPrevisaoEscorpiao.setBackground(new java.awt.Color(255, 204, 204));
        txtPrevisaoEscorpiao.setColumns(20);
        txtPrevisaoEscorpiao.setForeground(new java.awt.Color(51, 51, 51));
        txtPrevisaoEscorpiao.setRows(5);
        txPrevisaoEscorpiao.setViewportView(txtPrevisaoEscorpiao);

        btnAtualizarPrevisaoEscorpiao.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoEscorpiao.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoEscorpiaoLayout = new javax.swing.GroupLayout(areaPrevisaoEscorpiao);
        areaPrevisaoEscorpiao.setLayout(areaPrevisaoEscorpiaoLayout);
        areaPrevisaoEscorpiaoLayout.setHorizontalGroup(
            areaPrevisaoEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoEscorpiao)
                    .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisaoEscorpiaoLayout.setVerticalGroup(
            areaPrevisaoEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        escorpiao.add(areaPrevisaoEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        areaEnergiaEscorpiao.setBackground(new java.awt.Color(255, 204, 204));

        tituloEnergiaEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaEscorpiao.setForeground(new java.awt.Color(102, 0, 102));
        tituloEnergiaEscorpiao.setText("Energia do Dia");

        trabalhoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoEscorpiao.setForeground(new java.awt.Color(102, 0, 102));
        trabalhoEscorpiao.setText("Trabalho:");

        sorteEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteEscorpiao.setForeground(new java.awt.Color(102, 0, 102));
        sorteEscorpiao.setText("Sorte:");

        amorEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorEscorpiao.setForeground(new java.awt.Color(102, 0, 102));
        amorEscorpiao.setText("Amor:");

        saudeEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeEscorpiao.setForeground(new java.awt.Color(102, 0, 102));
        saudeEscorpiao.setText("Saúde:");

        tfAmorEscorpiao.setBackground(new java.awt.Color(255, 204, 204));
        tfAmorEscorpiao.setForeground(new java.awt.Color(51, 51, 51));
        tfAmorEscorpiao.setText("91%");

        tfTrabalhoEscorpiao.setBackground(new java.awt.Color(255, 204, 204));
        tfTrabalhoEscorpiao.setForeground(new java.awt.Color(51, 51, 51));
        tfTrabalhoEscorpiao.setText("89%");

        tfSaudeEscorpiao.setBackground(new java.awt.Color(255, 204, 204));
        tfSaudeEscorpiao.setForeground(new java.awt.Color(51, 51, 51));
        tfSaudeEscorpiao.setText("78%");

        tfSorteEscorpiao.setBackground(new java.awt.Color(255, 204, 204));
        tfSorteEscorpiao.setForeground(new java.awt.Color(51, 51, 51));
        tfSorteEscorpiao.setText("86%");

        javax.swing.GroupLayout areaEnergiaEscorpiaoLayout = new javax.swing.GroupLayout(areaEnergiaEscorpiao);
        areaEnergiaEscorpiao.setLayout(areaEnergiaEscorpiaoLayout);
        areaEnergiaEscorpiaoLayout.setHorizontalGroup(
            areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                        .addComponent(amorEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorEscorpiao)
                    .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                        .addComponent(trabalhoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoEscorpiao)
                    .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                        .addComponent(saudeEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeEscorpiao)
                    .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                        .addComponent(sorteEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteEscorpiao)
                    .addComponent(tituloEnergiaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergiaEscorpiaoLayout.setVerticalGroup(
            areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorEscorpiao)
                .addGap(16, 16, 16)
                .addComponent(trabalhoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeEscorpiao)
                .addGap(15, 15, 15)
                .addComponent(sorteEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteEscorpiao)
                .addGap(51, 51, 51))
        );

        escorpiao.add(areaEnergiaEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        areaMensagemEscorpiao.setBackground(new java.awt.Color(255, 204, 204));

        tituloMensagemEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemEscorpiao.setForeground(new java.awt.Color(102, 0, 102));
        tituloMensagemEscorpiao.setText("Mensagem do dia");

        txtMensagemEscorpiao.setBackground(new java.awt.Color(255, 204, 204));
        txtMensagemEscorpiao.setColumns(20);
        txtMensagemEscorpiao.setForeground(new java.awt.Color(51, 51, 51));
        txtMensagemEscorpiao.setRows(5);
        txMensagemEscorpiao.setViewportView(txtMensagemEscorpiao);

        btnCopiarMsgEscorpiao.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgEscorpiao.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemEscorpiaoLayout = new javax.swing.GroupLayout(areaMensagemEscorpiao);
        areaMensagemEscorpiao.setLayout(areaMensagemEscorpiaoLayout);
        areaMensagemEscorpiaoLayout.setHorizontalGroup(
            areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemEscorpiaoLayout.setVerticalGroup(
            areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgEscorpiao)
                .addGap(20, 20, 20))
        );

        escorpiao.add(areaMensagemEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoEscorpiao.setIcon(new javax.swing.ImageIcon("C:\\Users\\JordanaLeite\\Documents\\PROJETO_APP_HOROSCOPO\\HOROSCOPO\\src\\main\\resources\\assets\\zodiaco.png")); // NOI18N
        escorpiao.add(fundoEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1670, 940));

        areaAbas.addTab("Escorpião", escorpiao);

        sagitario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaCaracteristicasSagitario.setBackground(new java.awt.Color(255, 204, 204));

        tituloCaracteristicaSagitario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaSagitario.setForeground(new java.awt.Color(102, 0, 102));
        tituloCaracteristicaSagitario.setText("Características");

        pfortesSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesSagitario.setForeground(new java.awt.Color(102, 0, 102));
        pfortesSagitario.setText("Pontos Fortes:");

        pMelhorarSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarSagitario.setForeground(new java.awt.Color(102, 0, 102));
        pMelhorarSagitario.setText("Pontos a Melhorar:");

        txFortesSagitario.setBackground(new java.awt.Color(255, 204, 204));
        txFortesSagitario.setColumns(20);
        txFortesSagitario.setForeground(new java.awt.Color(51, 51, 51));
        txFortesSagitario.setRows(5);
        txFortesSagitario.setText("Otimismo, coragem, sinceridade e espírito aventureiro.");
        jScrollPane17.setViewportView(txFortesSagitario);

        txMelhorarSagitario.setBackground(new java.awt.Color(255, 204, 204));
        txMelhorarSagitario.setColumns(20);
        txMelhorarSagitario.setForeground(new java.awt.Color(51, 51, 51));
        txMelhorarSagitario.setRows(5);
        txMelhorarSagitario.setText("Impulsividade, falta de paciência e sinceridade excessiva.");
        jScrollPane18.setViewportView(txMelhorarSagitario);

        javax.swing.GroupLayout areaCaracteristicasSagitarioLayout = new javax.swing.GroupLayout(areaCaracteristicasSagitario);
        areaCaracteristicasSagitario.setLayout(areaCaracteristicasSagitarioLayout);
        areaCaracteristicasSagitarioLayout.setHorizontalGroup(
            areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasSagitarioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane17)
                    .addComponent(pMelhorarSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane18))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasSagitarioLayout.setVerticalGroup(
            areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane18)
                .addGap(27, 27, 27))
        );

        sagitario.add(areaCaracteristicasSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        areaInformacoesSagitario.setBackground(new java.awt.Color(255, 204, 204));

        imgSignoSagitario.setBackground(new java.awt.Color(255, 204, 204));
        imgSignoSagitario.setIcon(new javax.swing.ImageIcon("C:\\Users\\JordanaLeite\\Documents\\PROJETO_APP_HOROSCOPO\\HOROSCOPO\\src\\main\\resources\\assets\\sagitario.png")); // NOI18N

        tituloAriesSagitario.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloAriesSagitario.setForeground(new java.awt.Color(102, 0, 102));
        tituloAriesSagitario.setText("Sagiatário");

        periodoAriesSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoAriesSagitario.setForeground(new java.awt.Color(102, 0, 102));
        periodoAriesSagitario.setText("PERIODO:");

        elementoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoSagitario.setForeground(new java.awt.Color(102, 0, 102));
        elementoSagitario.setText("ELEMENTO:");

        planetaSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaSagitario.setForeground(new java.awt.Color(102, 0, 102));
        planetaSagitario.setText("PLANETA REGENTE:");

        corSagitario.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corSagitario.setForeground(new java.awt.Color(102, 0, 102));
        corSagitario.setText("COR:");

        numeroSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroSagitario.setText("NÚMERO DA SORTE:");

        tfPeriodoSagitario.setBackground(new java.awt.Color(255, 204, 204));
        tfPeriodoSagitario.setForeground(new java.awt.Color(51, 51, 51));
        tfPeriodoSagitario.setText("22 de novembro a 21 de dezembro.");

        tfElementoSagitario.setBackground(new java.awt.Color(255, 204, 204));
        tfElementoSagitario.setForeground(new java.awt.Color(51, 51, 51));
        tfElementoSagitario.setText("Fogo.");

        tfPlanetaSagitario.setBackground(new java.awt.Color(255, 204, 204));
        tfPlanetaSagitario.setForeground(new java.awt.Color(51, 51, 51));
        tfPlanetaSagitario.setText("Júpiter.");

        tfCorSagitario.setBackground(new java.awt.Color(255, 204, 204));
        tfCorSagitario.setForeground(new java.awt.Color(51, 51, 51));
        tfCorSagitario.setText("Roxo.");

        javax.swing.GroupLayout areaInformacoesSagitarioLayout = new javax.swing.GroupLayout(areaInformacoesSagitario);
        areaInformacoesSagitario.setLayout(areaInformacoesSagitarioLayout);
        areaInformacoesSagitarioLayout.setHorizontalGroup(
            areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloAriesSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                            .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaSagitario)
                                .addComponent(tfNumeroSagitario)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesSagitarioLayout.createSequentialGroup()
                            .addComponent(elementoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoSagitario))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesSagitarioLayout.createSequentialGroup()
                            .addComponent(periodoAriesSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                            .addComponent(corSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorSagitario))))
                .addGap(10, 10, 10))
        );
        areaInformacoesSagitarioLayout.setVerticalGroup(
            areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloAriesSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoAriesSagitario)
                    .addComponent(tfPeriodoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoSagitario)
                    .addComponent(tfElementoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaSagitario)
                    .addComponent(tfPlanetaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corSagitario)
                    .addComponent(tfCorSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroSagitario)
                    .addComponent(tfNumeroSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        sagitario.add(areaInformacoesSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        areaPrevisaoSagitario.setBackground(new java.awt.Color(255, 204, 204));

        previsaoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoSagitario.setForeground(new java.awt.Color(102, 0, 102));
        previsaoSagitario.setText("Previsão do Dia:");

        txtPrevisaoSagitario.setBackground(new java.awt.Color(255, 204, 204));
        txtPrevisaoSagitario.setColumns(20);
        txtPrevisaoSagitario.setForeground(new java.awt.Color(51, 51, 51));
        txtPrevisaoSagitario.setRows(5);
        txPrevisaoAries8.setViewportView(txtPrevisaoSagitario);

        btnAtualizarPrevisaoSagitario.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoSagitario.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoSagitario.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoSagitarioLayout = new javax.swing.GroupLayout(areaPrevisaoSagitario);
        areaPrevisaoSagitario.setLayout(areaPrevisaoSagitarioLayout);
        areaPrevisaoSagitarioLayout.setHorizontalGroup(
            areaPrevisaoSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoSagitarioLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoAries8)
                    .addGroup(areaPrevisaoSagitarioLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisaoSagitarioLayout.setVerticalGroup(
            areaPrevisaoSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoAries8, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        sagitario.add(areaPrevisaoSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        areaEnergiaSagitario.setBackground(new java.awt.Color(255, 204, 204));

        tituloEnergiaSagitario.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaSagitario.setForeground(new java.awt.Color(102, 0, 102));
        tituloEnergiaSagitario.setText("Energia do Dia");

        trabalhoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoSagitario.setForeground(new java.awt.Color(102, 0, 102));
        trabalhoSagitario.setText("Trabalho:");

        sorteSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteSagitario.setForeground(new java.awt.Color(102, 0, 102));
        sorteSagitario.setText("Sorte:");

        amorSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorSagitario.setForeground(new java.awt.Color(102, 0, 102));
        amorSagitario.setText("Amor:");

        saudeSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeSagitario.setForeground(new java.awt.Color(102, 0, 102));
        saudeSagitario.setText("Saúde:");

        tfAmorSagitario.setBackground(new java.awt.Color(255, 204, 204));
        tfAmorSagitario.setForeground(new java.awt.Color(51, 51, 51));
        tfAmorSagitario.setText("84%");

        tfTrabalhoSagitario.setBackground(new java.awt.Color(255, 204, 204));
        tfTrabalhoSagitario.setForeground(new java.awt.Color(51, 51, 51));
        tfTrabalhoSagitario.setText("86%");

        tfSaudeSagitario.setBackground(new java.awt.Color(255, 204, 204));
        tfSaudeSagitario.setForeground(new java.awt.Color(51, 51, 51));
        tfSaudeSagitario.setText("90%");

        tfSorteSagitario.setBackground(new java.awt.Color(255, 204, 204));
        tfSorteSagitario.setForeground(new java.awt.Color(51, 51, 51));
        tfSorteSagitario.setText("95%");

        javax.swing.GroupLayout areaEnergiaSagitarioLayout = new javax.swing.GroupLayout(areaEnergiaSagitario);
        areaEnergiaSagitario.setLayout(areaEnergiaSagitarioLayout);
        areaEnergiaSagitarioLayout.setHorizontalGroup(
            areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                        .addComponent(amorSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorSagitario)
                    .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                        .addComponent(trabalhoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoSagitario)
                    .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                        .addComponent(saudeSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeSagitario)
                    .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                        .addComponent(sorteSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteSagitario)
                    .addComponent(tituloEnergiaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergiaSagitarioLayout.setVerticalGroup(
            areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorSagitario)
                .addGap(16, 16, 16)
                .addComponent(trabalhoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeSagitario)
                .addGap(15, 15, 15)
                .addComponent(sorteSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteSagitario)
                .addGap(51, 51, 51))
        );

        sagitario.add(areaEnergiaSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        areaMensagemSagitario.setBackground(new java.awt.Color(255, 204, 204));

        tituloMensagemSagitario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemSagitario.setForeground(new java.awt.Color(102, 0, 102));
        tituloMensagemSagitario.setText("Mensagem do dia");

        txtMensagemSagitario.setBackground(new java.awt.Color(255, 204, 204));
        txtMensagemSagitario.setColumns(20);
        txtMensagemSagitario.setForeground(new java.awt.Color(51, 51, 51));
        txtMensagemSagitario.setRows(5);
        txMensagemAries8.setViewportView(txtMensagemSagitario);

        btnCopiarMsgSagitario.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgSagitario.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgSagitario.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemSagitarioLayout = new javax.swing.GroupLayout(areaMensagemSagitario);
        areaMensagemSagitario.setLayout(areaMensagemSagitarioLayout);
        areaMensagemSagitarioLayout.setHorizontalGroup(
            areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemAries8, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemSagitarioLayout.setVerticalGroup(
            areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemAries8, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgSagitario)
                .addGap(20, 20, 20))
        );

        sagitario.add(areaMensagemSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoSagitario.setForeground(new java.awt.Color(102, 0, 102));
        fundoSagitario.setIcon(new javax.swing.ImageIcon("C:\\Users\\JordanaLeite\\Documents\\PROJETO_APP_HOROSCOPO\\HOROSCOPO\\src\\main\\resources\\assets\\zodiaco.png")); // NOI18N
        sagitario.add(fundoSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1670, 940));

        areaAbas.addTab("Sagitário", sagitario);

        capricornio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaCaracteristicasCapricornio.setBackground(new java.awt.Color(255, 204, 204));

        tituloCaracteristicaCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaCapricornio.setForeground(new java.awt.Color(102, 0, 102));
        tituloCaracteristicaCapricornio.setText("Características");

        pfortesCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesCapricornio.setForeground(new java.awt.Color(102, 0, 102));
        pfortesCapricornio.setText("Pontos Fortes:");

        pMelhorarCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarCapricornio.setForeground(new java.awt.Color(102, 0, 102));
        pMelhorarCapricornio.setText("Pontos a Melhorar:");

        txFortesCapricornio.setBackground(new java.awt.Color(255, 204, 204));
        txFortesCapricornio.setColumns(20);
        txFortesCapricornio.setForeground(new java.awt.Color(51, 51, 51));
        txFortesCapricornio.setRows(5);
        txFortesCapricornio.setText("Disciplina, responsabilidade, persistência e organização.");
        jScrollPane19.setViewportView(txFortesCapricornio);

        txMelhorarCapricornio.setBackground(new java.awt.Color(255, 204, 204));
        txMelhorarCapricornio.setColumns(20);
        txMelhorarCapricornio.setForeground(new java.awt.Color(51, 51, 51));
        txMelhorarCapricornio.setRows(5);
        txMelhorarCapricornio.setText("Rigidez, pessimismo e excesso de cobrança.");
        jScrollPane20.setViewportView(txMelhorarCapricornio);

        javax.swing.GroupLayout areaCaracteristicasCapricornioLayout = new javax.swing.GroupLayout(areaCaracteristicasCapricornio);
        areaCaracteristicasCapricornio.setLayout(areaCaracteristicasCapricornioLayout);
        areaCaracteristicasCapricornioLayout.setHorizontalGroup(
            areaCaracteristicasCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCapricornioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane19)
                    .addComponent(pMelhorarCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane20))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasCapricornioLayout.setVerticalGroup(
            areaCaracteristicasCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane20)
                .addGap(27, 27, 27))
        );

        capricornio.add(areaCaracteristicasCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        areaInformacoesCapricornio.setBackground(new java.awt.Color(255, 204, 204));

        imgSignoCapricornio.setIcon(new javax.swing.ImageIcon("C:\\Users\\JordanaLeite\\Documents\\PROJETO_APP_HOROSCOPO\\HOROSCOPO\\src\\main\\resources\\assets\\capricornio.png")); // NOI18N

        tituloAriesCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloAriesCapricornio.setForeground(new java.awt.Color(102, 0, 102));
        tituloAriesCapricornio.setText("Capricórnio");

        periodoAriesCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoAriesCapricornio.setForeground(new java.awt.Color(102, 0, 102));
        periodoAriesCapricornio.setText("PERIODO:");

        elementoAriesCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoAriesCapricornio.setForeground(new java.awt.Color(102, 0, 102));
        elementoAriesCapricornio.setText("ELEMENTO:");

        planetaAriesCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaAriesCapricornio.setForeground(new java.awt.Color(102, 0, 102));
        planetaAriesCapricornio.setText("PLANETA REGENTE:");

        corAriesCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corAriesCapricornio.setForeground(new java.awt.Color(102, 0, 102));
        corAriesCapricornio.setText("COR:");

        numeroAriesCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroAriesCapricornio.setText("NÚMERO DA SORTE:");

        tfPeriodoAriesCapricornio.setBackground(new java.awt.Color(255, 204, 204));
        tfPeriodoAriesCapricornio.setForeground(new java.awt.Color(51, 51, 51));
        tfPeriodoAriesCapricornio.setText("22 de dezembro a 19 de janeiro.");

        tfElementoAriesCapricornio.setBackground(new java.awt.Color(255, 204, 204));
        tfElementoAriesCapricornio.setForeground(new java.awt.Color(51, 51, 51));
        tfElementoAriesCapricornio.setText("Terra.");

        tfPlanetaAriesCapricornio.setBackground(new java.awt.Color(255, 204, 204));
        tfPlanetaAriesCapricornio.setForeground(new java.awt.Color(51, 51, 51));
        tfPlanetaAriesCapricornio.setText("Saturno.");

        tfCorAriesCapricornio.setBackground(new java.awt.Color(255, 204, 204));
        tfCorAriesCapricornio.setForeground(new java.awt.Color(51, 51, 51));
        tfCorAriesCapricornio.setText("Cinza.");

        javax.swing.GroupLayout areaInformacoesCapricornioLayout = new javax.swing.GroupLayout(areaInformacoesCapricornio);
        areaInformacoesCapricornio.setLayout(areaInformacoesCapricornioLayout);
        areaInformacoesCapricornioLayout.setHorizontalGroup(
            areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloAriesCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                            .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaAriesCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroAriesCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaAriesCapricornio)
                                .addComponent(tfNumeroAriesCapricornio)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesCapricornioLayout.createSequentialGroup()
                            .addComponent(elementoAriesCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoAriesCapricornio))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesCapricornioLayout.createSequentialGroup()
                            .addComponent(periodoAriesCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoAriesCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                            .addComponent(corAriesCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorAriesCapricornio))))
                .addGap(10, 10, 10))
        );
        areaInformacoesCapricornioLayout.setVerticalGroup(
            areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloAriesCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoAriesCapricornio)
                    .addComponent(tfPeriodoAriesCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoAriesCapricornio)
                    .addComponent(tfElementoAriesCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaAriesCapricornio)
                    .addComponent(tfPlanetaAriesCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corAriesCapricornio)
                    .addComponent(tfCorAriesCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroAriesCapricornio)
                    .addComponent(tfNumeroAriesCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        capricornio.add(areaInformacoesCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        areaPrevisaoCapricornio.setBackground(new java.awt.Color(255, 204, 204));

        previsaoCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoCapricornio.setForeground(new java.awt.Color(102, 0, 102));
        previsaoCapricornio.setText("Previsão do Dia:");

        txtPrevisaoCapricornio.setBackground(new java.awt.Color(255, 204, 204));
        txtPrevisaoCapricornio.setColumns(20);
        txtPrevisaoCapricornio.setForeground(new java.awt.Color(51, 51, 51));
        txtPrevisaoCapricornio.setRows(5);
        txPrevisaoAries9.setViewportView(txtPrevisaoCapricornio);

        btnAtualizarPrevisaoCapricornio.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoCapricornio.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoCapricornioLayout = new javax.swing.GroupLayout(areaPrevisaoCapricornio);
        areaPrevisaoCapricornio.setLayout(areaPrevisaoCapricornioLayout);
        areaPrevisaoCapricornioLayout.setHorizontalGroup(
            areaPrevisaoCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoCapricornioLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoAries9)
                    .addGroup(areaPrevisaoCapricornioLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisaoCapricornioLayout.setVerticalGroup(
            areaPrevisaoCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoAries9, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        capricornio.add(areaPrevisaoCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        areaCapricornio.setBackground(new java.awt.Color(255, 204, 204));

        tituloEnergiaAries9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaAries9.setForeground(new java.awt.Color(102, 0, 102));
        tituloEnergiaAries9.setText("Energia do Dia");

        trabalhoAries9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoAries9.setForeground(new java.awt.Color(102, 0, 102));
        trabalhoAries9.setText("Trabalho:");

        sorteAries9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteAries9.setForeground(new java.awt.Color(102, 0, 102));
        sorteAries9.setText("Sorte:");

        amorAries9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorAries9.setForeground(new java.awt.Color(102, 0, 102));
        amorAries9.setText("Amor:");

        saudeAries9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeAries9.setForeground(new java.awt.Color(102, 0, 102));
        saudeAries9.setText("Saúde:");

        tfAmorAries9.setBackground(new java.awt.Color(255, 204, 204));
        tfAmorAries9.setForeground(new java.awt.Color(51, 51, 51));
        tfAmorAries9.setText("78%");

        tfTrabalhoAries9.setBackground(new java.awt.Color(255, 204, 204));
        tfTrabalhoAries9.setForeground(new java.awt.Color(51, 51, 51));
        tfTrabalhoAries9.setText("97%");

        tfSaudeAries9.setBackground(new java.awt.Color(255, 204, 204));
        tfSaudeAries9.setForeground(new java.awt.Color(51, 51, 51));
        tfSaudeAries9.setText("84%");

        tfSorteAries9.setBackground(new java.awt.Color(255, 204, 204));
        tfSorteAries9.setForeground(new java.awt.Color(51, 51, 51));
        tfSorteAries9.setText("83%");

        javax.swing.GroupLayout areaCapricornioLayout = new javax.swing.GroupLayout(areaCapricornio);
        areaCapricornio.setLayout(areaCapricornioLayout);
        areaCapricornioLayout.setHorizontalGroup(
            areaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCapricornioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCapricornioLayout.createSequentialGroup()
                        .addComponent(amorAries9, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorAries9)
                    .addGroup(areaCapricornioLayout.createSequentialGroup()
                        .addComponent(trabalhoAries9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoAries9)
                    .addGroup(areaCapricornioLayout.createSequentialGroup()
                        .addComponent(saudeAries9, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeAries9)
                    .addGroup(areaCapricornioLayout.createSequentialGroup()
                        .addComponent(sorteAries9, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteAries9)
                    .addComponent(tituloEnergiaAries9, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaCapricornioLayout.setVerticalGroup(
            areaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCapricornioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaAries9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorAries9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorAries9)
                .addGap(16, 16, 16)
                .addComponent(trabalhoAries9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoAries9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeAries9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeAries9)
                .addGap(15, 15, 15)
                .addComponent(sorteAries9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteAries9)
                .addGap(51, 51, 51))
        );

        capricornio.add(areaCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        areaMensagemCapricornio.setBackground(new java.awt.Color(255, 204, 204));

        tituloMensagemCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemCapricornio.setForeground(new java.awt.Color(102, 0, 102));
        tituloMensagemCapricornio.setText("Mensagem do dia");

        txtMensagemCapricornio.setBackground(new java.awt.Color(255, 204, 204));
        txtMensagemCapricornio.setColumns(20);
        txtMensagemCapricornio.setForeground(new java.awt.Color(51, 51, 51));
        txtMensagemCapricornio.setRows(5);
        txMensagemAries9.setViewportView(txtMensagemCapricornio);

        btnCopiarMsgCapricornio.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgCapricornio.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemCapricornioLayout = new javax.swing.GroupLayout(areaMensagemCapricornio);
        areaMensagemCapricornio.setLayout(areaMensagemCapricornioLayout);
        areaMensagemCapricornioLayout.setHorizontalGroup(
            areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCapricornioLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemAries9, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemCapricornioLayout.setVerticalGroup(
            areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemAries9, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgCapricornio)
                .addGap(20, 20, 20))
        );

        capricornio.add(areaMensagemCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoCapricornio.setBackground(null);
        fundoCapricornio.setIcon(new javax.swing.ImageIcon("C:\\Users\\JordanaLeite\\Documents\\PROJETO_APP_HOROSCOPO\\HOROSCOPO\\src\\main\\resources\\assets\\zodiaco.png")); // NOI18N
        capricornio.add(fundoCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1670, 940));

        areaAbas.addTab("Capricórnio", capricornio);

        aquario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaCaracteristicasAquario.setBackground(new java.awt.Color(255, 204, 204));

        tituloCaracteristicaAquario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaAquario.setForeground(new java.awt.Color(102, 0, 102));
        tituloCaracteristicaAquario.setText("Características");

        pfortesAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesAquario.setForeground(new java.awt.Color(102, 0, 102));
        pfortesAquario.setText("Pontos Fortes:");

        pMelhorarAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarAquario.setForeground(new java.awt.Color(102, 0, 102));
        pMelhorarAquario.setText("Pontos a Melhorar:");

        txFortesAquario.setBackground(new java.awt.Color(255, 204, 204));
        txFortesAquario.setColumns(20);
        txFortesAquario.setForeground(new java.awt.Color(51, 51, 51));
        txFortesAquario.setRows(5);
        txFortesAquario.setText("Criatividade, independência, inteligência e inovação.");
        jScrollPane21.setViewportView(txFortesAquario);

        txMelhorarAquario.setBackground(new java.awt.Color(255, 204, 204));
        txMelhorarAquario.setColumns(20);
        txMelhorarAquario.setForeground(new java.awt.Color(51, 51, 51));
        txMelhorarAquario.setRows(5);
        txMelhorarAquario.setText("Distanciamento emocional, teimosia e dificuldade com regras.");
        jScrollPane22.setViewportView(txMelhorarAquario);

        javax.swing.GroupLayout areaCaracteristicasAquarioLayout = new javax.swing.GroupLayout(areaCaracteristicasAquario);
        areaCaracteristicasAquario.setLayout(areaCaracteristicasAquarioLayout);
        areaCaracteristicasAquarioLayout.setHorizontalGroup(
            areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane21)
                    .addComponent(pMelhorarAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane22))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasAquarioLayout.setVerticalGroup(
            areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane22)
                .addGap(27, 27, 27))
        );

        aquario.add(areaCaracteristicasAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        areaInformacoesAquario.setBackground(new java.awt.Color(255, 204, 204));

        imgSignoAquario.setIcon(new javax.swing.ImageIcon("C:\\Users\\JordanaLeite\\Documents\\PROJETO_APP_HOROSCOPO\\HOROSCOPO\\src\\main\\resources\\assets\\aquario.png")); // NOI18N

        tituloAquario.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloAquario.setForeground(new java.awt.Color(102, 0, 102));
        tituloAquario.setText("Aquário");

        periodoAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoAquario.setForeground(new java.awt.Color(102, 0, 102));
        periodoAquario.setText("PERIODO:");

        elementoAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoAquario.setForeground(new java.awt.Color(102, 0, 102));
        elementoAquario.setText("ELEMENTO:");

        planetaAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaAquario.setForeground(new java.awt.Color(102, 0, 102));
        planetaAquario.setText("PLANETA REGENTE:");

        corAquario.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corAquario.setForeground(new java.awt.Color(102, 0, 102));
        corAquario.setText("COR:");

        numeroAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroAquario.setText("NÚMERO DA SORTE:");

        tfPeriodoAquario.setBackground(new java.awt.Color(255, 204, 204));
        tfPeriodoAquario.setForeground(new java.awt.Color(51, 51, 51));
        tfPeriodoAquario.setText("20 de janeiro a 18 de fevereiro.");

        tfElementoAquario.setBackground(new java.awt.Color(255, 204, 204));
        tfElementoAquario.setForeground(new java.awt.Color(51, 51, 51));
        tfElementoAquario.setText("Ar.");

        tfPlanetaAquario.setBackground(new java.awt.Color(255, 204, 204));
        tfPlanetaAquario.setForeground(new java.awt.Color(51, 51, 51));
        tfPlanetaAquario.setText("Saturno e Urano.");

        tfCorAquario.setBackground(new java.awt.Color(255, 204, 204));
        tfCorAquario.setForeground(new java.awt.Color(51, 51, 51));
        tfCorAquario.setText("Azul.");

        javax.swing.GroupLayout areaInformacoesAquarioLayout = new javax.swing.GroupLayout(areaInformacoesAquario);
        areaInformacoesAquario.setLayout(areaInformacoesAquarioLayout);
        areaInformacoesAquarioLayout.setHorizontalGroup(
            areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                            .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaAquario)
                                .addComponent(tfNumeroAquario)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesAquarioLayout.createSequentialGroup()
                            .addComponent(elementoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoAquario))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesAquarioLayout.createSequentialGroup()
                            .addComponent(periodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                            .addComponent(corAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorAquario))))
                .addGap(10, 10, 10))
        );
        areaInformacoesAquarioLayout.setVerticalGroup(
            areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoAquario)
                    .addComponent(tfPeriodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoAquario)
                    .addComponent(tfElementoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaAquario)
                    .addComponent(tfPlanetaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corAquario)
                    .addComponent(tfCorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroAquario)
                    .addComponent(tfNumeroAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        aquario.add(areaInformacoesAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        areaPrevisaoAquario.setBackground(new java.awt.Color(255, 204, 204));

        previsaoAquario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoAquario.setForeground(new java.awt.Color(102, 0, 102));
        previsaoAquario.setText("Previsão do Dia:");

        txtPrevisaoAquario.setBackground(new java.awt.Color(255, 204, 204));
        txtPrevisaoAquario.setColumns(20);
        txtPrevisaoAquario.setForeground(new java.awt.Color(51, 51, 51));
        txtPrevisaoAquario.setRows(5);
        txPrevisaoAries10.setViewportView(txtPrevisaoAquario);

        btnAtualizarPrevisaoAquario.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoAquario.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoAquario.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoAquarioLayout = new javax.swing.GroupLayout(areaPrevisaoAquario);
        areaPrevisaoAquario.setLayout(areaPrevisaoAquarioLayout);
        areaPrevisaoAquarioLayout.setHorizontalGroup(
            areaPrevisaoAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoAquarioLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoAries10)
                    .addGroup(areaPrevisaoAquarioLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisaoAquarioLayout.setVerticalGroup(
            areaPrevisaoAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoAries10, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        aquario.add(areaPrevisaoAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        areaEnergiaAquario.setBackground(new java.awt.Color(255, 204, 204));

        tituloEnergiaAquario.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaAquario.setForeground(new java.awt.Color(102, 0, 102));
        tituloEnergiaAquario.setText("Energia do Dia");

        trabalhoAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoAquario.setForeground(new java.awt.Color(102, 0, 102));
        trabalhoAquario.setText("Trabalho:");

        sorteAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteAquario.setForeground(new java.awt.Color(102, 0, 102));
        sorteAquario.setText("Sorte:");

        amorAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorAquario.setForeground(new java.awt.Color(102, 0, 102));
        amorAquario.setText("Amor:");

        saudeAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeAquario.setForeground(new java.awt.Color(102, 0, 102));
        saudeAquario.setText("Saúde:");

        tfAmorAquario.setBackground(new java.awt.Color(255, 204, 204));
        tfAmorAquario.setForeground(new java.awt.Color(51, 51, 51));
        tfAmorAquario.setText("76%");

        tfTrabalhoAquario.setBackground(new java.awt.Color(255, 204, 204));
        tfTrabalhoAquario.setForeground(new java.awt.Color(51, 51, 51));
        tfTrabalhoAquario.setText("90%");

        tfSaudeAquario.setBackground(new java.awt.Color(255, 204, 204));
        tfSaudeAquario.setForeground(new java.awt.Color(51, 51, 51));
        tfSaudeAquario.setText("91%");

        tfSorteAquario.setBackground(new java.awt.Color(255, 204, 204));
        tfSorteAquario.setForeground(new java.awt.Color(51, 51, 51));
        tfSorteAquario.setText("93%");

        javax.swing.GroupLayout areaEnergiaAquarioLayout = new javax.swing.GroupLayout(areaEnergiaAquario);
        areaEnergiaAquario.setLayout(areaEnergiaAquarioLayout);
        areaEnergiaAquarioLayout.setHorizontalGroup(
            areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                        .addComponent(amorAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorAquario)
                    .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                        .addComponent(trabalhoAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoAquario)
                    .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                        .addComponent(saudeAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeAquario)
                    .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                        .addComponent(sorteAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteAquario)
                    .addComponent(tituloEnergiaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergiaAquarioLayout.setVerticalGroup(
            areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorAquario)
                .addGap(16, 16, 16)
                .addComponent(trabalhoAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeAquario)
                .addGap(15, 15, 15)
                .addComponent(sorteAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteAquario)
                .addGap(51, 51, 51))
        );

        aquario.add(areaEnergiaAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        areaMensagemAquario.setBackground(new java.awt.Color(255, 204, 204));

        tituloMensagemAquario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemAquario.setForeground(new java.awt.Color(102, 0, 102));
        tituloMensagemAquario.setText("Mensagem do dia");

        txtMensagemAquario.setBackground(new java.awt.Color(255, 204, 204));
        txtMensagemAquario.setColumns(20);
        txtMensagemAquario.setForeground(new java.awt.Color(51, 51, 51));
        txtMensagemAquario.setRows(5);
        txMensagemAries10.setViewportView(txtMensagemAquario);

        btnCopiarMsgAquario.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgAquario.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgAquario.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemAquarioLayout = new javax.swing.GroupLayout(areaMensagemAquario);
        areaMensagemAquario.setLayout(areaMensagemAquarioLayout);
        areaMensagemAquarioLayout.setHorizontalGroup(
            areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemAries10, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemAquarioLayout.setVerticalGroup(
            areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemAries10, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgAquario)
                .addGap(20, 20, 20))
        );

        aquario.add(areaMensagemAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoAquario.setBackground(new java.awt.Color(51, 51, 51));
        fundoAquario.setIcon(new javax.swing.ImageIcon("C:\\Users\\JordanaLeite\\Documents\\PROJETO_APP_HOROSCOPO\\HOROSCOPO\\src\\main\\resources\\assets\\zodiaco.png")); // NOI18N
        aquario.add(fundoAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1670, 940));

        areaAbas.addTab("Aquário", aquario);

        peixes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaCaracteristicas11.setBackground(new java.awt.Color(255, 204, 204));

        tituloCaracteristicaAries11.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaAries11.setForeground(new java.awt.Color(102, 0, 102));
        tituloCaracteristicaAries11.setText("Características");

        pfortesAries11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesAries11.setForeground(new java.awt.Color(102, 0, 102));
        pfortesAries11.setText("Pontos Fortes:");

        pMelhorarAries11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarAries11.setForeground(new java.awt.Color(102, 0, 102));
        pMelhorarAries11.setText("Pontos a Melhorar:");

        txFortesAries11.setBackground(new java.awt.Color(255, 204, 204));
        txFortesAries11.setColumns(20);
        txFortesAries11.setForeground(new java.awt.Color(51, 51, 51));
        txFortesAries11.setRows(5);
        txFortesAries11.setText("Empatia, criatividade, sensibilidade e intuição.");
        jScrollPane23.setViewportView(txFortesAries11);

        txMelhorarAries11.setBackground(new java.awt.Color(255, 204, 204));
        txMelhorarAries11.setColumns(20);
        txMelhorarAries11.setForeground(new java.awt.Color(51, 51, 51));
        txMelhorarAries11.setRows(5);
        txMelhorarAries11.setText("Excesso de idealização, dificuldade em estabelecer limites e tendências a fugir dos problemas.");
        jScrollPane24.setViewportView(txMelhorarAries11);

        javax.swing.GroupLayout areaCaracteristicas11Layout = new javax.swing.GroupLayout(areaCaracteristicas11);
        areaCaracteristicas11.setLayout(areaCaracteristicas11Layout);
        areaCaracteristicas11Layout.setHorizontalGroup(
            areaCaracteristicas11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas11Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicas11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaAries11, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesAries11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane23)
                    .addComponent(pMelhorarAries11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane24))
                .addGap(26, 26, 26))
        );
        areaCaracteristicas11Layout.setVerticalGroup(
            areaCaracteristicas11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaAries11, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesAries11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarAries11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        peixes.add(areaCaracteristicas11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        areaInformacoes11.setBackground(new java.awt.Color(255, 204, 204));

        imgSignoPeixes.setIcon(new javax.swing.ImageIcon("C:\\Users\\JordanaLeite\\Documents\\PROJETO_APP_HOROSCOPO\\HOROSCOPO\\src\\main\\resources\\assets\\peixes.png")); // NOI18N

        tituloAries11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloAries11.setForeground(new java.awt.Color(102, 0, 102));
        tituloAries11.setText("Peixes");

        periodoAries11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoAries11.setForeground(new java.awt.Color(102, 0, 102));
        periodoAries11.setText("PERIODO:");

        elementoAries11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoAries11.setForeground(new java.awt.Color(102, 0, 102));
        elementoAries11.setText("ELEMENTO:");

        planetaAries11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaAries11.setForeground(new java.awt.Color(102, 0, 102));
        planetaAries11.setText("PLANETA REGENTE:");

        corAries11.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corAries11.setForeground(new java.awt.Color(102, 0, 102));
        corAries11.setText("COR:");

        numeroAries11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroAries11.setText("NÚMERO DA SORTE:");

        tfPeriodoAries11.setBackground(new java.awt.Color(255, 204, 204));
        tfPeriodoAries11.setForeground(new java.awt.Color(51, 51, 51));
        tfPeriodoAries11.setText("19 de fevereiro a 20 de março.");

        tfElementoAries11.setBackground(new java.awt.Color(255, 204, 204));
        tfElementoAries11.setForeground(new java.awt.Color(51, 51, 51));
        tfElementoAries11.setText("Água.");

        tfPlanetaAries11.setBackground(new java.awt.Color(255, 204, 204));
        tfPlanetaAries11.setForeground(new java.awt.Color(51, 51, 51));
        tfPlanetaAries11.setText("Netuno.");

        tfCorAries11.setBackground(new java.awt.Color(255, 204, 204));
        tfCorAries11.setForeground(new java.awt.Color(51, 51, 51));
        tfCorAries11.setText("Azul-claro.");

        javax.swing.GroupLayout areaInformacoes11Layout = new javax.swing.GroupLayout(areaInformacoes11);
        areaInformacoes11.setLayout(areaInformacoes11Layout);
        areaInformacoes11Layout.setHorizontalGroup(
            areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoes11Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloAries11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoes11Layout.createSequentialGroup()
                            .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaAries11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroAries11, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaAries11)
                                .addComponent(tfNumeroAries11)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes11Layout.createSequentialGroup()
                            .addComponent(elementoAries11, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoAries11))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes11Layout.createSequentialGroup()
                            .addComponent(periodoAries11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoAries11, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoes11Layout.createSequentialGroup()
                            .addComponent(corAries11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorAries11))))
                .addGap(10, 10, 10))
        );
        areaInformacoes11Layout.setVerticalGroup(
            areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloAries11, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoAries11)
                    .addComponent(tfPeriodoAries11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoAries11)
                    .addComponent(tfElementoAries11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaAries11)
                    .addComponent(tfPlanetaAries11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corAries11)
                    .addComponent(tfCorAries11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroAries11)
                    .addComponent(tfNumeroAries11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        peixes.add(areaInformacoes11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        areaPrevisao11.setBackground(new java.awt.Color(255, 204, 204));

        previsaoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoPeixes.setForeground(new java.awt.Color(102, 0, 102));
        previsaoPeixes.setText("Previsão do Dia:");

        txtPrevisaoPeixes.setBackground(new java.awt.Color(255, 204, 204));
        txtPrevisaoPeixes.setColumns(20);
        txtPrevisaoPeixes.setForeground(new java.awt.Color(51, 51, 51));
        txtPrevisaoPeixes.setRows(5);
        txPrevisaoPeixes.setViewportView(txtPrevisaoPeixes);

        btnAtualizarPrevisaoPeixes.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoPeixes.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoPeixes.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisao11Layout = new javax.swing.GroupLayout(areaPrevisao11);
        areaPrevisao11.setLayout(areaPrevisao11Layout);
        areaPrevisao11Layout.setHorizontalGroup(
            areaPrevisao11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisao11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisao11Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoPeixes)
                    .addGroup(areaPrevisao11Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisao11Layout.setVerticalGroup(
            areaPrevisao11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        peixes.add(areaPrevisao11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        areaEnergia11.setBackground(new java.awt.Color(255, 204, 204));

        tituloEnergiaPeixes.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaPeixes.setForeground(new java.awt.Color(102, 0, 102));
        tituloEnergiaPeixes.setText("Energia do Dia");

        trabalhoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoPeixes.setForeground(new java.awt.Color(102, 0, 102));
        trabalhoPeixes.setText("Trabalho:");

        sortePeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sortePeixes.setForeground(new java.awt.Color(102, 0, 102));
        sortePeixes.setText("Sorte:");

        amorPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorPeixes.setForeground(new java.awt.Color(102, 0, 102));
        amorPeixes.setText("Amor:");

        saudePeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudePeixes.setForeground(new java.awt.Color(102, 0, 102));
        saudePeixes.setText("Saúde:");

        tfAmorPeixes.setBackground(new java.awt.Color(255, 204, 204));
        tfAmorPeixes.setForeground(new java.awt.Color(51, 51, 51));
        tfAmorPeixes.setText("94%");

        tfTrabalhoPeixes.setBackground(new java.awt.Color(255, 204, 204));
        tfTrabalhoPeixes.setForeground(new java.awt.Color(51, 51, 51));
        tfTrabalhoPeixes.setText("80%");

        tfSaudePeixes.setBackground(new java.awt.Color(255, 204, 204));
        tfSaudePeixes.setForeground(new java.awt.Color(51, 51, 51));
        tfSaudePeixes.setText("86%");

        tfSortePeixes.setBackground(new java.awt.Color(255, 204, 204));
        tfSortePeixes.setForeground(new java.awt.Color(51, 51, 51));
        tfSortePeixes.setText("88%");

        javax.swing.GroupLayout areaEnergia11Layout = new javax.swing.GroupLayout(areaEnergia11);
        areaEnergia11.setLayout(areaEnergia11Layout);
        areaEnergia11Layout.setHorizontalGroup(
            areaEnergia11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia11Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergia11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia11Layout.createSequentialGroup()
                        .addComponent(amorPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorPeixes)
                    .addGroup(areaEnergia11Layout.createSequentialGroup()
                        .addComponent(trabalhoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoPeixes)
                    .addGroup(areaEnergia11Layout.createSequentialGroup()
                        .addComponent(saudePeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudePeixes)
                    .addGroup(areaEnergia11Layout.createSequentialGroup()
                        .addComponent(sortePeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSortePeixes)
                    .addComponent(tituloEnergiaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergia11Layout.setVerticalGroup(
            areaEnergia11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia11Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorPeixes)
                .addGap(16, 16, 16)
                .addComponent(trabalhoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudePeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudePeixes)
                .addGap(15, 15, 15)
                .addComponent(sortePeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSortePeixes)
                .addGap(51, 51, 51))
        );

        peixes.add(areaEnergia11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        areaMensagem11.setBackground(new java.awt.Color(255, 204, 204));

        tituloMensagemPeixes.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemPeixes.setForeground(new java.awt.Color(102, 0, 102));
        tituloMensagemPeixes.setText("Mensagem do dia");

        txtMensagemPeixes.setBackground(new java.awt.Color(255, 204, 204));
        txtMensagemPeixes.setColumns(20);
        txtMensagemPeixes.setForeground(new java.awt.Color(51, 51, 51));
        txtMensagemPeixes.setRows(5);
        txMensagemPeixes.setViewportView(txtMensagemPeixes);

        btnCopiarMsgPeixes.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgPeixes.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgPeixes.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagem11Layout = new javax.swing.GroupLayout(areaMensagem11);
        areaMensagem11.setLayout(areaMensagem11Layout);
        areaMensagem11Layout.setHorizontalGroup(
            areaMensagem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem11Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagem11Layout.setVerticalGroup(
            areaMensagem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgPeixes)
                .addGap(20, 20, 20))
        );

        peixes.add(areaMensagem11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoPeixes.setIcon(new javax.swing.ImageIcon("C:\\Users\\JordanaLeite\\Documents\\PROJETO_APP_HOROSCOPO\\HOROSCOPO\\src\\main\\resources\\assets\\zodiaco.png")); // NOI18N
        peixes.add(fundoPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 940));

        areaAbas.addTab("Peixes", peixes);

        getContentPane().add(areaAbas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 1050));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDescobrirSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescobrirSignoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDescobrirSignoActionPerformed

    private void tfElementoEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoEscorpiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoEscorpiaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new SIGNOS().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amorAquario;
    private javax.swing.JLabel amorAries;
    private javax.swing.JLabel amorAries9;
    private javax.swing.JLabel amorCancer;
    private javax.swing.JLabel amorEscorpiao;
    private javax.swing.JLabel amorGemeos;
    private javax.swing.JLabel amorLeao;
    private javax.swing.JLabel amorLibra;
    private javax.swing.JLabel amorPeixes;
    private javax.swing.JLabel amorSagitario;
    private javax.swing.JLabel amorTouro;
    private javax.swing.JLabel amorVirgem;
    private javax.swing.JPanel aquario;
    private javax.swing.JTabbedPane areaAbas;
    private javax.swing.JPanel areaCapricornio;
    private javax.swing.JPanel areaCaracteristicas;
    private javax.swing.JPanel areaCaracteristicas1;
    private javax.swing.JPanel areaCaracteristicas11;
    private javax.swing.JPanel areaCaracteristicas2;
    private javax.swing.JPanel areaCaracteristicas3;
    private javax.swing.JPanel areaCaracteristicas4;
    private javax.swing.JPanel areaCaracteristicas5;
    private javax.swing.JPanel areaCaracteristicas6;
    private javax.swing.JPanel areaCaracteristicasAquario;
    private javax.swing.JPanel areaCaracteristicasCapricornio;
    private javax.swing.JPanel areaCaracteristicasEscorpiao;
    private javax.swing.JPanel areaCaracteristicasSagitario;
    private javax.swing.JPanel areaCompatibilidade;
    private javax.swing.JPanel areaDescobrirSigno;
    private javax.swing.JPanel areaEnergia;
    private javax.swing.JPanel areaEnergia1;
    private javax.swing.JPanel areaEnergia11;
    private javax.swing.JPanel areaEnergia2;
    private javax.swing.JPanel areaEnergia3;
    private javax.swing.JPanel areaEnergia4;
    private javax.swing.JPanel areaEnergia5;
    private javax.swing.JPanel areaEnergiaAquario;
    private javax.swing.JPanel areaEnergiaEscorpiao;
    private javax.swing.JPanel areaEnergiaLibra;
    private javax.swing.JPanel areaEnergiaSagitario;
    private javax.swing.JPanel areaInformacoes;
    private javax.swing.JPanel areaInformacoes1;
    private javax.swing.JPanel areaInformacoes11;
    private javax.swing.JPanel areaInformacoes2;
    private javax.swing.JPanel areaInformacoes3;
    private javax.swing.JPanel areaInformacoes4;
    private javax.swing.JPanel areaInformacoes5;
    private javax.swing.JPanel areaInformacoesAquario;
    private javax.swing.JPanel areaInformacoesCapricornio;
    private javax.swing.JPanel areaInformacoesEscorpiao;
    private javax.swing.JPanel areaInformacoesLibra;
    private javax.swing.JPanel areaInformacoesSagitario;
    private javax.swing.JPanel areaMensagem;
    private javax.swing.JPanel areaMensagem1;
    private javax.swing.JPanel areaMensagem11;
    private javax.swing.JPanel areaMensagem2;
    private javax.swing.JPanel areaMensagem3;
    private javax.swing.JPanel areaMensagem5;
    private javax.swing.JPanel areaMensagemAquario;
    private javax.swing.JPanel areaMensagemCapricornio;
    private javax.swing.JPanel areaMensagemEscorpiao;
    private javax.swing.JPanel areaMensagemLeao;
    private javax.swing.JPanel areaMensagemLibra;
    private javax.swing.JPanel areaMensagemSagitario;
    private javax.swing.JPanel areaPrevisao;
    private javax.swing.JPanel areaPrevisao1;
    private javax.swing.JPanel areaPrevisao11;
    private javax.swing.JPanel areaPrevisao2;
    private javax.swing.JPanel areaPrevisao3;
    private javax.swing.JPanel areaPrevisao4;
    private javax.swing.JPanel areaPrevisao5;
    private javax.swing.JPanel areaPrevisaoAquario;
    private javax.swing.JPanel areaPrevisaoCapricornio;
    private javax.swing.JPanel areaPrevisaoEscorpiao;
    private javax.swing.JPanel areaPrevisaoLibra;
    private javax.swing.JPanel areaPrevisaoSagitario;
    private javax.swing.JPanel areaResultado;
    private javax.swing.JPanel aries;
    private javax.swing.JButton btnAtualizarPrevisaoAquario;
    private javax.swing.JButton btnAtualizarPrevisaoAries;
    private javax.swing.JButton btnAtualizarPrevisaoCancer;
    private javax.swing.JButton btnAtualizarPrevisaoCapricornio;
    private javax.swing.JButton btnAtualizarPrevisaoEscorpiao;
    private javax.swing.JButton btnAtualizarPrevisaoGemeos;
    private javax.swing.JButton btnAtualizarPrevisaoLeao;
    private javax.swing.JButton btnAtualizarPrevisaoLibra;
    private javax.swing.JButton btnAtualizarPrevisaoPeixes;
    private javax.swing.JButton btnAtualizarPrevisaoSagitario;
    private javax.swing.JButton btnAtualizarPrevisaoTouro;
    private javax.swing.JButton btnAtualizarPrevisaoVirgem;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCopiarMsgAquario;
    private javax.swing.JButton btnCopiarMsgAries;
    private javax.swing.JButton btnCopiarMsgCancer;
    private javax.swing.JButton btnCopiarMsgCapricornio;
    private javax.swing.JButton btnCopiarMsgEscorpiao;
    private javax.swing.JButton btnCopiarMsgGemeos;
    private javax.swing.JButton btnCopiarMsgLeao;
    private javax.swing.JButton btnCopiarMsgLibra;
    private javax.swing.JButton btnCopiarMsgPeixes;
    private javax.swing.JButton btnCopiarMsgSagitario;
    private javax.swing.JButton btnCopiarMsgTouro;
    private javax.swing.JButton btnCopiarMsgVirgem;
    private javax.swing.JButton btnDescobrirSigno;
    private javax.swing.JButton btnSigno;
    private javax.swing.JPanel cancer;
    private javax.swing.JPanel capricornio;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JLabel compatibilidade;
    private javax.swing.JLabel corAquario;
    private javax.swing.JLabel corAries;
    private javax.swing.JLabel corAries11;
    private javax.swing.JLabel corAriesCapricornio;
    private javax.swing.JLabel corCancer;
    private javax.swing.JLabel corEscorpiao;
    private javax.swing.JLabel corGemeos;
    private javax.swing.JLabel corLeao;
    private javax.swing.JLabel corLibra;
    private javax.swing.JLabel corSagitario;
    private javax.swing.JLabel corTouro;
    private javax.swing.JLabel corVirgem;
    private javax.swing.JLabel diaNascimento;
    private javax.swing.JLabel elementoAquario;
    private javax.swing.JLabel elementoAries;
    private javax.swing.JLabel elementoAries11;
    private javax.swing.JLabel elementoAriesCapricornio;
    private javax.swing.JLabel elementoCancer;
    private javax.swing.JLabel elementoEscorpiao;
    private javax.swing.JLabel elementoGemeos;
    private javax.swing.JLabel elementoLeao;
    private javax.swing.JLabel elementoLibra;
    private javax.swing.JLabel elementoSagitario;
    private javax.swing.JLabel elementoTouro;
    private javax.swing.JLabel elementoVirgem;
    private javax.swing.JPanel escorpiao;
    private javax.swing.JLabel fundoAquario;
    private javax.swing.JLabel fundoAries;
    private javax.swing.JLabel fundoCancer;
    private javax.swing.JLabel fundoCapricornio;
    private javax.swing.JLabel fundoEscorpiao;
    private javax.swing.JLabel fundoGemeos;
    private javax.swing.JLabel fundoInicio;
    private javax.swing.JLabel fundoLeao;
    private javax.swing.JLabel fundoLibra;
    private javax.swing.JLabel fundoPeixes;
    private javax.swing.JLabel fundoSagitario;
    private javax.swing.JLabel fundoTouro;
    private javax.swing.JLabel fundoVirgem;
    private javax.swing.JPanel gemeos;
    private javax.swing.JLabel imgSignoAquario;
    private javax.swing.JLabel imgSignoAries;
    private javax.swing.JLabel imgSignoCancer;
    private javax.swing.JLabel imgSignoCapricornio;
    private javax.swing.JLabel imgSignoEscorpiao;
    private javax.swing.JLabel imgSignoGemeos;
    private javax.swing.JLabel imgSignoLeao;
    private javax.swing.JLabel imgSignoLibra;
    private javax.swing.JLabel imgSignoPeixes;
    private javax.swing.JLabel imgSignoSagitario;
    private javax.swing.JLabel imgSignoTouro;
    private javax.swing.JLabel imgSignoVirgem;
    private javax.swing.JPanel inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JPanel leao;
    private javax.swing.JPanel libra;
    private javax.swing.JLabel mesNascimento;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel numeroAquario;
    private javax.swing.JLabel numeroAries;
    private javax.swing.JLabel numeroAries11;
    private javax.swing.JLabel numeroAriesCapricornio;
    private javax.swing.JLabel numeroCancer;
    private javax.swing.JLabel numeroEscorpiao;
    private javax.swing.JLabel numeroGemeos;
    private javax.swing.JLabel numeroLeao;
    private javax.swing.JLabel numeroLibra;
    private javax.swing.JLabel numeroSagitario;
    private javax.swing.JLabel numeroTouro;
    private javax.swing.JLabel numeroVirgem;
    private javax.swing.JLabel pMelhorarAquario;
    private javax.swing.JLabel pMelhorarAries;
    private javax.swing.JLabel pMelhorarAries11;
    private javax.swing.JLabel pMelhorarCancer;
    private javax.swing.JLabel pMelhorarCapricornio;
    private javax.swing.JLabel pMelhorarEscorpiao;
    private javax.swing.JLabel pMelhorarGemeos;
    private javax.swing.JLabel pMelhorarLeao;
    private javax.swing.JLabel pMelhorarLibra;
    private javax.swing.JLabel pMelhorarSagitario;
    private javax.swing.JLabel pMelhorarTouro;
    private javax.swing.JLabel pMelhorarVirgem;
    private javax.swing.JPanel peixes;
    private javax.swing.JLabel periodoAquario;
    private javax.swing.JLabel periodoAries;
    private javax.swing.JLabel periodoAries11;
    private javax.swing.JLabel periodoAriesCapricornio;
    private javax.swing.JLabel periodoAriesSagitario;
    private javax.swing.JLabel periodoCancer;
    private javax.swing.JLabel periodoEscorpiao;
    private javax.swing.JLabel periodoGemeos;
    private javax.swing.JLabel periodoLeao;
    private javax.swing.JLabel periodoLibra;
    private javax.swing.JLabel periodoTouro;
    private javax.swing.JLabel periodoVirgem;
    private javax.swing.JLabel pfortesAquario;
    private javax.swing.JLabel pfortesAries;
    private javax.swing.JLabel pfortesAries11;
    private javax.swing.JLabel pfortesCancer;
    private javax.swing.JLabel pfortesCapricornio;
    private javax.swing.JLabel pfortesEscorpiao;
    private javax.swing.JLabel pfortesGemeos;
    private javax.swing.JLabel pfortesLeao;
    private javax.swing.JLabel pfortesLibra;
    private javax.swing.JLabel pfortesSagitario;
    private javax.swing.JLabel pfortesTouro;
    private javax.swing.JLabel pfortesVirgem;
    private javax.swing.JLabel planetaAquario;
    private javax.swing.JLabel planetaAries;
    private javax.swing.JLabel planetaAries11;
    private javax.swing.JLabel planetaAriesCapricornio;
    private javax.swing.JLabel planetaCancer;
    private javax.swing.JLabel planetaEscorpiao;
    private javax.swing.JLabel planetaGemeos;
    private javax.swing.JLabel planetaLeao;
    private javax.swing.JLabel planetaLibra;
    private javax.swing.JLabel planetaSagitario;
    private javax.swing.JLabel planetaTouro;
    private javax.swing.JLabel planetaVirgem;
    private javax.swing.JLabel previsaoAquario;
    private javax.swing.JLabel previsaoAries;
    private javax.swing.JLabel previsaoCancer;
    private javax.swing.JLabel previsaoCapricornio;
    private javax.swing.JLabel previsaoEscorpiao;
    private javax.swing.JLabel previsaoGemeos;
    private javax.swing.JLabel previsaoLeao;
    private javax.swing.JLabel previsaoLibra;
    private javax.swing.JLabel previsaoPeixes;
    private javax.swing.JLabel previsaoSagitario;
    private javax.swing.JLabel previsaoTouro;
    private javax.swing.JLabel previsaoVirgem;
    private javax.swing.JPanel sagitario;
    private javax.swing.JLabel saudeAquario;
    private javax.swing.JLabel saudeAries;
    private javax.swing.JLabel saudeAries9;
    private javax.swing.JLabel saudeCancer;
    private javax.swing.JLabel saudeEscorpiao;
    private javax.swing.JLabel saudeGemeos;
    private javax.swing.JLabel saudeLeao;
    private javax.swing.JLabel saudeLibra;
    private javax.swing.JLabel saudePeixes;
    private javax.swing.JLabel saudeSagitario;
    private javax.swing.JLabel saudeTouro;
    private javax.swing.JLabel saudeVirgem;
    private javax.swing.JLabel signo;
    private javax.swing.JLabel signo1;
    private javax.swing.JLabel signo2;
    private javax.swing.JLabel sorteAquario;
    private javax.swing.JLabel sorteAries;
    private javax.swing.JLabel sorteAries9;
    private javax.swing.JLabel sorteCancer;
    private javax.swing.JLabel sorteEscorpiao;
    private javax.swing.JLabel sorteGemeos;
    private javax.swing.JLabel sorteLeao;
    private javax.swing.JLabel sorteLibra;
    private javax.swing.JLabel sortePeixes;
    private javax.swing.JLabel sorteSagitario;
    private javax.swing.JLabel sorteTouro;
    private javax.swing.JLabel sorteVirgem;
    private javax.swing.JTextField tfAmorAquario;
    private javax.swing.JTextField tfAmorAries;
    private javax.swing.JTextField tfAmorAries1;
    private javax.swing.JTextField tfAmorAries9;
    private javax.swing.JTextField tfAmorCancer;
    private javax.swing.JTextField tfAmorEscorpiao;
    private javax.swing.JTextField tfAmorGemeos;
    private javax.swing.JTextField tfAmorLeao;
    private javax.swing.JTextField tfAmorLibra;
    private javax.swing.JTextField tfAmorPeixes;
    private javax.swing.JTextField tfAmorSagitario;
    private javax.swing.JTextField tfAmorVirgem;
    private javax.swing.JTextField tfCorAquario;
    private javax.swing.JTextField tfCorAries;
    private javax.swing.JTextField tfCorAries11;
    private javax.swing.JTextField tfCorAries2;
    private javax.swing.JTextField tfCorAriesCapricornio;
    private javax.swing.JTextField tfCorCancer;
    private javax.swing.JTextField tfCorEscorpiao;
    private javax.swing.JTextField tfCorLeao;
    private javax.swing.JTextField tfCorLibra;
    private javax.swing.JTextField tfCorSagitario;
    private javax.swing.JTextField tfCorTouro;
    private javax.swing.JTextField tfCorVirgem;
    private javax.swing.JTextField tfElementoAquario;
    private javax.swing.JTextField tfElementoAries;
    private javax.swing.JTextField tfElementoAries11;
    private javax.swing.JTextField tfElementoAries2;
    private javax.swing.JTextField tfElementoAriesCapricornio;
    private javax.swing.JTextField tfElementoCancer;
    private javax.swing.JTextField tfElementoEscorpiao;
    private javax.swing.JTextField tfElementoLeao;
    private javax.swing.JTextField tfElementoLibra;
    private javax.swing.JTextField tfElementoSagitario;
    private javax.swing.JTextField tfElementoTouro;
    private javax.swing.JTextField tfElementoVirgem;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumeroAquario;
    private javax.swing.JTextField tfNumeroAries;
    private javax.swing.JTextField tfNumeroAries11;
    private javax.swing.JTextField tfNumeroAries2;
    private javax.swing.JTextField tfNumeroAriesCapricornio;
    private javax.swing.JTextField tfNumeroCancer;
    private javax.swing.JTextField tfNumeroEscorpiao;
    private javax.swing.JTextField tfNumeroLeao;
    private javax.swing.JTextField tfNumeroLibra;
    private javax.swing.JTextField tfNumeroSagitario;
    private javax.swing.JTextField tfNumeroTouro;
    private javax.swing.JTextField tfNumeroVirgem;
    private javax.swing.JTextField tfPeriodoAquario;
    private javax.swing.JTextField tfPeriodoAries;
    private javax.swing.JTextField tfPeriodoAries11;
    private javax.swing.JTextField tfPeriodoAries2;
    private javax.swing.JTextField tfPeriodoAriesCapricornio;
    private javax.swing.JTextField tfPeriodoCancer;
    private javax.swing.JTextField tfPeriodoEscorpiao;
    private javax.swing.JTextField tfPeriodoLeao;
    private javax.swing.JTextField tfPeriodoLibra;
    private javax.swing.JTextField tfPeriodoSagitario;
    private javax.swing.JTextField tfPeriodoTouro;
    private javax.swing.JTextField tfPeriodoVirgem;
    private javax.swing.JTextField tfPlanetaAquario;
    private javax.swing.JTextField tfPlanetaAries;
    private javax.swing.JTextField tfPlanetaAries11;
    private javax.swing.JTextField tfPlanetaAries2;
    private javax.swing.JTextField tfPlanetaAriesCapricornio;
    private javax.swing.JTextField tfPlanetaCancer;
    private javax.swing.JTextField tfPlanetaEscorpiao;
    private javax.swing.JTextField tfPlanetaLeao;
    private javax.swing.JTextField tfPlanetaLibra;
    private javax.swing.JTextField tfPlanetaSagitario;
    private javax.swing.JTextField tfPlanetaTouro;
    private javax.swing.JTextField tfPlanetaVirgem;
    private javax.swing.JTextField tfSaudeAquario;
    private javax.swing.JTextField tfSaudeAries;
    private javax.swing.JTextField tfSaudeAries1;
    private javax.swing.JTextField tfSaudeAries9;
    private javax.swing.JTextField tfSaudeCancer;
    private javax.swing.JTextField tfSaudeEscorpiao;
    private javax.swing.JTextField tfSaudeGemeos;
    private javax.swing.JTextField tfSaudeLeao;
    private javax.swing.JTextField tfSaudeLibra;
    private javax.swing.JTextField tfSaudePeixes;
    private javax.swing.JTextField tfSaudeSagitario;
    private javax.swing.JTextField tfSaudeVirgem;
    private javax.swing.JTextField tfSorteAquario;
    private javax.swing.JTextField tfSorteAries;
    private javax.swing.JTextField tfSorteAries1;
    private javax.swing.JTextField tfSorteAries9;
    private javax.swing.JTextField tfSorteCancer;
    private javax.swing.JTextField tfSorteEscorpiao;
    private javax.swing.JTextField tfSorteGemeos;
    private javax.swing.JTextField tfSorteLeao;
    private javax.swing.JTextField tfSorteLibra;
    private javax.swing.JTextField tfSortePeixes;
    private javax.swing.JTextField tfSorteSagitario;
    private javax.swing.JTextField tfSorteVirgem;
    private javax.swing.JTextField tfTrabalhoAquario;
    private javax.swing.JTextField tfTrabalhoAries;
    private javax.swing.JTextField tfTrabalhoAries1;
    private javax.swing.JTextField tfTrabalhoAries9;
    private javax.swing.JTextField tfTrabalhoCancer;
    private javax.swing.JTextField tfTrabalhoEscorpiao;
    private javax.swing.JTextField tfTrabalhoGemeos;
    private javax.swing.JTextField tfTrabalhoLeao;
    private javax.swing.JTextField tfTrabalhoLibra;
    private javax.swing.JTextField tfTrabalhoPeixes;
    private javax.swing.JTextField tfTrabalhoSagitario;
    private javax.swing.JTextField tfTrabalhoVirgem;
    private javax.swing.JLabel tituloAquario;
    private javax.swing.JLabel tituloAries;
    private javax.swing.JLabel tituloAries11;
    private javax.swing.JLabel tituloAriesCapricornio;
    private javax.swing.JLabel tituloAriesSagitario;
    private javax.swing.JLabel tituloCancer;
    private javax.swing.JLabel tituloCaracteristicaAquario;
    private javax.swing.JLabel tituloCaracteristicaAries;
    private javax.swing.JLabel tituloCaracteristicaAries11;
    private javax.swing.JLabel tituloCaracteristicaCancer;
    private javax.swing.JLabel tituloCaracteristicaCapricornio;
    private javax.swing.JLabel tituloCaracteristicaEscorpiao;
    private javax.swing.JLabel tituloCaracteristicaGemeos;
    private javax.swing.JLabel tituloCaracteristicaLeao;
    private javax.swing.JLabel tituloCaracteristicaLibra;
    private javax.swing.JLabel tituloCaracteristicaSagitario;
    private javax.swing.JLabel tituloCaracteristicaTouro;
    private javax.swing.JLabel tituloCaracteristicaVirgem;
    private javax.swing.JLabel tituloDescobrirSigno;
    private javax.swing.JLabel tituloEnergiaAquario;
    private javax.swing.JLabel tituloEnergiaAries;
    private javax.swing.JLabel tituloEnergiaAries9;
    private javax.swing.JLabel tituloEnergiaCancer;
    private javax.swing.JLabel tituloEnergiaEscorpiao;
    private javax.swing.JLabel tituloEnergiaGemeos;
    private javax.swing.JLabel tituloEnergiaLeao;
    private javax.swing.JLabel tituloEnergiaLibra;
    private javax.swing.JLabel tituloEnergiaPeixes;
    private javax.swing.JLabel tituloEnergiaSagitario;
    private javax.swing.JLabel tituloEnergiaTouro;
    private javax.swing.JLabel tituloEnergiaVirgem;
    private javax.swing.JLabel tituloEscorpiao;
    private javax.swing.JLabel tituloGemeos;
    private javax.swing.JLabel tituloLeao;
    private javax.swing.JLabel tituloLibra;
    private javax.swing.JLabel tituloMensagemAquario;
    private javax.swing.JLabel tituloMensagemAries;
    private javax.swing.JLabel tituloMensagemCancer;
    private javax.swing.JLabel tituloMensagemCapricornio;
    private javax.swing.JLabel tituloMensagemEscorpiao;
    private javax.swing.JLabel tituloMensagemGemeos;
    private javax.swing.JLabel tituloMensagemLeao;
    private javax.swing.JLabel tituloMensagemLibra;
    private javax.swing.JLabel tituloMensagemPeixes;
    private javax.swing.JLabel tituloMensagemSagitario;
    private javax.swing.JLabel tituloMensagemTouro;
    private javax.swing.JLabel tituloMensagemVirgem;
    private javax.swing.JLabel tituloTouro;
    private javax.swing.JLabel tituloVirgem;
    private javax.swing.JPanel touro;
    private javax.swing.JLabel trabalhoAquario;
    private javax.swing.JLabel trabalhoAries;
    private javax.swing.JLabel trabalhoAries9;
    private javax.swing.JLabel trabalhoCancer;
    private javax.swing.JLabel trabalhoEscorpiao;
    private javax.swing.JLabel trabalhoGemeos;
    private javax.swing.JLabel trabalhoLeao;
    private javax.swing.JLabel trabalhoLibra;
    private javax.swing.JLabel trabalhoPeixes;
    private javax.swing.JLabel trabalhoSagitario;
    private javax.swing.JLabel trabalhoTouro;
    private javax.swing.JLabel trabalhoVirgem;
    private javax.swing.JTextArea txFortesAquario;
    private javax.swing.JTextArea txFortesAries;
    private javax.swing.JTextArea txFortesAries11;
    private javax.swing.JTextArea txFortesCancer;
    private javax.swing.JTextArea txFortesCapricornio;
    private javax.swing.JTextArea txFortesEscorpiao;
    private javax.swing.JTextArea txFortesGemeos;
    private javax.swing.JTextArea txFortesLeao;
    private javax.swing.JTextArea txFortesLibra;
    private javax.swing.JTextArea txFortesSagitario;
    private javax.swing.JTextArea txFortesTouro;
    private javax.swing.JTextArea txFortesVirgem;
    private javax.swing.JTextArea txMelhorarAquario;
    private javax.swing.JTextArea txMelhorarAries;
    private javax.swing.JTextArea txMelhorarAries11;
    private javax.swing.JTextArea txMelhorarCancer;
    private javax.swing.JTextArea txMelhorarCapricornio;
    private javax.swing.JTextArea txMelhorarEscorpiao;
    private javax.swing.JTextArea txMelhorarGemeos;
    private javax.swing.JTextArea txMelhorarLeao;
    private javax.swing.JTextArea txMelhorarLibra;
    private javax.swing.JTextArea txMelhorarSagitario;
    private javax.swing.JTextArea txMelhorarTouro;
    private javax.swing.JTextArea txMelhorarVirgem;
    private javax.swing.JScrollPane txMensagemAries;
    private javax.swing.JScrollPane txMensagemAries10;
    private javax.swing.JScrollPane txMensagemAries4;
    private javax.swing.JScrollPane txMensagemAries8;
    private javax.swing.JScrollPane txMensagemAries9;
    private javax.swing.JScrollPane txMensagemCancer;
    private javax.swing.JScrollPane txMensagemEscorpiao;
    private javax.swing.JScrollPane txMensagemGemeos;
    private javax.swing.JScrollPane txMensagemLibra;
    private javax.swing.JScrollPane txMensagemPeixes;
    private javax.swing.JScrollPane txMensagemTouro;
    private javax.swing.JScrollPane txMensagemVirgem;
    private javax.swing.JScrollPane txPrevisaoAries;
    private javax.swing.JScrollPane txPrevisaoAries10;
    private javax.swing.JScrollPane txPrevisaoAries2;
    private javax.swing.JScrollPane txPrevisaoAries4;
    private javax.swing.JScrollPane txPrevisaoAries8;
    private javax.swing.JScrollPane txPrevisaoAries9;
    private javax.swing.JScrollPane txPrevisaoCancer;
    private javax.swing.JScrollPane txPrevisaoEscorpiao;
    private javax.swing.JScrollPane txPrevisaoLibra;
    private javax.swing.JScrollPane txPrevisaoPeixes;
    private javax.swing.JScrollPane txPrevisaoTouro;
    private javax.swing.JScrollPane txPrevisaoVirgem;
    private javax.swing.JTextArea txtMensagemAquario;
    private javax.swing.JTextArea txtMensagemAries;
    private javax.swing.JTextArea txtMensagemCapricornio;
    private javax.swing.JTextArea txtMensagemEscorpiao;
    private javax.swing.JTextArea txtMensagemLeao;
    private javax.swing.JTextArea txtMensagemLibra;
    private javax.swing.JTextArea txtMensagemPeixes;
    private javax.swing.JTextArea txtMensagemSagitario;
    private javax.swing.JTextArea txtMensagemTouro;
    private javax.swing.JTextArea txtMensagemVirgem;
    private javax.swing.JTextArea txtPrevisaoAquario;
    private javax.swing.JTextArea txtPrevisaoAries;
    private javax.swing.JTextArea txtPrevisaoCancer;
    private javax.swing.JTextArea txtPrevisaoCapricornio;
    private javax.swing.JTextArea txtPrevisaoEscorpiao;
    private javax.swing.JTextArea txtPrevisaoGemeos;
    private javax.swing.JTextArea txtPrevisaoLeao;
    private javax.swing.JTextArea txtPrevisaoLibra;
    private javax.swing.JTextArea txtPrevisaoPeixes;
    private javax.swing.JTextArea txtPrevisaoSagitario;
    private javax.swing.JTextArea txtPrevisaoTouro;
    private javax.swing.JTextArea txtPrevisaoVirgem;
    private javax.swing.JPanel virgem;
    // End of variables declaration//GEN-END:variables
}
