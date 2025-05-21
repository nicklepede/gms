package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.dexj;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class InAppCvmConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dexj();
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
        arwa.b("cdcvmExpirationInSecs", Integer.valueOf(this.a), arrayList);
        arwa.b("cdcvmTransactionLimit", Integer.valueOf(this.b), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, this.a);
        arxc.o(parcel, 3, this.b);
        arxc.c(parcel, a);
    }
}
