'use strict'

var opusreceitasApp = angular.module('opusreceitas', [ 'ui.bootstrap', 'opusreceitas.controllers',
		'opusreceitas.services' ]);
opusreceitasApp.constant("CONSTANTS", {
	getReceitaById : "receitas/",
	getAllReceitas : "receitas",
	getAllIngredientes : "ingredientes",
	criarReceita : "receita"
});