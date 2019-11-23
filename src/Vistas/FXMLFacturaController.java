package Vistas;

import Modelos.ElementoCarrito;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;

import Modelos.Factura;
import Modelos.Sistema;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLFacturaController implements Initializable {

    private Factura fact;
    private Sistema sis;
    @FXML
    private Label lblCliente;
    @FXML
    private Label lblMonto;
    @FXML
    private Label lblEmitido;
    @FXML
    private Label lblEntrega;

    @FXML
    public void handleClickImprimir(ActionEvent event) {
        Document document = new Document(PageSize.A4);
        document.addAuthor("EcoFood");
        document.addTitle("Demostracion");
        try {
            PdfWriter.getInstance(document, new FileOutputStream("pdf/holi.pdf "));
            document.open();

            Paragraph pInformacionHeader = new Paragraph("EcoFood tienda online \n\n Tel: 1234 6789 \n e-Ticket \n\n Consumo final \n\n");

            DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            Paragraph pFechaEmision = new Paragraph("Fecha de Emisión: " + formatoFecha.format(this.fact.getFechaEmision()));

            DateFormat formatoHora = new SimpleDateFormat("HH:mm");
            Paragraph pHoraEmision = new Paragraph("Hora de Emisión: " + formatoHora.format(this.fact.getFechaEmision()));

            document.add(pInformacionHeader);
            document.add(pFechaEmision);
            document.add(pHoraEmision);
            document.add(Chunk.NEWLINE);
            for (ElementoCarrito el : this.fact.getProductos()) {
                Paragraph pProducto = new Paragraph(el.getAlimento().getNombre() + " x" + el.getUnidades() + " " + (el.getAlimento().getPrecio() * el.getUnidades()));
                Paragraph pEnvase = new Paragraph("\t Envase: " + (el.getCompostable() ? "Compostable" : "Reutilizable"));
                document.add(pProducto);
                document.add(pEnvase);
                document.add(Chunk.NEWLINE);
            }
            Paragraph pTotal = new Paragraph("Total: " + Integer.toString(this.fact.getMontoTotal()));
            Paragraph pFechaEntrega = new Paragraph("");
            Paragraph pHoraEntrega = new Paragraph("");
            document.add(pTotal);
            document.add(Chunk.NEWLINE);
            document.add(pFechaEntrega);
            document.add(pHoraEntrega);
            document.add(Chunk.NEWLINE);
            document.add(new Paragraph("Gracias por su compra"));
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            document.close();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void setFactura(Factura f) {
        this.fact = f;
    }

    public void setSistema(Sistema sis) {
        this.sis = sis;
    }

    public void cargarDatos() {
        lblCliente.setText(this.fact.getUsuario().getNombre());
        lblMonto.setText(Integer.toString(this.fact.getMontoTotal()));
        lblEmitido.setText(this.sis.getFormat().format(this.fact.getFechaEmision()));
        lblEntrega.setText(this.sis.getFormat().format(this.fact.getFechaEntrega()));
    }
}
