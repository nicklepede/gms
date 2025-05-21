package com.google.android.gms.icing.shim.schemas;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.eiif;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class LocalBusiness extends Thing {
    public final PostalAddress a;
    public final String b;
    public final String c;
    public final String d;

    public LocalBusiness(String str, String str2, String str3, List list, List list2, PostalAddress postalAddress, String str4, String str5, String str6, G3AttributionInfo g3AttributionInfo) {
        super(str, str2, str3, list, list2, g3AttributionInfo);
        this.a = postalAddress;
        this.b = eiif.b(str4);
        this.c = eiif.b(str5);
        this.d = eiif.b(str6);
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalBusiness) {
            LocalBusiness localBusiness = (LocalBusiness) obj;
            if (super.equals(obj) && Objects.equals(this.a, localBusiness.a) && Objects.equals(this.b, localBusiness.b) && Objects.equals(this.c, localBusiness.c) && Objects.equals(this.d, localBusiness.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.a, this.b, this.c, this.d);
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final String toString() {
        PostalAddress postalAddress = this.a;
        return "LocalBusiness{39" + super.toString() + "address=" + String.valueOf(postalAddress) + ", annotationId='" + this.b + "', messageId='" + this.c + "', conversationId='" + this.d + "'}";
    }
}
