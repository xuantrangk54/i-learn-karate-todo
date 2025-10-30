function fun () {
    karate.log ("load karate configjs")
    var env = karate.env || 'dev';
    var config = {
        baseUrl: 'http://123.24.14.240:8081'
    }
    if (env == 'staging') {
        baseUrl: 'http://123.24.14.240:8081'
    }
    karate.log ('Running tests in environment: ', env);
    return config;
}