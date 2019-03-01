'use strict'

angular.module('opusreceitas.services', []).factory('ReceitaService',
		[ "$http", "CONSTANTS", function($http, CONSTANTS) {
			var service = {};
			service.getReceitaById = function(id) {
				var url = CONSTANTS.getReceitaById + id;
				return $http.get(url);
			}
			service.criarReceita = function(receitaDto) {
				return $http.post(CONSTANTS.criarReceita, receitaDto);
			}
			service.listarIngredientes = function() {
				return $http.get(CONSTANTS.getAllIngredientes);
			}
			service.listarReceitas= function() {
				return $http.get(CONSTANTS.getAllReceitas);
			}
			return service;
		} ]);