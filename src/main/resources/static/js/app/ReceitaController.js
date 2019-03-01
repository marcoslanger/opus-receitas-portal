'use strict'

var module = angular.module('opusreceitas.controllers', []);
module.controller("ReceitaController", [ "$scope", "ReceitaService",
		function($scope, ReceitaService) {

			$scope.receitaDto = {
				id : null,
				nome : null,
				caloria:null,
				preparo: null,
				ingredientes: null
			};
			$scope.ingredientes = [];
			
			ReceitaService.listarIngredientes().then(function(value) {
				$scope.ingredientesDto= value.data;
			}, function(reason) {
				console.log("error occured");
			}, function(value) {
				console.log("no callback");
			});
			


			$scope.criarReceita = function() {
				console.log("criarReceita");
				$scope.receitaDto.ingredientes = $("#ingredienteHidden").val();
				
				ReceitaService.criarReceita($scope.receitaDto).then(function() {
					console.log("works");						

					$scope.receitaDto = {
							id : null,
							nome : null,
							caloria:null,
							preparo: null,
							ingredientes: null
						};	
					
				}, function(reason) {
					console.log("error occured");
				}, function(value) {
					console.log("no callback");
				});
			}
			
			
			$scope.listarReceitas = function() {
				console.log("listar");	
				
				$scope.receitaDto = {
						id : null,
						nome : null,
						caloria:null,
						preparo: null,
						ingredientes: null
					};
				
				ReceitaService.listarReceitas().then(function(value) {					
					$scope.receitaDto = value.data;	
					
				}, function(reason) {
					console.log("error occured");
				}, function(value) {
					console.log("no callback");
				});
			
			}
			
			$scope.guardarIngrediente = function() {
				console.log($("#selectReceita").val());
				$("#ingredienteHidden").val($("#selectReceita").val());
				var conteudo = $("#ingredienteHidden").val().replace(/\,/g, ';');
				$("#ingredienteHidden").val(conteudo);
				console.log("hidden " + $("#ingredienteHidden").val());
			}
			
			
			$scope.obterReceita = function(id) {			
				console.log("listar unica receita " + id);
				ReceitaService.getReceitaById(id).then(function(value) {
					console.log(value.data);
					$scope.receitaDto = value.data;	
					
				}, function(reason) {
					console.log("error occured");
				}, function(value) {
					console.log("no callback");
				});
			}
			
			
		} ]);