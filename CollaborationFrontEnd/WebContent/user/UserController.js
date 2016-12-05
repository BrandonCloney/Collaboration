app.controller('UserController',
				['$scope','UserService','$rootScope','$http',
				function($scope, UserService, $rootScope,$http) {
					console.log("UserController...")
					var self = this;
					self.user = {
								userId : '',
								name : '',
								password : '',
								email : '',
								address : '',
								contact : '',
								status : '',
								reason :'',
								isOnline :'',
								role :'',
							    errorcode : '',
								errormsg : ''
							};
							self.users = [];
		self.fetchAllUsers = function() {
			console.log("fetchAllUsers...")
			UserService
				.fetchAllUsers()
				.then(
					function(d) {
								self.users = d;
								console.log(self.users);
								},
								function(errResponse) {
								console.error('Error while fetching Users');
								});
							};
							

					self.createUser = function(user) {
					console.log("createUser...")
					console.log(user)
						UserService
								.createUser(user)
								.then(
									function(reset)
									{
										self.reset();
									},
									function(errResponse) {
										console.error('Error while creating User.');
										});
							};
							self.reset = function() {
								self.user = {
										userId : '',
										name : '',
										password : '',
										email : '',
										address : '',
										contact : '',
										status : '',
										reason :'',
										isOnline :'',
										role :'',
									    errorcode : '',
										errormsg : ''
								}
							};
				
		}]);
