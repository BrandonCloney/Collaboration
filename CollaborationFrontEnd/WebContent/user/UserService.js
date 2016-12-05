app.factory('UserService', ['$http', '$q','$rootScope', 
                            function($http, $q,$rootScope){
	console.log("UserService...")
	
	var BASE_URL='http://localhost:8088/CollaborationBackEnd'
		return {
        
        fetchAllUsers: function() {
        	console.log("calling fetchAllUsers ")
                return $http.get(BASE_URL+'/user')
                        .then(
                                function(response){
                                    return response.data;
                                }, 
                                function(errResponse){
                                    console.error('Error while fetching UserDetailss');
                                    return $q.reject(errResponse);
                                }
                        );
        },
        createUser: function(user){
        	console.log("calling create user")
                return $http.post(BASE_URL+'/user', user)
                        .then(
                                function(response){
                                    return response.data;
                                }, 
                                function(errResponse){
                                    console.error('Error while registering');
                                    return $q.reject(errResponse);
                                }
                        );
        }
	};
}]);