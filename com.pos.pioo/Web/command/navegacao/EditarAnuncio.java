package command.navegacao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.NavegacaoCommand;

public class EditarAnuncio implements NavegacaoCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {

			RequestDispatcher d = request.getRequestDispatcher("/Anuncios/EditarAnuncio.jsp");
			d.forward(request,response);

		} catch (IOException | ServletException e) {
			e.printStackTrace();
		}
	}

}