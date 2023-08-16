package alveradkatsuro.com.br.anexos_mongo.service.arquivo;

import java.io.IOException;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.gridfs.GridFsResource;
import org.springframework.web.multipart.MultipartFile;

import alveradkatsuro.com.br.anexos_mongo.dto.arquivo.ArquivoDTO;
import alveradkatsuro.com.br.anexos_mongo.exceptions.NotFoundException;

public interface ArquivoService {

	public ObjectId salvarArquivo(ArquivoDTO arquivo)
			throws IOException;

	public ObjectId salvarArquivo(ObjectId id, Optional<String> nome, MultipartFile arquivo)
			throws IOException;

	public ObjectId salvarArquivo(Optional<String> nome, MultipartFile arquivo)
			throws IOException;

	public ObjectId salvarArquivo(MultipartFile arquivo)
			throws IOException;

	public GridFsResource recuperarArquivo(ObjectId id)
			throws IllegalArgumentException, SecurityException, NotFoundException;

}
