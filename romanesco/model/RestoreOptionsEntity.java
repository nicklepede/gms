package com.google.android.gms.romanesco.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cxpl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RestoreOptionsEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cxpl();
    public final boolean a;
    public final boolean b;

    public RestoreOptionsEntity(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RestoreOptionsEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        RestoreOptionsEntity restoreOptionsEntity = (RestoreOptionsEntity) obj;
        return arwb.b(Boolean.valueOf(restoreOptionsEntity.a), Boolean.valueOf(this.a)) && arwb.b(Boolean.valueOf(restoreOptionsEntity.b), Boolean.valueOf(this.b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = arxc.a(parcel);
        arxc.e(parcel, 2, z);
        arxc.e(parcel, 3, this.b);
        arxc.c(parcel, a);
    }
}
