package com.delfinasilva.projecto_java.model;

import jakarta.persistence.*;

@Entity
public class Projecto {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String titulo;
        private String descricao;
        private String link;
        private String tecnologias;

//Getter e Setters
        public Long getId()
        {
            return id;
        }
        public void setId(Long id)
        {
            this.id = id;
        }
        public String getTitulo()
        {
            return titulo;
        }
        public void setTitulo(String titulo)
        {
            this.titulo = titulo;
        }
        public String getDescricao()
        {
            return descricao;
        }
        public void setDescricao(String descricao)
        {
            this.descricao=descricao;
        }
        public String getLink()
        {
            return link;
        }
        public void setLink(String link)
        {
            this.link = link;
        }
        public String getTecnologias()
        {
            return tecnologias;
        }
        public void setTecnologias(String tecnologias)
        {
            this.tecnologias = tecnologias;
        }
}