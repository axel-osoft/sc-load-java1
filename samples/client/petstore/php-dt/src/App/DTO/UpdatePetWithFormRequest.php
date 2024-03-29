<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class UpdatePetWithFormRequest
{
    /**
     * Updated name of the pet
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * Updated status of the pet
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $status = null;

}
