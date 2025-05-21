package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjbn;
import defpackage.cjbp;
import defpackage.cjbz;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class InitiateBandwidthUpgradeParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjbz();
    public cjbp a;
    public String b;
    public final int c;

    public InitiateBandwidthUpgradeParams() {
        this.c = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InitiateBandwidthUpgradeParams) {
            InitiateBandwidthUpgradeParams initiateBandwidthUpgradeParams = (InitiateBandwidthUpgradeParams) obj;
            if (arwb.b(this.a, initiateBandwidthUpgradeParams.a) && arwb.b(this.b, initiateBandwidthUpgradeParams.b) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(initiateBandwidthUpgradeParams.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        cjbp cjbpVar = this.a;
        arxc.D(parcel, 1, cjbpVar == null ? null : cjbpVar.asBinder());
        arxc.v(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.c);
        arxc.c(parcel, a);
    }

    public InitiateBandwidthUpgradeParams(IBinder iBinder, String str, int i) {
        cjbp cjbnVar;
        if (iBinder == null) {
            cjbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            cjbnVar = queryLocalInterface instanceof cjbp ? (cjbp) queryLocalInterface : new cjbn(iBinder);
        }
        this.a = cjbnVar;
        this.b = str;
        this.c = i;
    }
}
