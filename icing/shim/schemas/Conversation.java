package com.google.android.gms.icing.shim.schemas;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.eiif;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class Conversation extends Thing {
    public final String a;

    public Conversation(String str, String str2, String str3, String str4, List list, List list2, G3AttributionInfo g3AttributionInfo) {
        super(str, str2, str3, list, list2, g3AttributionInfo);
        this.a = eiif.b(str4);
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Conversation)) {
            return false;
        }
        Conversation conversation = (Conversation) obj;
        if (super.equals(obj)) {
            return Objects.equals(this.a, conversation.a);
        }
        return false;
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(super.hashCode()));
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final String toString() {
        return "ContactPoint{'" + super.toString() + "'conversationId: " + this.a + "'}";
    }
}
