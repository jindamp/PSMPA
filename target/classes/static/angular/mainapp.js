var psmpa = angular.module("psmpa", ['ui.router']);

psmpa.config(function ($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise('/home');

    $stateProvider

    // HOME STATES AND NESTED VIEWS ========================================
        .state('home', {
            url: '/home',
            templateUrl: '../page-starter.html',
            controller: 'homeController'
        })

        // ABOUT PAGE AND MULTIPLE NAMED VIEWS =================================
        .state('patient', {
            url: '/patient',
            templateUrl: '../page-starter.html',
            controller: "patientController"
        })

        .state('patient.selectProvider', {
            url: '/selectProvider',
            templateUrl: '../ProvidersList.html',
            controller: "patientController"
        });

})