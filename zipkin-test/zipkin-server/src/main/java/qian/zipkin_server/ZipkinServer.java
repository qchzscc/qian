package qian.zipkin_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

//@EnableDiscoveryClient
@SpringBootApplication
@EnableZipkinServer
public class ZipkinServer {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServer.class, args);

	}

}
