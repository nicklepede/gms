package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.dhin;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class InAppCvmConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhin();
    final int a;
    final int b;

    public InAppCvmConfig(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InAppCvmConfig) {
            InAppCvmConfig inAppCvmConfig = (InAppCvmConfig) obj;
            if (this.a == inAppCvmConfig.a && this.b == inAppCvmConfig.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("cdcvmExpirationInSecs", Integer.valueOf(this.a), arrayList);
        atyp.b("cdcvmTransactionLimit", Integer.valueOf(this.b), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, this.a);
        atzr.o(parcel, 3, this.b);
        atzr.c(parcel, a);
    }
}
