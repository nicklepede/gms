package com.google.android.gms.romanesco.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cxpn;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RestoreSourceEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cxpn();
    public final String a;
    public final String b;
    public final List c;

    public RestoreSourceEntity(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RestoreSourceEntity)) {
            return false;
        }
        RestoreSourceEntity restoreSourceEntity = (RestoreSourceEntity) obj;
        if (this == restoreSourceEntity) {
            return true;
        }
        return arwb.b(restoreSourceEntity.a, this.a) && arwb.b(restoreSourceEntity.b, this.b) && arwb.b(restoreSourceEntity.c, this.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.x(parcel, 4, this.c, false);
        arxc.c(parcel, a);
    }
}
