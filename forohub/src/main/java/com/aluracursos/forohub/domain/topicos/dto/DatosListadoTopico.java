package com.aluracursos.forohub.domain.topicos.dto;

import com.aluracursos.forohub.domain.topicos.Topico;

import java.time.LocalDateTime;

public record DatosListadoTopico(

        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        String estado,
        String autor,
        String curso

) {

    public DatosListadoTopico(Topico topico) {

        this(topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion(),
                topico.getEstado(), topico.getAutor(), topico.getCurso());

    }

}