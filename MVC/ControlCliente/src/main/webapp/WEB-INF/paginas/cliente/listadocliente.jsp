<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="ft" uri="http://java.sun.com/jsp/jstl/functions" %>
<fmt:setLocale value="es-ES" scope="session"/>

<section id="clientes">
    <div class="container">
        <div class="row">
            <div class="col-md-9">
                <div class="card">
                    <div class="card-header">
                        <h4>Listado de Clientes</h4>
                    </div>
                    <table class="table table-striped">
                        <thead class="thead-dark">
                        <th>#</th>
                        <th>Nombre</th>
                        <th>Saldo</th>
                        <th></th>
                        </thead>
                        <tbody>
                            <c:forEach var="cliente" items="${clientes}" varStatus="status">
                                <tr>
                                    <td>${status.count}</td>
                                    <td>${cliente.nombre} ${cliente.apellido}</td>
                                    <td>
                                        <fmt:formatNumber type="currency" value="${cliente.saldo}" /> 
                                    </td>
                                    <td>
                                        <a href="${pageContext.request.contextPath}/ServletControlador?accion=editar&idcliente=${cliente.id_cliente}"
                                           class="btn btn-secondary">
                                            <i class="fas fa-angle-double-right" ></i>Editar
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
            <!-- Targetas de totales-->
            <div class="col-md-3">
                <div class="card text-center text-white bg-danger mb-3">
                    <div class="card-body">
                        <h3>Saldo Total</h3>
                        <h4 class="display-4">
                            <fmt:formatNumber type="currency" value="${saldoTotal}"/>
                        </h4>
                    </div>
                </div>
                <div class="card text-center text-white bg-success mb-3">
                    <div class="card-body">
                        <h3>Total Clientes</h3>
                        <h4 class="display-4">
                            <i class="fas fa-users"></i> ${totalClientes}
                        </h4>
                    </div>
                </div>                           
            </div>            
            <!-- Targetas de totales-->            
        </div>
    </div>
</section>
                        
<!-- agregar formulario agregarlciente -->
<jsp:include page="/WEB-INF/paginas/cliente/agregarcliente.jsp"/>