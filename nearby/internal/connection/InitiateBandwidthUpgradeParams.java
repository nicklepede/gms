package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cljs;
import defpackage.clju;
import defpackage.clke;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class InitiateBandwidthUpgradeParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clke();
    public clju a;
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
            if (atyq.b(this.a, initiateBandwidthUpgradeParams.a) && atyq.b(this.b, initiateBandwidthUpgradeParams.b) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(initiateBandwidthUpgradeParams.c))) {
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
        int a = atzr.a(parcel);
        clju cljuVar = this.a;
        atzr.D(parcel, 1, cljuVar == null ? null : cljuVar.asBinder());
        atzr.v(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.c(parcel, a);
    }

    public InitiateBandwidthUpgradeParams(IBinder iBinder, String str, int i) {
        clju cljsVar;
        if (iBinder == null) {
            cljsVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            cljsVar = queryLocalInterface instanceof clju ? (clju) queryLocalInterface : new cljs(iBinder);
        }
        this.a = cljsVar;
        this.b = str;
        this.c = i;
    }
}
