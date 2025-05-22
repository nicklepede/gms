package com.google.android.gms.icing.shim.schemas;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.ekvk;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class PostalAddress extends Thing {
    public final String a;

    public PostalAddress(String str, String str2, String str3, List list, List list2, String str4, G3AttributionInfo g3AttributionInfo) {
        super(str, str2, str3, list, list2, g3AttributionInfo);
        this.a = ekvk.b(str4);
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostalAddress)) {
            return false;
        }
        PostalAddress postalAddress = (PostalAddress) obj;
        if (super.equals(obj)) {
            return Objects.equals(this.a, postalAddress.a);
        }
        return false;
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.a);
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final String toString() {
        return "PostalAddress{39" + super.toString() + "streetAddress='" + this.a + "'}";
    }
}
