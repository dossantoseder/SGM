<%-- 
    Document   : MarcarConsultaPaciente
    Created on : Jun 1, 2016, 9:04:33 PM
    Author     : Logan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Sistema de Gestão Médica</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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

        <title>Funcionários</title>
    </head>
    <body>
        <nav class="navbar navbar-inverse" style="min-height: 135px">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#"><img  src="Imagens/logoResized.png" alt=""></a>
                </div>
                <div class="container" id="divMenu" style="padding-top: 1cm">
                    <ul class="nav navbar-nav">
                        <li> <a href="Inicio.jsp" style="color:#FFFFFF; font-size: x-large">Sobre</a></li>
                        <li> <a href="servicos.jsp" style="color:#FFFFFF; font-size: x-large">Serviços</a></li>
                        <li> <a href="faleConosco.jsp" style="color:#FFFFFF; font-size: x-large">Contatos</a></li>
                    </ul>
                </div>
                <ul class="nav navbar-nav navbar-right" style="padding-top: 0.5cm">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="color:#FFFFFF; font-size:x-large">Cliente</a>
                    <ul class="dropdown-menu">
                        <li><a href="#"><span class="glyphicon glyphicon-user"></span>Perfil</a></li>  
                        <li><a href="Inicio.jsp"><span class="glyphicon glyphicon-log-out"></span>Sair</a></li>
                    </ul>   
                </ul>
            </div>
        </nav>
        <div class="jumbotron">
            <div class="container text-center">
                <p>Marcar Consulta</p>
            </div>
            <div class="container">
                <form action="CadastroResponsavel" method="post">  
                    <div class="form-group row">
                        <div class="col-md-6">
                            <label for="txtNomePaciente" class="col-sm-2 form-control-label">Nome</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" name="txtNomePaciente">
                            </div>
                        </div>
                        <div class="col-md-6">
                            <label for="txtCpfPaciente" class="col-sm-2 form-control-label">CPF</label>
                            <div class="col-sm-4">
                                <input type="text" maxlength="11"  class="form-control" name="txtCpfPaciente" >
                            </div>
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="col-md-6">
                            <label for="txtEmailPaciente" class="col-sm-2 form-control-label">Email</label>
                            <div class="col-sm-6">
                                <input type="email" class="form-control" name="txtEmailPaciente">
                            </div>
                        </div>
                        <div class="col-md-6">
                            <label for="txtDataConsulta" class="col-sm-2 form-control-label">Data da Consulta</label>
                            <div class="col-sm-4">
                                <input type="text" maxlength="10" class="form-control" name="txtDataConsulta">
                            </div>
                        </div>
                    </div>
                    <div class="form-group row ">
                        <div class="col-md-6">            
                            <label for="txtLocalidade" class="col-sm-2 form-control-label">Local do Atendimento</label>
                            <div class="col-sm-6">
                                <input type="text" maxlength="9" class="form-control" name="txtLocalidade">
                            </div>                        
                        </div>
                        <div class="col-md-6">
                            <label for="txtTelPaciente" class="col-sm-2 form-control-label">Telefone</label>
                            <div class="col-sm-4">
                                <input type="text" maxlength="9" class="form-control" name="txtTelPaciente">
                            </div>
                        </div> 
                    </div>
                    <div class="row">
                        <div class="col-md-6">            
                            <label for="txtEspecialidade" class="col-sm-2 form-control-label">Especialidade</label>
                            <div class="col-sm-6">
                                <input type="text" maxlength="9" class="form-control" name="txtEspecialidade">
                            </div>                        
                        </div>
                    </div>               
                    <button type="submit" class="btn btn-warning">Marcar</button>
                </form>
            </div>
        </div>
        <footer class="container-fluid text-center">
            <p>SCE- Sistema de Gestão Médica, Copyright © 2016 </p>
        </footer>
    </body>
</html>

