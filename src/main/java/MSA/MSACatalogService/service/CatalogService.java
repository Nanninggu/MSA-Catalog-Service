package MSA.MSACatalogService.service;

import MSA.MSACatalogService.jpa.CatalogEntity;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}
