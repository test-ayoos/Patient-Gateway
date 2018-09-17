/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytatech.ayoos.patientapigateway.client.patient.api;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bytatech.ayoos.patientapigateway.client.patient.model.MedicalReferenceDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-14T15:25:11.683+05:30[Asia/Calcutta]")

@Api(value = "MedicalReferenceResource", description = "the MedicalReferenceResource API")
public interface MedicalReferenceResourceApi {

    @ApiOperation(value = "createMedicalReference", nickname = "createMedicalReferenceUsingPOST", notes = "", response = MedicalReferenceDTO.class, tags={ "medical-reference-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MedicalReferenceDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/medical-references",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<MedicalReferenceDTO> createMedicalReferenceUsingPOST(@ApiParam(value = "medicalReferenceDTO" ,required=true )  @Valid @RequestBody MedicalReferenceDTO medicalReferenceDTO);


    @ApiOperation(value = "deleteMedicalReference", nickname = "deleteMedicalReferenceUsingDELETE", notes = "", tags={ "medical-reference-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/medical-references/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteMedicalReferenceUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllMedicalReferences", nickname = "getAllMedicalReferencesUsingGET", notes = "", response = MedicalReferenceDTO.class, responseContainer = "List", tags={ "medical-reference-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MedicalReferenceDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/medical-references",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<MedicalReferenceDTO>> getAllMedicalReferencesUsingGET(@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "getMedicalReference", nickname = "getMedicalReferenceUsingGET", notes = "", response = MedicalReferenceDTO.class, tags={ "medical-reference-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MedicalReferenceDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/medical-references/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<MedicalReferenceDTO> getMedicalReferenceUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchMedicalReferences", nickname = "searchMedicalReferencesUsingGET", notes = "", response = MedicalReferenceDTO.class, responseContainer = "List", tags={ "medical-reference-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MedicalReferenceDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/medical-references",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<MedicalReferenceDTO>> searchMedicalReferencesUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "updateMedicalReference", nickname = "updateMedicalReferenceUsingPUT", notes = "", response = MedicalReferenceDTO.class, tags={ "medical-reference-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MedicalReferenceDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/medical-references",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<MedicalReferenceDTO> updateMedicalReferenceUsingPUT(@ApiParam(value = "medicalReferenceDTO" ,required=true )  @Valid @RequestBody MedicalReferenceDTO medicalReferenceDTO);

}
