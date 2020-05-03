<div class="modal fade" id="agregarclientemodal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header bg-info text-white">
                <h5 class="modal-title">
                    Agregar Cliente
                </h5>
                <button class="close" data-dismiss="modal">
                    <span>
                        <i class="fas fa-window-close"></i>
                    </span>
                </button>
            </div>
            
            
            <form action="${pageContext.request.contextPath}/ServletControlador?accion=insertar" method="POST">
                <div class="modal-body" class="was-validated">
                    <div class="form-group">
                        <label for="nombre">Nombre</label>
                        <input type="text" name="nombre" class="form-control" required/>                               
                    </div>
                    <div class="form-group">
                        <label for="apellido">Apellido</label>
                        <input type="text" name="apellido" class="form-control" required/>                               
                    </div>
                    <div class="form-group">
                        <label for="email">Email</label>
                        <input type="email" name="email" class="form-control" required/>                               
                    </div>
                    <div class="form-group">
                        <label for="telefono">Telefono</label>
                        <input type="tel" name="telefono" class="form-control" required/>                               
                    </div>
                    <div class="form-group">
                        <label for="saldo">Saldo</label>
                        <input type="number" name="saldo" class="form-control" required step="any"/>                               
                    </div>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="submit"><i class="far fa-save"></i></button>
                </div>
            </form>
            
        </div>
    </div>
</div>
