package com.google.android.gms.romanesco.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cxpy;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RestoreInfoEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cxpy();
    public final String a;
    public final Long b;

    public RestoreInfoEntity(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RestoreInfoEntity)) {
            return false;
        }
        RestoreInfoEntity restoreInfoEntity = (RestoreInfoEntity) obj;
        if (this == restoreInfoEntity) {
            return true;
        }
        return arwb.b(restoreInfoEntity.a, this.a) && arwb.b(restoreInfoEntity.b, this.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.I(parcel, 3, this.b);
        arxc.c(parcel, a);
    }
}
