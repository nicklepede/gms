package com.google.android.gms.romanesco.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cxpm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RestoreResultEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cxpm();
    public final int a;
    public final int b;
    public final Status c;

    public RestoreResultEntity(int i, int i2, Status status) {
        this.a = i;
        this.b = i2;
        this.c = status;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RestoreResultEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        RestoreResultEntity restoreResultEntity = (RestoreResultEntity) obj;
        return arwb.b(Integer.valueOf(restoreResultEntity.a), Integer.valueOf(this.a)) && arwb.b(Integer.valueOf(restoreResultEntity.b), Integer.valueOf(this.b)) && arwb.b(restoreResultEntity.c, this.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, i2);
        arxc.o(parcel, 3, this.b);
        arxc.t(parcel, 4, this.c, i, false);
        arxc.c(parcel, a);
    }
}
