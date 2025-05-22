package com.google.android.gms.appsearch.aidl;

import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.wav;
import defpackage.waw;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AppSearchAttributionSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new waw();
    private final String a;
    private final int b;
    private int c;
    private final wav d;

    public AppSearchAttributionSource(String str, int i, int i2) {
        String str2 = (String) Objects.requireNonNull(str);
        this.a = str2;
        this.b = i;
        this.c = i2;
        if (Binder.getCallingPid() == 0) {
            this.c = -1;
        }
        wav wavVar = new wav(str2, i, this.c);
        if (Binder.getCallingUid() != wavVar.b) {
            throw new SecurityException("Calling uid: " + Binder.getCallingUid() + " doesn't match source uid: " + wavVar.b);
        }
        int callingPid = Binder.getCallingPid();
        int i3 = wavVar.c;
        if (i3 == -1 || i3 == callingPid) {
            this.d = wavVar;
            return;
        }
        if (Binder.getCallingPid() == 0) {
            throw new SecurityException("Calling pid unavailable due to oneway Binder call.");
        }
        throw new SecurityException("Calling pid: " + Binder.getCallingPid() + " doesn't match source pid: " + wavVar.c);
    }

    public final int a() {
        return this.d.c;
    }

    public final int b() {
        return this.d.b;
    }

    public final String c() {
        return this.d.a;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof AppSearchAttributionSource)) {
            AppSearchAttributionSource appSearchAttributionSource = (AppSearchAttributionSource) obj;
            wav wavVar = this.d;
            if (Objects.equals(wavVar.a, appSearchAttributionSource.c()) && wavVar.b == appSearchAttributionSource.b() && wavVar.c == appSearchAttributionSource.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        wav wavVar = this.d;
        return Objects.hash(Integer.valueOf(wavVar.b), wavVar.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, null, i, false);
        atzr.v(parcel, 2, c(), false);
        atzr.o(parcel, 3, b());
        atzr.o(parcel, 4, a());
        atzr.c(parcel, a);
    }

    public AppSearchAttributionSource(wav wavVar) {
        wav wavVar2 = (wav) Objects.requireNonNull(wavVar);
        this.d = wavVar2;
        this.a = wavVar2.a;
        this.b = wavVar2.b;
        this.c = wavVar2.c;
    }
}
