package com.nosqlmanager.repository;

import com.nosqlmanager.model.JsonDocument;

import java.util.List;
import java.util.Optional;

/**
 * Interfaz que define las operaciones CRUD para documentos JSON.
 */
public interface JsonRepository {

    /**
     * Guarda un nuevo documento o actualiza uno existente.
     * @param document Documento a guardar.
     */
    void save(JsonDocument document);

    /**
     * Busca un documento por su clave principal.
     * @param id Clave principal del documento.
     * @return Optional con el documento si existe, vacío si no.
     */
    Optional<JsonDocument> findById(String id);

    /**
     * Obtiene todos los documentos almacenados.
     * @return Lista de documentos.
     */
    List<JsonDocument> findAll();

    /**
     * Elimina un documento por su clave principal.
     * @param id Clave principal del documento a eliminar.
     * @return true si se eliminó, false si no existía.
     */
    boolean deleteById(String id);

    /**
     * Verifica si existe un documento con la clave dada.
     * @param id Clave principal.
     * @return true si existe, false si no.
     */
    boolean existsById(String id);
}
