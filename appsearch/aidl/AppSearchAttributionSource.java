package com.google.android.gms.appsearch.aidl;

import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.uew;
import defpackage.uex;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AppSearchAttributionSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uex();
    private final String a;
    private final int b;
    private int c;
    private final uew d;

    public AppSearchAttributionSource(String str, int i, int i2) {
        String str2 = (String) Objects.requireNonNull(str);
        this.a = str2;
        this.b = i;
        this.c = i2;
        if (Binder.getCallingPid() == 0) {
            this.c = -1;
        }
        uew uewVar = new uew(str2, i, this.c);
        if (Binder.getCallingUid() != uewVar.b) {
            throw new SecurityException("Calling uid: " + Binder.getCallingUid() + " doesn't match source uid: " + uewVar.b);
        }
        int callingPid = Binder.getCallingPid();
        int i3 = uewVar.c;
        if (i3 == -1 || i3 == callingPid) {
            this.d = uewVar;
            return;
        }
        if (Binder.getCallingPid() == 0) {
            throw new SecurityException("Calling pid unavailable due to oneway Binder call.");
        }
        throw new SecurityException("Calling pid: " + Binder.getCallingPid() + " doesn't match source pid: " + uewVar.c);
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
            uew uewVar = this.d;
            if (Objects.equals(uewVar.a, appSearchAttributionSource.c()) && uewVar.b == appSearchAttributionSource.b() && uewVar.c == appSearchAttributionSource.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        uew uewVar = this.d;
        return Objects.hash(Integer.valueOf(uewVar.b), uewVar.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, null, i, false);
        arxc.v(parcel, 2, c(), false);
        arxc.o(parcel, 3, b());
        arxc.o(parcel, 4, a());
        arxc.c(parcel, a);
    }

    public AppSearchAttributionSource(uew uewVar) {
        uew uewVar2 = (uew) Objects.requireNonNull(uewVar);
        this.d = uewVar2;
        this.a = uewVar2.a;
        this.b = uewVar2.b;
        this.c = uewVar2.c;
    }
}
