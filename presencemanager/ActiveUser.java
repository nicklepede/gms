package com.google.android.gms.presencemanager;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cwsa;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ActiveUser extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cwsa();
    public final IBinder a;

    public ActiveUser(IBinder iBinder) {
        this.a = iBinder;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ActiveUser)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return arwb.b(this.a, ((ActiveUser) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder = this.a;
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, iBinder);
        arxc.c(parcel, a);
    }
}
