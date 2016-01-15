'use strict';

angular.module('jjzjhipsterswaggerApp')
    .factory('Register', function ($resource) {
        return $resource('api/register', {}, {
        });
    });


