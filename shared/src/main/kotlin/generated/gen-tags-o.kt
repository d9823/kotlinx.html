package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public class OBJECT_(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("object", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var width : String by attributeStringf30f39f0
    var usemap : String by attributeStringf30f39f0
    var height : String by attributeStringf30f39f0
    var type : String by attributeStringf30f39f0
    var classId : String by attributeStringClassId25f072a1
    var data : String by attributeStringf30f39f0
    var form : String by attributeStringf30f39f0
    var name : String by attributeStringf30f39f0

}

public class OL(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("ol", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var reversed : Boolean by attributeBooleanReversedReversedEmpty6412c117
    var start : String by attributeStringf30f39f0

}

public class OPTGROUP(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("optgroup", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var disabled : Boolean by attributeBooleanDisabledDisabledEmptyf8f91d7
    var label : String by attributeStringf30f39f0

}

public class OPTION(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("option", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var value : String by attributeStringf30f39f0
    var disabled : Boolean by attributeBooleanDisabledDisabledEmptyf8f91d7
    var label : String by attributeStringf30f39f0
    var selected : Boolean by attributeBooleanSelectedSelectedEmptyb27909f7

}

public class OUTPUT(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("output", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var for_ : String by attributeStringForf310c6d7
    var form : String by attributeStringf30f39f0
    var name : String by attributeStringf30f39f0

}

