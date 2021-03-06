var app = angular.module('deportes', [ "ngResource" ]);

app.controller('JerarquiaController', [ '$scope', '$window','$http',

	function($scope, $window, $http) {
		var url = 'http://localhost:8080';
		$scope.getDeportes = function() {
			$http.get(url+'/jerarquia').success(function(data) {
				$scope.deportes = data;
			});
		}
		
		$scope.addDeporte = function() {
			$http.post(url+'/jerarquia', 
				{
					nombre : $scope.nombre
				}
			).success(function(data) {
				$scope.msg = 'Pelicula creada correctamente';
				$scope.getDeportes();
			}).error(function(data) {
				$scope.msg = 'Se ha producido un error';
			});
		}
		
		$scope.mostrarEquipo=function(obj){
			return obj.abrir && obj.lstEquipos!=null && obj.lstEquipos.length;
		}
		
		$scope.mostrarDeportista=function(obj){
			return obj.abrir && obj.lstDeportistas!=null && obj.lstDeportistas.length;
		}

		$scope.goto = function(ventana){
			console.log($scope.ventana);
			$scope.ventana=ventana;
			console.log($scope.ventana);
		}

		$scope.calendario = new Object();
		$scope.calendario.mes = [];
		$scope.calendario.semana =['L','M','X','J','V','S','D'];
		$scope.initMes = function(mes){
			//TODO: obtener el mes del parametro
			for(var i=0;i<31;i++){
				$scope.calendario.mes.push(i);
			}
		};
		$scope.deportes=deportes;
} ]);