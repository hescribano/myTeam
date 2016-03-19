/* <!--
	Desarrollado por Hugo Escribano como parte del TFG en la Universidad Internacional de la Rioja
    Licencia GNU General Public License v3.0
-->*/
var app = angular.module('deportes', [ "ngResource" ]);

app.controller('JerarquiaController', [ '$scope', '$http',
                                     
	function($scope, $http) {
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
} ]);