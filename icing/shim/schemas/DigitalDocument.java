package com.google.android.gms.icing.shim.schemas;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.eiif;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DigitalDocument extends Thing {
    public final Conversation a;
    public final String b;
    public final Person c;
    public final String d;
    public final String e;
    public final String f;

    public DigitalDocument(String str, String str2, String str3, List list, List list2, Conversation conversation, String str4, Person person, String str5, String str6, String str7, G3AttributionInfo g3AttributionInfo) {
        super(str, str2, str3, list, list2, g3AttributionInfo);
        this.a = conversation;
        this.b = eiif.b(str4);
        this.c = person;
        this.d = eiif.b(str5);
        this.e = eiif.b(str6);
        this.f = eiif.b(str7);
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DigitalDocument) {
            DigitalDocument digitalDocument = (DigitalDocument) obj;
            if (super.equals(obj) && Objects.equals(this.a, digitalDocument.a) && Objects.equals(this.b, digitalDocument.b) && Objects.equals(this.c, digitalDocument.c) && Objects.equals(this.d, digitalDocument.d) && Objects.equals(this.e, digitalDocument.e) && Objects.equals(this.f, digitalDocument.f)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.a, this.b, this.c, this.d, this.e, this.f);
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public String toString() {
        Person person = this.c;
        Conversation conversation = this.a;
        return "DigitalDocument{39" + super.toString() + "conversation=" + String.valueOf(conversation) + ", text='" + this.b + "', author=" + String.valueOf(person) + ", annotationId='" + this.d + "', messageId='" + this.e + "', conversationId='" + this.f + "'}";
    }
}
