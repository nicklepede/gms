package com.google.android.gms.dtdi.core;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.aydc;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SelectedDevice extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aydc();
    public final IBinder a;
    public final String b;
    public final RemoteAppScope c;

    public SelectedDevice(IBinder iBinder, String str, RemoteAppScope remoteAppScope) {
        fvbo.f(iBinder, "token");
        fvbo.f(str, "displayName");
        this.a = iBinder;
        this.b = str;
        this.c = remoteAppScope;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedDevice)) {
            return false;
        }
        SelectedDevice selectedDevice = (SelectedDevice) obj;
        return fvbo.n(this.a, selectedDevice.a) && fvbo.n(this.b, selectedDevice.b) && fvbo.n(this.c, selectedDevice.c);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        RemoteAppScope remoteAppScope = this.c;
        return (hashCode * 31) + (remoteAppScope == null ? 0 : remoteAppScope.hashCode());
    }

    public final String toString() {
        return "SelectedDevice(token=" + this.a + ", displayName=" + this.b + ", remoteAppScope=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        IBinder iBinder = this.a;
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, iBinder);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
    }
}
