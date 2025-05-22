package com.google.android.gms.icing.shim.schemas;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.elgo;
import defpackage.elpg;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class NoteDigitalDocument extends DigitalDocument {
    public final long g;
    public final long h;
    public final List i;

    public NoteDigitalDocument(String str, String str2, String str3, List list, List list2, Conversation conversation, String str4, Person person, String str5, String str6, String str7, long j, long j2, List list3, G3AttributionInfo g3AttributionInfo) {
        super(str, str2, str3, list, list2, conversation, str4, person, str5, str6, str7, g3AttributionInfo);
        List list4;
        this.g = j;
        this.h = j2;
        if (list3 != null) {
            list4 = DesugarCollections.unmodifiableList(list3);
        } else {
            int i = elgo.d;
            list4 = elpg.a;
        }
        this.i = list4;
    }

    @Override // com.google.android.gms.icing.shim.schemas.DigitalDocument, com.google.android.gms.icing.shim.schemas.Thing
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NoteDigitalDocument) {
            NoteDigitalDocument noteDigitalDocument = (NoteDigitalDocument) obj;
            if (super.equals(obj) && this.g == noteDigitalDocument.g && this.h == noteDigitalDocument.h && Objects.equals(this.i, noteDigitalDocument.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.icing.shim.schemas.DigitalDocument, com.google.android.gms.icing.shim.schemas.Thing
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Long.valueOf(this.g), Long.valueOf(this.h), this.i);
    }

    @Override // com.google.android.gms.icing.shim.schemas.DigitalDocument, com.google.android.gms.icing.shim.schemas.Thing
    public final String toString() {
        List list = this.i;
        return "NoteDigitalDocument{'" + super.toString() + "dateCreated=" + this.g + ", dateModified=" + this.h + ", annotations=" + String.valueOf(list) + "}";
    }
}
