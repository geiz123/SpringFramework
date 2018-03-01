angular.module('hello', []).controller('home', function($scope, $http) {
//	$http.get('/resource/').success(function(data) {
//		$scope.greeting = data;
//	})
	$http.get('/resource/').
	then(function(data) {
		$scope.greeting = data;
	}).
	catch (function(e){
		console.log("error: ", e);
	})
});
