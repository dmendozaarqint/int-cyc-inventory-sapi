package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Fabrica
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-21T18:18:42.188344480Z[GMT]")


public class Fabrica   {
  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("pagina_web")
  private String paginaWeb = null;

  @JsonProperty("phone")
  private String phone = null;

  public Fabrica nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
   **/
  @Schema(example = "ACME Corporation", description = "")
  
    public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Fabrica paginaWeb(String paginaWeb) {
    this.paginaWeb = paginaWeb;
    return this;
  }

  /**
   * Get paginaWeb
   * @return paginaWeb
   **/
  @Schema(example = "https://www.acme-corp.com", description = "")
  
    public String getPaginaWeb() {
    return paginaWeb;
  }

  public void setPaginaWeb(String paginaWeb) {
    this.paginaWeb = paginaWeb;
  }

  public Fabrica phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   **/
  @Schema(example = "55-15-53-09", description = "")
  
    public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fabrica fabrica = (Fabrica) o;
    return Objects.equals(this.nombre, fabrica.nombre) &&
        Objects.equals(this.paginaWeb, fabrica.paginaWeb) &&
        Objects.equals(this.phone, fabrica.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre, paginaWeb, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fabrica {\n");
    
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    paginaWeb: ").append(toIndentedString(paginaWeb)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
