

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

        <title>Funcionário</title>
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
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="color:#FFFFFF; font-size:x-large">Funcionário</a>
                    <ul class="dropdown-menu">
                        <li><a href="#"><span class="glyphicon glyphicon-user"></span>Perfil</a></li>  
                        <li><a href="Inicio.jsp"><span class="glyphicon glyphicon-log-out"></span>Sair</a></li>
                    </ul>   
                </ul>
            </div>
        </nav>
        <div class="jumbotron">
            <div class="container text-center">
                <p>Atualização de Dados do Paciente</p>
            </div>
            <div class="container">
                <form action="AtualizarPacienteControl" method="post">  
                    <div class="form-group row ">
                        <div class="col-md-6">            
                            <label for="txtNome" class="col-sm-2 form-control-label">Nome</label>
                            <div class="col-sm-6">
                                <input type="text" maxlength="25" value="<%=request.getParameter("nome")%>" class="form-control" name="txtNome">
                            </div>                        
                        </div>
                        <div class="col-md-6">
                            <label for="txtRg" class="col-sm-2 form-control-label">RG</label>
                            <div class="col-sm-4">
                                <input  type="text"  value="<%=request.getParameter("rg")%>" class="form-control" name="txtRg">
                            </div>
                        </div>
                    </div>
                    <div class="form-group row ">
                        <div class="col-md-6">            
                            <label for="txtEmail" class="col-sm-2 form-control-label">Email</label>
                            <div class="col-sm-6">
                                <input type="text" maxlength="9" value="<%=request.getParameter("email")%>" class="form-control" name="txtEmail">
                            </div>                        
                        </div>
                        <div class="col-md-6">            
                            <label for="txtCpf" class="col-sm-2 form-control-label">CPF</label>
                            <div class="col-sm-4">
                                <input type="text" maxlength="11"  class="form-control" name="txtCpf">
                            </div>                        
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="col-md-6">            
                            <label for="txtTelefone" class="col-sm-2 form-control-label">Telefone</label>
                            <div class="col-sm-6">
                                <input type="text" maxlength="9" value="<%=request.getParameter("telefone")%>" class="form-control" name="txtTelefone">
                            </div>                        
                        </div>
                        <div class="col-md-6">            
                            <label for="txtSenha" class="col-sm-2 form-control-label">Senha</label>
                            <div class="col-sm-4">
                                <input type="text" maxlength="9" class="form-control" name="txtSenha">
                            </div>                        
                        </div>
                    </div>
                    <div class="form-group row"> 
                        <div class="col-md-6">            
                            <label for="txtLogin" class="col-sm-2 form-control-label">Login</label>
                            <div class="col-sm-4">
                                <input type="text" maxlength="9" class="form-control" name="txtLogin">
                            </div>                        
                        </div>              
                    </div>               
                    <button type="submit" class="btn btn-warning">Cadastar</button>
                </form>
            </div>
        </div>
        <footer class="container-fluid text-center">
            <p>SCE- Sistema de Gestão Médica, Copyright © 2016 </p>
        </footer>
    </body>
</html>
