/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cass
 */
public class Procesos {
    
    public void calcular(Datos d) {
        // 1. Calcular costo base
        d.setCostoBase(d.getDias() * d.getPrecioPorDia());

        // 2. Calcular cargo por seguro según el costo base
        if (d.getCostoBase() <= 300) {
            d.setCargoSeguro(d.getCostoBase() * 0.10); // 10%
        } else {
            d.setCargoSeguro(d.getCostoBase() * 0.07); // 7%
        }

        // 3. Calcular subtotal
        d.setSubtotal(d.getCostoBase() + d.getCargoSeguro());

        // 4. Calcular descuento según el tipo de cliente
        if (d.getTipoCliente().equalsIgnoreCase("Regular")) {
            d.setDescuento(d.getSubtotal() * 0.04); // 4%
        } else if (d.getTipoCliente().equalsIgnoreCase("Preferencial")) {
            d.setDescuento(d.getSubtotal() * 0.08); // 8%
        } else {
            d.setDescuento(0);
        }

        // 5. Calcular total a pagar
        d.setTotalPagar(d.getSubtotal() - d.getDescuento());
    }
}
