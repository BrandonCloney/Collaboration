var app=angular.module('myApp',['ngRoute']);

app.config(["$routeProvider",function($routeProvider)
{
	$routeProvider
	
	.when('/login',{
		templateUrl:'user/login.html',
		
	})
	
	.when('/signup',{
		templateUrl:'user/signUp.html',
	})
	.when('/listusers',{
		templateUrl:'user/users.html',
	})
	
	.otherwise({redirectTo:'/login'})
	}])
