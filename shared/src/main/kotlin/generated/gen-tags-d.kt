package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public class DATALIST(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("datalist", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {

}

public class DD(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("dd", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {

}

public class DEL(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("del", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {
    var cite : String
        get()  = attributeString_38b4cae2.get(this, "cite")
        set(newValue) {attributeString_38b4cae2.set(this, "cite", newValue)}

    var dateTime : String
        get()  = attributeString_38b4cae2.get(this, "datetime")
        set(newValue) {attributeString_38b4cae2.set(this, "datetime", newValue)}


}

public class DETAILS(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("details", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {
    var open : Boolean
        get()  = attributeBoolean_e6822d2.get(this, "open")
        set(newValue) {attributeBoolean_e6822d2.set(this, "open", newValue)}


}

public class DFN(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("dfn", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {

}

public class DIALOG(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("dialog", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {

}

public class DIV(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("div", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {

}

public class DL(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("dl", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {

}

public class DT(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("dt", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {

}

