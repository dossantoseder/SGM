<%-- 
    Document   : ConsultarCidMedico
    Created on : Jun 2, 2016, 8:12:25 AM
    Author     : Logan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Sistema de Gestão Médica</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/bootstrap.css">
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="js/bootstrap.min.js"></script>
        <link href="assets/css/custom.css" rel="stylesheet" />
        <style>
            /* Remove the navbar's default margin-bottom and rounded borders */ 
            .navbar {
                margin-bottom: 0;
                border-radius: 0;

            }
        </style>

        <title>Médico</title>
    </head>
    <body>
        <nav class="navbar navbar-inverse" style="min-height: 135px">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#"><img  src="Imagens/logoResized.png" alt=""> </a>
                </div>
                <div class="container" id="divMenuConsultarAluno" style="padding-top: 1cm">
                    <ul class="nav navbar-nav">
                        <li> <a href="Inicio.jsp" style="color:#FFFFFF; font-size: x-large">Sobre</a></li>
                        <li> <a href="servicos.jsp" style="color:#FFFFFF; font-size: x-large">Serviços</a></li>
                        <li> <a href="faleConosco.jsp" style="color:#FFFFFF; font-size: x-large">Contatos</a></li>
                    </ul>
                </div>
                <ul class="nav navbar-nav navbar-right" style="padding-top: 0.5cm">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="color:#FFFFFF; font-size: x-large">Médico</a>
                    <ul class="dropdown-menu">
                        <li><a href="Inicio.jsp"><span class="glyphicon glyphicon-log-out"></span>Sair</a></li>
                    </ul>   
                </ul>
            </div>
        </nav>
        <div class="jumbotron">
            <div class="container text-center">
                <p>Consultar CID</p>
            </div>
            <div class="container">
                <form action="ConsultarSaldoAluno" method="post"> 
                  <%-- <% Aluno CIDRespons = (Aluno) request.getAttribute("CIDRespons");%> --%>
                    <div class="form-group row">
                        <label for="txtMatricula" class="col-sm-2 form-control-label">CID para consulta</label>
                        <div class="col-sm-3">
                            <input type="text" class="form-control" name="txtMatricula">
                        </div>
                    </div>                                        
                    <div class="form-group row">
                        <label for="txtSaldoAluno" class="col-sm-2 form-control-label">Saldo do Aluno</label>
                      <%--    <div class="col-sm-3">
                        <%if (alunoRespons != null) {%>   
                            <input type="text" class="form-control" readonly="true" value="<%=alunoRespons.getSaldo()%>" name="txtSaldoAluno">
                        <% } %>
                        </div>    --%>                     
                    </div>                    
                    <button type="submit" class="btn btn-warning">Consultar</button>
                </form>
            </div>
        </div>
        <footer class="container-fluid text-center">
            <p>SGM- Sistema de Gestão Médica, Copyright © 2016 </p>
        </footer>
    </body>
</html>
