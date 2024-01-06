function fn() {
	var env = karate.env;

	if (!env) {
		env = 'qa';
	}

	var config = {
	
	}

	/* -------------------------- SETTINGS -------------------------- */

	config.ambiente = karate.call('demoblaze/core/environment/config-' + env + '.js');

	karate.log('karate.env system property was:', env);

	return config;
}
