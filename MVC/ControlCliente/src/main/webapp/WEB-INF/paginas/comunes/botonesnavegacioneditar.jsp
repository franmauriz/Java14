<section id="actions" class="py-4 mb-4 bg-light">
    <div class="container">
        <div class="row">
            <div class="col-md-3">
                <a href="index.jsp" class="btn btn-light btn-block">
                    <i class="fas fa-arrow-left"></i> Inicio
                </a>
            </div>
            <div class="col-md-3">
                <button class="btn btn-success btn-block" type="submit">
                    <i class="fas fa-check"></i> Guardar
                </button>
            </div>
             <div class="col-md-3">
                 <a href="${pageContext.request.contextPath}/ServletControlador?accion=eliminar&idcliente=${editcliente.id_cliente}"
                    class="btn btn-danger btn-block">
                    <i class="fas fa-user-minus"></i> Eliminar
                </a>
            </div>
        </div>
    </div>
</section>
