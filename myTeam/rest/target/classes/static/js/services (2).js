var app = angular.module('films', [ "ngResource" ]);

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
					title : $scope.title,
					year : $scope.year,
					director : $scope.director
				}
			).success(function(data) {
				$scope.msg = 'Pelicula creada correctamente';
				$scope.getFilms();
			}).error(function(data) {
				$scope.msg = 'Se ha producido un error';
			});
		}
} ]);