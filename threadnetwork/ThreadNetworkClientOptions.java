package com.google.android.gms.threadnetwork;

import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aszm;
import defpackage.aszo;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dhri;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class ThreadNetworkClientOptions extends AbstractSafeParcelable implements aszm, aszo {
    public static final Parcelable.Creator CREATOR = new dhri();
    public static final ThreadNetworkClientOptions a = new ThreadNetworkClientOptions(0, null);
    public final int b;
    public final IntentSender c;

    public ThreadNetworkClientOptions(int i, IntentSender intentSender) {
        this.b = i;
        this.c = intentSender;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ThreadNetworkClientOptions) {
            ThreadNetworkClientOptions threadNetworkClientOptions = (ThreadNetworkClientOptions) obj;
            if (this.b == threadNetworkClientOptions.b && atyq.b(this.c, threadNetworkClientOptions.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.b;
        int a2 = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.t(parcel, 2, this.c, i, false);
        atzr.c(parcel, a2);
    }
}
