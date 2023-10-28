package br.com.alverad.anexos_mongo.service.arquivo;

import java.io.IOException;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.gridfs.GridFsResource;
import org.springframework.web.multipart.MultipartFile;

import br.com.alverad.anexos_mongo.dto.arquivo.ArquivoDTO;
import br.com.alverad.anexos_mongo.exceptions.NotFoundException;

public interface ArquivoService {

	public ObjectId salvarArquivo(ArquivoDTO arquivo)
			throws IOException;

	public GridFsResource recuperarArquivo(ObjectId id)
			throws IllegalArgumentException, SecurityException, NotFoundException;

   	public void deleteArquivo(ObjectId id);

}
