package com.google.android.gms.icing.shim.schemas;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.elgo;
import defpackage.elpg;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ContactPoint extends Thing {
    public final List a;
    public final List b;
    public final List c;

    public ContactPoint(String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, G3AttributionInfo g3AttributionInfo) {
        super(str, str2, str3, list, list2, g3AttributionInfo);
        if (list3 == null) {
            int i = elgo.d;
            list3 = elpg.a;
        }
        this.a = list3;
        if (list4 == null) {
            int i2 = elgo.d;
            list4 = elpg.a;
        }
        this.b = list4;
        if (list5 == null) {
            int i3 = elgo.d;
            list5 = elpg.a;
        }
        this.c = list5;
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final boolean equals(Object obj) {
        if (!(obj instanceof ContactPoint) || !super.equals(obj)) {
            return false;
        }
        ContactPoint contactPoint = (ContactPoint) obj;
        return Objects.equals(this.a, contactPoint.a) && Objects.equals(this.b, contactPoint.b) && Objects.equals(this.c, contactPoint.c);
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Integer.valueOf(super.hashCode()));
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final String toString() {
        List list = this.c;
        List list2 = this.b;
        List list3 = this.a;
        return "ContactPoint{'" + super.toString() + "', address='" + String.valueOf(list3) + "', email='" + String.valueOf(list2) + "', telephone='" + String.valueOf(list) + "'}";
    }
}
