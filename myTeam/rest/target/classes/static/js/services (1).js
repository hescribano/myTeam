var app = angular.module('deportes', [ "ngResource" ]);

app.controller('JerarquiaController', [ '$scope', '$http',
                                     
	function($scope, $http) {
		$scope.getDeportes = function() {
			$http.get('/jerarquia').success(function(data) {
				$scope.films = data;
			});
		}
		
		$scope.addDeporte = function() {
			$http.post('/jerarquia', 
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
} ]);