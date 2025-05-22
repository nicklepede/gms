package com.google.android.gms.romanesco.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.czzj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RestoreResultEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czzj();
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
        return atyq.b(Integer.valueOf(restoreResultEntity.a), Integer.valueOf(this.a)) && atyq.b(Integer.valueOf(restoreResultEntity.b), Integer.valueOf(this.b)) && atyq.b(restoreResultEntity.c, this.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, i2);
        atzr.o(parcel, 3, this.b);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.c(parcel, a);
    }
}
