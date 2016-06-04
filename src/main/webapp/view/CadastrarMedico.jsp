
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

        <title>Médico</title>
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
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="color:#FFFFFF; font-size:x-large">Médico</a>
                    <ul class="dropdown-menu">
                        <li><a href="#"><span class="glyphicon glyphicon-user"></span>Perfil</a></li>  
                        <li><a href="Inicio.jsp"><span class="glyphicon glyphicon-log-out"></span>Sair</a></li>
                    </ul>   
                </ul>
            </div>
        </nav>
        <div class="jumbotron">
            <div class="container text-center">
                <p>Cadastrar Médico</p>
            </div>
            <div class="container">
                <form name="cadastrarMedico" action="Servlet.Controller" method="post">  
                    <input type="hidden" name="action" value="CadastrarMedicoCommand" />
                    <div class="form-group row ">
                        <div class="col-md-7">            
                            <label for="txtNome" class="col-sm-2 form-control-label">Nome</label>
                            <div class="col-sm-8">
                                <input type="text" maxlength="25" class="form-control" name="txtNome">
                            </div>                        
                        </div>
                    </div>
                    <div class="form-group row ">
                        <div class="col-md-7">            
                            <label for="txtEspecialidade" class="col-sm-2 form-control-label">Especialidade</label>
                            <div class="col-sm-4">
                                <input type="text" maxlength="9" class="form-control" name="txtEspecialidade">
                            </div>                        
                        </div>  
                    </div>
                    <div class="form-group row">
                        <div class="col-md-7">            
                            <label for="txtCrm" class="col-sm-2 form-control-label">CRM</label>
                            <div class="col-sm-2">
                                <input type="text" maxlength="9" class="form-control" name="txtCrm">
                            </div>                        
                        </div>
                    </div>  
                     <div class="form-group row">
                        <div class="col-md-7">            
                            <label for="txtTelefone" class="col-sm-2 form-control-label">Telefone</label>
                            <div class="col-sm-2">
                                <input type="text" maxlength="9" class="form-control" name="txtTelefone">
                            </div>                        
                        </div>
                    </div>      
                    <button type="submit" class="btn btn-warning">Cadastrar</button>
                </form>
            </div>
        </div>
        <footer class="container-fluid text-center">
            <p>SCE- Sistema de Gestão Médica, Copyright © 2016 </p>
        </footer>
    </body>
</html>



