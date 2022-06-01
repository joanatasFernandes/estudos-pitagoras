module com.example.trabalhofinal {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.web;

	requires org.controlsfx.controls;
	requires com.dlsc.formsfx;
	requires validatorfx;
	requires org.kordamp.ikonli.javafx;
	requires org.kordamp.bootstrapfx.core;
	requires java.sql;
	requires mysql.connector.java;

	exports com.example.trabalhofinal.controller.delegate;
	opens com.example.trabalhofinal to javafx.fxml;
	exports com.example.trabalhofinal;
	exports com.example.trabalhofinal.controller;
	opens com.example.trabalhofinal.controller to javafx.fxml;
	exports com.example.trabalhofinal.util;
	exports com.example.trabalhofinal.component;
	exports com.example.trabalhofinal.component.facoty;
	exports com.example.trabalhofinal.model;
	exports com.example.trabalhofinal.component.cardapio;
	exports com.example.trabalhofinal.component.usuario;
	exports com.example.trabalhofinal.component.mesa;
	exports com.example.trabalhofinal.component.menu;
	exports com.example.trabalhofinal.component.pedido;
	exports com.example.trabalhofinal.component.logout;

}
