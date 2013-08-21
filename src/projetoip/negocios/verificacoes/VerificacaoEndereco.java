package projetoip.negocios.verificacoes;

import projetoip.dados.classesbase.Endereco;
import projetoip.negocios.excecoes.endereco.BairroVazioException;
import projetoip.negocios.excecoes.endereco.CidadeVaziaException;
import projetoip.negocios.excecoes.endereco.LogradouroVazioException;

public class VerificacaoEndereco {
	private Endereco endereco;
	
	public VerificacaoEndereco(Endereco endereco){
		this.endereco= endereco;
	}
	
	public boolean verificar() throws BairroVazioException, CidadeVaziaException, LogradouroVazioException{
		if(endereco.getBairro().equals("")){
			throw new BairroVazioException();
		}else if(endereco.getCidade().equals("")){
			throw new CidadeVaziaException();
		}else if(endereco.getLogradouro().equals("")){
			throw new LogradouroVazioException();
		}else if(endereco.getNumero().equals("")){
			throw new LogradouroVazioException();
		}
		return true;
	}
}
