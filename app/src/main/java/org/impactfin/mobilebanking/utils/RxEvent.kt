package org.impactfin.mobilebanking.utils

import org.impactfin.mobilebanking.models.guarantor.GuarantorApplicationPayload

/*
 * Created by saksham on 29/July/2018
*/

class RxEvent {

    data class AddGuarantorEvent(var payload: GuarantorApplicationPayload, var index: Int)

    data class DeleteGuarantorEvent(var index: Int)

    data class UpdateGuarantorEvent(var payload: GuarantorApplicationPayload, var index: Int)
}
