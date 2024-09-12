/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jFrames;

import Asignatura.Asignatura;
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;

/**
 *
 * @author isaac
 */
public class mallaInterScreen extends javax.swing.JFrame {

    
    Color COLORASIGDISPO = new Color(234,118,0);
    Color COLORASIGDEFAULT = new Color(117,117,117);
    Color COLORASIGAPROB = new Color(57,64,73);
    
    
    //Atributos
    List<Asignatura> cursos = new ArrayList<>();
    
    /**
     * Creates new form verMallaScreen
     */
    public mallaInterScreen() {
        initComponents();
        
        //Codigo imperativo para datos de las asignaturas
        Asignatura calculo1 = new Asignatura("Calculo 1","D",cal1);
        this.cursos.add(calculo1);
        Asignatura algebra1 = new Asignatura("Algebra 1","D",alg1);
        this.cursos.add(algebra1);
        Asignatura fisica1 = new Asignatura("Fisica 1","D",fis1);
        this.cursos.add(fisica1);
        Asignatura tallerDesarrolloPersonal = new Asignatura("Taller desarrollo personal","D",tallDesPer);
        this.cursos.add(tallerDesarrolloPersonal);
        Asignatura metodosDeEstudio = new Asignatura("Metodos de estudio","D",metEstud);
        this.cursos.add(metodosDeEstudio);
        Asignatura introduccionALaIngenieria = new Asignatura("Introduccion a la ingenieria","D",introIng);
        this.cursos.add(introduccionALaIngenieria);
        Asignatura calculo2 = new Asignatura("Calculo 2","B",cal2);
        calculo2.setRequisitos(List.of(calculo1));
        this.cursos.add(calculo2);
        Asignatura algebra2 = new Asignatura("Algebra 2","B",alg2);
        algebra2.setRequisitos(List.of(algebra1));
        this.cursos.add(algebra2);
        Asignatura fisica2 = new Asignatura("Fisica 2","B",fis2);
        fisica2.setRequisitos(List.of(fisica1));
        this.cursos.add(fisica2);
        Asignatura fundamentosDeProgramacion = new Asignatura("Fundamentos de programacion","B",fundaProgra);
        fundamentosDeProgramacion.setRequisitos(List.of(algebra1));
        this.cursos.add(fundamentosDeProgramacion);
        Asignatura introduccionALaIngenieriaInformatica = new Asignatura("Introduccion ingenieria informatica","B",introIngInfor);
        introduccionALaIngenieriaInformatica.setRequisitos(List.of(introduccionALaIngenieria));
        this.cursos.add(introduccionALaIngenieriaInformatica);
        Asignatura quimicaGeneral = new Asignatura("Quimica","D",quimica);
        this.cursos.add(quimicaGeneral);
        Asignatura electricidadYMagnetismo = new Asignatura("Electro","B",electro);
        electricidadYMagnetismo.setRequisitos(List.of(calculo2,fisica2));
        this.cursos.add(electricidadYMagnetismo);
        Asignatura comunicacionEfectiva = new Asignatura("Comunicacion efectiva","B",comunicacionEfc);
        comunicacionEfectiva.setRequisitos(List.of(tallerDesarrolloPersonal));
        this.cursos.add(comunicacionEfectiva);
        Asignatura inglesI = new Asignatura("Ingles 1","B",ingles1);
        inglesI.setRequisitos(List.of(metodosDeEstudio));
        this.cursos.add(inglesI);
        Asignatura ecuacionesDiferenciales = new Asignatura("Ecuaciones diferenciales","B",edo);
        ecuacionesDiferenciales.setRequisitos(List.of(calculo2,fundamentosDeProgramacion));
        this.cursos.add(ecuacionesDiferenciales);
        Asignatura metodosDeProgramacion = new Asignatura("Metodos de programacion","B",metodos);
        metodosDeProgramacion.setRequisitos(List.of(fundamentosDeProgramacion,introduccionALaIngenieriaInformatica));
        this.cursos.add(metodosDeProgramacion);
        Asignatura analisisEstadistico = new Asignatura("Analisis estadistico","B",estadis);
        analisisEstadistico.setRequisitos(List.of(calculo2));
        this.cursos.add(analisisEstadistico);
        Asignatura inglesII = new Asignatura("Ingles 2","B",ingles2);
        inglesII.setRequisitos(List.of(inglesI));
        this.cursos.add(inglesII);
        Asignatura ingenieriaDeSistemas = new Asignatura("Ingenieria de sistemas","B",ingesis);
        ingenieriaDeSistemas.setRequisitos(List.of(introduccionALaIngenieria,quimicaGeneral,analisisEstadistico));
        this.cursos.add(ingenieriaDeSistemas);
        Asignatura estructuraDeComputadores = new Asignatura("Estructura de computadores","B",edecu);
        estructuraDeComputadores.setRequisitos(List.of(algebra2,electricidadYMagnetismo));
        this.cursos.add(estructuraDeComputadores);
        Asignatura fundamentosDeEconomia = new Asignatura("Fundamentos de economia","B",fundeco);
        fundamentosDeEconomia.setRequisitos(List.of(calculo1));
        this.cursos.add(fundamentosDeEconomia);
        Asignatura paradigmasDeProgramacion = new Asignatura("Paradigmas de programacion","B",paradigmas);
        paradigmasDeProgramacion.setRequisitos(List.of(metodosDeProgramacion));
        this.cursos.add(paradigmasDeProgramacion);
        Asignatura analisisDeAlgoritmos = new Asignatura("Analisis de algoritmos y estructura de datos","B",eda);
        analisisDeAlgoritmos.setRequisitos(List.of(metodosDeProgramacion));
        this.cursos.add(analisisDeAlgoritmos);
        Asignatura evaluacionProyectosInformaticos = new Asignatura("Evaluacion de proyectos informaticos","B",evalucion);
        evaluacionProyectosInformaticos.setRequisitos(List.of(ecuacionesDiferenciales,fundamentosDeEconomia));
        this.cursos.add(evaluacionProyectosInformaticos);
        Asignatura inglesIII = new Asignatura("Ingles 3","B",ingles3);
        inglesIII.setRequisitos(List.of(inglesII));
        this.cursos.add(inglesIII);
        Asignatura sistemasDeInformacion = new Asignatura("Sistemas de informacion","B",sia);
        sistemasDeInformacion.setRequisitos(List.of(ingenieriaDeSistemas));
        this.cursos.add(sistemasDeInformacion);
        Asignatura informaticaYSociedad = new Asignatura("Informatica y sociedad","B",inso);
        informaticaYSociedad.setRequisitos(List.of(comunicacionEfectiva));
        this.cursos.add(informaticaYSociedad);
        Asignatura fundamentosIngenieriaDeSoftware = new Asignatura("Fundamentos de ingenieria de software","B",fundaIngSoft);
        fundamentosIngenieriaDeSoftware.setRequisitos(List.of(paradigmasDeProgramacion));
        this.cursos.add(fundamentosIngenieriaDeSoftware);
        Asignatura organizacionDeComputadores = new Asignatura("Organizacion de computadores","B",orga);
        organizacionDeComputadores.setRequisitos(List.of(estructuraDeComputadores));
        this.cursos.add(organizacionDeComputadores);
        Asignatura disenioBaseDeDatos = new Asignatura("Disenio base de datos","B",basedatos);
        disenioBaseDeDatos.setRequisitos(List.of(paradigmasDeProgramacion));
        this.cursos.add(disenioBaseDeDatos);
        Asignatura inglesIV = new Asignatura("Ingles 4","B",ingles4);
        inglesIV.setRequisitos(List.of(inglesIII));
        this.cursos.add(inglesIV);
        Asignatura tecnicasDeIngenieriaDeSoftware = new Asignatura("Tecnicas de ingenieria de software","B",tecnias);
        tecnicasDeIngenieriaDeSoftware.setRequisitos(List.of(fundamentosIngenieriaDeSoftware));
        this.cursos.add(tecnicasDeIngenieriaDeSoftware);
        Asignatura redesComputacionales = new Asignatura("Redes computacionales","B",redes);
        redesComputacionales.setRequisitos(List.of(organizacionDeComputadores));
        this.cursos.add(redesComputacionales);
        Asignatura administracionProyectosInformaticos = new Asignatura("Administracion de proyectos informaticos","B",adminProyec);
        administracionProyectosInformaticos.setRequisitos(List.of(evaluacionProyectosInformaticos));
        this.cursos.add(administracionProyectosInformaticos);
        Asignatura sistemasOperativos = new Asignatura("Sistemas operativos","B",sistemasOper);
        sistemasOperativos.setRequisitos(List.of(analisisDeAlgoritmos,organizacionDeComputadores));
        this.cursos.add(sistemasOperativos);
        Asignatura tallerBaseDatos = new Asignatura("Taller base de datos","B",tallerbase);
        tallerBaseDatos.setRequisitos(List.of(fundamentosIngenieriaDeSoftware,disenioBaseDeDatos));
        this.cursos.add(tallerBaseDatos);
        Asignatura topicoEspecialidad1 = new Asignatura("Topicos 1","B",top1);
        topicoEspecialidad1.setRequisitos(List.of(tecnicasDeIngenieriaDeSoftware,redesComputacionales));
        this.cursos.add(topicoEspecialidad1);
        Asignatura topicoEspecialidad2 = new Asignatura("Topicos 2","B",top2);
        topicoEspecialidad2.setRequisitos(List.of(tecnicasDeIngenieriaDeSoftware,redesComputacionales));
        this.cursos.add(topicoEspecialidad2);
        Asignatura topicoEspecialidad3 = new Asignatura("Topicos 3","B",top3);
        topicoEspecialidad3.setRequisitos(List.of(tecnicasDeIngenieriaDeSoftware,redesComputacionales,administracionProyectosInformaticos));
        this.cursos.add(topicoEspecialidad3);
        Asignatura seminarioDeComputacionEInformatica = new Asignatura("Seminario de computacion e informatica","B",semina);
        seminarioDeComputacionEInformatica.setRequisitos(List.of(informaticaYSociedad,sistemasDeInformacion,sistemasOperativos,tallerBaseDatos));
        this.cursos.add(seminarioDeComputacionEInformatica);
        Asignatura proyectoDeIngenieriaDeSoftware = new Asignatura("Proyecto de ingenieria de software","B",proyec);
        proyectoDeIngenieriaDeSoftware.setRequisitos(List.of(tallerBaseDatos,tecnicasDeIngenieriaDeSoftware,administracionProyectosInformaticos));
        this.cursos.add(proyectoDeIngenieriaDeSoftware);
        Asignatura trabajoDeTitulacion = new Asignatura("Trabajo de titulacion","B",titu);
        trabajoDeTitulacion.setRequisitos(List.of(seminarioDeComputacionEInformatica));
        this.cursos.add(trabajoDeTitulacion);
        
        actualizarEstadoTodasLasAsignaturas();
        actualizarVisualizacionTodasLasAsignaturas();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanelMalla = new javax.swing.JPanel();
        n1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        n2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        n3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        n4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        n5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        n6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        n7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        n8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        cal1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        alg1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        fis1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        tallDesPer = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        introIng = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        metEstud = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        cal2 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        introIngInfor = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        estadis = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        alg2 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        fis2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        fundaProgra = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        quimica = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        metodos = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        edo = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        ingles1 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        electro = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        comunicacionEfc = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        ingesis = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        evalucion = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        sistemasOper = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        proyec = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        titu = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        top1 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        top2 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        edecu = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        fundeco = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        basedatos = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        tallerbase = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        orga = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        adminProyec = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        paradigmas = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        fundaIngSoft = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        tecnias = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        top3 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        eda = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        inso = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        redes = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        semina = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        ingles2 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        sia = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        ingles3 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        ingles4 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanelMalla.setBackground(new java.awt.Color(255, 255, 255));
        mainPanelMalla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        n1.setBackground(new java.awt.Color(234, 118, 0));
        n1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        n1.setToolTipText("");
        n1.setName(""); // NOI18N

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NIVEL 1");

        javax.swing.GroupLayout n1Layout = new javax.swing.GroupLayout(n1);
        n1.setLayout(n1Layout);
        n1Layout.setHorizontalGroup(
            n1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        n1Layout.setVerticalGroup(
            n1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        n2.setBackground(new java.awt.Color(234, 118, 0));
        n2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        n2.setToolTipText("");
        n2.setName(""); // NOI18N

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("NIVEL 2");

        javax.swing.GroupLayout n2Layout = new javax.swing.GroupLayout(n2);
        n2.setLayout(n2Layout);
        n2Layout.setHorizontalGroup(
            n2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );
        n2Layout.setVerticalGroup(
            n2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        n3.setBackground(new java.awt.Color(234, 118, 0));
        n3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        n3.setToolTipText("");
        n3.setName(""); // NOI18N

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("NIVEL 3");

        javax.swing.GroupLayout n3Layout = new javax.swing.GroupLayout(n3);
        n3.setLayout(n3Layout);
        n3Layout.setHorizontalGroup(
            n3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );
        n3Layout.setVerticalGroup(
            n3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        n4.setBackground(new java.awt.Color(234, 118, 0));
        n4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        n4.setToolTipText("");
        n4.setName(""); // NOI18N

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("NIVEL 4");

        javax.swing.GroupLayout n4Layout = new javax.swing.GroupLayout(n4);
        n4.setLayout(n4Layout);
        n4Layout.setHorizontalGroup(
            n4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );
        n4Layout.setVerticalGroup(
            n4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        n5.setBackground(new java.awt.Color(234, 118, 0));
        n5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        n5.setToolTipText("");
        n5.setName(""); // NOI18N

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("NIVEL 5");

        javax.swing.GroupLayout n5Layout = new javax.swing.GroupLayout(n5);
        n5.setLayout(n5Layout);
        n5Layout.setHorizontalGroup(
            n5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );
        n5Layout.setVerticalGroup(
            n5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        n6.setBackground(new java.awt.Color(234, 118, 0));
        n6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        n6.setToolTipText("");
        n6.setName(""); // NOI18N

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("NIVEL 6");

        javax.swing.GroupLayout n6Layout = new javax.swing.GroupLayout(n6);
        n6.setLayout(n6Layout);
        n6Layout.setHorizontalGroup(
            n6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );
        n6Layout.setVerticalGroup(
            n6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        n7.setBackground(new java.awt.Color(234, 118, 0));
        n7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        n7.setToolTipText("");
        n7.setName(""); // NOI18N

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("NIVEL 7");

        javax.swing.GroupLayout n7Layout = new javax.swing.GroupLayout(n7);
        n7.setLayout(n7Layout);
        n7Layout.setHorizontalGroup(
            n7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );
        n7Layout.setVerticalGroup(
            n7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        n8.setBackground(new java.awt.Color(234, 118, 0));
        n8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        n8.setToolTipText("");
        n8.setName(""); // NOI18N

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("NIVEL 8");

        javax.swing.GroupLayout n8Layout = new javax.swing.GroupLayout(n8);
        n8.setLayout(n8Layout);
        n8Layout.setHorizontalGroup(
            n8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );
        n8Layout.setVerticalGroup(
            n8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        cal1.setBackground(new java.awt.Color(234, 118, 0));
        cal1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cal1MousePressed(evt);
            }
        });

        jLabel19.setText("<html><center>Cálculo I para Ingeniería");

        javax.swing.GroupLayout cal1Layout = new javax.swing.GroupLayout(cal1);
        cal1.setLayout(cal1Layout);
        cal1Layout.setHorizontalGroup(
            cal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        cal1Layout.setVerticalGroup(
            cal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        alg1.setBackground(new java.awt.Color(234, 118, 0));
        alg1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        alg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                alg1MousePressed(evt);
            }
        });

        jLabel20.setText("<html><center>Álgebra I para Ingeniería");

        javax.swing.GroupLayout alg1Layout = new javax.swing.GroupLayout(alg1);
        alg1.setLayout(alg1Layout);
        alg1Layout.setHorizontalGroup(
            alg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        alg1Layout.setVerticalGroup(
            alg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        fis1.setBackground(new java.awt.Color(234, 118, 0));
        fis1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fis1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fis1MousePressed(evt);
            }
        });

        jLabel21.setText("<html><center>Física I para Ingeniería");

        javax.swing.GroupLayout fis1Layout = new javax.swing.GroupLayout(fis1);
        fis1.setLayout(fis1Layout);
        fis1Layout.setHorizontalGroup(
            fis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        fis1Layout.setVerticalGroup(
            fis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tallDesPer.setBackground(new java.awt.Color(234, 118, 0));
        tallDesPer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tallDesPer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tallDesPerMousePressed(evt);
            }
        });

        jLabel22.setText("<html><center>Taller de desarrollo personal e integral");

        javax.swing.GroupLayout tallDesPerLayout = new javax.swing.GroupLayout(tallDesPer);
        tallDesPer.setLayout(tallDesPerLayout);
        tallDesPerLayout.setHorizontalGroup(
            tallDesPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        tallDesPerLayout.setVerticalGroup(
            tallDesPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        introIng.setBackground(new java.awt.Color(234, 118, 0));
        introIng.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        introIng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                introIngMousePressed(evt);
            }
        });

        jLabel23.setText("<html><center>Introducción a la ingeniería");

        javax.swing.GroupLayout introIngLayout = new javax.swing.GroupLayout(introIng);
        introIng.setLayout(introIngLayout);
        introIngLayout.setHorizontalGroup(
            introIngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        introIngLayout.setVerticalGroup(
            introIngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        metEstud.setBackground(new java.awt.Color(234, 118, 0));
        metEstud.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        metEstud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                metEstudMousePressed(evt);
            }
        });

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("<html><center>Métodos de Estudio");

        javax.swing.GroupLayout metEstudLayout = new javax.swing.GroupLayout(metEstud);
        metEstud.setLayout(metEstudLayout);
        metEstudLayout.setHorizontalGroup(
            metEstudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        metEstudLayout.setVerticalGroup(
            metEstudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        cal2.setBackground(new java.awt.Color(117, 117, 117));
        cal2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cal2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cal2MousePressed(evt);
            }
        });

        jLabel25.setText("<html><center>Cálculo II para Ingeniería");

        javax.swing.GroupLayout cal2Layout = new javax.swing.GroupLayout(cal2);
        cal2.setLayout(cal2Layout);
        cal2Layout.setHorizontalGroup(
            cal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        cal2Layout.setVerticalGroup(
            cal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        introIngInfor.setBackground(new java.awt.Color(117, 117, 117));
        introIngInfor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        introIngInfor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                introIngInforMousePressed(evt);
            }
        });

        jLabel30.setText("<html><center>Introducción a la Ingeniería Informática");

        javax.swing.GroupLayout introIngInforLayout = new javax.swing.GroupLayout(introIngInfor);
        introIngInfor.setLayout(introIngInforLayout);
        introIngInforLayout.setHorizontalGroup(
            introIngInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        introIngInforLayout.setVerticalGroup(
            introIngInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        estadis.setBackground(new java.awt.Color(117, 117, 117));
        estadis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estadis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                estadisMousePressed(evt);
            }
        });

        jLabel36.setText("<html><center>Análisis estadístico para Ingenería");

        javax.swing.GroupLayout estadisLayout = new javax.swing.GroupLayout(estadis);
        estadis.setLayout(estadisLayout);
        estadisLayout.setHorizontalGroup(
            estadisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        estadisLayout.setVerticalGroup(
            estadisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        alg2.setBackground(new java.awt.Color(117, 117, 117));
        alg2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        alg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                alg2MousePressed(evt);
            }
        });

        jLabel26.setText("<html><center>Álgebra II para Ingeniería");

        javax.swing.GroupLayout alg2Layout = new javax.swing.GroupLayout(alg2);
        alg2.setLayout(alg2Layout);
        alg2Layout.setHorizontalGroup(
            alg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        alg2Layout.setVerticalGroup(
            alg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        fis2.setBackground(new java.awt.Color(117, 117, 117));
        fis2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fis2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fis2MousePressed(evt);
            }
        });

        jLabel27.setText("<html><center>Física II para Ingeniería");

        javax.swing.GroupLayout fis2Layout = new javax.swing.GroupLayout(fis2);
        fis2.setLayout(fis2Layout);
        fis2Layout.setHorizontalGroup(
            fis2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        fis2Layout.setVerticalGroup(
            fis2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        fundaProgra.setBackground(new java.awt.Color(117, 117, 117));
        fundaProgra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fundaProgra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fundaPrograMousePressed(evt);
            }
        });

        jLabel28.setText("<html><center>Fundamentos de computación y programación");

        javax.swing.GroupLayout fundaPrograLayout = new javax.swing.GroupLayout(fundaProgra);
        fundaProgra.setLayout(fundaPrograLayout);
        fundaPrograLayout.setHorizontalGroup(
            fundaPrograLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        fundaPrograLayout.setVerticalGroup(
            fundaPrograLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        quimica.setBackground(new java.awt.Color(234, 118, 0));
        quimica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        quimica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                quimicaMousePressed(evt);
            }
        });

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("<html><center>Química general");

        javax.swing.GroupLayout quimicaLayout = new javax.swing.GroupLayout(quimica);
        quimica.setLayout(quimicaLayout);
        quimicaLayout.setHorizontalGroup(
            quimicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        quimicaLayout.setVerticalGroup(
            quimicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        metodos.setBackground(new java.awt.Color(117, 117, 117));
        metodos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        metodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                metodosMousePressed(evt);
            }
        });

        jLabel35.setText("<html><center>Métodos de programación");

        javax.swing.GroupLayout metodosLayout = new javax.swing.GroupLayout(metodos);
        metodos.setLayout(metodosLayout);
        metodosLayout.setHorizontalGroup(
            metodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        metodosLayout.setVerticalGroup(
            metodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        edo.setBackground(new java.awt.Color(117, 117, 117));
        edo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        edo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                edoMousePressed(evt);
            }
        });

        jLabel34.setText("<html><center>Ecuaciones diferenciales y métodos numéricos para Ingeniería");

        javax.swing.GroupLayout edoLayout = new javax.swing.GroupLayout(edo);
        edo.setLayout(edoLayout);
        edoLayout.setHorizontalGroup(
            edoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        edoLayout.setVerticalGroup(
            edoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ingles1.setBackground(new java.awt.Color(117, 117, 117));
        ingles1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ingles1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ingles1MousePressed(evt);
            }
        });

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Inglés I");

        javax.swing.GroupLayout ingles1Layout = new javax.swing.GroupLayout(ingles1);
        ingles1.setLayout(ingles1Layout);
        ingles1Layout.setHorizontalGroup(
            ingles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ingles1Layout.setVerticalGroup(
            ingles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        electro.setBackground(new java.awt.Color(117, 117, 117));
        electro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        electro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                electroMousePressed(evt);
            }
        });

        jLabel32.setText("<html><center>Electricidad y magnetismo para Ingeniería");

        javax.swing.GroupLayout electroLayout = new javax.swing.GroupLayout(electro);
        electro.setLayout(electroLayout);
        electroLayout.setHorizontalGroup(
            electroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        electroLayout.setVerticalGroup(
            electroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        comunicacionEfc.setBackground(new java.awt.Color(117, 117, 117));
        comunicacionEfc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        comunicacionEfc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comunicacionEfcMousePressed(evt);
            }
        });

        jLabel31.setText("<html><center>Comunicación Efectiva");

        javax.swing.GroupLayout comunicacionEfcLayout = new javax.swing.GroupLayout(comunicacionEfc);
        comunicacionEfc.setLayout(comunicacionEfcLayout);
        comunicacionEfcLayout.setHorizontalGroup(
            comunicacionEfcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        comunicacionEfcLayout.setVerticalGroup(
            comunicacionEfcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ingesis.setBackground(new java.awt.Color(117, 117, 117));
        ingesis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ingesis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ingesisMousePressed(evt);
            }
        });

        jLabel41.setText("<html><center>Ingeniería de sistemas");

        javax.swing.GroupLayout ingesisLayout = new javax.swing.GroupLayout(ingesis);
        ingesis.setLayout(ingesisLayout);
        ingesisLayout.setHorizontalGroup(
            ingesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ingesisLayout.setVerticalGroup(
            ingesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        evalucion.setBackground(new java.awt.Color(117, 117, 117));
        evalucion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        evalucion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                evalucionMousePressed(evt);
            }
        });

        jLabel51.setText("<html><center>Evaluación de proyectos informáticos");

        javax.swing.GroupLayout evalucionLayout = new javax.swing.GroupLayout(evalucion);
        evalucion.setLayout(evalucionLayout);
        evalucionLayout.setHorizontalGroup(
            evalucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        evalucionLayout.setVerticalGroup(
            evalucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        sistemasOper.setBackground(new java.awt.Color(117, 117, 117));
        sistemasOper.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sistemasOper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sistemasOperMousePressed(evt);
            }
        });

        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("<html><center>Sistemas operativos");

        javax.swing.GroupLayout sistemasOperLayout = new javax.swing.GroupLayout(sistemasOper);
        sistemasOper.setLayout(sistemasOperLayout);
        sistemasOperLayout.setHorizontalGroup(
            sistemasOperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        sistemasOperLayout.setVerticalGroup(
            sistemasOperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        proyec.setBackground(new java.awt.Color(117, 117, 117));
        proyec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        proyec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                proyecMousePressed(evt);
            }
        });

        jLabel57.setText("<html><center>Proyecto de ingeniería de software");

        javax.swing.GroupLayout proyecLayout = new javax.swing.GroupLayout(proyec);
        proyec.setLayout(proyecLayout);
        proyecLayout.setHorizontalGroup(
            proyecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        proyecLayout.setVerticalGroup(
            proyecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        titu.setBackground(new java.awt.Color(117, 117, 117));
        titu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        titu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tituMousePressed(evt);
            }
        });

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("<html><center>Trabajo de Titulación");

        javax.swing.GroupLayout tituLayout = new javax.swing.GroupLayout(titu);
        titu.setLayout(tituLayout);
        tituLayout.setHorizontalGroup(
            tituLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        tituLayout.setVerticalGroup(
            tituLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        top1.setBackground(new java.awt.Color(117, 117, 117));
        top1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        top1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                top1MousePressed(evt);
            }
        });

        jLabel59.setText("<html><center>Tópicos de especialidad I");

        javax.swing.GroupLayout top1Layout = new javax.swing.GroupLayout(top1);
        top1.setLayout(top1Layout);
        top1Layout.setHorizontalGroup(
            top1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        top1Layout.setVerticalGroup(
            top1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        top2.setBackground(new java.awt.Color(117, 117, 117));
        top2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        top2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                top2MousePressed(evt);
            }
        });

        jLabel60.setText("<html><center>Tópicos de especialidad II");

        javax.swing.GroupLayout top2Layout = new javax.swing.GroupLayout(top2);
        top2.setLayout(top2Layout);
        top2Layout.setHorizontalGroup(
            top2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        top2Layout.setVerticalGroup(
            top2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        edecu.setBackground(new java.awt.Color(117, 117, 117));
        edecu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        edecu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                edecuMousePressed(evt);
            }
        });

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("<html><center>Estructura de computadores</center></html>");

        javax.swing.GroupLayout edecuLayout = new javax.swing.GroupLayout(edecu);
        edecu.setLayout(edecuLayout);
        edecuLayout.setHorizontalGroup(
            edecuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        edecuLayout.setVerticalGroup(
            edecuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        fundeco.setBackground(new java.awt.Color(117, 117, 117));
        fundeco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fundeco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fundecoMousePressed(evt);
            }
        });

        jLabel42.setText("<html><center>Fundamentos de economía");

        javax.swing.GroupLayout fundecoLayout = new javax.swing.GroupLayout(fundeco);
        fundeco.setLayout(fundecoLayout);
        fundecoLayout.setHorizontalGroup(
            fundecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        fundecoLayout.setVerticalGroup(
            fundecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        basedatos.setBackground(new java.awt.Color(117, 117, 117));
        basedatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        basedatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                basedatosMousePressed(evt);
            }
        });

        jLabel50.setText("<html><center>Diseño de bases de datos");

        javax.swing.GroupLayout basedatosLayout = new javax.swing.GroupLayout(basedatos);
        basedatos.setLayout(basedatosLayout);
        basedatosLayout.setHorizontalGroup(
            basedatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        basedatosLayout.setVerticalGroup(
            basedatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tallerbase.setBackground(new java.awt.Color(117, 117, 117));
        tallerbase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tallerbase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tallerbaseMousePressed(evt);
            }
        });

        jLabel53.setText("<html><center>Taller de bases de datos");

        javax.swing.GroupLayout tallerbaseLayout = new javax.swing.GroupLayout(tallerbase);
        tallerbase.setLayout(tallerbaseLayout);
        tallerbaseLayout.setHorizontalGroup(
            tallerbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        tallerbaseLayout.setVerticalGroup(
            tallerbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        orga.setBackground(new java.awt.Color(117, 117, 117));
        orga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        orga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                orgaMousePressed(evt);
            }
        });

        jLabel49.setText("<html><center>Organización de computadores");

        javax.swing.GroupLayout orgaLayout = new javax.swing.GroupLayout(orga);
        orga.setLayout(orgaLayout);
        orgaLayout.setHorizontalGroup(
            orgaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );
        orgaLayout.setVerticalGroup(
            orgaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
        );

        adminProyec.setBackground(new java.awt.Color(117, 117, 117));
        adminProyec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adminProyec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                adminProyecMousePressed(evt);
            }
        });

        jLabel54.setText("<html><center>Administración de proyectos informáticos");

        javax.swing.GroupLayout adminProyecLayout = new javax.swing.GroupLayout(adminProyec);
        adminProyec.setLayout(adminProyecLayout);
        adminProyecLayout.setHorizontalGroup(
            adminProyecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        adminProyecLayout.setVerticalGroup(
            adminProyecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        paradigmas.setBackground(new java.awt.Color(117, 117, 117));
        paradigmas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paradigmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                paradigmasMousePressed(evt);
            }
        });

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("<html><center>Paradigmas de programación");

        javax.swing.GroupLayout paradigmasLayout = new javax.swing.GroupLayout(paradigmas);
        paradigmas.setLayout(paradigmasLayout);
        paradigmasLayout.setHorizontalGroup(
            paradigmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        paradigmasLayout.setVerticalGroup(
            paradigmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        fundaIngSoft.setBackground(new java.awt.Color(117, 117, 117));
        fundaIngSoft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fundaIngSoft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fundaIngSoftMousePressed(evt);
            }
        });

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("<html><center>Fundamentos de ingeniería de software");

        javax.swing.GroupLayout fundaIngSoftLayout = new javax.swing.GroupLayout(fundaIngSoft);
        fundaIngSoft.setLayout(fundaIngSoftLayout);
        fundaIngSoftLayout.setHorizontalGroup(
            fundaIngSoftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        fundaIngSoftLayout.setVerticalGroup(
            fundaIngSoftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tecnias.setBackground(new java.awt.Color(117, 117, 117));
        tecnias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tecnias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tecniasMousePressed(evt);
            }
        });

        jLabel55.setText("<html><center>Técnicas de ingeniería de software");

        javax.swing.GroupLayout tecniasLayout = new javax.swing.GroupLayout(tecnias);
        tecnias.setLayout(tecniasLayout);
        tecniasLayout.setHorizontalGroup(
            tecniasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        tecniasLayout.setVerticalGroup(
            tecniasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        top3.setBackground(new java.awt.Color(117, 117, 117));
        top3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        top3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                top3MousePressed(evt);
            }
        });

        jLabel61.setText("<html><center>Tópicos de especialidad III");

        javax.swing.GroupLayout top3Layout = new javax.swing.GroupLayout(top3);
        top3.setLayout(top3Layout);
        top3Layout.setHorizontalGroup(
            top3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        top3Layout.setVerticalGroup(
            top3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        eda.setBackground(new java.awt.Color(117, 117, 117));
        eda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        eda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                edaMousePressed(evt);
            }
        });

        jLabel45.setText("<html><center>Análisis de algoritmos y estructura de datos");

        javax.swing.GroupLayout edaLayout = new javax.swing.GroupLayout(eda);
        eda.setLayout(edaLayout);
        edaLayout.setHorizontalGroup(
            edaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        edaLayout.setVerticalGroup(
            edaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        inso.setBackground(new java.awt.Color(117, 117, 117));
        inso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                insoMousePressed(evt);
            }
        });

        jLabel47.setText("<html><center>Informática y sociedad");

        javax.swing.GroupLayout insoLayout = new javax.swing.GroupLayout(inso);
        inso.setLayout(insoLayout);
        insoLayout.setHorizontalGroup(
            insoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        insoLayout.setVerticalGroup(
            insoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        redes.setBackground(new java.awt.Color(117, 117, 117));
        redes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        redes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                redesMousePressed(evt);
            }
        });

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("<html><center>Redes computacionales");

        javax.swing.GroupLayout redesLayout = new javax.swing.GroupLayout(redes);
        redes.setLayout(redesLayout);
        redesLayout.setHorizontalGroup(
            redesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        redesLayout.setVerticalGroup(
            redesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        semina.setBackground(new java.awt.Color(117, 117, 117));
        semina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        semina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                seminaMousePressed(evt);
            }
        });

        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("<html><center>Seminario de computación e informática");

        javax.swing.GroupLayout seminaLayout = new javax.swing.GroupLayout(semina);
        semina.setLayout(seminaLayout);
        seminaLayout.setHorizontalGroup(
            seminaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        seminaLayout.setVerticalGroup(
            seminaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ingles2.setBackground(new java.awt.Color(117, 117, 117));
        ingles2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ingles2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ingles2MousePressed(evt);
            }
        });

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Inglés II");

        javax.swing.GroupLayout ingles2Layout = new javax.swing.GroupLayout(ingles2);
        ingles2.setLayout(ingles2Layout);
        ingles2Layout.setHorizontalGroup(
            ingles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ingles2Layout.setVerticalGroup(
            ingles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        sia.setBackground(new java.awt.Color(117, 117, 117));
        sia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                siaMousePressed(evt);
            }
        });

        jLabel46.setText("<html><center>Sistemas de información");

        javax.swing.GroupLayout siaLayout = new javax.swing.GroupLayout(sia);
        sia.setLayout(siaLayout);
        siaLayout.setHorizontalGroup(
            siaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        siaLayout.setVerticalGroup(
            siaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ingles3.setBackground(new java.awt.Color(117, 117, 117));
        ingles3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ingles3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ingles3MousePressed(evt);
            }
        });

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Inglés III");

        javax.swing.GroupLayout ingles3Layout = new javax.swing.GroupLayout(ingles3);
        ingles3.setLayout(ingles3Layout);
        ingles3Layout.setHorizontalGroup(
            ingles3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ingles3Layout.setVerticalGroup(
            ingles3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ingles4.setBackground(new java.awt.Color(117, 117, 117));
        ingles4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ingles4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ingles4MousePressed(evt);
            }
        });

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Inglés IV");

        javax.swing.GroupLayout ingles4Layout = new javax.swing.GroupLayout(ingles4);
        ingles4.setLayout(ingles4Layout);
        ingles4Layout.setHorizontalGroup(
            ingles4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ingles4Layout.setVerticalGroup(
            ingles4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout mainPanelMallaLayout = new javax.swing.GroupLayout(mainPanelMalla);
        mainPanelMalla.setLayout(mainPanelMallaLayout);
        mainPanelMallaLayout.setHorizontalGroup(
            mainPanelMallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelMallaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelMallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelMallaLayout.createSequentialGroup()
                        .addGroup(mainPanelMallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelMallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelMallaLayout.createSequentialGroup()
                                .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelMallaLayout.createSequentialGroup()
                                .addGroup(mainPanelMallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainPanelMallaLayout.createSequentialGroup()
                                        .addComponent(cal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(electro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ingesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(evalucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sistemasOper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mainPanelMallaLayout.createSequentialGroup()
                                        .addGap(254, 254, 254)
                                        .addGroup(mainPanelMallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(mainPanelMallaLayout.createSequentialGroup()
                                                .addComponent(edecu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(orga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(adminProyec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(mainPanelMallaLayout.createSequentialGroup()
                                                .addComponent(fundeco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(basedatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tallerbase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(mainPanelMallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(top1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(mainPanelMallaLayout.createSequentialGroup()
                                        .addComponent(proyec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(titu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(top2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(mainPanelMallaLayout.createSequentialGroup()
                        .addComponent(alg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(alg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comunicacionEfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelMallaLayout.createSequentialGroup()
                        .addComponent(fis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fis2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ingles1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelMallaLayout.createSequentialGroup()
                        .addComponent(tallDesPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fundaProgra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(paradigmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fundaIngSoft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tecnias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(top3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelMallaLayout.createSequentialGroup()
                        .addComponent(introIng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quimica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(metodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(redes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(semina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelMallaLayout.createSequentialGroup()
                        .addGroup(mainPanelMallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ingles3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelMallaLayout.createSequentialGroup()
                                .addComponent(metEstud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(introIngInfor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(estadis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ingles2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ingles4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        mainPanelMallaLayout.setVerticalGroup(
            mainPanelMallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelMallaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelMallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelMallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(electro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(evalucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sistemasOper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proyec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelMallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelMallaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(alg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelMallaLayout.createSequentialGroup()
                        .addGroup(mainPanelMallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comunicacionEfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(top1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fundeco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(basedatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tallerbase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelMallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelMallaLayout.createSequentialGroup()
                        .addGroup(mainPanelMallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fis2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(top2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edecu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminProyec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelMallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(mainPanelMallaLayout.createSequentialGroup()
                                .addGroup(mainPanelMallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(paradigmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fundaIngSoft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tecnias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(top3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(mainPanelMallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(metodos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(redes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(semina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelMallaLayout.createSequentialGroup()
                                .addComponent(fundaProgra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(quimica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelMallaLayout.createSequentialGroup()
                                .addComponent(tallDesPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(introIng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(mainPanelMallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelMallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(mainPanelMallaLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(metEstud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelMallaLayout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(introIngInfor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelMallaLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(mainPanelMallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(estadis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ingles2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ingles4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(ingles1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ingles3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanelMalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(mainPanelMalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarEstadoAsignatura(Asignatura curso){
        
        if(curso.getEstado().equals("B") && curso.getRequisitos().isEmpty()){
            curso.setEstado("D");
        }
        
        //Proceso para verificar que todos los requisitos del curso estan aprobados o no
        boolean allRequisitosAprobados = true;
        for(Asignatura asig : curso.getRequisitos()) {
            if(!asig.getEstado().equals("A")) {
                allRequisitosAprobados = false; 
            }
        }
        
        if(allRequisitosAprobados && !curso.getEstado().equals("A")){
            curso.setEstado("D");
        }else if(!allRequisitosAprobados && !curso.getEstado().equals("B")){
            curso.setEstado("B");
        }
    }
    
    private void actualizarEstadoTodasLasAsignaturas(){
        for (Asignatura asig : cursos) {
            actualizarEstadoAsignatura(asig);
        }
    }
    
    private void actualizarVisualizacionTodasLasAsignaturas(){
        for (Asignatura asig : cursos) {
            switch (asig.getEstado()){
                case "A":
                    asig.getPanel().setBackground(COLORASIGAPROB);
                    break;
                case "B":
                    asig.getPanel().setBackground(COLORASIGDEFAULT);
                    break;
                case "D":
                    asig.getPanel().setBackground(COLORASIGDISPO);
                    break;
            }
        }
    }
    
    private Asignatura getAsignaturaByName(String name){
        for (Asignatura asig : cursos) {
            if(asig.getNombre().equals(name)) {
                return asig;
            }
        }
        return null;
    }
    
    private void interaccionJPanelConAsignatura(Asignatura curso){
        if(!curso.getEstado().equals("B")){ //caso en que no este bloqueada
            actualizarEstadoTodasLasAsignaturas();
            actualizarVisualizacionTodasLasAsignaturas();
            if(curso.getEstado().equals("D")){
                curso.setEstado("A");
            }else{  //caso que ya este aprobada
                curso.setEstado("D");
            }
            actualizarEstadoTodasLasAsignaturas();
            actualizarVisualizacionTodasLasAsignaturas();
        }
    }
    
    

                            

    
    
    private void cal1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cal1MousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Calculo 1"));
    }//GEN-LAST:event_cal1MousePressed

    private void alg1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alg1MousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Algebra 1"));
    }//GEN-LAST:event_alg1MousePressed

    private void fis1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fis1MousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Fisica 1"));
    }//GEN-LAST:event_fis1MousePressed

    private void tallDesPerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tallDesPerMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Taller desarrollo personal"));
    }//GEN-LAST:event_tallDesPerMousePressed

    private void introIngMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_introIngMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Introduccion a la ingenieria"));
    }//GEN-LAST:event_introIngMousePressed

    private void metEstudMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_metEstudMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Metodos de estudio"));
    }//GEN-LAST:event_metEstudMousePressed

    private void cal2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cal2MousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Calculo 2"));
    }//GEN-LAST:event_cal2MousePressed

    private void fis2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fis2MousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Fisica 2"));
    }//GEN-LAST:event_fis2MousePressed

    private void alg2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alg2MousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Algebra 2"));
    }//GEN-LAST:event_alg2MousePressed

    private void fundaPrograMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fundaPrograMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Fundamentos de programacion"));
    }//GEN-LAST:event_fundaPrograMousePressed

    private void quimicaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quimicaMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Quimica"));
    }//GEN-LAST:event_quimicaMousePressed

    private void introIngInforMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_introIngInforMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Introduccion ingenieria informatica"));
    }//GEN-LAST:event_introIngInforMousePressed

    private void electroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_electroMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Electro"));
    }//GEN-LAST:event_electroMousePressed

    private void comunicacionEfcMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comunicacionEfcMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Comunicacion efectiva"));
    }//GEN-LAST:event_comunicacionEfcMousePressed

    private void ingles1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingles1MousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Ingles 1"));
    }//GEN-LAST:event_ingles1MousePressed

    private void edoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edoMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Ecuaciones diferenciales"));
    }//GEN-LAST:event_edoMousePressed

    private void metodosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_metodosMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Metodos de programacion"));
    }//GEN-LAST:event_metodosMousePressed

    private void estadisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estadisMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Analisis estadistico"));
    }//GEN-LAST:event_estadisMousePressed

    private void ingesisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingesisMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Ingenieria de sistemas"));
    }//GEN-LAST:event_ingesisMousePressed

    private void fundecoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fundecoMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Fundamentos de economia"));
    }//GEN-LAST:event_fundecoMousePressed

    private void edecuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edecuMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Estructura de computadores"));
    }//GEN-LAST:event_edecuMousePressed

    private void paradigmasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paradigmasMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Paradigmas de programacion"));
    }//GEN-LAST:event_paradigmasMousePressed

    private void edaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edaMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Analisis de algoritmos y estructura de datos"));
    }//GEN-LAST:event_edaMousePressed

    private void ingles2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingles2MousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Ingles 2"));
    }//GEN-LAST:event_ingles2MousePressed

    private void evalucionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evalucionMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Evaluacion de proyectos informaticos"));
    }//GEN-LAST:event_evalucionMousePressed

    private void basedatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basedatosMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Disenio base de datos"));
    }//GEN-LAST:event_basedatosMousePressed

    private void orgaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orgaMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Organizacion de computadores"));
    }//GEN-LAST:event_orgaMousePressed

    private void fundaIngSoftMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fundaIngSoftMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Fundamentos de ingenieria de software"));
    }//GEN-LAST:event_fundaIngSoftMousePressed

    private void insoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insoMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Informatica y sociedad"));
    }//GEN-LAST:event_insoMousePressed

    private void siaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siaMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Sistemas de informacion"));
    }//GEN-LAST:event_siaMousePressed

    private void ingles3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingles3MousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Ingles 3"));
    }//GEN-LAST:event_ingles3MousePressed

    private void ingles4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingles4MousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Ingles 4"));
    }//GEN-LAST:event_ingles4MousePressed

    private void redesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redesMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Redes computacionales"));
    }//GEN-LAST:event_redesMousePressed

    private void tecniasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tecniasMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Tecnicas de ingenieria de software"));
    }//GEN-LAST:event_tecniasMousePressed

    private void adminProyecMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminProyecMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Administracion de proyectos informaticos"));
    }//GEN-LAST:event_adminProyecMousePressed

    private void tallerbaseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tallerbaseMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Taller base de datos"));
    }//GEN-LAST:event_tallerbaseMousePressed

    private void sistemasOperMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sistemasOperMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Sistemas operativos"));
    }//GEN-LAST:event_sistemasOperMousePressed

    private void proyecMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proyecMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Proyecto de ingenieria de software"));
    }//GEN-LAST:event_proyecMousePressed

    private void tituMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Trabajo de titulacion"));
    }//GEN-LAST:event_tituMousePressed

    private void top1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_top1MousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Topicos 1"));
    }//GEN-LAST:event_top1MousePressed

    private void top2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_top2MousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Topicos 2"));
    }//GEN-LAST:event_top2MousePressed

    private void top3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_top3MousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Topicos 3"));
    }//GEN-LAST:event_top3MousePressed

    private void seminaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seminaMousePressed
        interaccionJPanelConAsignatura(getAsignaturaByName("Seminario de computacion e informatica"));
    }//GEN-LAST:event_seminaMousePressed

    
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mallaInterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mallaInterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mallaInterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mallaInterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mallaInterScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminProyec;
    private javax.swing.JPanel alg1;
    private javax.swing.JPanel alg2;
    private javax.swing.JPanel basedatos;
    private javax.swing.JPanel cal1;
    private javax.swing.JPanel cal2;
    private javax.swing.JPanel comunicacionEfc;
    private javax.swing.JPanel eda;
    private javax.swing.JPanel edecu;
    private javax.swing.JPanel edo;
    private javax.swing.JPanel electro;
    private javax.swing.JPanel estadis;
    private javax.swing.JPanel evalucion;
    private javax.swing.JPanel fis1;
    private javax.swing.JPanel fis2;
    private javax.swing.JPanel fundaIngSoft;
    private javax.swing.JPanel fundaProgra;
    private javax.swing.JPanel fundeco;
    private javax.swing.JPanel ingesis;
    private javax.swing.JPanel ingles1;
    private javax.swing.JPanel ingles2;
    private javax.swing.JPanel ingles3;
    private javax.swing.JPanel ingles4;
    private javax.swing.JPanel inso;
    private javax.swing.JPanel introIng;
    private javax.swing.JPanel introIngInfor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JPanel mainPanelMalla;
    private javax.swing.JPanel metEstud;
    private javax.swing.JPanel metodos;
    private javax.swing.JPanel n1;
    private javax.swing.JPanel n2;
    private javax.swing.JPanel n3;
    private javax.swing.JPanel n4;
    private javax.swing.JPanel n5;
    private javax.swing.JPanel n6;
    private javax.swing.JPanel n7;
    private javax.swing.JPanel n8;
    private javax.swing.JPanel orga;
    private javax.swing.JPanel paradigmas;
    private javax.swing.JPanel proyec;
    private javax.swing.JPanel quimica;
    private javax.swing.JPanel redes;
    private javax.swing.JPanel semina;
    private javax.swing.JPanel sia;
    private javax.swing.JPanel sistemasOper;
    private javax.swing.JPanel tallDesPer;
    private javax.swing.JPanel tallerbase;
    private javax.swing.JPanel tecnias;
    private javax.swing.JPanel titu;
    private javax.swing.JPanel top1;
    private javax.swing.JPanel top2;
    private javax.swing.JPanel top3;
    // End of variables declaration//GEN-END:variables
}
