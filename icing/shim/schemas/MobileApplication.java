package com.google.android.gms.icing.shim.schemas;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.eiif;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class MobileApplication extends Thing {
    public final String a;
    public final long b;
    public final String c;

    public MobileApplication(String str, String str2, String str3, List list, List list2, String str4, long j, String str5, G3AttributionInfo g3AttributionInfo) {
        super(str, str2, str3, list, list2, g3AttributionInfo);
        this.a = eiif.b(str4);
        this.b = j;
        this.c = eiif.b(str5);
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileApplication) || !super.equals(obj)) {
            return false;
        }
        MobileApplication mobileApplication = (MobileApplication) obj;
        return Objects.equals(this.a, mobileApplication.a) && this.b == mobileApplication.b && Objects.equals(this.c, mobileApplication.c);
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final int hashCode() {
        return Objects.hash(this.a, Long.valueOf(this.b), this.c, Integer.valueOf(super.hashCode()));
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final String toString() {
        return "mobileApplicationId: '" + super.toString() + "', image: " + this.a + ", dateModified: " + this.b + ", identifier: " + this.c;
    }
}
