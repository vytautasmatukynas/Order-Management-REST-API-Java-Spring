package lt.ordermanagement.api.security.dtos;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Data Transfer Object (DTO) representing the response for a user deletion operation.
 *
 * @param status  The status of the user deletion operation.
 * @param message A descriptive message providing additional information about the user deletion status.
 */
@Schema(description = "Response DTO for deleting a user")
public record DeleteUserResponseDTO(
        @Schema(description = "Status of the delete operation") String status,
        @Schema(description = "Detailed message about the delete operation") String message) {
}
