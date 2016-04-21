package br.com.sgm.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	String executa(HttpServletRequest req, HttpServletResponse res) throws Exception;
}
