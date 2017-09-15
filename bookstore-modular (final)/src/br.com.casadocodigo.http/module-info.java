module br.com.casadocodigo.http {
	exports br.com.casadocodigo.data;
	requires jdk.incubator.httpclient;
	requires static br.com.casadocodigo.domain;
}